package day15;

class SingleT{
	//싱글턴으로 만들기
	private static SingleT instance = new SingleT();
	private SingleT() {}
	public static SingleT getInstance() {
		return instance;
	}
	//일반 인스턴스 변수
	int a = 100;
	
	//일반 인스턴스 메서드 : 객체 생성후 사용가능
	void func() {
		System.out.println("싱클턴");
	}
}



public class SingleEx01 {
	public static void main(String[] args) {

		
		//SingleT s = new SingleT(); 외부에서 객체 생성 불가!!
		
		SingleT s = SingleT.getInstance();//객체 한개 생성된거 얻어다 s에 담아 사용
		s.func();
		
		
		SingleT s1 = SingleT.getInstance();
		
		System.out.println("s.a : " + s.a);		//s 에 100
		System.out.println("s1.a : " + s1.a);	//s1 에 100

		s.a = 200;
		
		System.out.println("s.a : " + s.a);		//200
		System.out.println("s1.a : " + s1.a);	//200
		System.out.println(s);	//두개 주소가 같아서 하나에 값을 변경하면 같이 변한다.
		System.out.println(s1);
		
	}

}
