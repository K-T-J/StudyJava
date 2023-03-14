package day02;

public class Test08 {

	public static void main(String[] args) {

		// 작은 -> 큰
//		char c = 'A';
//		int i = c; // 아스키 코드 값이 int 변수에 담김.
//		System.out.println(i);//A에 아스키 코드인 65출력
		
//		//다운캐스팅 큰->작은
//		int a = 65;
//		char c = (char)a;
//		System.out.println(c); //A출력
		
//		int i = 5;
//		double d = (double)i;
//		System.out.println(d);
		
//		double dd = 5.7;
//		int ii = (int)dd;
//		System.out.println(ii);
		
//		char ch = 'a';
//		double ddd = ch;
//		System.out.println(ddd);
		
		//1~100까지 더하기
//		int tot = 0;
//		for(int i=1; i<=100; i++) {
//			tot += i;
//			System.out.println(tot);
//		}
//		
//		//구구단 만들기
//		for(int i = 1; i<=9; i++) {
//			System.out.println("<" + i + "단>");
//			for(int j= 1; j<=9; j++) {
//				System.out.println( i +"*" + j + "=" + i*j);
//			}
//		}
		
		
		//구구단 3단에서 4의 배수 제외하고 출력
//		for(int i = 1; i<=9; i++) {
//			if((3*i)%4 != 0) {
//				System.out.println("3 * "+ i + " =" + 3*i);
//			}
//		}
		
		//로또 번호 추출하기
		int[] ball = new int[45];
		for(int i = 0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		int tmp = 0;
		int lotto = 0;
		for(int i = 0; i< 777; i++) {
			lotto = (int)(Math.random() * 45);
			tmp = ball[0];
			ball[0] = ball[lotto];
			ball[lotto] = tmp;
		}
		for(int i = 0; i < 6; i++) {
			System.out.println(ball[i]);
		}
		System.out.println("로또번호");
		
		
		
		
		
		
		
		

	}

}
