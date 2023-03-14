package day08;


//#1. 클래스 정의
class Tv {					//티비 공장생성
	boolean power = false;  //티비를 끄고 키고 
	int vol = 0, ch = 1;	//티비 채널
}

public class ClassEx03 {
	//클래스변수
	//인스턴스변수

	public static void main(String[] args) {

		//#2. 객체 생성
		Tv t;			// 생성
		t = new Tv();	// 선언 : 메모리가 Tv 크기만큼 생성되는 시점.
		
		//줄여쓰면
		//Tv t = new Tv();  선언 + 생성
		
		//#3. 사용
		System.out.println(t.power);
		System.out.println(t.vol);
		System.out.println(t.ch);
		
		//#4. 객체 여러개 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		Tv t4 = new Tv();
		
		
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		//출력하면 클래스명@객체고유번호(주소)
		
		
		//객체는 각각 따로 데이터 저장
		t1.ch = 10;
		t2.ch = 20;
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		
		
		// 같은 타입끼리 대입 가능
		int a = 10;
		int b = 20;
		a = b;
		b = a;
		
		t1 = t2; //가능
		t2 = t3;
		
		//불가능
		//t1 = t2.ch;  Tv타입에 int 타입 ch 넣기 불가능
		//가능
		t1.ch = t2.ch;
		a = t2.ch;
		t1.ch = b;
		//int타입 -> int 타입이라 가능
		
		
		//ClassEx03도 클래스라서 객체생성가능, 자기자신 생성가능.
		ClassEx03 cls = new ClassEx03();
		
		String s = new String();
		
		int [] arr = new int[5];
		
		
		
		
		
		
		
		
		
		
		
		//이클립스 단축키  //syso 한다음 ctrl + 스페이스
		// 실행 ㅣ ctrl + F11
		// 자동완성 : ctrl + spacebar
		// 다음줄로 넘어갈때 shift + enter
		// 줄 전체를 옮기고싶을때 : 드레그 하고 alt누른상태에서 화살표
		// 한줄 전체 선택  : shift + end 키 (앞으로)
		//					   + hom 키 (뒤로)	
		// 한줄 삭제 : 컨트로 + D
		// 전체 선택 컨트롤 + a
		// 한줄복사 : 복사 하고싶은 곳에 커서를 두고 컨트롤 + 알트 + 방향키

		
		
		
		
	}

}
