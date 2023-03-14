package day00;

class Ex02{
	int a;
	boolean isPlay;
	double d;
	
}



public class Test1 {
	public static void main(String[] args) {

		Ex02 ex = new Ex02(); //객체생성
		
		ex.a = 10;			//메서드 호출 한후 값대입
		ex.isPlay = false;
		ex.d = 10.0;
		System.out.println(ex.a);
		System.out.println(ex.isPlay);
		System.out.println(ex.d);
		
	}

}
