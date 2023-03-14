package day11;

class Circle{
	
	int radius;
	
	//Circle(){} *여기 자동으로 만들어줌
	Circle(){} //초기화 없이, 매개변수없이 객체생성도 가능하게 하려면,
	// 매개변수없는 생성자도 작성을 해줘야한다.

	Circle(int r){//이것 때문에 기본형을 만들어줘야한다.
		radius = r;
	}
	
	
	//메서드
	void set(int r) {	//  -여기
		radius = r;
	}
	double getArea() {
		return radius * radius * 3.14;
	}
}





public class ClassEx35 {

	public static void main(String[] args) {

		Circle pizza = new Circle();//기본생성자 실행 radius = 0 *여기
		pizza.set(15); //set 실행되고 radius는 15 덮여씀 -여기
		System.out.println(pizza.getArea());
		
		
		
		
		
		
	}

}
