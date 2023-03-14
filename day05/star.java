package day05;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//문제1. 10~30까지 출력
/*
	for(int i = 10; i<30; i++) {
		System.out.println(i);
	}
	*/
	
	
	
	
	
	
	//문제2. 0~100까지 10단위로 출력 0 10 20 30 ...
		/*
	for(int i = 0; i <= 100; i+=10) {
		System.out.println(i);
	}
	
	*/
	
	
	
	
	//문제3. 1~20까지 짝수만 출력
/*
	for(int i = 1; i <=20; i++) {
		if(i%2 == 0) {
			System.out.println(i);
		}
	}
	*/
	
	
	
	//문제4. 1~100까지의 홀수의 합 출력
	/*
	int tot = 0;
	for(int i = 1; i <100; i++) {
		if(i%2 == 1) {
			tot = tot + i;
		}
	}System.out.println(tot);
	*/
	
	
	
	//문제5. 정수 1개를 입력받고, 1부터 입력받은 수까지의 총합 출력
	
		/*
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 1개 입력 >>");
	int num = sc.nextInt();
	
	int tot = 0;
	for(int i = 1; i <= num; i++) {
		System.out.println(i);
		tot += i;
	}
	System.out.println(tot);
	*/
	
		
		
		
		
				//문제1.		구구단 2단 출력  -> 2 * 1 = 2
				//						-> 2 * 2 = 4
				//						-> 2 * 3 = 6
				//							......
	
		/*
		for(int i = 1; i<10; i++) {
			System.out.println("2 * " + i + " = " + i*2 );
		}
		
		*/
		
		
		
		
		
		
		
		
		
		//------------------------------------------------
		
		
				//문제2. 구구단 단수를 입력받아, 해당 단을 출력
				// 예) 단 입력 >> 3
				// 3 * 1 = 3
				// 3 * 2 = 6
				// 3 * 3 = 9
				// ......
	/*
	
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 단수 입력>>");
		int num = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = "+ i*num);
		}
		
		
		*/
		
		
		
	
		
		
		//-----------------------------------------------------
		
		
		//문제3. 구구단 전체 출력 (2단~9단)
	
		/*
		for(int i = 2; i <10; i++) {
			System.out.println("*** "+ i +" ***");
			for(int j = 1; j <10; j++) {
				System.out.println(i + " * " + j + " = "+ i*j);
			}
		}
		*/

	
		//--------------------------------------------------
		
		
		
		//문제4. 구구단 전체 출력 (1단~9단)
		
		
		
		
		
		//1
		/*
		for (int i = 1; i < 6; i++) {
			System.out.println(i +"행 : ***");
		}
		*/
		
		
		//2
		/*
		for(int i = 0; i<5; i++) {
			for(int j = 0; j <=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		*/
		
		//3
		/*
		for(int i = 0; i<5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}System.out.println();
		}
		
		*/
		
		//4
		/*
		for(int i = 1; i<6; i++) {
			for(int j =i; j <i+5; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
		*/
		
		
		
		//5
		/*
		for(int i = 5; i>0; i--) {
			//System.out.println(i);
			for(int j = i; j<i+5; j++ ) {
				System.out.print(j);
				
			}System.out.println();
		}
		*/
		
		
		//6
		
		/*
		
		for(int i=0; i<4; i++){
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}

		for(int i = 0; i<5; i++) {
			//System.out.println("*");
			for(int j = i; j<5; j++) {
				System.out.print("*");
			}System.out.println();
		} 
		
		
		*/
		
		//7
		/*
		for(int i = 0; i<4; i++) {
			for(int j = 4; j>i; j--) {
				System.out.print("");
			}System.out.println();
		}
		for(int i =)
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}
