package com.zzhy.common.enums;

/**
 * 关于院校报备的枚举
 */
public class ReportingEnum {
    public enum StipendDifficultyTypeDesc {
        // 资格类型 1-低保（含特困供养）家庭学生，2-建档立卡家庭学生，3-残疾学生，4-孤儿，5-烈士、英雄模范和因公牺牲军人、公安民警和消防人员家庭子女，6-优抚对象子女，7-残疾人家庭子女，9-其他经济困难家庭学生（子女），10-连片地区困难，11-三州三区困难，12-涉农专业'
        DB("低保", 1L), JDLKJTXX("建档立卡家庭学生", 2L), CJXX("残疾学生", 3L), GE("孤儿", 4L),
        LS("烈士、英雄模范和因公牺牲军人、公安民警和消防人员家庭子女", 5L), YFDXZN("优抚对象子女", 6L),
        CJRJTZN("残疾人家庭子女", 7L), QTJJKNJTXS("其他经济困难家庭学生", 9L), LPDQKN("连片地区困难", 10L),
        SZSQKN("三州三区困难", 11L), SNZY("涉农专业", 12L);

        public String name;
        public Long value;

        private StipendDifficultyTypeDesc(String name, Long value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Long value) {
            for (StipendDifficultyTypeDesc e : StipendDifficultyTypeDesc.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }
    }


    public enum ReportingStatus {
        CG("草稿", 1), YTJ("已提交报备审核", 2);
        public String name;
        public Integer value;

        private ReportingStatus(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (ReportingStatus e : ReportingStatus.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }

            return "";
        }

    }


    public enum DeleteStatus {
        CZ("存在", 1), SC("删除", 2);
        public String name;
        public Integer value;

        private DeleteStatus(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (DeleteStatus e : DeleteStatus.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }
    }


    //证件类型 001-居民身份证（户口簿），002-香港特区护照/港澳居民来往内地通行证，003-澳门特区护照/港澳居民来往内地通行证，004-台湾居民来往大陆通信证，005-外国人护照，006-社会保障卡，007-军官证，008-香港居民身份证，009-澳门居民身份证，010-台湾居民身份证，999-其他证件'
    public enum CertificateType {
        JMSFZ("居民身份证（户口簿）", "001"),
        XGTQ("香港特区护照/港澳居民来往内地通行证", "002"),
        AMTQ("澳门特区护照/港澳居民来往内地通行证", "003"),
        TWTQ("台湾居民来往大陆通信证", "004"),
        WGR("外国人护照", "005"),
        SHBZK("社会保障卡", "006"),
        JGZ("军官证", "007"),
        XGJMSFZ("香港居民身份证", "008"),
        AMJMSFZ("澳门居民身份证", "009"),
        TWJMSFZ("台湾居民身份证", "010"),
        QT("其他证件", "999");
        public String name;
        public String value;

        private CertificateType(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (CertificateType e : CertificateType.values()) {
                if (e.value .equals(value) ) {
                    return e.name;
                }
            }
            return "";
        }
    }

    /**
     * 是否向省技工中心发送报备 1-是，2-否（主要用于判断省技工中心能不能显示确认报备的按钮
     */
    public enum SenReportStatusEnum {
        KQ("是", "1"), GB("否", "2");
        public String name;
        public String value;

        private SenReportStatusEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (SenReportStatusEnum e : SenReportStatusEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }
    }


    public enum UseStatus {
        ZC("正常", 1), TY("停用", 2);
        public String name;
        public Integer value;

        private UseStatus(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (UseStatus e : UseStatus.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }
    }


    public enum AuitStatus {
        //审核状态0 默认状态    1待审核，2审核中，3审核通过，4审核驳回
        MR("默认状态", 0), DSH("1待审核", 1), SHZ("审核中", 2), TG("审核通过", 3), BH("审核驳回", 4),
        CH("撤回", 8), TH("退回", 9);
        public String name;
        public Integer value;

        private AuitStatus(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (AuitStatus e : AuitStatus.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }
    }

    public enum Condition
    {
        ONE(1L,2L,null),TWO(2L,2L,null),THREE(3L,1L,null),FOUR(4L,1L,null),
        FIVE(5L,3L,3L),SIX(6L,3L,4L),SEVEN(7L,3L,5L),EIGHT(8L,1L,null),
        NINE(9L,1L,null), TEN(10L,2L,null), ELEVEN(11L,3L,3L), TWELVE(12L,1L,null);
        private Long ct;
        private Long ss;
        private Long si;
        Condition(Long ct,Long ss,Long si)
        {
            this.ct = ct;
            this.ss = ss;
            this.si = si;
        }
        public static Long  getSs(Long value)
            {
                for(Condition e: Condition.values())
                {
                    if(e.ct.equals(value))
                    {
                        return e.ss;
                    }
                }
                return null;
            }

        public static Long getSi(Long value)
        {
            for(Condition e: Condition.values())
            {
                if(e.ct.equals(value))
                {
                    return e.si;
                }
            }
            return null;
        }
    }

    public enum Transfer
    {
        ONE(1L,4L,6L),TWO(2L,5L,7L),THREE(3L,6L,8L),FOUR(4L,7L,9L),
        FIVE(5L,3L,12L);
        private Long ts;
        private Long at;
        private Long ct;
        Transfer(Long ts,Long at,Long ct)
        {
            this.ts = ts;
            this.at = at;
            this.ct = ct;
        }
        public static Long  getAt(Long value)
        {
            for(Transfer e: Transfer.values())
            {
                if(e.ts.equals(value))
                {
                    return e.at;
                }
            }
            return null;
        }

        public static Long getCt(Long value)
        {
            for(Transfer e: Transfer.values())
            {
                if(e.ts.equals(value))
                {
                    return e.ct;
                }
            }
            return null;
        }
    }

    public enum InstitutionType
    {
        ONE(1L,"一年级"),TWO(2L,"一年级,二年级"),THREE(3L,"一年级,二年级,三年级"),FOUR(4L,"一年级,二年级,三年级,四年级"),
        FIVE(5L,"一年级,二年级,三年级,四年级,五年级"),SIX(6L,"一年级,二年级,三年级,四年级,五年级,六年级");
        private Long type;
        private String it;
        InstitutionType(Long type,String it)
        {
            this.type = type;
            this.it   = it;
        }
        public static String getIt(Long value)
        {
            for(InstitutionType e: InstitutionType.values())
            {
                if(e.type.equals(value))
                {
                    return e.it;
                }
            }
            return "班级错误";
        }
    }


    public enum Season
    {
        ONE("1","春季"),TWO("2","秋季");
        private String season;
        private String seasonDesc;
        Season(String season,String seasonDesc)
        {
            this.season     = season;
            this.seasonDesc = seasonDesc;
        }
        public static String getSeasonDesc(String value)
        {
            for(Season e: Season.values())
            {
                if(e.season.equals(value))
                {
                    return e.seasonDesc;
                }
            }
            return "季节报错";
        }



    }
    public enum SourceId {
        //审核状态0 默认状态    1待审核，2审核中，3审核通过，4审核驳回
        YXBB("院校情况年度报备审核配置", 2L), YXZS("招生专业申报审核配置", 3L),
        YXZSJH("招生计划申报审核配置", 4L), ZSJZ("招生简章申报审核配置", 5L),
        YXXJ("确认入学学籍花名册报备配置", 6L),
        YXXJYD("学籍异动申报审核配置", 7L),
        YXXJLQ("招生录取审核配置", 8L),
        YBYSQSHPZ("预毕业申请审核配置", 9L),
        YXXJYJ("学籍预警处理申报", 10L),
        MXFSQ("免学费申请", 11L),
        ZXJSQ("助学金申请", 12L),
        ZXJZGSQ("助学金申请资格申请", 13L),
        BUFAZISQ("补发资助申请", 14L),
        MXF("免学费与生均配置申请", 15L),
        ;
        public String name;
        public Long value;

        private SourceId(String name, Long value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Long value) {
            for (SourceId e : SourceId.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }
    }

    public enum QuarterEnum {
        //招生季节，1是春季，2是秋季',
        CJ("春季", "1"), QJ("秋季", "2");
        public String name;
        public String value;

        private QuarterEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (QuarterEnum e : QuarterEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }
    }


    public enum FunctionEnum {
        XZ("新增", 1), XG("修改", 2);
        public String name;
        public Integer value;

        private FunctionEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (FunctionEnum e : FunctionEnum.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * '学籍状态(根据异动类型) 1-正式学籍（默认值），2-保留学籍，3-已离校
     */
    public enum StudentStatusEnum {
        ZSXJ("正式学籍", 1L), BLXJ("保留学籍", 2L), YLX("已离校", 3L);
        public String name;
        public Long value;

        private StudentStatusEnum(String name, Long value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Long value) {
            for (StudentStatusEnum e : StudentStatusEnum.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * '离校类别(根据异动类型) 默认空值,1. 毕业，2. 结业，3. 退学，4. 系统内转出，5. 系统外转出，6. 预毕业（部系统不存在的值），7. 预结业（部系统不存在的值）
     */
    public enum LeaveItemEnum {
        BY("毕业", 1), JY("结业", 2), TX("退学", 3), XTNZC("系统内转出", 4), XTWZC("系统外转出", 5), YBY("预毕业（部系统不存在的值）", 6), YJY("V", 7);
        public String name;
        public Integer value;

        private LeaveItemEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (LeaveItemEnum e : LeaveItemEnum.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 数据状态(根据异动类型) 1. 正常数据（默认值）,2. 应毕业（说明：学员学籍过了应毕业的时间，没有操作“毕结业”，系统就自动归到“应毕业”了）
     */
    public enum DataStateEnum {
        ZCSZ("正常数据（默认值）", 1), YBY("应毕业", 2);
        public String name;
        public Integer value;

        private DataStateEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (DataStateEnum e : DataStateEnum.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 录入类型，1是学生端（小程序）报名，2系统导入
     */
    public enum InputTypeEnum {
        XSDBM("学生端（小程序）报名", 1), XTDR("2系统导入", 2);
        public String name;
        public Integer value;

        private InputTypeEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (InputTypeEnum e : InputTypeEnum.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 固化状态1-固化中，2-固化完成'
     */
    public enum SolidifyStateEnum {
        GHZ("固化中", "1"), GHWC("固化完成", "2");
        public String name;
        public String value;

        private SolidifyStateEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (SolidifyStateEnum e : SolidifyStateEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }


    /**
     * 是否拥有中职卡或社保卡,1有,2没有
     */
    public enum IsHavaCertificateEnum {
        YOU("有", "1"), MY("没有", "2");
        public String name;
        public String value;

        private IsHavaCertificateEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (IsHavaCertificateEnum e : IsHavaCertificateEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 1-低保（含特困供养）家庭学生，2-建档立卡家庭学生，3-残疾学生，
     * 4-孤儿，5-烈士、英雄模范和因公牺牲军人、公安民警和消防人员家庭子女，
     * 6-优抚对象子女，7-残疾人家庭子女，9-其他经济困难家庭子女
     *
     * @param
     */
    public enum FamilyDifficultyTypeEnum {
        DBJT("低保家庭", 1L), JDLK("建档立卡家庭", 2L),
        CJXS("残疾学生", 3L), GER("孤儿", 4L),
        LS("烈士、英雄模范和因公牺牲军人、公安民警和消防人员家庭子女", 5L), YFZN("优抚对象子女", 6L),
        CJR("残疾人家庭子女", 7L), QTJJKN("其他经济困难家庭子女", 8L);
        public String name;
        public Long value;

        private FamilyDifficultyTypeEnum(String name, Long value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Long value) {
            for (FamilyDifficultyTypeEnum e : FamilyDifficultyTypeEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 专业性质，1-普通，2-涉农，3-特殊高级工，4,-顶岗实习困难
     */
    public enum MajorNatureEnum {
        PT("普通", 1L), SN("涉农", 2L),
        TJGJG("特殊高级工", 3L), DGSXKN("顶岗实习困难", 4L);
        public String name;
        public Long value;

        private MajorNatureEnum(String name, Long value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Long value) {
            for (MajorNatureEnum e : MajorNatureEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 院校性质 1公办，2民办',
     */
    public enum SchoolNatureEnum {
        GB("公办", "1"), MB("民办", "2");

        public String name;
        public String value;

        private SchoolNatureEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (SchoolNatureEnum e : SchoolNatureEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }
    }

    /**
     * 学制 1-一年，2-二年，3-三年，4-四年，5-五年，6-六年'
     */
    public enum InstitutionTypeEnum {
        YNJ("一年级", 1), ENJ("二年级", 2),
        SNJ("三年级", 3), FNJ("四年级", 4),
        WNJ("五年级", 5), LNJ("六年级", 6);
        public String name;
        public Integer value;

        private InstitutionTypeEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Integer value) {
            for (InstitutionTypeEnum e : InstitutionTypeEnum.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }

    }

    public enum InstitutionTypeEnumx{
        YNJ("一年", 1), ENJ("二年", 2),
        SNJ("三年", 3), FNJ("四年", 4),
        WNJ("五年", 5), LNJ("六年", 6);
        public String name;
        public Integer value;

        private InstitutionTypeEnumx(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Integer value) {
            for (InstitutionTypeEnum e : InstitutionTypeEnum.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }

    }
    /**
     * 是否为三区三州
     */
    public enum FamilyIsThreeDistrictsEnum {
        YES("普通", "1"), NO("涉农", "2");
        public String name;
        public String value;

        private FamilyIsThreeDistrictsEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Integer value) {
            for (FamilyIsThreeDistrictsEnum e : FamilyIsThreeDistrictsEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 具体连片特困地区 1-六盘区等11个连片特困地区，2-西藏，3-四省藏区，4-新疆南疆四地州
     */
    public enum FamilyDifficultyAreaDistrictEnum {
        LPTKDQ("六盘区等11个连片特困地区", "1"), XZ("西藏", "2"),
        SSZQ("四省藏区", "3"), XJNJSDZ("新疆南疆四地州", "4");
        public String name;
        public String value;

        private FamilyDifficultyAreaDistrictEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Integer value) {
            for (FamilyDifficultyAreaDistrictEnum e : FamilyDifficultyAreaDistrictEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }


    /**
     * 培养模式，1-全日制，2-非全日制
     */
    public enum FosterTypeEnum {
        QRZ("全日制", 1L), FQRZ("非全日制", 2L);
        public String name;
        public Long value;

        private FosterTypeEnum(String name, Long value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Long value) {
            for (FosterTypeEnum e : FosterTypeEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }


    /**
     * 培养层次，1-初级，2-中级，3-高级，4,-预备技师
     */
    public enum FosterLevelEnum {
        CJ("初级", 1L), ZJ("中级", 2L),
        GJ("高级", 3L), YBJS("预备技师", 4L);
        public String name;
        public Long value;

        private FosterLevelEnum(String name, Long value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Long value) {
            for (FosterLevelEnum e : FosterLevelEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 户口所在地生源地（根据规则自动赋值）默认为空,1-东部，2-中部，3-西部，4-港澳台，5-外籍
     */
    public enum FamilyOfStudentEnum {
        DB("东部", "1"), ZB("中部", "2"),
        XB("西部", "3"), GAT("港澳台", "4"),
        WJ("外籍", "5");
        public String name;
        public String value;

        private FamilyOfStudentEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Integer value) {
            for (FamilyOfStudentEnum e : FamilyOfStudentEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 家庭信息，是否连片特困区 1-是，2-否
     */
    public enum FamilyIsDifficultyAreaEnum {
        YES("是", "1"), NO("否", "2");
        public String name;
        public String value;

        private FamilyIsDifficultyAreaEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Integer value) {
            for (FamilyIsDifficultyAreaEnum e : FamilyIsDifficultyAreaEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }


    /**
     * 是否中招平台招收外地生 默认为空，当培养层次为 1-初级 存在值1-是，2-否
     */
    public enum RecruitNonlocalFlagEnum {
        YES("是", "1"), NO("否", "2");
        public String name;
        public String value;

        private RecruitNonlocalFlagEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Integer value) {
            for (RecruitNonlocalFlagEnum e : RecruitNonlocalFlagEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }


    /**
     * 归档状态
     */
    public enum FileStatusEnum {
        YSY("是", "1"), WSY("否", "2");
        public String name;
        public String value;

        private FileStatusEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Integer value) {
            for (FileStatusEnum e : FileStatusEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }


    /**
     * 申请类型 1-免学费，2-资助金',
     */
    public enum ApplyTypeEnum {
        MXF("免学费", "1"), ZXJ("资助金", "2");
        public String name;
        public String value;

        private ApplyTypeEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (ApplyTypeEnum e : ApplyTypeEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }

    /**
     * 申请类型 1-免学费，2-生均',
     */
    public enum TuitionTypeEnum {
        MXF("免学费", "1"), SJ("生均", "2");
        public String name;
        public String value;

        private TuitionTypeEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(Integer value) {
            for (TuitionTypeEnum e : TuitionTypeEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }


    public enum PublicStatus {
        TSG("未公示", 0), WGS("已公示无异议", 1), YYY("公示有异议", 2);
        public String name;
        public Integer value;

        private PublicStatus(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (PublicStatus e : PublicStatus.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }
    }


    public enum SchoolComments {
        DSH("待审核", 0), YTG("已通过", 1), WTG("未通过", 2);
        public String name;
        public Integer value;

        private SchoolComments(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (SchoolComments e : SchoolComments.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }
    }

    public enum GrantConfirmState {
        YSQWFK("已申请未反馈", 1), FSCG("发放成功", 2), ZZFF("终止发放", 3),
        ZTFF("暂停发放", 4), FFSB("发放失败", 5), DK("抵扣", 6);

        GrantConfirmState(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String name;
        public Integer value;
    }

    /**
     * 资格类型 1-低保（含特困供养）家庭学生，2-建档立卡家庭学生，3-残疾学生，4-孤儿，5-烈士、英雄模范和因公牺牲军人、公安民警和消防人员家庭子女，6-优抚对象子女，7-残疾人家庭子女，8-其他经济困难家庭学生（子女），9-连片地区困难，10-三州三区困难，11-涉农专业',
     */
    public enum SupportQualificationsApplyEnum {
        DB("低保（含特困供养）家庭学生", 1),
        JDLK("建档立卡家庭学生", 2),
        CJXS("残疾学生", 3),
        GE("孤儿", 4),
        LS("烈士、英雄模范和因公牺牲军人、公安民警和消防人员家庭子女", 5),
        YFZN("优抚对象子女", 6),
        CJZN("残疾人家庭子女", 7),
        QTNV("其他经济困难家庭学生（子女）", 8),
        LP("连片地区困难", 9),
        SZ("三州三区困难", 10),
        SN("涉农专业", 11),
        XZ("西藏、四省涉藏州县、新疆南疆四地州中等职业学校农村学生（不含县城）", 12);
        public String name;
        public Integer value;

        private SupportQualificationsApplyEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (SupportQualificationsApplyEnum e : SupportQualificationsApplyEnum.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }
        public static Integer getValue(String name) {
            for (SupportQualificationsApplyEnum e : SupportQualificationsApplyEnum.values()) {
                if (name.contains(e.name)) {
                    return e.value;
                }
            }
            return null;
        }
    }

    /**
     * 申报状态 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）
     */
    public enum DeclareStatusEnum {
        CG("草稿", 1),
        DSH("待审核", 2),
        SHBH("审核驳回", 3),
        SHTG("审核通过（无需监管中心审批时，显示审核通过的状态）", 4),
        DSB("待审批", 5),
        SBTG("审批通过", 6),
        SBBH("审批驳回", 7),
        CH("撤回（院校自行撤回审批流）", 8),
        TH("退回", 9);

        public String name;
        public Integer value;

        private DeclareStatusEnum(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(int value) {
            for (DeclareStatusEnum e : DeclareStatusEnum.values()) {
                if (e.value == value) {
                    return e.name;
                }
            }
            return "";
        }

    }


    /**
     * 1已发放未反馈、2-发放成功、3-终止发放、4-暂停发放、5-发放失败、6-抵扣（院校端）',
     */
    public enum GrantConfirmStateEnum {
        YFWFK("1已发放未反馈", "1"),
        CG("发放成功", "2"),
        ZZ("终止发放", "3"),
        ZT("暂停发放", "4"),
        SB("发放失败", "5"),
        DK("抵扣", "6");
        public String name;
        public String value;

        private GrantConfirmStateEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (GrantConfirmStateEnum e : GrantConfirmStateEnum.values()) {
                if (e.value.equals(value)) {
                    return e.name;
                }
            }
            return "";
        }

    }


    public static void main(String[] args) {
        System.out.println("SourceId.YXBB.value = " + SourceId.YXBB.value);
    }

}
