package day00;

class MobilePhone{
	String name;
	int x;
	int y;
	double weight;
	
	String number (String a) {
		System.out.println(a+"로 전화를 걸고 있습니다");
		return a;
		
	}
	void number1() {
		System.out.println("전화받기");
	}
	void message() {
		System.out.println("문자보내기");
	}
	void message1() {
		System.out.println("문자받기");
	}
	
}


public class Test2 {
	public static void main(String[] args) {

		MobilePhone mp = new MobilePhone();
		
		mp.name = "iphone";
		mp.x = 20;
		mp.y = 20;
		mp.weight = 5.0;
		System.out.println(mp.weight);
		
		String TT = mp.number("010-1111-2222");
		mp.message();
		mp.number1();
		mp.message1();
		
		
	}

}
