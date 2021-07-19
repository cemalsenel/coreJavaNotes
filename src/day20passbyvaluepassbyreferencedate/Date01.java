package day20passbyvaluepassbyreferencedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		//How to create date object
		LocalDate currentDate1 = LocalDate.now();
		
		System.out.println(currentDate1);//2021-03-07
		
		System.out.println(currentDate1.plusDays(5));//2021-03-12
		System.out.println(currentDate1.plusMonths(3));//2021-06-07
		System.out.println(currentDate1.plusYears(2));//2023-03-07
		
		System.out.println(currentDate1.plusDays(3).plusMonths(2).plusYears(1));//2022-05-10

		System.out.println(currentDate1.getYear());//2021
		System.out.println(currentDate1.getMonth());//MARCH
		System.out.println(currentDate1.getMonthValue());//3
		System.out.println(currentDate1.getDayOfMonth());//7
		System.out.println(currentDate1.getDayOfYear());//66.day
		System.out.println(currentDate1.getDayOfWeek());//SUNDAY
		
		System.out.println(currentDate1.minusDays(12));//2021-02-23
		System.out.println(currentDate1.minusMonths(5));//2020-10-07
		System.out.println(currentDate1.minusYears(2));//2019-03-07
		
		System.out.println(currentDate1.minusYears(2).plusMonths(3).minusDays(5));//2019-06-02
		
		LocalDate date2 = LocalDate.of(2019, 03, 05);
		System.out.println(currentDate1.isAfter(date2));//true
		System.out.println(currentDate1.isBefore(date2));//false
		
		
		System.out.println(date2.isLeapYear());//false
		
		//How to create time object
		LocalTime currentTime1=LocalTime.now();
		System.out.println(currentTime1);//20:06:35.354923800
		System.out.println(currentTime1.plusMinutes(11));//20:17:35.354923800
		System.out.println(currentTime1.plusMinutes(11));//20:19:55.515628300
		for(int i= 0 ; i<100000000 ; i++) {
			i++;
		}
		LocalTime currentTime2=LocalTime.now();
		System.out.println(currentTime2);//20:11:00.578902
		System.out.println(currentTime2.getNano()-currentTime1.getNano());//15946000
		System.out.println(currentTime1.plusHours(3));//23:13:54.691703500==> test other plus methods
		System.out.println(currentTime1.minusHours(3));//17:14:25.272976500==> test other minus methods
		System.out.println(currentTime1.getSecond());//12==> test other get methods
		System.out.println(currentTime1.now(ZoneId.of("Japan")));//04:16:53.027121100
		System.out.println(currentTime1.now(ZoneId.of("Europe/Moscow")));//22:18:44.932487300
		
		//How to create an object from LocalDateTime 
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);//2021-03-07T20:21:01.182604200
		
		LocalDate currentDate2 = LocalDate.now();
		System.out.println(currentDate2);//2021-03-07
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd"); // M ==> months , m==> minutes(any characters are possible==>(* - / + )(time format depends on us==>dd/MMM/yy or etc.)
		                                                                   //MMM==> first 3 characters
																		   //MM==>The number of the month
																		   //MMMM==> Full month name
																		   //M==> The number of month in integer ( without "0" ==> 1,2,3,4,5,..10,11,12)
		System.out.println(dtf2.format(currentDate2));//21/Mar/07
		
		LocalTime currentTime3 = LocalTime.now();
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm");//hh==> is for am-pm time format
																	  //HH==> is for 24 hours system
		System.out.println(dtf3.format(currentTime3));//08:40
		
		
		//How to find difference between two dates
		LocalDate d1 = LocalDate.now();
		LocalDate bd1 = LocalDate.of(1988, 7, 8);
		
		//If you want to get year,month and day in age use the below code
		Period age = Period.between(bd1, d1);
		System.out.println(age);//P32Y7M27D
		
		//If you want to get just year in age use the following code
		int age1 = Period.between(bd1, d1).getYears();
		System.out.println(age1);//32
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
