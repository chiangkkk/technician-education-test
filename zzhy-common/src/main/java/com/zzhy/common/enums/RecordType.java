package com.zzhy.common.enums;

/**
 * @author dabort
 * @date 2021/12/24 - 11:37
 */
public enum RecordType {

    OLD("旧数据",1L),NEW("新数据",2L);

    private final String name;
    private final Long value;

    RecordType(String name, Long value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Long getValue() {
        return value;
    }

    public enum EnrollmentTarget{
/**
 * 招生对象 001-初中毕业生，002-高中毕业生，003-技校毕业生，004-大专，
 * 005-大学本科，006-中级工(取得中级职业资格证书)，007-中职毕业生，
 * 008-高级工(取得高级职业资格证书)，009-相近工种工作满2年的在职员工，
 * 010-相近工种工作满1年的在职员工，011-现役军人，012-初级工(取得初级职业资格证书)
 */
        CZBY(1,"初中毕业生"),GZBY(2,"高中毕业生"),
        JXBY(3,"技校毕业生"),DZ(4,"大专"),
        DXBK(5,"大学本科"),ZJG(6,"中级工(取得中级职业资格证书)"),
        ZZBY(7,"中职毕业生"),GJG(8,"高级工(取得高级职业资格证书)"),
        XJGZ2(9,"相近工种工作满2年的在职员工"),
        XJGZ1(10,"相近工种工作满1年的在职员工"),XYJR(11,"现役军人"),CJG(12,"初级工(取得初级职业资格证书)");

        private Integer key;
        private String val;

        EnrollmentTarget(Integer key, String val) {
            this.key = key;
            this.val = val;
        }

        public static String getValue(Integer key) {
            for (EnrollmentTarget e : EnrollmentTarget.values()) {
                if (e.key == key) {
                    return e.val;
                }
            }

            return "";
        }
    }

}

