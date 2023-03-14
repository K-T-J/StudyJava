package day11;

public class ClassEx36this {
	
	int x = 10;//인스턴스 변수
	
	void add(int x) { //지역변수 > 인스턴스변수 > 클래스변수
		this.x=x; //this == 인스턴스 == 객체
	}

	public static void main(String[] args) {

		
		ClassEx36this c1 = new ClassEx36this();	// x=10
		ClassEx36this c2 = new ClassEx36this();	// x=10
		ClassEx36this c3 = new ClassEx36this(); // x=10
		c1.add(200);
		
		System.out.println(c1.x);
		System.out.println(c2.x);
		
		
		//지역변수를 인스턴스변수에 덮어쓰고 싶은데
		//둘이 이름이 같다면 
		//인스턴스 변수 앞에 this. 을 붙여야한다.
		//*인스턴스 변수를 가르킬때는 this.(외워)   개별적으로 하나씩
		
		
		
		
		
		
	}

}
