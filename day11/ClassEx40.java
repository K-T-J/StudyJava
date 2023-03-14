package day11;

//default 클래스 : 같은 패키지만 공개 (public안붙음)
class Sample{
	//인스터스 변수
	public int a;
	private int b;
	protected int c; // 같은 패키지, 다른패키지라도 자식이면 허용
	int d;
	
}

//public 클래스 : 전체공개
public class ClassEx40 {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.a = 10;
		//s.b = 20; private 접근 불가, 부르고 있는 위치가 ClassEx40의 main이기때문에
		s.c = 30;
		s.d = 40;
		
		
		
		
	}

}
