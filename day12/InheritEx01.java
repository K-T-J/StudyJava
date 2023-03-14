package day12;

//상속
class Super{//x 	//부모
	static int a = 100;
	int x = 10;
}

class Sub extends Super{//x,y	//자식
	int y = 20;
	
}



public class InheritEx01 {
	public static void main(String[] args) {

		Sub sub = new Sub();
		System.out.println(sub.x); //10출력
		System.out.println(sub.toString());//sub 한것과 동일 주소값출력
		System.out.println(sub);// sub.toString()한것과 동일 주소값 출력
		
		System.out.println(Super.a);//static 100출력
		System.out.println(sub.a);//static 100출력
		
	}

}
