package day16;

public class WrapperEx02 {

	public static void main(String[] args) {

		//wrapper -> 기본형으로
		
		
		Integer i = new Integer(10);
		int ii = i.intValue();
		System.out.println(ii);
		
		
		Character c = new Character('c');
		char cc = c.charValue();
		System.out.println(cc);
		
		Double d = new Double(3.14);
		double dd = d.doubleValue();
	}

}
