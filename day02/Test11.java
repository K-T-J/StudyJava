package day02;

import java.util.Scanner;
public class Test11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //객체생성
		
		//입력받기
		System.out.println("이름 입력하세요>>");//콘솔에 메세지 띄우기
		//입력받아서 name 변수에 입력받은 문자 저장
		String name = sc.nextLine(); 
		//입력+저장이 잘 됐는지 name변수 출력해서 확인
		System.out.println(name);
		
		System.out.println("나이를 입력해주세요>>");
		String age = sc.nextLine();
		//int ageInt = (int)age;
		//안되는 이유는? string은 기본형(int)으로 바로 형변환이안된다
		int ageInt = Integer.parseInt(age); // String -> int로 형변환 하기
		//double ageDb = Double.parseDouble(age); // String -> double로 형변환하기
		System.out.println(ageInt);
		System.out.println("내년 당신의 나이는" + (ageInt+1) + "살 입니다.");
											//()를 안하면 문자열 계산이 된다.
		
		sc.close();
		System.out.println("프로그램 종료!!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
