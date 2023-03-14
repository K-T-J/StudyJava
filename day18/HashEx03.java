package day18;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashEx03 {
	private HashMap<String, Integer>map;
	private Scanner sc;
	
	public HashEx03() {
		map = new HashMap<String, Integer>();
		sc = new Scanner(System.in);
	}
	
	void printAll() {//1
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
			System.out.println(name + ":" + score);
		}
		System.out.println("========================");
	}
	
	   void insertData() { // 2
		      System.out.print("이름 >> ");
		      String name = sc.next();
		      Set<String> keys = map.keySet(); 
		      if(keys.contains(name)) {
		         System.out.println("이미 존재하는 학생입니다. 이름을 다시 확인해주세요.");
		         insertData();
		         return;
		      }else {
		         System.out.print("점수 >> ");
		         int score = sc.nextInt();
		         map.put(name, score); 
		         System.out.println("저장완료!");
		      }
		      System.out.println("============================");
		   }

	   
	
	
	void modifyData() {
	      System.out.print("수정할 학생 이름 >> ");
	      String name = sc.next();
	      Set<String> keys = map.keySet(); 
	      if(keys.contains(name)) { // 수정할 학생의 이름이 존재한다. 
	         System.out.print("점수>> ");
	         int score = sc.nextInt(); 
	         map.put(name, score);
	         System.out.println("수정 완료!");
	      }else {
	         System.out.println("존재하지 않는 학생입니다.");
	      }
	      System.out.println("============================");      
	   }

	
	 void deleteData() {
	      System.out.print("삭제할 학생 이름 >> ");
	      String name = sc.next();
	      Set<String> keys = map.keySet(); 
	      if(keys.contains(name)) {
	         map.remove(name);
	         System.out.println("삭제 완료!");
	      }else {
	         System.out.println("존재하지 않는 학생입니다.");
	      }
	      System.out.println("============================");      
	   }

	
	 void showAvg() {
	      Collection<Integer> coll = map.values();
	      Iterator<Integer> it = coll.iterator();
	      int sum = 0; 
	      while(it.hasNext()) {
	         int val = it.next(); 
	         sum += val;
	      }
	      double avg = (double)sum / map.size();
	      System.out.println("평균 점수 : " + avg + "점");
	      System.out.println("============================");      
	   }

	
	public static void main(String[] args) {
		// HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 관리 프로그램을 작성하세요. 
		// 아래 프로그램 메뉴에서 각 번호로 서비스를 선택하고, 
		// 6번 종료를 입력받으면 프로그램 종료. 
		/*
			** 자바 성적 관리 프로그램 **
			1. 전체 조회
			2. 등록
			3. 수정
			4. 삭제
			5. 전체 평균
			6. 프로그램 종료 
		*/
		
		HashEx03 prg = new HashEx03();

	      while(true) {
	          System.out.println("** 자바 성적 관리 프로그램 **\n"+ "1. 전체 조회\n"
	                + "2. 등록\n" + "3. 수정\n" + "4. 삭제\n" + "5. 전체 평균\n"
	                + "6. 프로그램 종료");
	          System.out.print("원하는 서비스 번호 입력 >> ");
	          int sel = prg.sc.nextInt();
	          if(sel == 1)  prg.printAll(); 
	          else if(sel == 2)  prg.insertData(); 
	          else if(sel == 3)  prg.modifyData(); 
	          else if(sel == 4)  prg.deleteData(); 
	          else if(sel == 5)  prg.showAvg(); 
	          else if(sel == 6) { System.out.println("프로그램 종료!"); break; }
	          else { System.out.println("잘못된 서비스 번호 입력.. 다시시도해주세요."); }
	       }

		
		
		
	}
}
