package day01;

public class Test02 {
	
	public static void main(String[] args) {
		
		//변수의 선언
		boolean b;  //true / false
		char ch;
		int i;
		double d;
		
		int a, c; //같은타입에 변수 여러개 선언
		
		// 변수 선언만하면 사용불가능. 
		//System.out.println(b);<---에러!!!
		
		//변수에 값대입
		b = true;
		ch = 'A';
		i = 100;
		d = 1.23;
		d = 10.2345;	//1.23을 10.2345로 덮어씌움
		System.out.println("10.2345출력 : " + d); //출력해서 확인
		
		// 변수 선언 + 초기화
		int abc = 10;
		abc = 20;
		System.out.println("20출력 : " + abc);
		
		
		abc = 20 + 100;
		System.out.println("120출력 : " + abc);
		
		String str;
		str = "hello";
		System.out.println("hello출력 : " + str);
		
		
	}

}
