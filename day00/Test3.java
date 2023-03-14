package day00;

class MyCard{
	int num;	//인스턴스 변수
	boolean isGwang;	// 인스턴스변수
}


public class Test3 {
	public static void main(String[] args) {

		MyCard mc = new MyCard();
		
		mc.num = 5;
		mc.isGwang = true;
		System.out.println(mc.num);		//5출력
		System.out.println(mc.isGwang);	//true출력
	
	}
}
