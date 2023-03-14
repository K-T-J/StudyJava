package day05;

public class Test30 {

	public static void main(String[] args) {

		
		
		int num = 0; //초기값						//do 무조건 1번은 실행된다.
		do {
			System.out.println("출력");
		}while(num != 0);
		
		System.out.println("종료");
		
		
		
		
		int num1 = 12;
		do {
			System.out.println("출력");
		}while(num1-- > 10);
		System.out.println("종료");
	}

}
