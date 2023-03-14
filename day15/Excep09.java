package day15;

public class Excep09 {
	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
		method2();
		}catch(Exception e) {
			
		}
	}
	static void method2() throws Exception{
		throw new Exception();
	}
	
	
	
	

}
