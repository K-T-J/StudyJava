package day00;

class MobilePhone1{
	double x;
	double y;
	double h;
	String color;
	String name;
}




public class Test5 {
	public static void main(String[] args) {

		MobilePhone1 mp = new MobilePhone1();
		
		mp.x = 7.5;
		mp.y = 10.5;
		mp.h = 3.5;
		mp.color = "pink";
		mp.name = "Iphone";
		
		System.out.println(mp.x + "cm");	//7.6cm 출력
		System.out.println(mp.y + "cm");	//10.5cm 출력
		System.out.println(mp.h + "cm");	//3.5cm 출력
		System.out.println(mp.color);		//pink 출력
		System.out.println(mp.name);		//Iphone 출력
		
		
		
	}

}
