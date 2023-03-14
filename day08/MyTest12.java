package day08;

class Ttt{
	int a = 20;//인스턴스 변수
}
class Test002{//변수 메서드 생성자 
	int a =10; //값은 메서드 안에서 하는게 좋다.
	//if문, for문, 출력문 다안된다.	
	
	/*
	메서드 : 접근지정자 (static) 리턴타입 메서드명(매개변수 0개이상..){
	  	메서드 영역(출력, 변수, 배열, 반복문, 객체생성
	  	return 값 : 없으면 void
	  }
	 */
	int func() {//3번
		//실행 ~~! 끝
		System.out.println("실행!!!");
		return 100;
	}
	String strFunc(int num) {//5번 (100)
		System.out.println("num = " + num);
		return "ok";
	}
	Ttt func2() { 
		Ttt t1 = new Ttt();
		t1.a =100;
		return t1;
	}
	void func3(Ttt ttt) {
		System.out.println(ttt.a);
	}
	
}

public class MyTest12 {
	public static void main(String[] args) {
		
		Test002 t = new Test002();	//1번 객체 생성
		
		String str = t.strFunc(t.func());//2번  4번(100)
		// 7번				6번("0k")
		System.out.println(str);
		
		
		Ttt ttt = new Ttt(); //ttt타입은 Ttt
	
		t.func3(ttt);
		

	}

}
