package day11;
// 인스턴스 초기화 블럭
class Product{
	static int count = 0; //객체가 몇개 생성되었는지 개수 저장  *누적시키기 위해 static
	String serialNo;	//객체 고유 번호	*인스턴스로 String 문자열이라서
	

	{
	++count; System.out.println("count 증가");		//인스턴스 블럭
	serialNo = "p000" + count;
	}


}


public class ClassEx31 {

	public static void main(String[] args) {

		 
		Product p1 = new Product();
		Product p2 = new Product();
		//Product p3 = new Product();
		System.out.println("생상된 제품의 수는 : " + Product.count);
		System.out.println("----------");
		System.out.println("p1 : " + p1.serialNo);
		System.out.println("p2 : " + p2.serialNo);
		//System.out.println("p3 : " + p3.serialNo);
		
		
		
		
		
		
		
		
		
	}

}
