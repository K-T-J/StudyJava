package day12;

import java.util.Scanner;

/*
하루할일을 표현하는 클래스 Day는 다음과 같다. 
한달의 할일을 표현하는 MonthSchedule 클래스를 작성하세요.
MonthSchedule 클래스에는 Day 객체 배열과 적절한 변수,메서드를 작성하고
실행 예시처럼 입력, 보기, 끝내기 등의 3개의 기능을 작성하라. 
 -> 생성자, input(), view(), finish(), run() 메소드 만들기. 
 */
 
 class MonthSchedule{
	 private int nDays;// 한달의 일수
	 private Day[] days; //Day 객체배열
	 Scanner sc = new Scanner(System.in);
	 
	 
	 
	 
	 MonthSchedule(int nDays){
		 this.nDays = nDays;
		 days = new Day[nDays]; //배열 공간 만들기(Day객체생성해서 저장가능해짐)
		 for(int i= 0; i<days.length; i++) {
			 days[i] = new Day();
		 }
	 }
	 //입력 메서드
	 void input() {
		 System.out.println("날짜(1~31)?");
		 int d = Integer.parseInt(sc.nextLine());
		 //할일? 자바공부
		 System.out.println("할일?");
		 String work = sc.nextLine();
		 //저장
		 days[d-1].set(work);
	 }
	 
	 void view() {
		 //날짜(1 ~ 31)? 1
		 System.out.println("날짜(1~" + nDays + ")? ");
		 int day = Integer.parseInt(sc.nextLine());
		 //1일의 할 일은 자바 공부입니다.
		 System.out.println(day + "일의 할일은");
		 days[day-1].show();
	 }
	 
	 void finish() {
		 sc.close();
		 System.out.println("프로그램 종료!");
	 }
	 
	 
	 void run() {
		 
		 System.out.println("이번달 스케쥴 관리 프로그램.");
		 
		 
		 while(true) {
			 System.out.println("할일(입력 : 1, 보기 :2, 끝내고 :3)>>>");
			 int menu = Integer.parseInt(sc.nextLine());
			 switch(menu) {
			 case 1:input(); break; //입력기능
			 case 2 : view(); break; //보기기능
			 case 3: finish(); return; //끝내기
			default :  System.out.println("잘못입력 하셨습니다. 다시 눌러주세요.");
			 }//switch
		 }//while
	 }//run
 }//MonthSchedule class
 
 
 
 
 
 
 
 
 
 
 
 /*
#실행예시#
이번달 스케쥴 관리 프로그램. 
할일(입력:1, 보기:2, 끝내기:3) >> 1
날짜(1~31)? 1
할일? 자바공부

할일(입력:1, 보기:2, 끝내기:3) >> 2
날짜(1~31)? 1
1일의 할 일은 자바공부입니다.

할일(입력:1, 보기:2, 끝내기:3) >> 3
프로그램 종료.
*/
class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}
public class ClassTest06 {
	public static void main(String[] args) {
		
		MonthSchedule may = new MonthSchedule(31); // 5월달의 할 일
		may.run();
		
	}
}
