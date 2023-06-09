package day16;



/*
	int 타입의 width와 height변수를 가지는 Rect 클래스를 작성하고,
	면적이 같으면 두 Rect 객체가 같은 것으로 판별하는 equals()를 작성하세요.
	생성자에서 widh와 height를 받아 변수 초기화 하세요.

*/
class Rect{
	int width;
	int height;
	public Rect(int widh, int height){
		this.width = width;
		this.height =height;
	}
	@Override
	public boolean equals(Object obj) {
		Rect r = (Rect)obj;
		if(width * height == r.width * r.height) return true;
		else return false;
			
		}
}

public class ApiEx06 {
	public static void main(String[] args) {
		
		Rect a = new Rect(4,5);
		Rect b = new Rect(4,5);
		Rect c = new Rect(4,5);
		if(a.equals(b)) System.out.println("a is equals to b");
		if(a.equals(c)) System.out.println("a is equals to c");
		if(a.equals(c)) System.out.println("a is equals to c");
		
	}
	
}
