package day14;

import java.util.Scanner;

//인터페이스
/*
	Stack 인터페이스를 상속받아 문자열을 저장하는 StringStack 클래스를 구현하세요. 
	아래와 같은 실행결과가 나오도록 main()을 참고하여 작성하세요. 
	실행결과:
		총 스택 저장 공간의 크기 입력 >>  3 (사용자가 입력)
		문자열 입력 >> hello
		문자열 입력 >> sunny
		문자열 입력 >> smile
		문자열 입력 >> happy
		스택이 꽉 차서 푸시 불가!
		문자열 입력 >> 그만
		스택에 저장된 모든 문자열 팝 : smile sunny hello 위에서부터 꺼낸다.
*/
interface Stack {
	int length();					// 현재 스택에 저장된 개수 리턴		추상메서드
	int capacity();					// 스택의 전체 저장 가능한 개수 리턴
	String pop();					// 스택의 톱(top)에 저장된 문자열 리턴하고 저장소에서 문자열 삭제 가장마지막
	boolean push(String val);		// 스택의 톱(top)에 저장소에 문자열 넣고 실행 결과 boolean 타입으로 리턴
}
class StringStack implements Stack{
	private String[] data; // 입력받은 문자열 저장공간, 스택
	
	
	
	

	@Override
	public int length() {//현재 저장된 데이터 개수
		int count = 0;
		for(int i =0; i<data.length; i++) {
			if(data[i] != null)count++;
		}
		return count;
	}

	@Override
	public int capacity() {//총 저장가능한 공간크기 == 배열의 길이
		return data.length;
	}

	@Override
	public String pop() {// 마자막에 저장된 데이터 꺼내서 리턴
		// 현재 상태에서 마지막 저장된 아이만 꺼내서 리턴
		// 꺼낸다음에는 지우기(null대입)
		int idx = length()-1;
		String pop = data[idx];//해당 데이터 꺼내거 변수에 담아두기)밑에서 리턴해주려고
		data[idx] = null; // 해당 데이터자리는 null 덮어쓰기 ->지우기효과
		return pop;
		
	}

	@Override
	public boolean push(String val) {//현재 저장된거 뒤에다 저장
		//저장하고 결과 리턴
		boolean result = true;
		int len = length();		//현재저장된개수
		int size = capacity();	//총저장공간
		if(size - len > 0)data[len] = val; // 남은 공간이 있으면, 저장하고 true 리턴
		else result = false;	// 남은공간이 없으면, 저장안고 false리턴
		return false;
	}
	
	void run() {
		Scanner sc= new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력 >>");
		int n =sc.nextInt();
		data = new String[n];
		while(true) {
			System.out.println("문자열 입력 >>");
			String input = sc.next();
			if(input.equals("그만")){
				//스택에 저장된 모든 문자열 팝 :  smile sunny hello 출력!!!
				String str = "스택에 저장된 모든 문자열 팝 :";
				for(int i = length()-1; i >= 0; i--) {
					str += (pop() + " ");
				}
				System.out.println(str);
				break;
			}else {
				//남은 공간이 있는지 확인하고 저장
				boolean result = push(input);
				if(!result) {
					System.out.println("스택이 꽝 차서 푸시 불가!");
				}
			}
		}
		
		
		
		
		
		
		
	}
	
}




public class ClassTest16 {
	public static void main(String[] args) {
		StringStack s = new StringStack();
		s.run();	// 프로그램 구동 시작
	}
}
