package day16;

public class ApiEx04 {
	public static void main(String[] args) {

		String a = new String("Hello");
		String b = new String("Hello");
		System.out.println(a);
		System.out.println(b);
		
		
		if(a == b)System.out.println("a==b"); //다른 객체에 있어서 출력x
		if(a.equals(b))System.out.println("a Equals b");
		
		
		//
		String s1 = "abc"; //"" 리털럴 방식
		String s2 = "abc";
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}
		if(s1.equals(s2)) {
			System.out.println("s1 equal s2");
		}
		
		
		
	}
}
