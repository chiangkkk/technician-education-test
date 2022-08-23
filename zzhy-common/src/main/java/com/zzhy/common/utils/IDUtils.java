package com.zzhy.common.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Calendar;
import java.util.Date;

public class IDUtils {

	/**
	 * 15 位随机字符串。字母+数字
	 * 
	 * @return
	 */
	public static String commonID() {
		return Long.toString(System.currentTimeMillis(), Character.MAX_RADIX) + RandomStringUtils.randomAlphanumeric(6);
	}
	
	/**
	 * 获取订单号  ymdhis+6位数字
	 * @return
	 */
	public static String commonOrderNo() {
		return DateTimeUtils.getCurTimeyMdHms() + RandomStringUtils.random(6, "0123456789");
	}

	/**
	 * 集群情况下，设置服务节点号，可避免多个节点间重复
	 */
	private static int nodeIdx = System.getenv("serverNodeIdx") == null ? 1
			: Integer.parseInt(System.getenv("serverNodeIdx"));

	private static Long orderNOIdx = 0l;

	public static String generateOrderNO() {
		synchronized (orderNOIdx) {
			orderNOIdx = orderNOIdx >= 9999 ? 0 : orderNOIdx + 1;
			return DateFormatUtils.format(new Date(), "yyyyMMddHHmmss") + nodeIdx
					+ StringUtils.substring("0000" + orderNOIdx, -4);
		}
	}

	private static Integer orderNOIdx15 = 0;

	public static String generateOrderNO15() {
		synchronized (orderNOIdx15) {
			orderNOIdx15 = orderNOIdx15 >= 99 ? 0 : orderNOIdx15 + 1;
			return DateFormatUtils.format(new Date(), "yyMMddHHmmss") + nodeIdx
					+ StringUtils.substring("00" + orderNOIdx15, -2);
		}
	}

	private static Integer orderNOIdx20 = 0;

	public static String generateOrderNO20() {
		synchronized (orderNOIdx20) {
			orderNOIdx20 = orderNOIdx20 >= 999 ? 0 : orderNOIdx20 + 1;
		}
		return DateFormatUtils.format(Calendar.getInstance(), "yyyyMMddHHmmssSSS")
				+ StringUtils.substring("00" + orderNOIdx20, -3);
	}

	public static void main(String a[]) {
		for (int i = 0; i < 20100; i++) {
			String orderId = generateOrderNO();
			System.out.println(generateOrderNO());
			System.out.println(Long.toString(Long.parseLong(orderId), Character.MAX_RADIX));
		}
	}


	/**
	 * 15 位随机字符串。字母+数字
	 *
	 * @return
	 */
	public static String kezCommonID() {
		return "cardezu"+Long.toString(System.currentTimeMillis(), Character.MAX_RADIX) + RandomStringUtils.randomAlphanumeric(6);
	}

}