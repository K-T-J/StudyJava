package day12;
//상속을 이용하여 다음 클래스들을 간결한 구조로 재작성하세요
class pen{
	private int amount;
	public int getAmount(){return amount;}
	public void setAmount(int amount) {this.amount = amount;}
}
class SharpPencil extends pen{ //(amount), (getAmount), (setAmount)
	private int width;
	
}
class BallPen extends SharpPencil{ //(amount), (getAmount), (setAmount), (width)
	private String color;
	public String getColor() {return color;}
	public void setColor(String color) {this.color=color;}
} 
class FountainPen extends BallPen{
	//(p)(amount), (getAmount), (setAmount)
	//(p)color(),getColor(),setColor()
public void refill(int n) {setAmount(n);}

}













public class InheritEx02 {

	public static void main(String[] args) {

		Object obj; //import 안해줘도 된다 lang 패키지에서 찾기(가장기본적인 패키지)

		//Scanner sc;
		
		
		
	}

}
