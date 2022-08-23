package com.zzhy.common.enums;

/**
 * 关于院校报备的枚举
 */
public class TypeEnum {

    /**
     * 轮播图位置（1微信小程序-首页轮播图，2-pc官网-首页轮播图）
     */
    public enum PositionTypeEnum {
        XCX("小程序", "1"),
        PC("PC", "2"),
        All("PC+小程序", "3");

        public String name;
        public String value;

        private PositionTypeEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (PositionTypeEnum e : PositionTypeEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 轮播图位置（1微信小程序-首页轮播图，2-pc官网-首页轮播图）
     */
    public enum IsReadEnum {
        YD("已读", "1"),
        WD("未读", "2");

        public String name;
        public String value;

        private IsReadEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (IsReadEnum e : IsReadEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }
}
