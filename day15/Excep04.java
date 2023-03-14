package day15;

public class Excep04 {
	public static void main(String[] args) {

		String [] strNumber = {"23","45","12.24","454"};
		int i = 0;//그래서 여기에 변수로 i 변수를 만든다
		try {
		for(i = 0; i< strNumber.length; i++) {
			//NumberFormatException
			
			int j = Integer.parseInt(strNumber[i]);
			System.out.println("정수로 변환된 값 : " + j);
		}
	}catch(NumberFormatException e) {
		System.out.println(strNumber[i] + "는 정수로 변환할 수 없습니다.");//for문 안에 잇던 i변수를 못쓴다.
	}
		
		
		
		
	}

}
