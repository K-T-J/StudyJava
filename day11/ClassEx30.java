package day11;
//초기화

public class ClassEx30 {
	
	//클래스 변수
	static int x = 10;
	
	//클래스 블럭 (프로그램 실행시 한번만!! 자동 호출) ex)핸드폰 키자마자 실행되는 ios
	static {
		System.out.println("클래스 초기화 블럭");
		x = 100; //클래스변수 초기화
		
	}
	
	//인스턴스 블럭
	{
		System.out.println("인스턴스 블럭"); //객체생성되야지만 실행된다.
	}
	
	
	//생성자 클래스이름(){}
	ClassEx30(){
		System.out.println("생성자!!");
	}
	

	public static void main(String[] args) {
		
		ClassEx30 c = new ClassEx30(); //객체 생성하니깐 인스턴스블럭 자동 호출
		
		System.out.println("-----------");
		ClassEx30 c1 = new ClassEx30();//객체를 1개더 만들면 인스턴스블럭 2번출력 클래스블럭은 x
		System.out.println(ClassEx30.x);
		
		
		
		
		

	}

}
