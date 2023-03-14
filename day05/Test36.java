package day05;

//import java.util.Scanner;

public class Test36 {

	public static void main(String[] args) {

		//문제1.		구구단 2단 출력  -> 2 * 1 = 2
		//						-> 2 * 2 = 4
		//						-> 2 * 3 = 6
		//							......
		
		/*
		for(int i = 1; i<=9; i++) {
			
			System.out.println("2*" + i + "=" + i*2);
			
		}
		
		
		*/
		
		
		//문제2. 구구단 단수를 입력받아, 해당 단을 출력
		// 예) 단 입력 >> 3
		// 3 * 1 = 3
		// 3 * 2 = 6
		// 3 * 3 = 9
		// ......
		//Scanner sc = new Scanner(System.in); 
		//System.out.println("구구단 단수 입력 >>");

		//int num = sc.nextInt();
		
		/*
		for(int i = 1; i<10; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}
		
		
		
		*/
		
		
		
		//문제3. 구구단 전체 출력 (2단~9단)
		/*
		for(int dan = 2; dan<10; dan++) { //2단부터 시작   9단까지
			System.out.println("***" + dan + "단 ***");
			for(int i = 1; i<10; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			}
		}
		*/
//		for(int i = 2; i<10; i++) {
//			System.out.println("***" + i + "단 ***");
//			for(int j = 1; j<10; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//		}
		
		for(int i = 1; i <=9; i++) {
			System.out.println("****" + i +"단****");
			for(int j=1; j <=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		
		
		
		
		
		
		
		//문제4. 구구단 전체 출력 (1단~9단)
		//출력이 *** 1단 ***	*** 2단 ***	*** 3단 ***
		//		1 * 1 = 1	2 * 1 = 2	3 * 1 = 3
		//		1 * 2 = 2	2 * 2 = 4	3 * 2 = 6
		
		/*
		for(int i = 1; i<10; i+=3) { // 1단 ~ 9단 ++가 아니라 +3으로
			System.out.println("***" + i +"단 ***\t***" + (i+1)+"단 ***\t***" +(i+2) +"단***");
			for(int j = 1; j<10; j++) {// *1 ~ *9
				
				System.out.print(i + "*"+ j + "=" + i*j +"\t");
				System.out.print((i+1) + "*"+ j + "=" + (i+1)*j +"\t");
				System.out.println((i+2) + "*"+ j + "=" + (i+2)*j);
			}
		}
		
		*/
		
//-----------------------------------------------------------------------
		/*
		// 문제5. 별찍기
		//(1)
		for(int i = 1; i < 6; i ++) {
			System.out.println(i +"행 : ***");
		}
			
		*/
		
//-----------------------------------------------------------------------
		
		/*
		// (2)    
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		 
		 */
//----------------------------------------------------------------------
		//(3)
		/*
		for(int i = 0; i < 5; i++ ) {
			for(int j=-4; j<1-i; j++){
				System.out.print("*");
			}	
			System.out.println();
		}
		
		*/
//------------------------------------------------------------------------
		//(4)	
		//풀이!!
		
		//12345  겉에
		/*
		
		for(int i = 1; i < 6; i ++) {
			// i = 1 j 12345
			// i = 2 j 23456
			// i = 3 j 34567
			for(int j = i; j < i+5; j++) {
				System.out.print(j);
			}
			System.out.println();
			}
		*/
//------------------------------------------------------------------
		//(5)
		
		/*
		for(int i = 5; i>0; i--) {
			//System.out.println(i);
			for(int j = i; j<i+5; j++ ) {
				System.out.print(j);
				
			}System.out.println();
		}
		*/
		
//--------------------------------------------------------------------
		//(6)
		/*
		//풀이
		int star = 1;
		boolean toggle = true; //별이 증가할지 감소하는지 판별
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			if(toggle) star++;
			else star--;
			
			if(star == 5) {
				toggle = false;
				
				
			}
			System.out.println();
		}
		
		*/
//----------------------------------------------------------------
		
		//(7)
		//풀이	
		
//		for(int i = 0; i < 5; i++){ // 5행
//			// 공백 반복 4 ~ 0
//			for(int j = 0; j < 4-j; j++) {
//				System.out.print(" ");
//			}
//			// 별 반복 1 ~ 5
//			for(int k = 0; k < i+1; k++) {
//			System.out.print("*");
//		}
//			System.out.println();
//	}	
//		
		
//------------------------------------------------------------------------		

		//(8)
		
//-------------------------------------------------------------------------------
		//(9)
		

//---------------------------------------------------------------------------		
		//(10)
		/*
		
		for(int i = 0; i < 5; i++){ 
			for(int j = 0; j < 4-j; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i*2; k++) {
			System.out.print("*");
		}
			System.out.println();
	}
		
		*/
//---------------------------------------------------------------------------		
		
		//(11)
		
		

		
		//sc.close();
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
