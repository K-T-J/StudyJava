package day08;

// 변수의 종류 : 변수 선언 위치에 따른 종류

class TvEx{
	//클래스 기본형 변수 : static를 쓰면 TvEx로 생성된 객체들이 공유하는 변수
	static boolean power = false;
	//인스턴스 기본형 변수 : 각각의 저장 공간을 따로 가지고 있는 변수
	int vol = 0, ch =1;
	
}
public class ClassEx04 {
	//메인 메서드
	public static void main(String[] args) {
		
		
		
		System.out.println(TvEx.power);
		//System.out.println(TvEx.vol);  //안된다
		
		TvEx tv1 = new TvEx();
		TvEx tv2 = new TvEx();
		
		System.out.println(TvEx.power);
		System.out.println(tv1.power);
		System.out.println(tv2.power);
		
		tv1.power = true;
		//power는 static 클래스 변수라 객체들중 1명이 바뀌면 모든 객체들이 바뀐다.
		System.out.println(TvEx.power);
		System.out.println(tv1.power);
		System.out.println(tv2.power);
		
		
		System.out.println("======= ch ==========");
		System.out.println(tv1.ch);
		System.out.println(tv2.ch);
		
		tv1.ch = 100;
		
		System.out.println(tv1.ch);
		System.out.println(tv2.ch);
		
		
		/*
		//지역 기본형 변수 : 메서드 안에서 만들어지고, 메서드가 끝나면 사라짐
		int a = 10;
		
		for(int i = 0; i<5; i++) {
			int test = 100;
			System.out.println(i);
		}
		//System.out.println(test); 못쓴다.
		*/
		
		
		
		
		
		
		
	}

}
