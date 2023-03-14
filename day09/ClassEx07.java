package day09;


class Test2{
	static int a = 10;
	int b = 20;
}

public class ClassEx07 {
	
	static Test2 t = new Test2();	//인스턴스 : 객체 생성후 -> 참조변수명.변수명
	
	public static void main(String[] args) {
		
		System.out.println(ClassEx07.t.b);

		

	}

}
