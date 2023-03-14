package day13;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}


public class PolyEx03 {
	
	static void print(Object p) {
		//Person p = new Student(); 부모변수에다가 자식 객체를 받아줘서
		if (p instanceof Person ) {System.out.println("Person");}
		// p가 person에 자식이 맞냐 
		if (p instanceof Student ) {System.out.println("Student");}
		if (p instanceof Researcher ) {System.out.println("Researcher");}
			
		
	}
	
	public static void main(String[] args) {

		System.out.println("new Person -> ");
		print(new Person());
		System.out.println("new Student ->");
		print(new Student());
		System.out.println("new Researcher -> ");
		print(new Researcher());//Researcher res = new Researcher(); 같은말
		
		
		
		//다형성 : 	부모타입 변술 자식 객체 담을 수있다.
		//			부모타입 변수로는 부모가 아는 멤버들만 사용가능
		//			온전히 모든 자식 멤버를 사용하고 싶으면,
		//			자식 변수에 다시 담아줘야 한다. 
		//			이때,(instanceof 연산자로 형변환 가능한지 체크하고 형변환하기.
		//			instanceof 연산자는 자신타입또는 자신의 자식타입까지 true 리턴해줌.
		
		
	}

}
