package day17;

import java.util.Calendar;
import java.util.Date;

public class DateEx02 {
	public static void main(String[] args) {
/*
		//클래스가 자동으로 안잡힐때, 내가 만들거나 "java.util.Date" 
		try {
		Class cls = Class.forName("java.util.Date");//Date cls
		Object obj = cls.newInstance(); //new Date();와 같다
		//Date cls = new Date();라고 쓴것과 같다.
			if(obj instanceof Date) { //obj를 Date소환
				Date d = (Date)obj; //강제 형변환
				System.out.println(d);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		// D-day 계산기 만들기
		Calendar time1 = Calendar.getInstance();		
		Calendar time2 = Calendar.getInstance();	
		
		time1.set(Calendar.YEAR, 2021);
		time1.set(Calendar.DAY_OF_WEEK, 5, 17);
		//time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.YEAR, 2022);
		time2.set(Calendar.DAY_OF_WEEK, 6, 17);
		//time2.set(Calendar.HOUR_OF_DAY, 20);
		//time2.set(Calendar.MINUTE, 30);
		//time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시 "
		+time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초");
		
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "시 "
				+time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초");
		
		
		long difference = (time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
		System.out.println(difference);
		
		final int [] TIME_UNIT = {3600,60,11};
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];//diff/3600 + "시간"
			difference %= TIME_UNIT[i];//diff = diff % 3600;
		}
		System.out.println("시분초로 변환하면 : " + tmp);
		
		
		
		
		
		
		
		
	}
}
