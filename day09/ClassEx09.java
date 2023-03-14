package day09;
//Tv 클래스
//1. 변수 : 값저장 : 채널, 볼륨, 전원
//2. 메서드 : 기능 : 채널 조정, 채널입력, 볼륨 조정, 전원on/off


class Tv{
	//인스턴스 변수	: 티비의 상태값 들고있을 변수들
	int ch = 1,vol = 0;
	boolean power = false;
	
	// 기능 (메서드)
	void poweronoff() {
		// 전원 껐다 켜기
		power = !power; 
	}
	void volUp() {
		vol++;
	}
	void volDown() {
		vol--;
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
	void chChange(int c) { // c = 23을 받아줬다
		ch = c;
	}
	
}

public class ClassEx09 {
	public static void main(String[] args) {

		Tv tv = new Tv();
		System.out.println("tv 구매~");
		System.out.println("power : " + tv.power);	//false
		
		// 전원키기
		tv.poweronoff(); //호출
		System.out.println("power : " + tv.power);	//true
		
		// 전원끄자
		tv.poweronoff();
		System.out.println("power : " + tv.power);	//false
		
		//볼륨up
		System.out.println("vol : " + tv.vol);	//볼륨 0
		tv.volUp();
		System.out.println("vol : " + tv.vol);	//볼륨 1
		tv.volUp();
		tv.volUp();
		tv.volUp();	// 리모컨 버튼 눌렀다.
		tv.volUp();
		tv.volUp();
		tv.volUp();
		System.out.println("vol : "+ tv.vol);	//볼륨 7
	
		tv.volDown();
		System.out.println("vol : " + tv.vol); 	//볼륨 6
		
		tv.chUp();
		tv.chUp();
		tv.chUp();
		System.out.println("ch : " + tv.ch);	//채널 4
		tv.chDown();
		System.out.println("ch : " + tv.ch);	//채널 3
		
		
		tv.chChange(23); 	//채널을 23번으로 바꿀거야
		System.out.println("ch : " + tv.ch);
		
		
		
		
		
		return;	//void는 생략된것. 강제 종료 *위치 중요
		
		
	}

}
