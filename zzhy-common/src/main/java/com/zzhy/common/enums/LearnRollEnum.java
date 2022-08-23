package com.zzhy.common.enums;

public class LearnRollEnum {

    public enum auditStatus{
        //审核状态的五种情况
        DSH("待审核","1"),SHZ("审核中","2"),SHTG("审核通过","3"),
        SHBH("审核驳回","4"),BCYSH("不参与审核","5");

        private String name;
        private String value;

        private auditStatus(String name,String value){
            this.name=name;
            this.value=value;
        }

        public String getName() {
            return name;
        }
        public String getValue() {
            return value;
        }

    }

    public enum changeType{
        //最近异动类型 1. 休学，2. 入伍，3. 复学，4. 留级，5. 退学，6. 系统内转出，7. 系统外转出，8. 系统内转入，9. 系统外转入，10. 请假（部系统不存在的值，11. 开除（部系统不存在的值'
        XX("休学",1L),RW("入伍",2L),FX("复学",3L),LJ("留级",4L),
        TX("退学",5L),XTNZC("系统内转出",6L),XTWZC("系统外转出",7L),
        XTNZR("系统内转入",8L), XTWZR("系统外转入",9L),QJ("请假",10L),KC("开除",11L),
        ZBJHZZY("转班级和转专业(同院校)",12L);

        private final String name;
        private final Long value;

        private changeType(String name,Long value){
            this.name=name;
            this.value=value;
        }

        public String getName() {
            return name;
        }

        public Long getValue() {
            return value;
        }
    }


    public enum schProcessId{
        //院校端申报流程配置表 的id
        situation("院校情况年度报备审核配置",2L),profession("招生专业申报审核配置",3L),
        admission("招生计划申报审核配置",4L),general("招生简章申报审核配置",5L),
        inputInfo("确认入学学籍花名册报备配置",6L),exception("学籍异动申报审核配置",7L),
        input("招生录取审核配置",8L),preGraduation("预毕业申请审核配置",9L);

        private String name;
        private Long value;

        private schProcessId(String name,Long value){
            this.name=name;
            this.value=value;
        }

        public String getName() {
            return name;
        }

        public Long getValue() {
            return value;
        }
    }

    public enum supProcessId{
        //监管端申报流程配置表 的id
        situation("院校情况年度报备审核配置",1L),profession("招生专业申报审核配置",2L),
        admission("招生计划申报审核配置",3L),general("招生简章申报审核配置",4L),
        inputAudit(" 编辑 | 查看 确认入学名单审核配置",5L),
        inputInfo("确认入学学籍花名册报备配置",6L),exception("编辑 | 查看 学籍异动申报审核配置",7L),
        preGraduation("预毕业申请审核配置",8L);

        private String name;
        private Long value;

        private supProcessId(String name,Long value){
            this.name=name;
            this.value=value;
        }

        public String getName() {
            return name;
        }

        public Long getValue() {
            return value;
        }
    }

    public enum applyType{
        //学籍修改与异动类型 1-信息修改，2-异动状态，3-转班级和转专业（同院校），4-转出（系统内，不同院校），5-转出（系统外，比如外省），6-转入（系统内，不同院校），7-转入（系统外，比如外省）8-学籍预警，9-转为预毕业，10-转为于结业，11-转为结业，12-转为毕业'
        infoChange("信息修改",1L),exceptionChange("异动状态",2L),
        classAndProfession("转班级和转专业（同院校）",3L),InterTransferOut("转出（系统内，不同院校）",4L),
        exterTransferOut("转出（系统外，比如外省）",5L),interTransferIn("转入（系统内，不同院校）",6L),
        exterTransferIn("转入（系统外，比如外省）",7L),warning("学籍预警",8L),preGraduation("转为预毕业",9L),
        preCourseOver("转为于结业",10L),courseOver("转为结业",11L),graduation("转为毕业",12L);

        private String name;
        private Long value;

        private applyType(String name,Long value){
            this.name=name;
            this.value=value;
        }

        public String getName() {
            return name;
        }

        public Long getValue() {
            return value;
        }
    }

    public enum auditLevel{
        //终审级别，1-省，2-市，3-区县(暂时不考虑)，4-隶属，5-院校

        province("省","1"),city("市","2"),districtAndCountry("区县(暂时不考虑)","3"),
        affiliated("隶属","4"),colleges("院校","5");

        private String name;
        private String value;

        private auditLevel(String name,String value){
            this.name=name;
            this.value=value;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }
    }

    public enum finalLevel{
        //终审级别 1院校，2院校隶属上级的区县级技工中心,3院校隶属上级的市级技工中心,4院校隶属上级的省级技工中心
        colleges("1院校",1),affiliated("2院校隶属上级的区县级技工中心",2),city("3院校隶属上级的市级技工中心",3),province("4院校隶属上级的省级技工中心",4);

        private String name;
        private Integer value;

        private finalLevel(String name,Integer value){
            this.name=name;
            this.value=value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    public enum leaveItem{
        //离校类别(根据异动类型) 默认空值,1. 毕业，2. 结业，3. 退学，4. 系统内转出，5. 系统外转出，6. 预毕业（部系统不存在的值），7. 预结业（部系统不存在的值）
        graduation("毕业",1L),over("结业",2L),quit("退学",3L),
        interSysOut("系统内转出",4L),exterSysOut("系统外转出",5L),preGraduation("预毕业",6L),
        PreOver("预结业",7L);

        private String name;
        private Long value;

        private leaveItem(String name, Long value){
            this.name=name;
            this.value=value;
        }

        public String getName() {
            return name;
        }

        public Long getValue() {
            return value;
        }
    }




}
