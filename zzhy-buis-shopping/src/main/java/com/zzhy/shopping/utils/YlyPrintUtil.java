package com.zzhy.shopping.utils;

import com.alibaba.fastjson.JSON;
import com.yly.java.yly_sdk.RequestMethod;
import com.zzhy.shopping.dto.YlyResultDTO;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author ChiangKai
 * @date 2022/9/15 19:01
 */
@Component
@PropertySource("classpath:yly.properties")
public class YlyPrintUtil {

    @Value("${client_id}")
    private String clientId;
    @Value("${client_secret}")
    private String clientSecret;

    @Value("${machine_code}")
    private String machineCode;

    @Value("${msign}")
    private String msign;

    @SneakyThrows
    public YlyResultDTO print(String content, String oid) {
        RequestMethod.init(clientId, clientSecret);

        // 这个方法一天只能10次
        String accessToken = "10f18803f2554cd4b8c312e18acbb8a1";// RequestMethod.getAccessToken();

        RequestMethod instance = RequestMethod.getInstance();

        //String addPrinterResult = instance.addPrinter(machineCode, msign,accessToken);

        String printResult = instance.printIndex(accessToken, machineCode, content, oid);
        return JSON.parseObject(printResult, YlyResultDTO.class);

    }

    public static class MakePrintContent {
        public StringBuilder getSb() {
            return sb;
        }

        public void setSb(StringBuilder sb) {
            this.sb = sb;
        }

        private StringBuilder sb;

        public MakePrintContent() {
            this.sb = new StringBuilder();
        }

        public MakePrintContent Bold(String content) {
            sb.append("<FB>").append(content).append("</FB>");
            return this;
        }

        public MakePrintContent F_48_48(String content) {
            sb.append("<FS2>").append(content).append("</FS2>");
            return this;
        }

        public MakePrintContent F_32_32(String content) {
            sb.append("<FS>").append(content).append("</FS>");
            return this;
        }


        public MakePrintContent F_32_32_B(String content) {
            sb.append("<FB>")
                    .append("<FS>").append(content).append("</FS>")
                    .append("</FB>");
            return this;
        }

        public MakePrintContent F_48_48_B(String content) {
            sb.append("<FB>")
                    .append("<FS2>").append(content).append("</FS2>")
                    .append("</FB>");
            return this;
        }

        public MakePrintContent BR() {
            sb.append("\n");
            return this;
        }

        public MakePrintContent F_32_32_B_C(String content) {
            sb.append("<FB>").append("<FS>")
                    .append("<center>").append(content).append("</center>")
                    .append("</FS>").append("</FB>");
            return this;
        }

        public MakePrintContent F_48_48_B_C(String content) {
            sb.append("<FB>").append("<FS2>")
                    .append("<center>").append(content).append("</center>")
                    .append("</FS2>").append("</FB>");
            return this;
        }


        public MakePrintContent F_48_24(String content) {
            sb.append("<FH2>").append(content).append("</FH2>");
            return this;
        }

        public MakePrintContent F_32_24(String content) {
            sb.append("<FH>").append(content).append("</FH>");
            return this;
        }

        /**
         * 条形码
         * code128 B 支持14位以内字符长度数字、字母和特殊字符，中文或其他字符无效
         * code128 C 支持25位以内奇数字符长度和28位以内偶数字符长度数字，字母和特殊字符、中文或其他字符无效
         */
        public MakePrintContent code128(String content) {
            if (content.length() < 14)
                sb.append("<BR2>" + content + "</BR2>");
            else
                sb.append("<BR3>" + content + "</BR3>");
            return this;
        }

        /**
         * 只能是数字
         *
         * @param content
         * @return
         */
        public MakePrintContent ean13(String content) {
            sb.append("<b>" + content + "</b>");
            return this;
        }

        public MakePrintContent appendLine(String content) {
            sb.append(content).append("\n");
            return this;
        }

        public MakePrintContent append(String... content) {
            for (String str : content) {
                sb.append(str);
            }
            return this;
        }

        @Override
        public String toString() {
            return sb.toString();
        }

        public MakePrintContent newLine() {
            sb.append("\n");
            return this;
        }

    }

}
