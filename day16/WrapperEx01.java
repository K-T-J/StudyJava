package day16;

public class WrapperEx01 {
	public static void main(String[] args) {

		Integer i = new Integer(10);
		Character c = new Character('c');
		Double d = new Double(3.14);
		Boolean b = new Boolean(true);
		
		//Character를 제외한 나머지 wrapper클래스의 경우,
		//문자열을 생성자 매개변수로 던져서 객체 생성이 가능.
		Integer ii = new Integer("100");
		Double dd = new Double("3.14");
		Boolean bb = new Boolean(true);
		
		Float f = new Float((double)3.14);
		
		
		
		
		
		
		
		
	}

}
