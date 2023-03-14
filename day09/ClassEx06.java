package day09;

/*
	클래스 기본형 변수	: static붙은아이 : 바로 사용가능	"클래스명.변수명"	
	클래스 참조형 변수	: 
	
	인스턴스 기본형 변수	: 메서드 밖에서 new로 객체 생성후 사용가능 "참조변수명.변수명"
	인스턴스 참조형 변수
	
	지역 기본형 변수		: 메서드 안에서 만들고 메서드가 끝나면 소멸 "클래스명.변수명" 
	지역 참조형 변수
*/
class TvTest{
	boolean power = false;
	int ch = 1, vol = 0;
}

public class ClassEx06 {
		//클래스
	
	//선언만 했을경우
	static int a;		// 클래스 기본형변수 ClassEx06.a 자동으로 초기값을 정해준다 default값 0
	static ClassEx06 c;	// 클래스 참조형변수 ClassEx06.c	default값 null
	static TvTest tv;	// 클래스 참조형변수 ClassEx06.tv default값 null
	// tv변수는 ClassEx06 안에 있는변수라 TvTest.변수가 아니라 ClassEx06.으로
	//static TvTest tv; = new TvTest(); 이렇게 해도 된다,
	
	int x;							//인스턴스 기본형 (기본값 0 자동초기화)
	TvTest t1 = new TvTest();		// 객체 생성
	
	//자기자신(ClassEx06) 타입으로 인스턴스 객체 생성할면 안됨!!! 무한 메모리활용
	//ClassEx06 c2 = new ClassEx06();	//인스턴스 참조형
	ClassEx06 c2 = null;
	
	
	
	
	
	public static void main(String[] args) {//메인메서드
		
		//int b; : 지역 기본형 변수는 자동초기화가 안된다.
		//static int b = 100; : 불가능 stctic키워드는 메서드 밖에서 사용가능!!!
		
		//지역변수
		int b = 100;	//지역 기본형 변수
		TvTest tt= new TvTest();	//지역 참조형 변수
		
		System.out.println(ClassEx06.a);
		System.out.println(ClassEx06.c);
		//System.out.println(ClassEx06.tv.power); //문법적으로는 맞음
//NullPointerException에러 : tv에 객체 생성된 적이없음. tv가 비어있어서 = power,ch,vol이 만들어진적이 없어.
		
		System.out.println("--------------------");
		if(ClassEx06.tv != null) {
			//null이 아닐때, 즉 tv안에 TvTest객체가 생성되어있다면,
			System.out.println("1" + ClassEx06.tv.power);
		}else {	// == null : 즉, tv안에 TvTest객체 생성이 안되어 있다면
			ClassEx06.tv = new TvTest();// 객체 생성하고,
			System.out.println("2" +ClassEx06.tv.power); //power출력
		}
		
		System.out.println("--------------------");
		//선언 위치가 다르면 이름이 같아도 괜찮다.
		int a = 299;	//지역 변수
		System.out.println(a + ClassEx06.a); 
		// static이 붙은 main에서 static이 붙은 a를 호출하기 떄문에
		// 같은 클래스안에서, 메모리 생성시점이 같은 아이들은 서로 바로 호출 가능.
		// static<-->static , 인스턴스 <--> 인스턴스, 
		//파란색 글씨 : class변수
		
		
		//메서드 안에서 변수의 우선순위
		// 지역변수 > 인스턴스 > 클래스
		
		
		// 인스턴스 변수 사용
		ClassEx06 ccc = new ClassEx06();
		System.out.println(ccc.x);
		System.out.println(ccc.t1.ch);
		ccc.c2 = new ClassEx06();
		System.out.println(ccc.c2.x);
		
		
		
		System.out.println();
		Math.random();
		

	}//여기서 지역변수 소멸

}
