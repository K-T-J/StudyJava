package day03;

public class Test16 {

	public static void main(String[] args) {
		
		//사칭 연산 : + - * / %           (%) 나누고 남은 값이 나온다.
		int a = 10 % 10;  //=도 연산자다
		System.out.println(a);
		
		//overflow
		a = 100000 * 100000;  // 100억  int * int -> 100억 처리 할수 없음
		System.out.println(a);
		
		long l = 100000L * 100000; //둘중 한개 long으로 바꿔 처리해야한다.
		System.out.print(l);
	
		
	}
}
