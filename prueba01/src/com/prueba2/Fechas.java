package com.prueba2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fechas {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println(LocalDate.now());
//		System.out.println(LocalTime.now());
//		System.out.println(LocalDateTime.now());
		
//		LocalDate hoy = LocalDate.of(2022, 2, 17);
//		System.out.println(hoy);
//		
//		LocalDateTime ahora = LocalDateTime.of(2022, 2, 17, 9, 43);
//		System.out.println(ahora);
//		
//		System.out.println(LocalDate.of(2024, Month.FEBRUARY, 29));
		
//		System.out.println(new Date());
//		System.out.println(LocalDate.now());
//		Calendar c = Calendar.getInstance();
//		c.set(2022, Calendar.FEBRUARY, 17);
//		Date d = c.getTime();
		
//		LocalDate date = LocalDate.of(2022, 2, 17);
//		
//		System.out.println(date.plusDays(14));
//		System.out.println(date.plusWeeks(1));
//		System.out.println(date.plusMonths(4));
//		
//		LocalDateTime dateTime1 = LocalDateTime.now();
//		System.out.println(dateTime1.minusMinutes(3));
//		
//		Thread.sleep(3000); // 3 segundos
//		
//		LocalDateTime dateTime2 = LocalDateTime.now();
//		System.out.println(dateTime1.isBefore(dateTime2));
		
		
//		LocalDate start = LocalDate.of(2022, 2, 1);
//		LocalDate end = LocalDate.of(2022, 5, 1);
//		
//		Period period = Period.ofMonths(1);
//		System.out.println(start.plus(period));
//		
//		Period everyYearAndWeek = Period.of(1, 0, 7);
//		System.out.println(start.plus(everyYearAndWeek));
		
//		LocalDate date = LocalDate.now();
//		System.out.println(date.getDayOfWeek());
//		System.out.println(date.getMonth().equals(Month.FEBRUARY));
//		
//		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
//		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
//		System.out.println(LocalDateTime.now().format(f));
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("02 17 2022", f);
		System.out.println(date);
	}

}
