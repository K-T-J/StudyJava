package day11;

public class ClassEx32 {
	
	//클래스 초기화 블럭
	static int[] arr = new int[10];
	
	static {
		System.out.println("초기화블럭실행!!");
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
	


	public static void main(String[] args) {

		System.out.println("main메서드 실행");
		
		for(int a :arr) {
			System.out.println(a);
		}
		
		
		
		
		
		
	}

}
