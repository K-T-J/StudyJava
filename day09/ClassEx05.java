 package day09;

/*
	메모리 로딩순서
	클래스 -> static -> main 메서드실행 ->(new~)인스턴스
	|클래스 범위
	
 */
class Test{
	//static int x = y;	//클래스 변수 인스턴스y가 아직 만들어지지도(new) 않은 상태여서 안된다.
	//int y = 10;			//인스턴스 변수

	
	//static이 붙은 변수는 프로그램 시작시 먼저 메모리에 로딩되어 사용준비가 된다.
	// 선얼할때 인스턴스가 먼저 작성되었다고 혼동하면 안된다.
	int y = x;
	static int x = 100;	//헤깔라니 static 이 맨위로 가는게 보기 편하다.
	
}

public class ClassEx05 {
			//클래스
			//이곳에서도 변수 선언 가능.
		static int a = 100;
		int i = 20;
		
	public static void main(String[] args) {//메인 메서드
		
		System.out.println(ClassEx05.a);	// 클래스명.변수
		
		System.out.println(a);//같은 static 끼리는 a 라고만 써도 된다.
		
		ClassEx05 cls = new ClassEx05();	//new 객체생성
		
		System.out.println(cls.i);
		
		// 단발성, 1회용으로 한번만 i의 값을 출력하고 말겠다~~~~
		System.out.println(new ClassEx05().i); //출력만 하고싶을때 가능은하다.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
