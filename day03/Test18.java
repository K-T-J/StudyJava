package day03;

public class Test18 {

	public static void main(String[] args) {

		// 비교 연산자 : >  >=  <  <=  == !=   :  true / false 의 결과가 나옴
		int a = 10;
		int b = 0;
		
		System.out.println(a<b);    // false 결과값이 나옴
	
		//논리 연산자	: && ||    : 비교 연산식을 여러개 연결할때 사용
		//&& : and	: 둘중에 하나라도 거짓이면 거짓, 모두 참이여야 참 
		//|| : or	: 둘중에 하나라도 참이면 참, 모두 거짓이여야 거짓
		boolean pp = a >b && b == 0;
		System.out.println(pp);		//값 : true
		
		pp = a>b || b > 0;
		System.out.println(pp);		//값 : true
		
		// ! : not : 부정문 : 결과를 반대로 바꿔  true -> false , false -> true
		int c = 10;
		int d = 30;
		boolean res = c < d;
		
		System.out.println(!res);  // 값 false<--보여주려는 값 앞에 ! 붙이면 결과반대
		res = c > d && d >= 30;
		System.out.println(!res);   //값 true 
		
		
		// 삼항연산자 : 조건식(비교식) ? 참일때값 : 거짓일때값;
		int e = 10;
		int f = 5;
		
		String result = e < f ? "크다" : "작다";  // <-- 결과가 문자라 String
						//e < f ? "1" : "2"; <-- 일때 int
		System.out.println(result);
		
		char result2 = e > f ? '0' : 'x';
		System.out.println(result2);
		
		int result3 = e < f ? 1 : 0;
		System.out.println(result3);
		
		int result4 = e < f ? e : f;  // 삼항연산자로 큰수 찾기
		System.out.println(result4);
	
		
		
	}

}
