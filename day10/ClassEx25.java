package day10;

public class ClassEx25 {
	//오버 로딩
	static void add() {}
	static void add(int x) {System.out.println(x);}
	//static void add(int x) {}  안된다
	static void add(long x) {System.out.println(x);} //타입이 달라서 가능
	static void add(long a, int b) {System.out.println(a + " " + b);} //개수가 달라서 가능
	static void add(int a, long b) {System.out.println(a + " " + b);} //개수는 같지만 순서가 달라서 가능
	
	
	
	public static void main(String[] args) {

		add(); //1번째거 실행
		add(100); //2번째거 실행
		add(100L); //long 타입으로 할려면 L 3번째거 실행
		//add(10,10); //int int 가 없어서 안된다.
		add(10L, 10); //4번째거 실행
		
		
		
	}

}
