package day11;
public class ClassEx33 {
	
	double d; //인스턴스변수
	

	ClassEx33(){	//생성자
		System.out.println("기본생성자");
		d = Math.random();
	}
	//생성자 오버로딩
	ClassEx33(double a){
		System.out.println("생성자2");
		d = a;
	}
	
	
	
	
	public static void main(String[] args) {

		ClassEx33 c1 = new ClassEx33(); //생성자를 호출한다라는말
		ClassEx33 c2 = new ClassEx33();
		ClassEx33 c3 = new ClassEx33();
		System.out.println(c1.d);
		System.out.println(c2.d);
		System.out.println(c3.d);
		
		
		/*
		System.out.println(c1.d);
		ClassEx33 c2 = new ClassEx33(5.12); //()안에 매개변수를 작성하면된다.
		System.out.println(c2.d);
		*/
		
		
		
		
	}

}
