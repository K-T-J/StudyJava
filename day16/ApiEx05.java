package day16;

class Point1{
	int x, y;
	public Point1(int x, int y) {
		this.x = x; this.y = y;
	}
	@Override
	public boolean equals(Object obj) {//두 객체의 x,y가 동일한지 비교하는식으로 재정의
		Point p = (Point)obj; //Object타입으로 받은 obj값을 Point1로 다시 형변환해야지 x,y로 접근가능
		if(x == p.x && y == p.y) {
			return true;
		}else {
			return false;
		}
	}
}


public class ApiEx05 {
	public static void main(String[] args) {

		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,5);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}
}
