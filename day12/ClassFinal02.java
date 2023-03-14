package day12;

class Calc{
	public static int sum(int a, int b) {return a+b;}
	public static int mul(int a, int b) {return a*b;}
	public static int abs(int a) {return 1>0 ? a: -a;};
}





public class ClassFinal02 {

	public static void main(String[] args) {

		System.out.println(Calc.sum(10, 10));
		System.out.println(Calc.mul(10, 200));
		System.out.println(Calc.abs(-100));
		
	}

}
