package day14;

//아래 추상 클래스 Calculator 상속받은 MyCalc 클래스를 구현하세요.
abstract class Calculator {
	public abstract int add(int a, int b);			//두 정수의 합 리턴
	public abstract int substract(int a, int b);	//두 정수의 차를 리턴
	public abstract double average(int[] a);		//배열에 저장된 정수의 평균값 리턴
}
		

// 일반클래스로 상속받아서, 추상메서드 모두 구현시켜서 객체생성후 사용
class MyCalc extends Calculator{ //추상클래스를 사용할려면 오버라이딩해서 사용해라
	@Override //추상메서드 전부 오버라이딩
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int substract(int a, int b) {
		return a-b;
	}
	@Override
	public double average(int[]a) {
		double sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
	
}


public class AbstEx02 {
	public static void main(String[] args) {
		MyCalc c = new MyCalc();
		System.out.println(c.add(10, 20));
		System.out.println(c.substract(30, 20));
		
		//int[]r = new int[5];
		
		
		System.out.println(c.average(new int [] {10,20,30,40,50}));
		
		
		

	}

}
