package day03;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//대입연산자 : = : 대입을 해야 변수안의 값이 변경됨.
		int a = 10;
		System.out.println(a+10);			//20
		System.out.println(a);				//10
		
		
		
		System.out.println(a = a +10);		//20
		System.out.println(a);				//20
		*/
		//복합대입 연산자 : 산술 + 대입 
		// += -= *= /= %=
		int b = 10;
		b = b + 10;     //덮어쓰기
		b += 10;		//위식을 간단하게
		System.out.println(b);
		b -= 10;
		System.out.println(b);
		b *= 10;
		System.out.println(b);
		b /= 5;
		System.out.println(b);
		b %= 10;
		System.out.println(b);

		int c = 5;
		c = c + 1;
		c += 1;
		++c;	//어차피 1씩 늘어나니깐 ++를 쓴다.
		System.out.println(c);


		
		
		
		
		
	}

}
