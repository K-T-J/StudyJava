package day15;


interface MyInter{
	void func(); //추상 메서드
	
}



public class AnonyEx01 {
	public static void main(String[] args) {
		
		
		//인터페이스 :  -> 구현한 클래스 정의(오버라이딩)
		//			 -> 구현클래스 객체 생성해서 오버라이딩된 메서드 호출 사용
		new MyInter() {
			@Override
			public void func() {
				System.out.println("MyInter 의 func() 오버라이딩된 메서드 호출");
			}
		}.func();

	}

}
