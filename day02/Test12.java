package day02;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		// 이름, 나이, 혈액형, 주소 입력받아 출력해보기.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력해 주세요>>");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("나이 입력해 주세요>>");
		int ag = Integer.parseInt(sc.nextLine());
		System.out.println(ag);
		//간단하게 만들려면 위에 String age = sc.nextLine(); 지우고 
		//int ageInt = Integer.parseInt(sc.nextLine()); 한줄로 합친다.
		
		System.out.println("혈액형 입력해 주세요");
		String ABC = sc.nextLine();
		System.out.println(ABC);

		System.out.println("주소 입력해 주세요");
		String a = sc.nextLine();
		System.out.println(a);

		sc.close();//닫기
		System.out.println("입력을 종료합니다!!");

	}
}
