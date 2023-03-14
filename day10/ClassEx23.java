package day10;

import java.util.Scanner;

/*
 	Tv 클래스 기능 구현
 	1. 채널 = 배열[10] 생성후, 랜덤값 10개 생성해 낮은 값부터 대입
 	2. 채널(up,down) = 위 랜덤뽑힌 채널 번호로 이동.
 	3. 채널값을 입력받아 변경 (입력값이 채널 배열에 없는 번호면 이동 못함)
 	4. 볼륨은 0~10 까지 증감
 	5. 볼륨 음소거 기능 
 	6. Tv정보출력 - 메서드 호출되면 TV상태 (전원, 채널, 볼륨 값 출력)
 	7. 전원이 꺼져있는 경우 모든 기능 동작 안함
 */
class Tv{//Tv 클래스 기능 구현
	boolean power = false;	//전원 상태값 저장할 변수
	int [] channel = new int [10];	//배열10개 생성 채널들 저장할 저장소
	int chIdx = 0; // 채널 배열 가르킬 인덱스
	int vol = 0; //볼륨상태값 저장할 변수
	
	// 전원 켜기/끄기 메서드
	void powerOnOff() {
		power = !power;
	}
	// 채널 세팅 메서드
	void setChannel() {
		if(power) {
		//랜덤 10개 체우기 (중복없어야함)
		for(int i =0; i < channel.length; i++) { 
			channel[i] = (int)(Math.random() * 100) + 1; //1 ~ 100 사이 랜덤
			//중복 체크
			for(int j =0; j<i; j++) {
				if(channel[i]== channel[j]) {
					i--;
					break; // 중복체크(내부) for문 종료
				}
			}
		}
		// 정렬 (오름차순) 선택정렬 (가장낮은거찾아서 앞으로이동)
		int min =0; //낮은값의 인덱스번호를 가지고 있을 변수 초기값은 0번 인덱스
		for(int i =0; i < channel.length-1; i++) {
			min = i;
			for(int j = i+1; j < channel.length; j++) {
				if(channel[min] > channel[j]) {
					min = j;
				}
			}
			int tmp = channel[i];
			channel[i] = channel[min];
			channel[min] = tmp;
			}
		}
	}
	void printch() { // 채널 출력하는 메서드 정의
		if(power) {
		System.out.print("ch >>");
		for(int c : channel) System.out.print(c + " ");
		System.out.println();
		}
	}
	void setTv() { // 티비 처음 세팅하는 메서드 정의
		if(power) {
		System.out.println("전원 : " + (power ? "ON" : "OFF"));
		setChannel(); //채널 세팅 메서드 호출 
		printch();//채널 출력 메서드 호출
		
		}
	}
	
	//2번문제 답 채널up/Down
	void chUp() {
		if(power) {
		chIdx++;
		if(chIdx == 10) chIdx =0;	//명령문 1개라 {}삭제
		System.out.println("채널 up : " + channel[chIdx]);
		}
	}
	void chDown() {
		if(power) {
		chIdx--;
		if(chIdx == -1) chIdx = 9;
		System.out.println("채널 down : " + channel[chIdx]);
		}
	}
	//3번 문제 답 채널 번호입력해서 변경하기
	void chChange(int c) {
		for(int i =0; i < channel.length; i++) {
			if(channel[i]==c) {
				chIdx = i; //해당 채널로 변경
				System.out.println("채널변경 : " + channel[chIdx]);
				break;
			}
		}
	}
	//4번문제 답 볼륨 조정
	void volup() {
		if(power) {
		if(vol < 10) vol++;
		System.out.println("볼륨 up : " + vol);
		}
	}
	void voldown() {
		if(power) {
		if(vol >0) vol--;
		System.out.println("볼륨 down : " + vol);
		}
	}
	
	//5번문제 답 음소거
	void mute() {
		vol = 0;
	}
	//6번문제 답 Tv정보 출력
	void tvInfo() {
		System.out.println("**** TV 정보 ****");
		System.out.println("전원 : " + (power ? "ON" : "OFF"));
		printch();
		System.out.println("채널 : " + channel[chIdx] + "  볼륨 : " + vol);
		System.out.println();
	}
	
	//7번문제 답
	
	
}

public class ClassEx23 {

	public static void main(String[] args) {

		Tv tv = new Tv(); // tv세팅
		tv.powerOnOff(); // 전원세팅
		tv.setTv(); // 채널세팅
		tv.chUp();
		tv.chChange(20);
		tv.volup();
		tv.volup();
		tv.volup();
		tv.volup();
		tv.tvInfo();
	}

}
