package day14;
//상속문제
/*
	#1. 
	아래 main()메소드 #1번과 아래 실행결과를 참고하여 TVClass를 상속받은 
	ColorTV클래스를 작성하세요. 
	실행결과 : 32인치 1024컬러
	
	#2. 위 1번 문제를 푼후, main()메소드 #2번과 아래 실행결과를 참고하여 
	ColorTV를 상속받는  IPTV클래스를 작성하세요.
	실행결과 : 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
*/

class TVClass1 {
	private int size; 
	public TVClass1(int size) { this.size = size; } //생성자 size초기화
	protected int getSize() { return size; } //size가 private라 get만듬
}//TVClass1

class ColorTV2 extends TVClass1{//TVClass1 자식 클래스
	private int color; 
	public int getColor() {return color;}
	ColorTV2(int size, int color){//매개변수 2개 던져줬다. size는 부모에 있지만 color는 없어서 직접생성
		super(size);//부모 size 호출
		this.color = color; //color 초기화
	}//생성자
	
	void printProperty() {
		System.out.println(getSize() + "인치" + color + "컬러");//호출 size는 private이라 get으로 작성
	}//void 메서드
}//ColorTv2

class IPTV1 extends ColorTV2{//ColorTV2의 자식 클래스
	private String ip;
	IPTV1(String ip, int size, int color){//매개변수 3개 던져줬다. size,color는 부모에 있지만 ip는 없어서 직접생성
		super(size,color);//부모 size, color 호출
		this.ip = ip;//ip 초기화
	}//생성자
	@Override 
	void printProperty() {//TVClass1에 있는 printProperty를 오버라이딩
		System.out.println("나의 IPTV는"+ip+"주소의"+getSize() + "인치" + getColor() + "컬러");
	}//메서드
	
}//IPTV1




public class Myclass545648 {
	public static void main(String[] args) {

		//#1. 
		ColorTV2 myTV = new ColorTV2(32, 1024);//매개변수 2개 던져줬다.
		myTV.printProperty();
		
		
		
		//#2. 
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);//매개변수 3개 던져줬다.
		iptv.printProperty();
		
		
		
	}//main

}//Myclass545648
