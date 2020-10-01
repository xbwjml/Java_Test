package com.java8New.timeAPI;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import org.junit.Test;

public class Demo1 {

	@Test
	public void test1() {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime ldt2 = LocalDateTime.of(2013, 9, 12, 13, 43, 23);
		System.out.println(ldt2);
		
		LocalDateTime ldt3 = ldt.plusYears(2);
		System.out.println(ldt3);
		
		LocalDateTime ldt4 = ldt.minusMonths(2);
		System.out.println(ldt4);
		
		System.out.println(ldt.getYear()+"---"+ldt.getMonth()+"---"+ldt.getMonthValue());
	}
	
	// Instant: 时间戳(1970-01-01 00:00:00 到某个时间的毫秒值)
	@Test
	public void test2() {
		Instant ins1 = Instant.now();//默认获取utc时区
		System.out.println(ins1);
		OffsetDateTime odt = ins1.atOffset(ZoneOffset.ofHours(8));
		System.out.println(odt);
	}
	
	@Test
	public void test3() throws Exception{
		Instant ins1 = Instant.now();
		Thread.sleep(2000);
		Instant ins2 = Instant.now();
		//计算两个时间之间的间隔
		Duration duration = Duration.between(ins1, ins2);
		System.out.println(duration);
		System.out.println(duration.toMillis());
	}
	
	@Test
	public void test4() {
		LocalDate ld1 = LocalDate.of(2017, 3, 21);
		LocalDate ld2 = LocalDate.now();
		//计算两个日期之间的间隔
		Period period = Period.between(ld1, ld2);
		System.out.println(period);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
	}
	
	@Test
	public void test5() {
		LocalDate ldt = LocalDate.now();
		System.out.println(ldt);
		
		LocalDate ldt2 = ldt.withDayOfMonth(3);
		System.out.println(ldt2);
		
		LocalDate ldt3 = ldt.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println(ldt3);
		
		//自定义，得到下一个工作日
		LocalDate nextWorkLdt = ldt.with( (l)->{
							LocalDateTime temp = (LocalDateTime) l;
							DayOfWeek dow = temp.getDayOfWeek();
							if(dow.equals(DayOfWeek.FRIDAY)) {
								return temp.plusDays(3);
							} else if(dow.equals(DayOfWeek.SATURDAY)) {
								return temp.plusDays(2);
							} else {
								return temp.plusDays(1);
							}
		} );
		System.out.println(nextWorkLdt);
	}
	
	@Test
	public void test6() {
		
	}
	
}
