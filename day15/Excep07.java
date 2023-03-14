package day15;

public class Excep07 {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("try 구문");
			//throw new Exception("hello");
			throw new RuntimeException();
			//System.out.println("hello");
		}catch(NullPointerException e) {
			System.out.println("Null");
		}catch(RuntimeException e) {
			System.out.println("Runtime");
		}catch(Exception e) {
			System.out.println("모든예외");
		}
		
		
		
		
		
		
		
		
		

	}

}
