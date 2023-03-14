package day13;

class Poly1{
	int a= 10;
	void abc () { //메서드
		System.out.println("abc");
	}
}

class Poly2 extends Poly1{//a, b, abc(), def 
	int b= 100;
	void def() {
		System.out.println("def");
	}
}


public class PolyEx06 {
	public static void main(String[] args) {
		
		
		Poly1 p1 = new Poly1();//a,abc()
		Poly2 p2 = new Poly2();//a,b,abc(),def()
		//다형성
		Poly1 p3 = new Poly2();//a,abc() 자식클래스가 멀가졌는지 알수없다.
		Poly2 p4 = (Poly2)p3; //a,b,abc(),def() p4에 다시 p3를 담는다.(형변환)
		
	}

}
