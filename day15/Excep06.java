package day15;



public class Excep06 {
	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("hello");
			throw new Exception("고의로 예외 발생~");
			//System.out.println("test"); 위에서 에러 떠서 아래것은 출력안된다
			
		}catch(Exception e) {
			System.out.println("예외 발생!!");
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();//예외 발생시 뜨는 에러 메세지 다시 출력
		}
		
		

	}

}
