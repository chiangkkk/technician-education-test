package com.zzhy.common.utils.qrcode;


import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.zzhy.common.utils.uuid.UUID;
import com.zzhy.common.utils.wechat.WechatUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QrCodeUtils {

    private static final Logger log = LoggerFactory.getLogger(WechatUtil.class);
    private static final String QR_CODE_IMAGE_PATH = "E:/MyQRCode.jpg";
    /**
     * 生成普通二维码图片
     * @param text 内容可以是连接地址，也可以是文本内容
     * @param width
     * @param height
     * @param filePath
     * @throws WriterException
     * @throws IOException
     */
    public static void generateQRCodeImage(String text, int width, int height, String filePath) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(filePath);

        MatrixToImageWriter.writeToPath(bitMatrix, "JPG", path);

    }

    public static void main(String[] args) {
        try {
            String uuid = UUID.randomUUID().toString();
            String xcxCode = "https://jg.fjrst.cn:8915/api/index/test?id=test_"+1;
//            generateQRCodeImage("https://jg.fjrst.cn:8915/api/index/grantPower", 300, 300, QR_CODE_IMAGE_PATH);
            generateQRCodeImage(xcxCode, 200, 200, QR_CODE_IMAGE_PATH);
        } catch (WriterException e) {
            log.error("Could not generate QR Code, WriterException :: " + e.getMessage());
        } catch (IOException e) {
            log.error("Could not generate QR Code, IOException :: " + e.getMessage());
        }

    }
}
