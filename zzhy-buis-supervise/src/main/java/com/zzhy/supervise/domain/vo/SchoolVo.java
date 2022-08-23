package com.zzhy.supervise.domain.vo;

import com.zzhy.supervise.domain.CollegesAttachment;
import com.zzhy.supervise.domain.School;
import lombok.Data;

import java.util.List;

/**
 * 院校对象 sch_school
 * 
 * @author zzhy
 * @date 2021-11-11
 */
@Data
public class SchoolVo extends School
{
    /**
     * 年度报备附件对象集合
     */
    private List<CollegesAttachment> attachments;
}
