package day13;

class A {//이것부터 시작해서 다시 아래로
	A(){
		System.out.println("생성자 A");
	}
}
class B extends A{//부모생성자부터
	B(){
		System.out.println("생성자 B");
	}
}
class C extends B{//부모생성자부터
	C(){
		System.out.println("생성자 C");
	}
}



public class InheritEx03 {
	public static void main(String[] args) {

		C c = new C();//부모 생성자 먼저 다음 자식생성자 순으로
		
		
		
	}

}
