package com.bys.level2;

import java.time.LocalDate;


class Date {
	public String date(int a, int b) {
		String answer = "";

		LocalDate targetDate = LocalDate.of(2016, a, b);
		answer = targetDate.getDayOfWeek().toString().substring(0, 3);
				
//		System.out.println(dayOfWeek);
		
		return answer;
	}

	public static void main(String args[]) {
		
		Date sol = new Date();
		String str = sol.date(5, 24);
		System.out.println(str);
		
	}
}