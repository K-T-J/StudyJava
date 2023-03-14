package day16;


public class ApiEx07 {
	public static void main(String[] args) {

		
		
		String a = "hello";
		String b = "hello";
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));//a,b는 주소가 같다
		System.out.println(a);//to String이 오버라이딩된것이다.
		System.out.println(b);
		System.out.println();
		
		String c = new String("hello");
		String d = new String("hello");
		System.out.println(System.identityHashCode(c));//a,b와 c,d 주소가 다르다
		System.out.println(System.identityHashCode(d));
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String s; //선언만 했을때 에러가 안나면 lㅁng 패키지에 있구나
		//Scanner sc; //선언했을때 에러가 난다.
		
		
	}
}
