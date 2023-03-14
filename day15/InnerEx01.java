package day15;
//inner 클래스 만들기

class A{
	A(){System.out.println("A객체생성");}
	
	//인스턴스 멤버 클래스
	class B{
		B(){System.out.println("B객체생성");}
		int x;
		void func1() {System.out.println("B클래스 메서드 실행");}
		//static int y; 만들수없다
		//static void func2() {} 만들숭벗다
		
	}
	
	//static 멤버 클래스
	static class C{
		C(){System.out.println("C 객체생성");}
		int x;
		void func1() {System.out.println("C클래스 메서드 실행");}
		static int y;
		static void func2() {System.out.println("C클래스 static 메서드 실행");}
	}
	
	//인스턴스 메서드
	void methodA() {
		System.out.println("A클래스의 methodA() 호출");
		class D{
			D(){System.out.println("D객체생성");}
			int x;
			void func1() {System.out.println("D클래스 메서드 실행");}
		}
		//지역클래스 객체 생성
		D d = new D();
		System.out.println(d.x);
		d.x = 300;
		System.out.println(d.x);
		d.func1();
	}
	
	
	
}




public class InnerEx01 {
	public static void main(String[] args) {
		/*
		//인스턴스 멤버 클래스 객체 생성
		A a =new A();		//외부 클래스 객체 생성
		A.B b=a.new B();	//외부 클래스 참조변수명.new 내부클래스명();
		
		System.out.println(b.x);
		b.x = 10;
		System.out.println(b.x);
		b.func1();
		*/
		
		
		/*
		//static 멤버 클래스 객체 생성
		A.C c= new A.C();
		System.out.println(c.x);
		c.x = 100;
		System.out.println(c.x);
		c.func1();
		System.out.println(A.C.y);
		A.C.y = 200;
		System.out.println(A.C.y);
		A.C.func2();
		*/
		
		
		//지역 클래스
		A a = new A();
		a.methodA();
		
		
		
	}

}
