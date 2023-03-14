package day08;

public class MyTest11 {
	//클래스 변수
	static int y =20;
	//인스턴스 변수
	int x = 10;

	static void fun2() { //클래스 메서드
		System.out.println("클래스 메서드 실행");
	}
	void func() { //인스턴스 메서드
		System.out.println("인스턴스 메서드 실행");
	}
	
	public static void main(String[] args) {

		MyTest11.y = 200; 	//200을 집어넣고싶을때 (클래스명.변수명)
		System.out.println(MyTest11.y);
		
		MyTest11.fun2();//클래스 메서드 실행 (클래스명.클래스메서드명)
		
		System.out.println("--------------------");
		
		//t = 지역 참조형 변수
		MyTest11 t = new MyTest11();
		System.out.println(t.x);	//10
		t.func();	// "인스턴스 메서드 실행"
		
		System.out.println(MyTest11.y);//20클래스 변수 출력 
		
		
		//프로그램이 시작
		//class 영역 -> static (Method Area)->main()실행 ->new~~(Heap)
		
		//Method Area		static			Heap
		
		//***MyTest11
		//y = 20
		//fun2								0x00[x=10 			]
		//											fun2()
		//MyTest11			**main**
		//main			|	t[0x00]	|
		
	}

}
