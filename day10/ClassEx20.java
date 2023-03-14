package day10;

class Circle{
	int radius = 30;
}

public class ClassEx20 {
	// 기본형 테스트용 메서드
	static void plus(int num) { // 객체생성안하고 테스트해보기 위해 그냥 static
		num = num +1;
		System.out.println("plus num : " + num);
	}
	//참조형 테스트용 메서드
	static void biggerpizza(Circle pizza) {
		pizza.radius++;
	}
	// 배열 테스트용 메서드
	static void increase(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		// 기본형 
		int num = 10;
		ClassEx20.plus(num);
		
		System.out.println("main num : " + num);//return값을 받은게 아니라 10;
		
		//참조형
		Circle pizza = new Circle();
		ClassEx20.biggerpizza(pizza);//클레스 메서드라 객체생성x 
		System.out.println("main pizza radius before : " + pizza.radius);
		System.out.println("main pizza radius after : " + pizza.radius);
		
		// 배열 (참조형)
		int [] arr = {1,2,3,4,5};
		increase(arr);
		for(int a : arr) {System.out.println(a);}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
