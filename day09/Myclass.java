package day09;

import java.util.Scanner;


public class Myclass {
	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);//입력받기
		
		//문제7. 주문 프로그램
/*
		 * ***글로벌 카페 메뉴 ***
		 * 1. 아메리카노	: 2500원
		 * 2. 카페라떼	: 3000원
		 * 3. 카푸치노	: 3500원
		 * 4. 카라멜프라푸치노	: 4000원
		 * 5. 햄치즈샌드위치	: 6000원
		 * 6. 종료
	 	1단계 :	위 메뉴를 콘솔에 출력하여, 종료(6)를 선택할때 까지 반복해서
	 			메뉴 번호로 주문을 받고, 종료 선택후 총 주문 금액 출력
	 	2단계 : int money=y = 20000; 내돈에서 주문시 주문금액 차감,
	 			돈이 부족하면 주문 추가 불가, 종료시 총액 출력, 잔액도 출력
				 			
				 */
		int tot = 0;
		
		while(true) {//반복
			System.out.println("***글로벌 카페 메뉴***");
			System.out.println("1. 아메리카노 : 2500원");
			System.out.println("2. 카페라떼 : 3000원");
			System.out.println("3. 카푸치노 : 3500원");
			System.out.println("4. 카라멜프라푸치노 : 4000원");
			System.out.println("5. 햄치즈샌드위치 : 6000원");
			System.out.println("6. 종료");
			int num = sc.nextInt();//숫자로 입력받기
			if(num == 1) {//만약 
				System.out.println("아메리카노를 선택하셨습니다.");
				tot = tot + 2500;
			}else if(num == 2) {
				System.out.println("카페라떼를 선택하셨습니다.");
				tot = tot + 3000;
			}else if(num == 3) {
				System.out.println("카푸치노를 선택하셨습니다");
				tot = tot + 3500;
			}else if (num ==4) {
				System.out.println("카라멜프라푸치노를 선택하셨습니다");
				tot = tot + 4000;
			}else if (num == 5) {
				System.out.println("햄치즈샌드위치를 선택하셨습니다");
				tot = tot + 6000;
			}else if (num == 6) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("메뉴 번호가 아닙니다. 다시 시도해주세요");
			}
		}
		
		System.out.println("총 금액 : " + tot + "입니다");
		
		
		
	}
}