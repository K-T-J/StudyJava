package day05;

import java.util.Scanner;
public class Test34 {

	public static void main(String[] args) {

		//*for문*
		/*
		//문제1. 10~30까지 출력
		for(int i = 10; i<=30; i++) {
			System.out.println(i);
		}
		
		*/
		
		//문제2. 0~100까지 10단위로 출력 0 10 20 30 ...
		/*
		for(int i = 0; i <=100; i+=10) {
			System.out.println(i);
		}
		*/
		
		//문제3. 1~20까지 짝수만 출력
		/*
		for(int i = 1; i<=20; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		*/
		/*
		//문제4. 1~100까지의 홀수의 합 출력
		//1~100 반복 돌리기
		//홀수만 검사 찾기 -> if % 2
		//홀수일때만 누적시키기 -> total
		 * 
		int tot = 0;
		for(int i = 1;i<=100; i++){
			if(i%2 == 1) {
				tot += i;
			}
		}
		System.out.println(tot);
		*/
		
		//문제5. 정수 1개를 입력받고, 1부터 입력받은 수까지의 총합 출력
		
		//정수1개 입력받아 저장. -> Scanner 필요
		//1 부터 입력받은 수까지 -> 1부터 반복 -> 입력받은 수까지로 범위가 매번 변경
		// 범위 지정 -> 조건식or증감식인다 증감식은 1씩 늘어나야 하니 1++
		//총합 -> 누적 더하기 -> total변수 필요
		Scanner sc= new Scanner(System.in);
		
		System.out.println("정수 1개 입력 >>");
		int f = Integer.parseInt(sc.nextLine());
		
		int tot = 0;
		for(int i = 1;i <= f; i++) {// tip)일단 for문 구조틀을 만들고 수정
			tot += i;
			System.out.println(i);
		}   
		System.out.println(tot);
			
		
		sc.close();
	}

}
