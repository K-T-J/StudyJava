package day16;

public class StringEx01 {
	
	
	static String s;		//자동 초기화 null
	static String s2= "";	// ""
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		for(int i =1; i <10; i++) {
			s += i;
			s2 += i;
		}
		
		System.out.println(s);
		System.out.println(s2);
		
		
		
		/*
		//lastIndexOf()
		String FullName = "Hello.test.java";
		
		
		int idx = FullName.lastIndexOf(".");//문자열에서 . 을 뒤에서부터 찾는다.
											//IndexOf . 을 앞에서부터 찾는다.
		
		String FileName = FullName.substring(0,idx); 	//Hello
		String ext = FullName.substring(idx);		//.java
		
		System.out.println("파일명 : " + FileName);
		System.out.println("확장자 : " + ext);

		
		

		//char[]
		char[] c = {'a','b','c'};
		String s = new String(c); // 
		System.out.println(s);
		
		
		
		//valueOf() 숫자를 문자열로
		int value = 100;
		String strValue = String.valueOf(value);
		System.out.println(strValue);
		
		String strValue2 = value + ""; //이게더 편하다.
		
		
		

		//문자열 연결
		System.out.println("abcd" + 1 + true + 2.13e-2 + 'E' + "fgh");
		//										2.13 e -2<--소숫점을 앞으로 2칸간다.
		//								ex) 0.000123 -> 1.23e-4
		
		//객체와 연결
		System.out.println(new StringEx01() + "입니다");
		
		//concat()
		System.out.println("I Like ".concat("java"));
		
		
		
		//trim()
		String a = "             abcd           edf      ";
		String b = "             xyz\t";
		
		System.out.println(b);
		
		
		String c = b.trim();
		System.out.println(c);

		
		//charAt()
		String a = "class";
		char c = a.charAt(2); //모르겠으면 마우스 올려서 타입을 보고 변수만들고 출력해본다.
		System.out.println(c);
	
		
		//count()
		String a = "classaaaaaaaawddddddss";
		int count = 0;
		for(int i =0; i < a.length(); i++) {
			if(a.charAt(i) == 's') count++;
		}
		System.out.println(count);

		
		
		
		//replace()
		String str = "Apple Trre";
		str = str.replace("Apple", "Lemon");
		System.out.println(str);
		
		//substring()위에것
		String a = str.substring(4);
		System.out.println(a);
		
		
		//substring()아래것
		String b = str.substring(3, 7);
		System.out.println(b);
		
		
		//toLowerCase()
		String c = str.toLowerCase();	//전부 소문자
		System.out.println(c);
		
		//split()
		String[]ss = str.split("e");
		for(String s : ss)System.out.println(s);
		System.out.println(ss.length);
		
*/
		

		
		
		
		/*
		String java = "Java";
		String cpp = "C++";

		int a = cpp.compareTo(java);

		if(a == 0)System.out.println("same");
		else if(a<0) System.out.println(cpp + "->" + java);
		else System.out.println(java + "-->" + cpp);
		*/
	}
}
