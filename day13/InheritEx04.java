package day13;

class A1{ //부모 클래스
	A1(){//기본 생성자
		System.out.println("생성자 A");
	}
	A1(int x){//매개변수 떄문에 기본생성자가 자동생성이 안된다.
		System.out.println("생성자 A-param");
	}
}
class B1 extends A1{//자식 클래스
	B1(){//A1에 기본생성자를 주석처리하면 오류가 뜬다.
		System.out.println("생성자 B");
	}
	B1(int x){
		System.out.println("생성자 B-param");
	}
}




public class InheritEx04 {
	public static void main(String[] args) {

		B1 b = new B1(100);//매개변수를 던져줘도 부모생성자는 기본생성자로 출력된다.
		
		
		
		
	}

}
