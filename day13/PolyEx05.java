package day13;
// 오버라이딩 다형성 실현 -> 링크드 리스트 구현

class Shape{
	public Shape next;
	public Shape() {next = null;}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{ //next @draw(Line)
	@Override
	public void draw() {
		System.out.println("Line");
		
	}
}

class Rect extends Shape{ //next @draw(Rect)
	@Override
	public void draw() {
		System.out.println("Rect");
		
	}
}

class Circle extends Shape{	//next @draw(Circle)
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}



public class PolyEx05 {
	
	static void paint(Shape l) {
		l.draw();
	}
	
	
	public static void main(String[] args) {
		
		Shape start, last, obj;
		
		
		start = new Line();//첫 시작
		last = start; //시작과 동시에 끝
		
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		obj = new Line();
		last.next = obj;
		last = obj;
		
		obj = new Circle();
		last.next = obj;
		last = obj;
		
		//모든 도형 출력
		Shape s =start;
		while(s !=null) {
			s.draw();
			s= s.next;
		}
		

		/*
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		*/
	}

}
