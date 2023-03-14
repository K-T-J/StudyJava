package day14;

interface Test{
	public static final int NUM = 1; // 상수
	public abstract void add();		//추상메서드
	//int NUM = 1; 		//생략 public static final
	//void add();		//생략 public abstract
	
}
interface Test2{
	void sub();
}


class A {}





class Inter extends A implements Test, Test2{ //상속도 받고 다중 구현도 가능하다
	@Override
	public void add() { //위에 생략했어도 반드시 오버라이딩할떄 접근지정자 public을 붙여줘야한다.
		System.out.println("implements");
	}
	public void sub() {
		//구현
	}
}




public class InterEx01 {
	public static void main(String[] args) {

		Inter i = new Inter();
		i.add();
		System.out.println(Test.NUM);
		System.out.println(i.NUM);
		i.sub(); // 서브도 생김
		
		//다형성
		Test t = new Inter(); //Test 선언은 가능하니
		t.add(); 
		
		
		
		Test2 t2 = new Inter();
		A a = new Inter();
		
		
	}

}
