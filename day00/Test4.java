package day00;

class Student{
	String name = "";
	int age = 0;
}

public class Test4 {
	public static void main(String[] args) {
	
		Student s = new Student();
		s.name = "짱구";
		s.age = 5;
		System.out.println(s.name); //짱구 출력
		System.out.println(s.age);	//0 출력
	}

}
