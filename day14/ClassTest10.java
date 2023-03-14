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
class TVClass {
	private int size;
	public TVClass(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TVClass{//size,getsize()
		private int color;
		ColorTV(int size, int color){
			super(size);//부모생성자 직역해서 호출, 이때 size를 필요로 하고, size 초기화공식도 부모생성자에 써있고
			this.color = color;//내가만든 변수이므로 내 생성자에서 초기화
			
		}
		void printProperty() {
			System.out.println(getSize() + "인치" + color + "컬러"); //size 에러 private이라서
			
		}
		protected int getColor() {return color;}
	}
	
class IPTV extends ColorTV{//size, color, getSize(),printProperty()
	private String ip;
	IPTV(String ip, int size, int color){
		super(size,color); // 부모생성자를 통해 size,color변수 초기화 됨
		this.ip = ip; //내가만든 ip 변수 초기화
	}
	@Override
	void printProperty() {
		System.out.println("나의 IPTV는"+ ip +"주소의" + getSize() +"인치"+ getColor() +"컬러");
	}
}	

public class ClassTest10 {
	public static void main(String[] args) {
		//#1. 
		ColorTV myTV = new ColorTV(32, 1024);//매개변수 2개 던져줬다.
		myTV.printProperty();
		
		
		
		//#2. 
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
