package day18;

import java.util.Scanner;
import java.util.Vector;

/*
Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 벡터에 저장하고,
벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요. 
실행예시:
	정수>> 10 
	정수>>6 
	정수>>22
	정수>>6
	정수>>88
	정수>>77
	정수>>-1
	가장 큰 수는 88
*/

public class UtilEx01 {
	public static void main(String[] args) {

		
		Vector<Integer> vec = new Vector<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수 입력 >>");
			int a = sc.nextInt();
		//	Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 벡터에 저장하고,
		//	벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요.	
			int full = 0;
			
			
			if(a == -1) {
				System.out.println("가장 큰 수는 : " + full);
				break;
			}
		}
		
		
		
		
	}
}
