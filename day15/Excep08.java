package day15;

public class Excep08 {
	/* 정서으로 예외처리 방법
	static void add() {
		try {
			Exception e = new Exception();
			throw e; 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}*/
	
	static void add() throws Exception { //()옆에 throws 쓰면 부른쪽에서 해결하라는뜻
		//							메서드안에서 예외가 발생하면 메서드를 호출한 쪽으로 예외처리 미루기.
		Exception e = new Exception();
		throw e;
	}
	
	public static void main(String[] args) {

		try {
			add(); //add호출
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료!!!");
		
		
		
		
		
		
		
		
		
	}

}
