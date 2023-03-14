package day02;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte b = 127;
		System.out.println(b);
		
		
		//오버플로우(용량이큼) byte는(-128~127) 뺑뺑이 돈다
		b = (byte)128; 
		System.out.println(b);
		
		
		//문자열 string (참조형) : 데이터는 반드시 /쌍따옴표로 작성
		String a = "안";
		System.out.println(a);
		
		char ch = '\u0041';//아스키코드
		System.out.println(ch);
		
		// int : 10진수 / 8진수 : 0으로 시작하는수/ 16진수 : 0x로 시작 
		//		2진수 : 0b로 시작
		int i = 15;
		System.out.println(i);
		int j = 015;
		System.out.println(j);
		int k = 0x15;
		System.out.println(k);
		int l = 0b0101;
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
