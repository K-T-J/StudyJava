package day15;




public class Excep05 {
	public static void main(String[] args) {

		
		System.out.println(1);
		try {
			
			System.out.println(2);
			//System.out.println(0/0);//일부러 에러 발생 바로 catch로 넘어간다.뒤에 코드 무시
			System.out.println(3);//무시
		}catch(Exception e){
			System.out.println(4);
		}finally {
			System.out.println(5);//오류가 발생을 하건 안하건 무조건 실행
			
		}
		System.out.println(6);
		
		
		
	}

}
