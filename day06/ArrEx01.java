package day06;

public class ArrEx01 {

	public static void main(String[] args) {

		//배열선언,
		// int a;
		int [] score;  //선언
		// a = 10;		// 값 저장 
		score = new int[5];  // int형 배열 방 5개 만들기. 공간만 만들고 값저장 x
		
		//int a = 10 처럼 할려면
		//배열 선언 + 생성
		int [] num = new int[3]; // 공간 만들고 값저장 x
		
		// 값 저장
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		//값 출력
		
		System.out.println(++num[0]);	// ++를 하면 11이 된다.
		System.out.println(num[1]);
		System.out.println(num[2]);
		//System.out.println(num[3]); // java.lang.ArrayIndexOutOfBounds : 배열방번호 에러
		System.out.println(num);	//주소 출력 되어 이상하게 나온다
		
		
		
	
		System.out.println("----------------------");
		//int a = num   //같은 int지만 앞은변수   num은 주소 출
		int a = num[0];
		System.out.println(a);
		
		System.out.println(num.length); // 방의 개수

			
		
		
		/*
		int num1 = 10;
		int num2 = 20;  //가능은하지만 불편하다.
		int num3 = 30;
		
		int [] v = new int[3];
		v[0] = 100;
		v[1] = 200;
		v[2] = 300;
		System.out.println(v[0]);
		
		*/
		
		
		
		
		
		
	}

}
