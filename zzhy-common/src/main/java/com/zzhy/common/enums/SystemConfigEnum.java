package com.zzhy.common.enums;

/**
 * 关于院校报备的枚举
 */
public class SystemConfigEnum {

    /**
     * 是否指定部分院校具备年度申报资格
     */
    public enum StartStatusEnum {
        KQ("是", "1"), GB("关闭", "2");
        public String name;
        public String value;

        private StartStatusEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (StartStatusEnum e : StartStatusEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }
    }

}
