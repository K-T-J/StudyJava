package day13;


class AClass1{//s add()
	int x;
	void add() {
		System.out.println("AAA");
	}
}

class BClass1 extends AClass1{//x, @add(), y ,sub()
	int y;
	@Override
	void add() {
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("subsub");
	}
}



public class PoltEx02 {
	public static void main(String[] args) {

		
		AClass1 a = new BClass1();
		Object o = new BClass1();
		
		
		
		
		
		
		BClass1 b = null;
		if(a instanceof BClass1) {
			System.out.println("형변환 가능");
			b = (BClass1)a;
		}else {
			System.out.println("형변환 불가능");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		AClass1 a = null;
		BClass1 b = new BClass1();
		BClass1 b2 = null;
		
		a = (AClass1)b;
		//형변환 가능 여부 판단하고 형변환.
		
		
		if(a instanceof BClass1) {
		b2 = (BClass1)a; //변수만 보면 부모타입이기때문에 형변환 안하면 출력x 반드시 작성
		}
		b2.sub();
		b2.add();
		*/
		
		
		
		
		
		
		/*
		AClass1 a =new AClass1();
		BClass1 b = null;
		//b = (BClass1)a; //BClass1 b = new AClass1(); 안된다. 
		//b.add();
		*/
		
		
		
		
		
		
		
		
		
		/*
		AClass1 a =null;
		BClass1 b = new BClass1();
		
		a = (AClass1)b; //AClass1 a = new BClass1(); 가능하다. 형변환하는게 좋다.
		System.out.println(a.x);
		a.add();//오버라이딩 된 상태로 넘어온다.
		//a.sub(); 안된다.
		 */
		
		
		
		
		
		
		
		
		
		
		 
		/*
		AClass1 a = new AClass1(); //x add("AAA")
		AClass1 a1 = new BClass1(); //x, @add("BBB"), y, sub
		
		System.out.println(a.x);
		a.add();
		
		System.out.println(a1.x);
		a1.add();
		*/
		
		
		
		
		
		
		
		
		
	
		
	}

}
