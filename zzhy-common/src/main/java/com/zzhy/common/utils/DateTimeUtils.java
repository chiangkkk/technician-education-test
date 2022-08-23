package com.zzhy.common.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTimeUtils {
	public static String yyyyMM = "yyyy-MM";
	public static String yyyyMMdd = "yyyy-MM-dd";
	public static String yMdHms = "yyyy-MM-dd HH:mm:ss";
	public static String Hms = "HH:mm:ss";
	public static String yMdHm = "yyyyMMddHHmm";
	public static String yMdH = "yyyyMMddHH";
	public static String yyyyMMddHHmmss = "yyyyMMddHHmmss";
	/**
	 * 时间格式：年月日
	 */
	public final static String DATE_FORMAT_YMD = "yyyyMMdd";

	public final static String DATE_FORMAT_Y = "yyyy";

	/**
	 * 时间间隔：日
	 */
	public final static int DATE_INTERVAL_DAY = 1;
	/**
	 * 时间间隔：周
	 */
	public final static int DATE_INTERVAL_WEEK = 2;
	/**
	 * 时间间隔：月
	 */
	public final static int DATE_INTERVAL_MONTH = 3;
	/**
	 * 时间间隔：年
	 */
	public final static int DATE_INTERVAL_YEAR = 4;
	/**
	 * 时间间隔：小时
	 */
	public final static int DATE_INTERVAL_HOUR = 5;
	/**
	 * 时间间隔：分钟
	 */
	public final static int DATE_INTERVAL_MINUTE = 6;
	/**
	 * 时间间隔：秒
	 */
	public final static int DATE_INTERVAL_SECOND = 7;

//	static SimpleDateFormat monthFormat = new SimpleDateFormat("yyyy-MM");
//	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	static SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	
	private static Map<String, ThreadLocal<SimpleDateFormat>> mapThreadLocal = new HashMap<String, ThreadLocal<SimpleDateFormat>>();
	private static final Object lockObj = new Object();
	
	/**
	 * 获取格式化类
	 * @param pattern
	 * @return
	 */
	public static SimpleDateFormat getSimpleDateFormat(final String pattern) {
		ThreadLocal<SimpleDateFormat> df = mapThreadLocal.get(pattern);
		if (df == null) {
			synchronized (lockObj) {
				df = mapThreadLocal.get(pattern);
				if (df == null) {
					df = new ThreadLocal<SimpleDateFormat>() {
						@Override
						protected SimpleDateFormat initialValue() {
							return new SimpleDateFormat(pattern);
						}
					};
					mapThreadLocal.put(pattern, df);
				}
			}
		}
		return df.get();
	}
	
	/**
	 * 日期格式转换
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getDate(String date) throws ParseException{
		SimpleDateFormat dateFormat = getSimpleDateFormat(yyyyMMdd);

		return dateFormat.parse(date);
	}
	
	/**
	 * 日期格式转换
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getMonth(String date) throws ParseException{
		SimpleDateFormat monthFormat = getSimpleDateFormat(yyyyMM);

		return monthFormat.parse(date);
	}
	
	/**
	 * 日期格式转换
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getDateTime(String date) throws ParseException{
		SimpleDateFormat dateTimeFormat = getSimpleDateFormat(yMdHms);

		return dateTimeFormat.parse(date);
	}
	/**
	 * 日期+随机数
	 * @return
	 */
	public static String getFileName(){
		return new DateTime().toString("yyyyMMdd") + RandomStringUtils.randomAlphanumeric(12);
	}
	
	/**
	 * 获取两个日期之间的日期,包含起始时间和结束时间
	 * 
	 * @param start
	 *            开始日期
	 * @param end
	 *            结束日期
	 * @return 日期集合
	 */
	public static List<Date> getBetweenDates(Date start, Date end) {
		List<Date> result = new ArrayList<Date>();
		result.add(start);
		Calendar tempStart = Calendar.getInstance();
		tempStart.setTime(start);
		tempStart.add(Calendar.DAY_OF_YEAR, 1);

		Calendar tempEnd = Calendar.getInstance();
		tempEnd.setTime(end);
		while (tempStart.before(tempEnd)) {
			result.add(tempStart.getTime());
			tempStart.add(Calendar.DAY_OF_YEAR, 1);
		}
		result.add(end);
		return result;
	}

	/**
	 * 获取当前日期七天前的日期
	 * 
	 * @return
	 */
	public static Date getBeforeDate() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -7);
		return date = calendar.getTime();
	}

	/**
	 * 获取日期之间所有月份
	 * @param minDate
	 * @param maxDate
	 * @return
	 * @throws ParseException
	 */
	public static List<String> getMonthBetween(String minDate, String maxDate) throws ParseException {
		ArrayList<String> result = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 格式化为年月日

		Calendar min = Calendar.getInstance();
		Calendar max = Calendar.getInstance();

		min.setTime(sdf.parse(minDate));
		min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

		max.setTime(sdf.parse(maxDate));
		max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

		Calendar curr = min;
		while (curr.before(max)) {
			result.add(sdf.format(curr.getTime()));
			curr.add(Calendar.MONTH, 1);
		}

		return result;
	}

	/**
	 * 获取月份起始日期
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getMinMonthDate(String date) throws ParseException {
		SimpleDateFormat dateFormat = getSimpleDateFormat(yyyyMMdd);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateFormat.parse(date));
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		return calendar.getTime();
	}



	/**
	 * 获取月份最后日期
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getMaxMonthDate(String date) throws ParseException {
		SimpleDateFormat dateFormat = getSimpleDateFormat(yyyyMMdd);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateFormat.parse(date));
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return calendar.getTime();
	}

	/**
	 * 获取某日多年前的数据
	 * 
	 * @param year 年数
	 * @return
	 */
	public static String getYear(Integer year) {
		SimpleDateFormat dateFormat = getSimpleDateFormat(yyyyMMdd);

		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, year);
		return dateFormat.format(calendar.getTime());
	}



	/**
	 * 获取某日日期前的日期
	 * @param days 天数
	 * @return
	 */
	public static String getDate(Integer days) {
		SimpleDateFormat dateFormat = getSimpleDateFormat(yyyyMMdd);

		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return dateFormat.format(calendar.getTime());
	}
	/*
	 * 返回起始时间结束时间
	 * 1--今日  2--昨日  3--近3日   4--近7日  5--近30天  null--不限
	 * */
	public static HashMap<String, String> getData(Integer type)
	{
		HashMap<String, String> hashMap = new  HashMap<String, String>();
		if(null == type)
		{
			hashMap.put("startTime", "");
			hashMap.put("endTime", "");
		}
		else
		{
			switch (type) {
			case 1:
				hashMap.put("startTime", getDate(0));
				hashMap.put("endTime", getDate(0));
				break;

			case 2:
				hashMap.put("startTime", getDate(-1));
				hashMap.put("endTime", getDate(-1));
				break;

			case 3:
				hashMap.put("endTime", getDate(0));
				hashMap.put("startTime", getDate(-3));
				break;

			case 4:
				hashMap.put("endTime", getDate(0));
				hashMap.put("startTime", getDate(-7));
				break;

			case 5:
				hashMap.put("startTime", getDate(-30));
				hashMap.put("endTime", getDate(0));
				break;

			default:
				hashMap.put("startTime", "");
				hashMap.put("endTime", "");
				break;
			}
		}
		
		return hashMap;
	}


	/**
	 * 获取当前时间 yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getCurTime() {
		return new DateTime().toString("yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 通过日期获取格式化时间Y-m-d H:i:s
	 * 
	 * @return
	 */
	public static String getDateTimeByDate(Date date) {
		SimpleDateFormat dateTimeFormat = getSimpleDateFormat(yMdHms);

		return dateTimeFormat.format(date);
	}
	
	/**
	 * 通过日期获取格式化时间Y-m-d
	 * 
	 * @return
	 */
	public static String getDateByDate(Date date) {
		SimpleDateFormat dateFormat = getSimpleDateFormat(yyyyMMdd);

		return dateFormat.format(date);
	}

	/**
	 * 通过当前时间Y-m-d
	 * 
	 * @return
	 * @throws ParseException 
	 */
	public static Date getCurData() throws ParseException {
		SimpleDateFormat dateTimeFormat = getSimpleDateFormat(yMdHms);
		SimpleDateFormat dateFormat = getSimpleDateFormat(yyyyMMdd);

		String string =  dateTimeFormat.format(new Date());
		try {
			return dateFormat.parse(string);
		} catch (ParseException e) {
			//e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 通过当前时间H:i:s
	 * 
	 * @return
	 * @throws ParseException 
	 */
	public static Date getCurTimeDate() throws ParseException {
		SimpleDateFormat timeFormat = getSimpleDateFormat(Hms);
		
		String string =  timeFormat.format(new Date());
		try {
			return timeFormat.parse(string);
		} catch (ParseException e) {
			//e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 通过日期获取格式化时间Y-m
	 * 
	 * @return
	 */
	public static String getMonthByDate(Date date) {
		SimpleDateFormat monthFormat = getSimpleDateFormat(yyyyMM);

		return monthFormat.format(date);
	}

	/**
	 * 通过日期获取格式化时间Y-m
	 *
	 * @return
	 */
	public static String getCurByDate(Date date) {
		SimpleDateFormat dateFormat = getSimpleDateFormat(DATE_FORMAT_YMD);

		return dateFormat.format(date);
	}
	
	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	public static String getCurTimeyMdHms() {
		return new DateTime().toString("yyyyMMddHHmmss");
	}
	
	/**
	 * 获取当前日期
	 * 
	 * @return
	 */
	public static String getCurDate() {
		return new DateTime().toString("yyyy-MM-dd");
	}
	
	public static long[] getDisTime(Date startDate, Date endDate){
         long timesDis = Math.abs(startDate.getTime() - endDate.getTime());
         long day = timesDis / (1000 * 60 * 60 * 24);
         long hour = timesDis / (1000 * 60 * 60) - day * 24;
         long min = timesDis / (1000 * 60) - day * 24 * 60 - hour * 60;
         long sec = timesDis / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60;
         return new long[]{day, hour, min, sec};
	}
	
	/**
	 * 获取时间差
	 * 
	 * @return N天N小时N分钟
	 */
	public static String getDateDiff(Date startDate, Date endDate) {		
		long[] dis = getDisTime(startDate, endDate);
		return new StringBuilder().append(dis[0]).append("天").append(dis[1]).append("小时").append(dis[2]).append("分钟").toString();
	}

	/**
	 * 判断日期是否是在同一个月
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean isSameDate(Date date1, Date date2) {
		try {
			Calendar cal1 = Calendar.getInstance();
			cal1.setTime(date1);

			Calendar cal2 = Calendar.getInstance();
			cal2.setTime(date2);

			boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
			boolean isSameMonth = isSameYear && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);

			return isSameMonth;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * 获取当前N天的日期,N为整数表示N天之后,N为负表示N天前
	 * 
	 * @return
	 */
	public static Date getNDay(Integer NDate) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, NDate);
		return date = calendar.getTime();
	}

	/**
	 * 获取当前N月的日期,N为整数表示N月之后,N为负表示N月前
	 * 
	 * @return
	 */
	public static Date getNMonth(Integer NMonth) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, NMonth);
		return date = calendar.getTime();
	}
	
	/**
	 * 获取当前N天的日期,N为整数表示N天之后,N为负表示N天前
	 * 
	 * @return
	 */
	public static Date getNDay(Integer NDate, Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, NDate);
		return date = calendar.getTime();
	}
	
	/**
	 * 获取当前N分钟的日期,N为整数表示N分钟之后,N为负表示N分钟前
	 * 
	 * @return
	 */
	public static Date getNMinite(Integer NMinute) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, NMinute);
		return date = calendar.getTime();
	}
	
	/**
	 * 获取某一时间的N分钟的日期,N为整数表示N分钟之后,N为负表示N分钟前
	 * 
	 * @return
	 */
	public static Date getNMinite(Integer NMinute, Date date) {
//		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, NMinute);
		return date = calendar.getTime();
	}
	
	/**
	 * 获取当前N分钟的日期,N为整数表示N分钟之后,N为负表示N分钟前
	 * 
	 * @return
	 */
	public static Date getNSec(Integer NSec) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.SECOND, NSec);
		return date = calendar.getTime();
	}

	/**
	 * 获取date 的N秒的日期,N为整数表示N秒之后,N为负表示N秒前
	 * 
	 * @return
	 */
	public static Date getNSec(Integer NSec, Date date) {
//		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.SECOND, NSec);
		return date = calendar.getTime();
	}
	
	/**
	 * 获取当前日期格式为20101011的日期
	 * @return
	 */
	public static String getCurDateYMD() {
		return new DateTime().toString("yyyyMMdd");
	}
	
	/**
	 * 根据时间获取是今天、昨天、和日期
	 * @param date Y-m-d H:i:s
	 * @return
	 */
	public static String getTimeDesc(Date date)
	{
		SimpleDateFormat dateFormat = getSimpleDateFormat(yyyyMMdd);
		String time = "";
		
		time = dateFormat.format(date);
		
		String curTime = getCurDate();
		
		if(curTime.equals(time))
		{
			return "今日";
		}
		else 
		{
			date = getNDay(-1);
			String yesterTime = dateFormat.format(date);
			
			if(yesterTime.equals(time))
			{
				return "昨日";
			}
			else
			{
				return time;
			}
		}
	}
	
	/**
	 * 根据时间获取是本月，N月 2017-01-01
	 * @param date Y-m-d H:i:s
	 * @return
	 */
	public static String getMonthDesc(Date date)
	{		
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		SimpleDateFormat onlyMonthFormat = new SimpleDateFormat("MM");
		String curYear = yearFormat.format(new Date());
		String curMon = onlyMonthFormat.format(new Date());
		
		if(yearFormat.format(date).equals(curYear))
		{
			if(onlyMonthFormat.format(date).equals(curMon))
			{
				return "本月";
			}
			else
			{
				return Integer.valueOf(onlyMonthFormat.format(date))+"月";
			}
		}
		else
		{
			SimpleDateFormat monthFormat = getSimpleDateFormat(yyyyMM);

			return monthFormat.format(date);
		}
	}

	/**
	 * 获取时间的时分秒
	 * @param date H:i:s
	 * @return
	 */
	public static String getTime(Date date)
	{		
		SimpleDateFormat timeFormat = getSimpleDateFormat(Hms);
//			date = dateTimeFormat.parse(time);
		String time = timeFormat.format(date);
		
		return time;

	}
	
	/**
	 * 获取天数差
	 * 
	 * @param start
	 *            开始日期
	 * @param end
	 *            结束日期
	 * @return 日期集合
	 */
	public static int getBetweenDateCount(Date start, Date end) {
		long startTmp = start.getTime();
		long endTmp = end.getTime();
		
		Double value = (endTmp - startTmp) / (60 * 60 * 24 * 1000.0);
		return (int)Math.ceil(value);
	}
	
	/**
	 * 获取小时差
	 * @param start
	 * @param end
	 * @return
	 */
	public static int getBetweenHourCount(Date start, Date end){
		long startTmp = start.getTime();
		long endTmp = end.getTime();
		
		Double value = (endTmp - startTmp) / (1000.0 * 60 * 60);
		return (int)Math.ceil(value);
	}
	/** 
	 * 取得当月天数 
	 * */  
	public static int getCurrentMonthLastDay()  
	{  
	    Calendar a = Calendar.getInstance();  
	    a.set(Calendar.DATE, 1);//把日期设置为当月第一天  
	    a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天  
	    int maxDate = a.get(Calendar.DATE);  
	    return maxDate;  
	}
	
	/**
	 * 获取当前月份
	 * @return
	 */
	public static int getCurMonth() {
		SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
		return Integer.valueOf(monthFormat.format(new Date()));
	}
	
	/**
	 * 获取下一个月份
	 * @return
	 */
	public static int getNextMonth() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
	
		SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
		return Integer.valueOf(monthFormat.format(calendar.getTime()));
	}

	/**
	 * 通过日期获取格式化时间yyMMddHHmm
	 *
	 * @return
	 */
	public static String getDateMiByDate(Date date) {
		SimpleDateFormat dateTimeFormat = getSimpleDateFormat(yMdHm);
		return dateTimeFormat.format(date);
	}

	/**
	 * 通过日期获取格式化时间yyMMddHH
	 *
	 * @return
	 */
	public static String getDateHourByDate(Date date) {
		SimpleDateFormat dateTimeFormat = getSimpleDateFormat(yMdH);
		return dateTimeFormat.format(date);
	}


	/**
	 * 获取文件服务器文件夹和对应的日期
	 * 判断日期是否是大于00分 小于30分， 大于30分 小于 59分
	 * @param date
	 * @return
	 */
	public static String stageDate(Date date) {
		String stageDateStr = "";
		//当前时间到分
		String currDateM = getDateMiByDate(date);
		String currDateH = getDateHourByDate(date);
		String add00 = currDateH+"00";
		String add30 = currDateH+"30";
		String add59 = currDateH+"59";
		if(BigDecimal.valueOf(Long.parseLong(currDateM)).compareTo(BigDecimal.valueOf(Long.parseLong(add00)))>0 &&  BigDecimal.valueOf(Long.parseLong(currDateM)).compareTo(BigDecimal.valueOf(Long.parseLong(add30)))<0 ){
			stageDateStr=add00;
		}else if(BigDecimal.valueOf(Long.parseLong(currDateM)).compareTo(BigDecimal.valueOf(Long.parseLong(add30)))>0 &&  BigDecimal.valueOf(Long.parseLong(currDateM)).compareTo(BigDecimal.valueOf(Long.parseLong(add59)))<0 ){
			stageDateStr=add30;
		}
		return stageDateStr;
	}

	/**
	 * 日期格式转换 将时间格式为yyyyMMddHHmmss 转为Date
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getDateTimeTwo(String date) throws ParseException{
		SimpleDateFormat dateTimeFormat = getSimpleDateFormat(yyyyMMddHHmmss);

		return dateTimeFormat.parse(date);
	}

	/**
	 * 获取当前年份 yyyy
	 *
	 * @return
	 */
	public static String getCurTimeYear() {
		return new DateTime().toString("yyyy");
	}

	/**
	 * 获取日期的年份 yyyy
	 *
	 * @return
	 */
	public static String getDateYear(Date date) {
		SimpleDateFormat dateTimeFormat = getSimpleDateFormat("yyyy");
		return dateTimeFormat.format(date);
	}

	/**
	 * 加时间
	 * @creationDate. 2019-10-12
	 * @param interval 增加项，可以是天数、月份、年数、时间、分钟、秒
	 * @param date 时间
	 * @param num 加的数目
	 * @return 时间加后的时间
	 */
	public static Date dateAdd(int interval, Date date, int num) {
		if (date == null) return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		switch (interval) {
			case DATE_INTERVAL_DAY:
				calendar.add(Calendar.DATE, num);
				break;
			case DATE_INTERVAL_WEEK:
				calendar.add(Calendar.WEEK_OF_MONTH, num);
				break;
			case DATE_INTERVAL_MONTH:
				calendar.add(Calendar.MONTH, num);
				break;
			case DATE_INTERVAL_YEAR:
				calendar.add(Calendar.YEAR, num);
				break;
			case DATE_INTERVAL_HOUR:
				calendar.add(Calendar.HOUR, num);
				break;
			case DATE_INTERVAL_MINUTE:
				calendar.add(Calendar.MINUTE, num);
				break;
			case DATE_INTERVAL_SECOND:
				calendar.add(Calendar.SECOND, num);
				break;
			default:
		}
		return calendar.getTime();
	}


	/**
	 * 获取日期之间所有月份
	 * @param minDate
	 * @param maxDate
	 * @return
	 * @throws ParseException
	 */
	public static List<Date> getMonthDateBetween(Date minDate, Date maxDate) throws ParseException {
		ArrayList<Date> result = new ArrayList<Date>();

		Calendar min = Calendar.getInstance();
		Calendar max = Calendar.getInstance();

		min.setTime(minDate);
		max.setTime(maxDate);

		Calendar curr = min;
		while (curr.before(max)) {
			result.add(curr.getTime());
			curr.add(Calendar.MONTH, 1);
		}

		return result;
	}


	/**
	 * 获取两个时间秒数
	 * @param start
	 * @param end
	 * @return
	 */
	public static long getBetweenSecond(Date start, Date end){
		long startTmp = start.getTime();
		long endTmp = end.getTime();
		long value =  (endTmp - startTmp) / 1000;
//		Double value = (endTmp - startTmp) / (1000.0 * 60 * 60);
		return value;
	}


	/**
	 * 根据当前时间获取上一个月的月初时间
	 * @return
	 */
	public static String getUpperDateByCurrTime(){
		Date upperMonth = getNMonth(-1);
		String upMonth = getMonthByDate(upperMonth);
		String upperDate = upMonth+"-01";
		return upperDate;
	}

    /**
     * 根据当前时间获取下一个月的月初时间
     * @return
     */
    public static String getNextDateByCurrTime(){
        Date upperMonth = getNMonth(1);
        String upMonth = getMonthByDate(upperMonth);
        String upperDate = upMonth+"-01";
        return upperDate;
    }

	/**
	 * 日期格式转换 2019-06-27T16:00:00.000Z 转换
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getUTCDateTime(String date) throws ParseException{
		if(date.contains("T") || date.contains("Z")){
			Date dateTime =null;
			date = date.replace("Z", " UTC"); //2019-06-27T16:00:00.000 UTC

			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");//转换时区格式
			dateTime = format.parse(date);
			return dateTime;
		}else {
			return getDateTime(date);
		}
	}


	/**
	 * 计算2个日期相差多少年
	 * 列：2011-02-02  ~  2017-03-02 大约相差 6.1 年,全日制按 春季按xxxx年3月，秋季按 xxxx年9月，非全日制 按开班时间来算
	 * @param startDate
	 * @param endDate
	 * @param type 1-全日制，2-非全日制
	 * @return
	 */
	public static int getBetweenYear(Date startDate,Date endDate){
		int gradeInt = 0;
		Calendar  start  =  Calendar.getInstance();
		start.setTime(startDate);
		Calendar  end  =  Calendar.getInstance();
		end.setTime(endDate);

		int startYear = start.get(Calendar.YEAR);
		int startMonth = start.get(Calendar.MONTH);
//		int fromDay = from.get(Calendar.DAY_OF_MONTH);

		int endYear = end.get(Calendar.YEAR);
		int endMonth = end.get(Calendar.MONTH);
//		int toDay = to.get(Calendar.DAY_OF_MONTH);
		int year = endYear  -  startYear;
		int month = endMonth  - startMonth;
		//属于一年级的情况 1、如果结束时间年和开始时间年相等那么就是一年级；2、如果结束时间年大于开始时间年=1，并且开始时间月份大于结束时间月份
		//属于二年级 如果结束时间年大于开始时间年=2，并且开始时间月份大于结束时间月份，以此类推
		if(0 == year){
			gradeInt = year+1;
			if(month >= 0){
				gradeInt = year+2;
			}
		}else if(1 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}else if(2 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}else if(3 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}else if(4 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}else if(5 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}else if(6 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}else if(7 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}else if(8 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}else if(9 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}else if(10 == year){
			gradeInt = year+1;
			if(month < 0){
				gradeInt = year;
			}
		}
//		int day = toDay  - fromDay;
		return gradeInt;
	}


}
