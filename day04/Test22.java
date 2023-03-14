package day04;

import java.util.Scanner;
public class Test22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		/*
		//#1.
		//점수 60점 이상이면 "합격", 아니면 "불합격" 출력
		
		int score =70;
		if(score >=60 ) {
				System.out.println("합격");
		}else {System.out.println("불합격");
		
		}
		*/
			
		//문제 #2.
		//점수를 입력받고, 90점 이상이면 "수"
		//80점 이상이면 "우", 70점 이상이면 "미",
		//그 이하는 "재시험" 출력
	
			
			
			
		/*
		System.out.println("점수를 입력하세요");			//점수를 입력 받고
		int num1 = Integer.parseInt(sc.nextLine());
		if (num1>=90) {								//90점 이상이면 "수"
			System.out.println("수");
		}else if(num1>=80) {						//80점 이상이면 "우"
			System.out.println("우");
		}else if(num1>=70) {						//70점 이상이면 "미"
			System.out.println("미");
		}else {										//나머지는 재시험
			System.out.println("재시험");
		}
		*/
		
		//또는 이렇게 쓸수도있다.
		//100 >= num1  <= 90  이렇게 쓰면 안된다.
		
		/*
		if(num1>100) {
			System.out.println("점수를 잘못 입력 하셨습니다.");
			//100보다 큰수를 입력했을때 예외처리
		}else{ //100 이하로 입력했을때
			//점수 판별해서 출력
		}if(num1 >= 90 && num1 <= 100) {
			System.out.println("수");
		}else if(num1>=80 && num1<=90) {
			System.out.println("우");
		}else if(num1>=70 && num1<=80) {
			System.out.println("미");
		}else{
			System.out.println("재시험");
		}
		
		*/
		
		
		
		
		
		
		//sc.close();
		
	}

}
