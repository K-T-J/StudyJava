package day12;
/*
직사각형을 표현하는 Rectangle 클래스를 작성하세요. 
- int 타입의 x, y, width, heigth 필드 : 사각형을 구성하는 점과 크기 정보
* x,y는 사각형의 왼쪽 위의 점을 말함. (0,0)은 왼쪽 위이며, x값은 오른쪽으로 늘어나고, y값은 밑으로 늘어난다. 
- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
- int squareArea() : 사각형 넓이 리턴
- void show() : 사각형의 좌표와 넓이 출력
- boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
- 콘솔출력결과:
	(2,2)에서 크기가 8x7인 사각형
	b의 면적은 36
	c는 a을 포함합니다.
*/
class Rectangle{
	int x;
	int y;
	int width;
	int height;
	
	Rectangle(int x, int y, int width, int heigth){
		this.x = x; this.y = y;
		this.width = width; this.height = heigth;
	}
	int squareArea() {
		return width * height;
	}
	void show() {
		System.out.println("("+ x +","+ y +")에서 크기가"+ width +"x"+height+"인 사각형");
	}
	boolean contains(Rectangle r) {
		if(x < r.x && y < r.y && (x + width) > (r.x + r.width) && (y+height)>(r.y + r.height)) {
			return true;
		}else {
			return false;
			}
		}
}



public class ClassTest05 {
	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(2, 2, 8, 7); //2,2에서 2+8(가로) , 2+7(세로)
		Rectangle b = new Rectangle(5, 5, 6, 6); //11,11 출력x
		Rectangle c = new Rectangle(1, 1, 10, 10); 
		
		a.show();
		
		System.out.println("b의 면적은 "+ b.squareArea());//b의 면적은 36
		
		if(c.contains(a)) System.out.println("c는 a를 포함합니다.");//c는 a을 포함합니다.
		//c가 a를 포함하고있는지 비교
		
		
		
		if(c.contains(b)) System.out.println("c는 b를 포함합니다.");//출력안됨
		
	}
}
