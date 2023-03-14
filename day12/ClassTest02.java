package day12;
/*
	main메서드를 실행하였을 때 예시와 같이 출력되도록 Tv 클래스를 작성하세요. 
	콘솔 출력예 >> Samsung에서 만든 2021년형 32인치 TV
*/
class Tv {//캡슐화 할려면 private
	String name;
	int a;
	int b;
	
	Tv(String name, int a, int b){ //생성자는 인스턴스값을 초기화할때 사용
		this.name = name;
		this.a = a;
		this.b = b;
	}
	
	void show() {
		System.out.println(name + "에서 만든" + a + "년형" + b + "인치TV");
		
	}
	
}

public class ClassTest02 {
	public static void main(String[] args) {
		// main메서드는 작성 끝인 상태 실행하면 콘솔 예시 처럼 출력되어야함. 
		Tv myTv = new Tv("Samsung", 2020, 30);
		myTv.show(); //리턴 받은게 없어서 void
		
	}
}
