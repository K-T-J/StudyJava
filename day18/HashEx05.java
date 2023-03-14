package day18;

import java.util.HashMap;
import java.util.Scanner;

public class HashEx05 {
	public static void main(String[] args) {
		
		
		
		HashMap map = new HashMap();
		
		map.put("java", 1234);
		map.put("jsp", 1234);	//key는 중복이 안되므로 먼저 데이터 값 덮어 씌우기
		map.put("jsp", 15034);	
		map.put("spring", 9004);
		map.put("sql", 45032234);
		map.put(100, "test");
		
		System.out.println(map);
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("id 와 password를 입력해주세요.");
		System.out.println("id >>");
		String id = sc.nextLine().trim();// 사용자가 실수로 띄어쓰기 작성한것 없애주기 .trim()
		System.out.println("pw >> ");
		String pw = sc.nextLine().trim();
		System.out.println();
		
		
		if(!map.containsKey(id)) {
			System.out.println("id가 존재하지 않습니다.");
			continue;
		}else{	//id가 존재할때
			if(!((Integer)map.get(id)==Integer.parseInt(pw))) { // id와 pw불일치   형변환!!
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				continue;
			}else {
				System.out.println(id + "님! 로그인 성공! 환영합니다.");
				break;
			}
		}//외부 else
		
	}//while
		
		
		
		

	}

}
