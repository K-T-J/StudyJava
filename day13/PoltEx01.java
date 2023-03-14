package day13;

class AClass{int x;}				//x
class BClass extends AClass{int y;}	//x,y






public class PoltEx01 {
	public static void main(String[] args) {
		//다형성 : 부모 (조상)의 변수에 자식 객체를 담는것.
		AClass aa = new BClass();//부모가 자식을 담을수있지만 자식에 갖고있는 내용은 모른다.
		//BClass bb = new AClass();//자식클래스가 부모클래스를 담을수 없다.

		// 형변환
		//int a = 10;			//조상 : 정수
		//double d=(double)a;	//자손 : 정수, 실수
		
		//double d = 5.7;		//조상 : 정수, 실수
		//int a = (int)d;		//자손 : 타입 인트이므로 정수만 사용가능
		
		//기존 객체 생성 방법
		AClass a = new AClass();
		BClass b = new BClass();
		
		System.out.println(aa.x);
		
		
		
		
		
		
		
	}
}
