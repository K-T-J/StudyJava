package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashEx02 {
	public static void main(String[] args) {

		// 영한 사전 만들기 : HashMap을 이용하여 10개의 단어를 영어, 한글을 쌍으로 저장.
		// 영어로 한글을 검색하는 프로그램을 만들어보세요.
		// 단, exit가 입력되면 프로그램 종료.
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("pen", "펜");
		map.put("book", "책");
		map.put("eye", "눈");
		map.put("computer", "컴퓨터");
		map.put("java", "자바");
		map.put("phone", "폰");
		map.put("kakako", "카카오");
		map.put("black", "검정");
		map.put("white", "흰색");
		map.put("pink", "분홍");
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> str = map.keySet();
		Iterator<String> iter = str.iterator();
		
		while(true) {
			System.out.println("단어 입력 >>");
			String name = sc.nextLine();
			if(name.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			String kor = map.get(name);
			if(kor == null) {System.out.println("name" + "는 없는 단어 입니다");
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
}
}