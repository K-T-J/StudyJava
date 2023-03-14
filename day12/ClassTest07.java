package day12;

import java.util.Scanner;

/*
콘서트 예약 프로그램. 
- 공연은 하루에 한번
- 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다. 
- 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다. 
- 예약은 한자리만 가능하고, 좌석타입, 예약자이름, 좌석번호를 입력받아 예약한다.
- 조회는 모든 좌석을 출력한다.
- 취소는 예약자의 이름을 입력받아 취소한다.
- 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소등에 대해서
  오류 메세지를 출력하고 사용자가 다시 시도하도록 한다.
# 실행예시 #
자바콘서트홀 예약시스템입니다.
예약:1, 조회:2, 취소:3, 끝내기:4 >> 1
좌석구분 S(1), A(2), B(3) >> 1
S >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ 
이름 >> 피카츄
번호 >> 1
<<예약완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 1
좌석구분 S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
이름 >> 꼬북이
번호 >> 5
<<예약완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 2
S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<조회완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 3
좌석구분 S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
이름 >> 꼬북이
<<취소완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 2
S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<조회완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 4
<<프로그램 종료>>
*/
class Seat{//좌석 
	private String name= "___";
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
}
class Booking{//예약
	Scanner sc = new Scanner(System.in); 
	private Seat[] seatS = new Seat[10];//배열 칸만 만듬.내부에 객체생성x
	private Seat[] seatA = new Seat[10];
	private Seat[] seatB = new Seat[10];
	
	
	public Booking() {
		for(int i= 0; i < seatS.length; i++) {
			seatS[i] = new Seat();
		}
		for(int i= 0; i < seatA.length; i++) {
			seatA[i] = new Seat();
		}
		for(int i= 0; i < seatB.length; i++) {
			seatB[i] = new Seat();
		}
	}
	void showSeat(int sel) {
		if(sel == 1) {
			for (int i =0; i  < seatS.length; i++) {
				System.out.print(seatS[i].getName() + " ");
				}
		}else if(sel == 2) {
				for (int i =0; i  < seatS.length; i++) {
					System.out.print(seatA[i].getName() + " ");
					}
		}else if(sel == 3) {
				for (int i =0; i  < seatS.length; i++) {
					System.out.print(seatB[i].getName() + " ");
						}
					}
				}
	
	void book() {
		System.out.println("좌석구분 S(1), A(2), B(3) >>");
		int sel = Integer.parseInt(sc.nextLine());
		showSeat(sel);//해당 죄석 한줄 출력
		System.out.println("이름>> ");
		String name = sc.nextLine();
		System.out.println("번호>> ");
		int seatNum = Integer.parseInt(sc.nextLine());
		//해당 좌석에 이름 저장
		if(sel == 1) seatS[seatNum-1].setName(name);
		if(sel == 2) seatS[seatNum-1].setName(name);
		if(sel == 3) seatS[seatNum-1].setName(name);
		System.out.println("<< 예약 완료 ");
		
	}
	void showAll() {
		showSeat(1);
		showSeat(2);
		showSeat(3);
		System.out.println("<< 조회 완료 >>\n");
	}
		
	
	void cancel() {
		System.out.println("좌석구분 S(1), A(2), B(3) >>");
		int sel = Integer.parseInt(sc.nextLine());
		showSeat(sel);
		System.out.println("이름>>");
		String name = sc.nextLine();
		if(sel == 1) {
			for(int i = 0; i < seatS.length; i++) {
				if(seatS[i].getName().equals(name)) seatS[i].setName("___");
			}
		}else if(sel == 2) {
			for(int i = 0; i < seatS.length; i++) {
				if(seatS[i].getName().equals(name)) seatS[i].setName("___");
			}
		}else if(sel == 3) {
			for(int i = 0; i < seatS.length; i++) {
				if(seatS[i].getName().equals(name)) seatS[i].setName("___");
			}
		}
	}
		
	
	
	
	
	void run() {
		System.out.println("자바콘서트홀 예약시스템 입니다.");
		while(true) {
			System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			int sel = Integer.parseInt(sc.nextLine());
			if(sel == 1) { book();}
			else if(sel ==2) {showAll();}
			else if(sel ==3) {cancel();}
			else if(sel ==4) {
				System.out.println("예약 프로그램 종료");
				break;
			}else
				System.out.println("메뉴번호 오류! 다시 선택해주세요");
		}//while true
	}//run
}//Booking



public class ClassTest07 {
	public static void main(String[] args) {

		Booking book = new Booking();
		book.run();
	}
}
