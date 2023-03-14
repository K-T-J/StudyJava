package day16;

public class WrapperEx03 {

	public static void main(String[] args) {
		/*
		// 문자열 -> 기본타입으로 변환
		
		int i = Integer.parseInt("123");
		System.out.println(i);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		double d = Double.parseDouble("3.1415");
		System.out.println(d);
		*/
		
		
		
		
		
		
		
		// 기본타입 -> 문자열
		
		String s1 = Integer.toString(123);
		System.out.println(s1); //Double, Float, Boolean, Byt....
		
		String s2 = Integer.toBinaryString(123);
		System.out.println(s2);
		
		
		String s11 = 123 +"";// 이렇게 하는게 더 쉽다.
		String s12 = true +"";// 이렇게 하는게 더 쉽다.
		
		
		
		//타입 알아보기
		int x = 100;
		Object obj = x;	//Object에다가도 담을수 있다.
		System.out.println(obj.getClass());
		
		
		
		Integer i = new Integer(100);
		Integer ii = new Integer(100);
		
		System.out.println("i == i: " + (i == ii));
		System.out.println("i equals i: " + (i.equals(x)));
		
		
		
		
		
		
		
		
		
	}

}
