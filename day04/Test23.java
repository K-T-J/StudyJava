package day04;
import java.util.Scanner;
public class Test23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		/*
		// 문제1. 정수 두개를 입력받고, 몫과 나머지를 출력하세요. 
		System.out.println("정수1 입력 : ");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("정수2 입력 : ");
		int num2 = Integer.parseInt(scanner.nextLine());
		System.out.println("몫 : " + num1 / num2);
		System.out.println("나머지 : " + num1 % num2);
		
//--------------------------------------------------------------------------
		// 문제2. 일수(day)을 입력받고, 몇개월 몇일 인지 출력해보세요. 
		//		단, 한달은 30일로 고정 
		System.out.println("일수 입력 : ");
		int day = Integer.parseInt(scanner.nextLine());
		System.out.println((day / 30) + "개월 " + (day%30) + "일");
		
//---------------------------------------------------------------------------	
		// 문제3. 점수 3개를 입력받고, 총점과 평균을 구하여 출력해보세요. 
		System.out.println("점수1 입력 : ");
		int sco1 = Integer.parseInt(scanner.nextLine());
		System.out.println("점수2 입력 : ");
		int sco2 = Integer.parseInt(scanner.nextLine());
		System.out.println("점수3 입력 : ");
		int sco3 = Integer.parseInt(scanner.nextLine());
		int total = sco1 + sco2 + sco3;
		double avg = total / 3.0;
		System.out.println("총점 : " + total + " 평균 : " + avg);
		
//---------------------------------------------------------------------------
		// 문제4. 숫자 하나를 입력받고, "음수"인지 "양수"인지 출력해보세요. 
		System.out.println("정수 입력 :");
		int num = Integer.parseInt(scanner.nextLine());
		if(num > 0) {
			System.out.println("양수");
		}else if(num < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0 입니다.");
		}
//---------------------------------------------------------------------------
		// 문제5. 1 ~ 99 사이 숫자를 입력받고, "짝수"인지 "홀수"인지 출력.
		System.out.println("1 ~ 99 사이 숫자 입력 : ");
		int num = Integer.parseInt(scanner.nextLine());
		if(num % 2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}*/
		
//---------------------------------------------------------------------------
		
		// 문제6. 서로 다른 정수 3개를 입력받고, 3개의 숫자중 중간크기의 수를 출력. 
		//			(평균값X)
		System.out.println("정수1 입력 :");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("정수2 입력 :");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("정수3 입력 :");
		int c = Integer.parseInt(sc.nextLine());
		
		if(a < b) {//만약 a가 b보다 작을때
			if(a > c) {//만약 a가 c보다 클때
				System.out.println("a : " + a);//a출력
			}else { //a가 c보다 작을때
				if(b < c) {// b가 c보다 작을때
					System.out.println("b : " + b);//b출력
				}else { //b가 c보다 클때 
					System.out.println("c : " + c);//c출력
				}
			}
		}else { //a가 b보다 클때
			if(b > c) {//b가 c보다 클때
				System.out.println("b : " + b); //b출력
			}else {// b < c 일떄
				if(a < c) {//a가 c보다 작을때
					System.out.println("a : " + a);//a출력
				}else {// a가 c보다 클때
					System.out.println("c : " + c);//c출력
				}
			}
		}
		
		sc.close();
		
	}
}
