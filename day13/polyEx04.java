package day13;
// 매개변수의 다형성
class Product{
	int price; // 제품의 가격
	int point; // 제품구매시 제공하는 보너스 점수
	Product(int price){ //생성자 *3번
		this.price = price; //초기화
		point = (int)(price/10.0); //포인트 제품 가격의 10%
	}
}
class Tv extends Product{ //price, point 자식클래스1
	Tv(){ //기본생성자	*2번
		super(100);// 부모클래스 생성자 호출 
	}
	@Override //Object
		public String toString() { //String에 주소값을 Tv로 리턴한다.
			return "Tv";
		}
}
class Computer extends Product{//price, point 자식클래스2
	Computer(){//기본생성자
		super(200);//부모클래스 생성자 호출
	}
	@Override // Object
		public String toString() {//String에 주소값을 Computer로 리턴한다.
			return "Computer";
		}
}
class Buyer{
	int money = 1000;	//고객의 돈
	int point = 0; 		//고객이 갖고 있는 포인트 점수 저장
	
	void buy(Product p) {//<--부모로 받으면 다받을수있다. Product 타입
		if(money < p.price) {//만약 고객돈이 제품가격보다 적을때 실행
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return; //메서드 강제 종료
		}
		
		money -= p.price; //100 10	900만원 10포인트  고객돈에 제품가격을 -한다.
		point += p.point; //200 20	700만원 30포인트  고객포인트에 제공 포인트를 +한다.
		System.out.println(p + "를 구입하셨습니다.");//p.toString() + 를 구입하셨습니다.
	}
}



public class polyEx04 {
	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		System.out.println(tv);//toString() 호출 tv의 주소값 *1번
		
				
		b.buy(tv);
		b.buy(com);
		
		System.out.println("현재 남은 돈은" + b.money + "만원 입니다.");
		System.out.println("현재 보너스 포인트는" + b.point + "점 입니다.");

	}

}
