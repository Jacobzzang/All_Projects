package com.Jacob.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		//���糯¥ 
		Date today = new Date();
		System.out.println(today.getTime()); //1629253671313 1970/1/1 0 
											 //->1000*60*60*24*365*10 = 10���� �ʷ�
		
		Date birth = new Date(2000, 6, 25);
		long result = today.getTime()-birth.getTime();
		System.out.println(result/1000/60/60/24);
		System.out.println(birth);
		
		
		//Calendar
		Calendar day1 = Calendar.getInstance();
		System.out.println(day1);
		System.out.println(day1.get(Calendar.YEAR));
		System.out.println(day1.get(Calendar.MONTH+1));
		System.out.println(day1.get(Calendar.DAY_OF_MONTH));
		System.out.println("���Ϲ�ȣ : " + day1.get(Calendar.DAY_OF_WEEK));
		
		//�ϼ����
		Calendar day2 = Calendar.getInstance();
		day2.set(2020, 7, 18);
		long result1 = day1.getTimeInMillis()-day2.getTimeInMillis();
		System.out.println(result1/1000/60/60/24);
		
		LocalDate day3 = LocalDate.now();
		LocalDate day4 = day3.plusDays(100);
		System.out.println("���ú��� 100���� : " + day4);
		
		//Duration, LocalTime, LocalDateTime
		
		//date -> string
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/d u hh�� mm�� ss��");
		String todayStr = sdf.format(today);
		System.out.println("format : " + todayStr);
		
		
		
		//string -> date
		String sdate = "2020-09-01";
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date ddate = sdf.parse(sdate);
		System.out.println(ddate);
		
		
		//static �޼��� ȣ��
		System.out.println("static : " + DateUtil.dateToStr(today));
		
		System.out.println("static : " + DateUtil.dateToStr(today, "yyyy"));
		
		Date date3 = DateUtil.strToDate("2021/08/10");
		
		
		
		
		
		
		
		
	}

}
