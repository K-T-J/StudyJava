package day10;
/*
 	char[] 배열을 전달받아 출력하는 printCharArray() 메서드와
 	배열속의 ' ' 공백문자를 , ',' 쉽표로 대치하는 replaceSpace() 메서드를 작성해보자
 */

public class ClassEx22 {
	// static 으로 두개 메서드 작성
	
	// static : 클래스 만들어주는 키워드
	// void	: 리턴타입 없다. 돌려줄 값 없다. return키워드 안에 작성x
	// (char[]a) : 매개변수, 파라미터, 호출하는 시점에서 char[]을 인자로 줬으니
	// 받아주는 매개변수도 같은 char[]으로 만들고,
	// 이때 이름은 던져준 변수와 받는 변수가 같을 필요는 없다. 달라도 된다.
	// 매개변수,인자는 서로 개수와 데이터 타입과 순서가 일치해야된다.
	// 밑에서 char[] 한개 던졌으니 받아주는애도 한개만 일치하게 작성
	static void printCharArray(char[] a) {
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	static void replaceSpace(char[]b) {
		for(int i = 0; i < b.length; i++) {
			if(b[i] == ' ') {//배열에 ''이 있다면
				b[i] = ','; // ','로 바꿔라
			}
		}
	}
	public static void main(String[] args) { // 프로그램 시작 시점 !! start !!
		
		
			//char : 2byte 기본형 문자한개 저장 할수 있고, ''감싸기
			//char[] : char 를 여러개 저장할 수 있는 배열
			//초기화해서 데이터의 개수만큼 10개 방이 생기고 저장까지 완료
			//c : 배열이 실제 저장되어 있는 메모리 주소가 저장되어있다.
		char[] c = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 'b', 'o', 'y'};
		
				//메서드 호출, main도 클래스메서드,
				//printCharArray 클래스 메서드 (static) 붙은 메서드라서
				// 메모리 생성시점이 동일하므로 바로 이름만 불러 호출가능
				//메모리 언제 생성 ? -> 프로그램 시작할떄 Method area 영역에 로딩된다.
				//c를 인자로 던져서 호출 -> c는 주소를 가지고 있으니 주소를 전달함.
				//레퍼런스 공유 (주소공유, 다른이름의 뱅려 변수들이 같은 데이터를 참조한다.
				// i am a boy
				printCharArray(c); // I am a boy
				replaceSpace(c);
				printCharArray(c); // I, am,a,boy
		
	}

}
