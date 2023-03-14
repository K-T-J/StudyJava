package day03;


import java.util.Scanner;


public class Test17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		//문제1. 숫자 2개를 입력받고, 사칙연산 결과를 출력해보세요.
		//		단, 0을 제외한 숫자 입력받기.

		//숫자 2개 입력받기
		//입력하라고 메세지 띄워주고 => 출력문
		System.out.println("숫자1 입력 : ");
		//입력받고, 받은거 변수에 저장하기
		int num1 = Integer.parseInt(sc.nextLine());//문자열로입력받아 정수로 형변
		//두번 반복하기
		System.out.println("숫자2 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
			
		//사칙연산 결과 출력 + - * / %
		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼기 : " + (num1 - num2));
		System.out.println("곱하기 : " + (num1 * num2));
		System.out.println("나누기 : " + (num1 / num2));
		System.out.println("나머지 : " + (num1 % num2));
			
		System.out.println("--------------------");
//--------------------------------------------------------------------------
		//문제2. 초단위로 정수를 입력받고, "?분,?초" 형태로 출력해보세요.
			
		//메세지 출력
		System.out.println("초단위 정수 입력 ");
		
		//입력받아 저장
		int input = Integer.parseInt(sc.nextLine());
		
		//?분?초 형태로 계산해서 출력
		//100 -> 1분 40초     200-> 3분 20초
		int min = input / 60;
		int sec = input % 60;
		
		System.out.println(min + "분" + sec + "초");
//---------------------------------------------------------------------------
		//문제3. 초단위로 정수를 입력받고, "?시간 ?분 ?초" 형태로 출력.
		/* 정답
		System.out.println("초단위 정수 입력 : ");
		int input = Integer.parseInt(sc.nextLine());
		//계산 : 1분 + 60초    1시간 = 60분 = 3600초

		int hour = input / 3600;			// int 정수니깐 소수점 아래로 안나온다.
		int min = (input % 3600) / 60;      // 시간에 나온 나머지 값에서 60으로 나눈다.
		int sec = input % 60;				// 
		
		System.out.println(hour + "시간" + min + "분" + sec + "초");
		
		*/
			
//--------------------------------------------------------------------------			
	
		/*문제4. 최소 화폐매수 구하기  정답
		 * : 금액을 입력하면 최소한의 화폐 매수를 출력하세요.
		 * 콘실실행예)
		 * 금액입력 >> 67800 (<--사용자가 입력하는부분)
		 * 
		 * 5만원 : 1장
		 * 1만원 : 1장
		 * 5천원 : 1장
		 * 1천원 : 2장
		 * 5백원 : 1개
		 * 1백원 : 3개
		 */
		
			
		/*
		System.out.println("금액입력>>");
		int money=Integer.parseInt(sc.nextLine());
		System.out.println("5만원 : " +(money / 50000) + "장");
		System.out.println("1만원 : " +(money % 50000)/10000 + "장");
		System.out.println("5천원 : " +(money % 10000)/5000 + "장");
		System.out.println("1천원 : " +(money % 5000) /1000 + "장");
		System.out.println("5백원 : " +(money % 1000) /500 + "개");
		System.out.println("1백원 : " +(money % 500) /100 + "개");
			
			
		*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
