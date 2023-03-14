package day13;

class Super{//add()
	void add() {
		System.out.println("Super");
	}
}

class Sub extends Super{ //add() ->@add() 오버라이딩
	@Override
	void add() { //부모add를 오버라이딩한다. {}앞에까지 동일하게
		super.add(); // "Super"까지 출력하고싶을때
		System.out.println("Sub");
		System.out.println("Sub");
		System.out.println("Sub");
	}
}








public class InheritEx06 {
	public static void main(String[] args) {

		
		Sub sub = new Sub();
		sub.add();
	}

}
