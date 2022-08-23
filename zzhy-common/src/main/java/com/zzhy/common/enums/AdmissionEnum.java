package com.zzhy.common.enums;


public class AdmissionEnum {
    public enum InstitutionType{
        //学制，1-一年，2-二年，3-三年，4-四年，5-五年，6-六年
        one(1,"一年"),two(2,"二年"),three(3,"三年"),four(4,"四年"),
        five(5,"五年"),six(6,"六年");

        private final Integer key;
        private final String value;

        private InstitutionType(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(InstitutionType institutionType : InstitutionType.values()){
                if (institutionType.key.equals(key)){
                    return institutionType.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(InstitutionType institutionType : InstitutionType.values()){
                if (institutionType.value.equals(value)){
                    return institutionType.key;
                }
            }
            return null;
        }
    }
    public enum Season{
        //招生季节，1是春季，2是秋季
        spring(1,"春季"),autumn(2,"秋季");
        private final Integer key;
        private final String value;

        private Season(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public  Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key) {
            for(Season s : Season.values()){
                if (s.key.equals(key)){
                    return s.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(Season season : Season.values()){
                if (season.value.equals(value)){
                    return season.key;
                }
            }
            return null;
        }
    }
    public enum CertificateType{
        //10-居民身份证（户口溥），20-香港特区护照，30-澳门特区护照，40-台湾居民来往大陆通信证，50-外国人护照，60-军官证，70-社会保障卡，99-其他证件
        SFZ(10,"居民身份证（户口溥）"),XGTQHZ(20,"香港特区护照"),AMTQHZ(30,"澳门特区护照"),
        TW(40,"台湾居民来往大陆通信证"),WGR(50,"外国人护照"),JG(60,"军官证"),
        SH(70,"社会保障卡"),QT(99,"其他证件");

        private final Integer key;
        private final String value;

        private CertificateType(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(CertificateType certificateType : CertificateType.values()){
                if (certificateType.key.equals(key)){
                    return certificateType.value;
                }
            }
            return "";
        }
        public static Integer getValue(String name) {
            for (CertificateType e : CertificateType.values()) {
                if (name.contains(e.value)) {
                    return e.key;
                }
            }
            return null;
        }
    }
    public enum Sex{
        //性别
        male(2,"男"),female(1,"女");

        private final Integer key;
        private final String value;

        private Sex(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(Sex sex : Sex.values()){
                if (sex.key.equals(key)){
                    return sex.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(Sex sex : Sex.values()){
                if (sex.value.equals(value)){
                    return sex.key;
                }
            }
            return null;
        }
    }

    public enum PoliticalOutlook{
        //政治面貌 1-群众，2-中国共产党员，3-中国共产主义共青团团员
        QZ(1,"群众"),DY(2,"中国共产党员"),TY(3,"中国共产主义共青团团员");

        private final Integer key;
        private final String value;

        private PoliticalOutlook(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(PoliticalOutlook politicalOutlook : PoliticalOutlook.values()){
                if (politicalOutlook.key.equals(key)){
                    return politicalOutlook.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(PoliticalOutlook politicalOutlook : PoliticalOutlook.values()){
                if (politicalOutlook.value.equals(value)){
                    return politicalOutlook.key;
                }
            }
            return null;
        }
    }
    public enum InputType{
        //录入类型，1是学生端（小程序）报名，2系统导入
        XSD(1,"学生端"),XTDR(2,"系统导入");

        private final Integer key;
        private final String value;

        private InputType(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(InputType inputType : InputType.values()){
                if (inputType.key.equals(key)){
                    return inputType.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(InputType inputType : InputType.values()){
                if (inputType.value.equals(value)){
                    return inputType.key;
                }
            }
            return null;
        }
    }
    public enum AdmissionsType{
        //招生类型，1是中招，2是自主招生
        ZZ(1,"中招"),ZZZS(2,"自主招生");

        private final Integer key;
        private final String value;

        private AdmissionsType(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(AdmissionsType admissionsType : AdmissionsType.values()){
                if (admissionsType.key.equals(key)){
                    return admissionsType.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(AdmissionsType admissionsType : AdmissionsType.values()){
                if (admissionsType.value.equals(value)){
                    return admissionsType.key;
                }
            }
            return null;
        }
    }
    public enum PreinscriptionFlag{
        //预录取状态，是否进行了预录取操作，1-待录取，2-预录取，3-录取，8-录取驳回，9-录取退回
        DRQ(1,"待录取"),YRQ(2,"预录取"),RQ(3,"录取"),
        RQBH(4,"录取驳回"),RQTH(5,"录取退回");

        private final Integer key;
        private final String value;

        private PreinscriptionFlag(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(PreinscriptionFlag preinscriptionFlag : PreinscriptionFlag.values()){
                if (preinscriptionFlag.key.equals(key)){
                    return preinscriptionFlag.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(PreinscriptionFlag preinscriptionFlag : PreinscriptionFlag.values()){
                if (preinscriptionFlag.value.equals(value)){
                    return preinscriptionFlag.key;
                }
            }
            return null;
        }
    }
    public enum Status{
        //1=正常,2=停用
        normal(1,"正常"),quit(2,"停用");

        private final Integer key;
        private final String value;

        private Status(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(Status status : Status.values()){
                if (status.key.equals(key)){
                    return status.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(Status status : Status.values()){
                if (status.value.equals(value)){
                    return status.key;
                }
            }
            return null;
        }
    }
    public enum FosterLevel{
        //培养目标,专业级别（层次，1初级，2中级，3高级，4预备技师）
        primary(1,"初级"),intermediate(2,"中级"),senior(3,"高级"),
        prepare(4,"预备技师");

        private final Integer key;
        private final String value;

        private FosterLevel(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(FosterLevel fosterLevel : FosterLevel.values()){
                if (fosterLevel.key.equals(key)){
                    return fosterLevel.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(FosterLevel fosterLevel : FosterLevel.values()){
                if (fosterLevel.value.equals(value)){
                    return fosterLevel.key;
                }
            }
            return null;
        }
    }
    public enum FosterType{
        //1=全日制,2=非全日制
        QRZ(1,"全日制"),FQRZ(2,"非全日制");

        private final Integer key;
        private final String value;

        private FosterType(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(FosterType fosterType : FosterType.values()){
                if (fosterType.key.equals(key)){
                    return fosterType.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(FosterType fosterType : FosterType.values()){
                if (fosterType.value.equals(value)){
                    return fosterType.key;
                }
            }
            return null;
        }
    }
    public enum EnrollmentTarget{
        //1-初中毕业，2-高中毕业，3-达到中级技能水平学生，4-达到高级技能水平学生
        juniorGraduate(1,"初中毕业"),seniorGraduate(2,"高中毕业"),
        intermediateLevel(3,"达到中级技能水平学生"),seniorLevel(4,"达到高级技能水平学生");

        private final Integer key;
        private final String value;

        private EnrollmentTarget(Integer key,String value){
            this.key=key;
            this.value=value;
        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Integer key){
            for(EnrollmentTarget enrollmentTarget : EnrollmentTarget.values()){
                if (enrollmentTarget.key.equals(key)){
                    return enrollmentTarget.value;
                }
            }
            return "";
        }
        public static Integer getKey(String value){
            for(EnrollmentTarget enrollmentTarget : EnrollmentTarget.values()){
                if (enrollmentTarget.value.equals(value)){
                    return enrollmentTarget.key;
                }
            }
            return null;
        }
    }

    public enum InputStatus{
        YLQ(1L,"预录取"),LQ(2L,"已录取"),LXQR(3L,"入学确认"),YQRJD(4L,"已确认就读"),CSWQRJD(6L,"超时未确认就读"),FQJD(7L,"放弃就读"),LXBH(8L,"入学驳回"),LQBH(9L,"录取驳回");

        private final Long key;
        private final String value;

        InputStatus(Long key, String value) {
            this.key = key;
            this.value = value;
        }

        public Long getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static String getName(Long value)
        {
            for(InputStatus e: InputStatus.values())
            {
                if(e.key.equals(value))
                {
                    return e.value;
                }
            }
            return "";
        }

    }


}
