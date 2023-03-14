package day04;
import java.util.Scanner;
public class Test25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력>>");
		
		int num = Integer.parseInt(sc.nextLine());
		
		switch (num) {
		case 1:
				System.out.println("1을 입력하셨습니다.");
				break;
		case 2:
				System.out.println("2를 입력히셨습니다.");
				break;
		case 3 : 
				System.out.println("3을 입력히셨습니다.");
				break;
		default ://나머지
				System.out.println("1,2,3이 아닌 숫자를 입력하셨습니다.");
		}
		
		
	
		
/*
		// int,char,string
		
		char ch = 'B';
		
		switch(ch) {    //switch (변수){case 'A' <--홑따옴표}
		case 'A' : //홑따움표로 써준다.
			System.out.println("A");
			break;
		case 'B' :
			System.out.println("B");
			break;
		case 67 :
			System.out.println("C");
			break;
		default:
			System.out.println("???????");
		
		}
		
		
		
		*/
		
		
		
		
		
		
		
		
	//sc close();

	}

}
