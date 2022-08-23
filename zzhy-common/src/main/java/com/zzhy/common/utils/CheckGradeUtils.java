package com.zzhy.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckGradeUtils {
    /**
     * 全日制判断年级
     *
     * @param solidifyYear
     * @param solidifyMonth
     * @param objectYear
     * @param season
     * @return
     */
    public static int judgeGradeFullTime(Integer solidifyYear, Integer solidifyMonth, Integer objectYear, Integer season) {
        int i = solidifyYear - objectYear;
        //没有跨年 属于一年级
        if (i == 0) {
            return 1;
        }
        //固化月份如果是一月份
        if (solidifyMonth <= 2) {
            return i;
            //固化月份如果是3-7月份
        } else if (3 <= solidifyMonth && solidifyMonth <= 7) {
            //如果是春季则提升一年级
            if (season == 1) {
                return i + 1;
            } else {
                return i;
            }
            //固化月份如果是9月份
        } else {
            return i + 1;
        }
    }

    /**
     * 非全日制判断年级
     *
     * @param solidifyYear
     * @param solidifyMonth
     * @param classCreateTime
     * @return
     */
    public static int judgeGradeNoFullTime(Integer solidifyYear, Integer solidifyMonth, Date classCreateTime) {
        String format = new SimpleDateFormat("yyyy-MM").format(classCreateTime);
//        String dateYearMonth = DateUtils.getDateYearMonth();
        String[] yearMonth = format.split("-");
//        int i = solidifyYear - Integer.valueOf(yearMonth[0]) <= 1 ? 1 : solidifyYear - Integer.valueOf(yearMonth[0]);
        int i = solidifyYear - Integer.valueOf(yearMonth[0]);
        //代表是否跨年
        if (i == 0) {
            return 1;
        } else {
            if (solidifyMonth > Integer.valueOf(yearMonth[1])) {
                return i + 1;
            } else {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        int i1 = judgeGradeFullTime(2021, 1, 2020, 1);
        int i2= judgeGradeFullTime(2021, 1, 2020, 2);

        int i3 = judgeGradeFullTime(2021, 3, 2020, 1);
        int i4 = judgeGradeFullTime(2021, 3, 2020, 2);

        int i5= judgeGradeFullTime(2021, 9, 2020, 1);
        int i6 = judgeGradeFullTime(2021, 9, 2020, 2);
        System.out.println("i1 = " + i1);
        System.out.println("i1 = " + i2);
        System.out.println("i1 = " + i3);
        System.out.println("i1 = " + i4);
        System.out.println("i1 = " + i5);
        System.out.println("i1 = " + i6);
    }
}
