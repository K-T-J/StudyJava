package day00;

class Ex01{
	
	String str = "hello java";
	int year = 2020;

	void str1 () {
		System.out.println(str);
	}
	
	void year1(){
		System.out.println(year);
	}

}

public class Test03 {
	public static void main(String[] args) {
		
		Ex01 ex = new Ex01();
		ex.str1(); //hello java 출력
		ex.year1();//2020 출력
		
	}
}