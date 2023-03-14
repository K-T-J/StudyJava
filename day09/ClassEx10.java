package day09;

class Test3{
	//메서드 4개 종류
	//입력값 x, 리턴값 x
	void test(){	//인스턴스 메서드 : 객체생성->참조변수명 . 메서드명()
		System.out.println("hello");
	}
	
	//입력값 o, 리턴값 x
	void printName(String name) {
		System.out.println("안녕하세요~," + name + "님!");
	}
	
	//입력값 x, 리턴값 o
	int getHundred() {
		System.out.println("100 리턴해줄게~~~");
		return 100;
	}
	//입력값 o, 리턴값 o
	
	String sum(String a,String b) {
		String res = a+b;
		return res;
	}
}

public class ClassEx10 {

	public static void main(String[] args) {

		Test3 t = new Test3();	//객체생성
		
		t.test();
		System.out.println("------------");
		
		t.printName("피카츄");
		t.printName("김태준");
		
//-----------------------------------------
		int result = t.getHundred();
		System.out.println(result);
		
//-----------------------------------------		
		String resulta = t.sum("피카츄" , "라이츄");
		System.out.println(resulta);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
