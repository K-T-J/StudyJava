package day05;

public class Test32 {

	public static void main(String[] args) {
		//반복문 사용시 주의점
		
		//int i는 for문 안에서 만들어졌으니, for안에서만 유효함.
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			//for문안에 변수는 밖에서 못쓴다 
		}
		
		for(int i = 0; i<10; i++) { 
			System.out.println(i);    //i변수를 또 쓸수있다
		}
		
		int b = 0;	//for문 밖에다 b변수를 쓸수있다.
		for(b = 0; b<5; b++) {
			System.out.println(b);
		}
		System.out.println("b : " +b);
		
		
		/*
		//초기식  생략
		int b = 0;	//for문 밖에다 b변수를 쓸수있다.
		for( ; b<5; b++) {	//초기식을 위에 썻을경우 생략 가능하나 ; 를써야한다.
			System.out.println(b);
		}
		System.out.println("b : " + b);
		
		*/
		
		
//		for(int c = 0; c<3; c--) {		//무한반복
//			
//			System.out.println("hela");
//			
//		}
		
		//for문으로 무한반복
		for(;;) {
			
		}	// 쓸수있지만 보기편하기 위해선 while문을 쓴다.
		/*
		while(true) {
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
