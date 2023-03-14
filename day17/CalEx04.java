package day17;

import java.util.Calendar;

public class CalEx04 {
	public static void main(String[] args) {

		
		Calendar date = Calendar.getInstance();
		
		date.set(2021, 4, 31); //2021.5.31 날짜를 꺼내오고 싶으면 set
		
		System.out.println(dateToString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(dateToString(date));
		
		System.out.println("= 3달 전 =");
		date.add(Calendar.MONTH, -3);//Calendar.MONTH int 타입 상수를 문자로 지정해둔것
		System.out.println(dateToString(date));
		
		
		System.out.println(" = 31일 후 add=");
		date.add(Calendar.DATE, 31);
		System.out.println(dateToString(date));
		
		
		//System.out.println(" = 15일 후 roll=");
		//date.roll(Calendar.DATE, 15);//roll은 월이면 월만 바뀌고 일을 바뀌면 일만 바뀐다.
		//System.out.println(dateToString(date));
		
		
		
	}
	public static String dateToString(Calendar date) {
		// date.get(Calendar.DAY_OF_WEEK) =>1~7 => 인덱스번호로 사용
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH)+1) + "월"
				+date.get(Calendar.DATE) + "일" + DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)] + "요일";
	}

}
