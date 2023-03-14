package day11;


class Car {
	String color = "";
	//매개변수있는생성자 -> 기본생성자 자동생성x->new Car(); 기본생성자 호출하며 객체생성불가.
	//객체 생성시 반드시 color 값을 주면 생성해야된다.
	Car(String color){	//생성자
		this.color = color;
	}
	String drive() { //문자 리턴
		return color + "색 차가 지나갑니다 ~ 비키세요~~";
		
	}
}












public class ClassEx38 {

	public static void main(String[] args) {

		Car[] cars = new Car[5]; // 자동차 5개 저장할 수 있는 배열 (주차장)
		String [] color = {"빨강","노란","검정","초록","파란"};
		
//		for(int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i].color);
//		}
		
		
		
		for(int i = 0; i < cars.length; i++) {//주차장 개수만큼 반복해서
			cars[i] = new Car(color[i]);	// 자동차를 color의 색들로 생성해서 주차장에 저장.
			/*
		cars[0] = new Car(color[0]);
		cars[1] = new car(color[1]);
			//..... 등등 반복문 for 사용
			 */
		}
		for(int i =0; i < cars.length; i++) { //출력
			System.out.println(cars[i].drive());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
