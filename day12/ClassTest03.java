package day12;

import java.util.Scanner;


class Grade{ //인스턴스변수 생성
	int math;
	int sic;
	int eng;

	
	Grade(int math, int sic, int eng){//기본생성자
		this.math = math;//인스턴스값 초기화
		this.sic = sic;
		this.eng = eng;
	}
	
	int getAvg() {//평균 구해서 return 해주기
		int tot = math+sic+eng;
		int avg = tot /3;
		return avg;
		//또는 return (math + sic + eng) /3; 해도 된다.
	}
	
	

	
}



/*
Grade 클래스를 작성해보세요. 
3과목의 점수를 입력받아 성적 평균을 출력하는 main()과 실행 예시는 아래와 같습니다. 
콘솔출력예 )
	수학, 과학, 영어점수를 입력하세요. 
	수학>> 90  (<- 임의로 사용자가 입력한 숫자)
	과학>> 88
	영어>> 96
	평균은 91
*/

public class ClassTest03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 점수를 입력하세요.");
		
		System.out.print("수학>>");
		int math = Integer.parseInt(sc.nextLine());
		
		System.out.print("과학>>");
		int sci = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어>>");
		int eng = Integer.parseInt(sc.nextLine());
		
		Grade me = new Grade(math, sci, eng);//*매개변수3개 던지면 인스턴스변수 3개필요
		System.out.println("평균은 "+ me.getAvg());//평균값을 가지고온다 즉 return값이 필요하다
		
		sc.close();
		
	}
}


