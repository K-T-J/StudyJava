package day15;

public class Excep010 {
	public static void main(String[] args){
		try {
		method1();
		}catch(Exception e) {
			System.out.println("main에서 예외 처리");
		}
	}

	static void method1() throws Exception{
		try {
		throw new Exception();
		}catch(Exception e) {
			System.out.println("method1에서 예외 처리함~~~");
			throw e;
		}
	}
	
}
