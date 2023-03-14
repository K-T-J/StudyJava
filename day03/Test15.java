package day03;

public class Test15 {

	public static void main(String[] args) {

		// 증감 연산자	: ++, -- 1이 증가or 1이 감소    변수값이 변함 
		// 전위형		: ++a 앞에 붙는것 나먼저
		// 후위형		: a++ 가장 나중에, 다른거 먼저
	
		int aa = 10;
		System.out.println("10출력 : " + aa);	
		++aa;
		System.out.println("11출력 : " + aa);	
		aa++;
		System.out.println("12출력 : " + aa);	
		//단독으로 할때는 상관없다
		--aa;
		System.out.println("11출력 : " + aa);
	
		System.out.println("------------");
		
		int bb = 10;
		System.out.println("11출력 : " + ++bb); // 증가하고 출력
		System.out.println("11출력 : " + bb++); // 출력하고 증가
		System.out.println("12출력 : " + bb);
	
		System.out.println("------------");
		//문제 : 출력결과를 미리 주석으로 적어보고 실행해서 맞는지 확인하기.
		int i = 5, j = 5;
		System.out.println(i++);					//5			6
		System.out.println(++j);					//6			6
		System.out.println("i=" + i + ",j=" + j);	//6 6
		
		System.out.println("------------");
		int k = 10;
		System.out.println(k++);					//10	11
		System.out.println(++k);					//12
		++k;										//		13
		System.out.println(++k);					//14
		System.out.println(k++);					//14	15
		System.out.println(k);						//15
		
		System.out.println("------------");
		int a = 10;
		int b = 10;
		int r = ++a + ++b;
		System.out.println(r);					//11 + 11 = 22
		r = ++a + b++;							
		System.out.println(r);					//12 + 11(1) = 23
		r = ++a + a;							
		System.out.println(r);					//13 + 13 = 26
		r = ++a + a++;							
		System.out.println(r);					//14 + 14(1)= 28
		r = ++a + ++a;							
		System.out.println(r);					//16 + 17 = 33
		
		
		
		
		
		
		
		
		
		
	}

}
