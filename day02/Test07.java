package day02;

public class Test07 {

	public static void main(String[] args) {

		//문제. 	정수형 변수 a.b. 를 만들고
		//		각각 10. 20을 대입하고,
		//		값을 서로 교환해서 출력해보세요.
		
		// 1) 정수형 변수 a.b 만들기
		int a,b;
		
		// 2) 각각 10, 20 대입
		a = 10;
		b = 20;
		
		// 3) 출력
		System.out.println(a +" "+ b); //10 20이 출력
		
		// 4) ☆a와 b변수에 들어있는 값을 서로 교환 하기 ☆
		int tmp = a;	//임시 변수에 tmp에 a의 값을 잠시 저장해놓고
		a = b;			//b가 들고있는값을 a에 덮에쓰기하고
		b = tmp;		//tmp에 잠시 저장해둔 a가 갖고있던 값을 b에 덮어쓰기함   <-정렬할때 유용하게 쓰임
		
		// 5) 출력
		System.out.println(a + " " +b); // 20 10이 출력
		

		
	}

}
