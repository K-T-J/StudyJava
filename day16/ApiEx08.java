package day16;

public class ApiEx08 {
	public static void main(String[] args) {

		
		String s = new String("hello");
		System.out.println("s : " + System.identityHashCode(s));
		
		System.out.println( );
		
		String t = s;
		System.out.println("t : " + System.identityHashCode(t));
		
		System.out.println();
		
		t = s.concat("Java"); // 수정 hello -> helloJava
		System.out.println("s : " + System.identityHashCode(s));
		System.out.println("t : " + System.identityHashCode(t));
		
		System.out.println();
		
		s = s.concat("spring");
		System.out.println("s : " + System.identityHashCode(s));
		System.out.println("t : " + System.identityHashCode(t));
		System.out.println(s);
		System.out.println(t);
		
		
	}
}
