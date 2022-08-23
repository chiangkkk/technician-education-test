package com.zzhy.web.controller.common;

import com.zzhy.common.config.RuoYiConfig;
import com.zzhy.common.constant.Constants;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.utils.StringUtils;
import com.zzhy.common.utils.file.FileUploadUtils;
import com.zzhy.common.utils.file.FileUtils;
import com.zzhy.common.utils.uuid.IdUtils;
import com.zzhy.framework.config.ServerConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

/**
 * 通用请求处理
 *
 * @author ruoyi
 */
@Api("文件上传")
@RestController
public class CommonController {

    private static final Logger log = LoggerFactory.getLogger(CommonController.class);

    @Autowired
    private ServerConfig serverConfig;

    /**
     * 通用下载请求
     *
     * @param fileName 文件名称
     * @param delete   是否删除
     */
    @ApiOperation("通用下载请求")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fileName", value = "文件名称", dataType = "String", paramType = "path", dataTypeClass = String.class),
            @ApiImplicitParam(name = "delete", value = "是否删除", dataType = "Boolean", paramType = "path", dataTypeClass = Boolean.class),
    })
    @GetMapping("common/download")
    public void fileDownload(String fileName, Boolean delete, HttpServletResponse response, HttpServletRequest request) {
        try {
            if (!FileUtils.checkAllowDownload(fileName)) {
                throw new Exception(StringUtils.format("文件名称({})非法，不允许下载。 ", fileName));
            }
            String realFileName = System.currentTimeMillis() + fileName.substring(fileName.indexOf("_") + 1);
            String filePath = RuoYiConfig.getDownloadPath() + fileName;

            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
            FileUtils.setAttachmentResponseHeader(response, realFileName);
            FileUtils.writeBytes(filePath, response.getOutputStream());
            if (delete) {
                FileUtils.deleteFile(filePath);
            }
        } catch (Exception e) {
            log.error("下载文件失败", e);
        }
    }

    /**
     * 通用上传请求
     */
    @ApiOperation("通用上传请求")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "file", value = "文件", required = true, dataType = "file", paramType = "formData"),
            @ApiImplicitParam(name = "file", value = "文件", required = true, dataType = "file", paramType = "formData")

    })
    @PostMapping("/common/upload")
    public AjaxResult uploadFile(MultipartFile file) throws Exception {
        try {
            // 上传文件路径
            String filePath = RuoYiConfig.getUploadPath();
//            // 上传并返回新文件名称
            String fileName = FileUploadUtils.upload(filePath, file);
            String url = "";
            String srcPath = filePath+fileName.replace("/profile/upload", "");
            String tagerPath = srcPath;
            String reg = "(jpg|png|gif|bmp|jpeg)";
            Pattern p = Pattern.compile(reg);
            //获取上传文件名
            String xname = file.getOriginalFilename();
            boolean boo = p.matcher(xname).find();
            if (StringUtils.isNotEmpty(RuoYiConfig.getRoutingPath()))
            {
                url = RuoYiConfig.getRoutingPath()+ fileName;
                if(boo){
                    // 使用压缩方法
                    commpressPicForScale(srcPath,tagerPath,500,0.5);
                }
            }
            else
            {
                url = serverConfig.getUrl()+ RuoYiConfig.getRoutingPath()+ fileName;
                if(boo){
                    // 使用压缩方法
                commpressPicForScale(srcPath,tagerPath,500,0.5);
                }

            }
            AjaxResult ajax = AjaxResult.success();
            ajax.put("fileName", fileName);
            ajax.put("url", url);
            return ajax;
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     *
     * @param srcPath  原图片地址
     * @param desPath  目标图片地址
     * @param desFileSize  指定图片大小,单位kb
     * @param accuracy 精度,递归压缩的比率,建议小于0.9
     * @return
     */
    public static String commpressPicForScale(String srcPath,String desPath,
                                              long desFileSize , double accuracy){
        try {
            File srcFile  = new File(srcPath);
            long srcFilesize = srcFile.length();
            System.out.println("原图片:"+srcPath + ",大小:" + srcFilesize/1024 + "kb");
            //递归压缩,直到目标文件大小小于desFileSize
            commpressPicCycle(desPath, desFileSize, accuracy);

            File desFile = new File(desPath);
            System.out.println("目标图片:" + desPath + ",大小" + desFile.length()/1024 + "kb");
            System.out.println("图片压缩完成!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return desPath;
    }
    public static void commpressPicCycle(String desPath , long desFileSize,
                                         double accuracy) throws IOException{
        File imgFile = new File(desPath);
        long fileSize  = imgFile.length();
        //判断大小,如果小于500k,不压缩,如果大于等于500k,压缩
        if(fileSize <= desFileSize * 500){
            return;
        }
        //计算宽高
        BufferedImage  bim = ImageIO.read(imgFile);
        int imgWidth = bim.getWidth();
        int imgHeight = bim.getHeight();
        int desWidth = new BigDecimal(imgWidth).multiply(
                new BigDecimal(accuracy)).intValue();
        int desHeight = new BigDecimal(imgHeight).multiply(
                new BigDecimal(accuracy)).intValue();
        Thumbnails.of(desPath).size(desWidth, desHeight).outputQuality(accuracy).toFile(desPath);
        //如果不满足要求,递归直至满足小于1M的要求
        commpressPicCycle(desPath, desFileSize, accuracy);
    }


    /**
     * 本地资源通用下载
     */
    @ApiOperation("本地资源通用下载")
    @GetMapping("/common/download/resource")
    public void resourceDownload(String resource, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        try {
            if (!FileUtils.checkAllowDownload(resource)) {
                throw new Exception(StringUtils.format("资源文件({})非法，不允许下载。 ", resource));
            }
            // 本地资源路径
            String localPath = RuoYiConfig.getProfile();
            // 数据库资源地址
            String downloadPath = localPath + StringUtils.substringAfter(resource, Constants.RESOURCE_PREFIX);
            // 下载名称
            String downloadName = StringUtils.substringAfterLast(downloadPath, "/");
            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
            FileUtils.setAttachmentResponseHeader(response, downloadName);
            FileUtils.writeBytes(downloadPath, response.getOutputStream());
        } catch (Exception e) {
            log.error("下载文件失败", e);
        }
    }


    /**
     * 图片上传压缩
     *
     * @param file 文件
     * @param subdirectory 文件夹名称
     * @param width 图片宽度
     * @param height 图片高度
     * @return
     */
    public static Map<String, String> saveImgCompress(MultipartFile file, String subdirectory, Integer width, Integer height) {
        //上传文件路径
        String path = RuoYiConfig.getUploadPath();
        // 获取文件名称
        String filename = file.getOriginalFilename();
        String fielhouzhui = filename.substring(filename.lastIndexOf("."), filename.length());
        //重新修改文件名防止重名
        filename = new SimpleDateFormat("yyyyMMddHHmmssSSS")
                .format(new Date())
                + (new Random().nextInt(9000) % (9000 - 1000 + 1) + 1000) +  IdUtils.fastUUID() + fielhouzhui;
        File filepath = new File(path, filename);
        //判断路径是否存在，没有就创建一个
        if (!filepath.getParentFile().exists()) {
            filepath.getParentFile().mkdirs();
        }
        File img = new File(path + File.separator + filename);
        Map<String, String> map = new HashMap<>();
        try {
            Thumbnails.of(file.getInputStream()).size(width,height).toFile(img);
            map.put("res", "success");
            map.put("url", filename);
            return map;
        } catch (IOException e) {
            e.printStackTrace();
            map.put("res", "error");
            return map;
        }
    }

    /**
     * 获取文件目录
     *
     * @param subdirectory 文件夹名称
     * @return
     */
    public static String getPath(String subdirectory) {
        //获取跟目录---与jar包同级目录的upload目录
        File upload = null;
        try {
            // 获取项目中所在的路径
            // C:\Users\Administrator\Desktop\SpringBoot\xx\xx-common\target\classes
            File path = new File(ResourceUtils.getURL("classpath:").getPath());
            // 判断目录是否存在
            if (!path.exists()) path = new File("");
            // 项目运行目录 + subdirectory
            upload = new File(path.getAbsolutePath(), subdirectory);
            //如果不存在则创建目录
            if (!upload.exists()) upload.mkdirs();
            String realPath = upload + "/";
            return realPath;// C:\Users\Administrator\Desktop\SpringBoot\XX\XX-common\target\classes\123/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("GetServerPathUtil===>获取服务器路径发生错误!");
            throw new RuntimeException("获取服务器路径发生错误！");
        }
    }

}
