package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashEx01 {
	public static void main(String[] args) {

		
		//# HashMap
		
		HashMap<String, String> h = new HashMap<String, String>();
		
		
		h.put("apple", "사과");
		h.put("strawberry", "딸기");
		h.put("watermelon", "수박");
		h.put("peach", "복숭아");
		
		System.out.println(h);
		
		//덮어쓰기, 수정
		h.put("apple", "대구사과");
		
		System.out.println(h);
		
		// 꺼내기 get
		String val = h.get("apple");
		System.out.println(val);
		String val2 = h.get("melon");
		System.out.println(val2);
		
		//삭제 remove
		String str = h.remove("peach");//삭제하면서 값을 한번 리턴해준다.
		System.out.println(str);
		
		//사이즈 size
		System.out.println(h.size());
		
		Set<String> keys = h.keySet(); //hashmap의 모든 키들만 꺼내옴
		Iterator<String> it = keys.iterator(); // 키들의 반복자 얻기
		while(it.hasNext()) {// 키가 없을때까지 반복 (정렬)
			String key = it.next();//키 하나 꺼내짐
			String value = h.get(key);// 꺼내진 key로 해쉬맵에서 value 꺼내기
			System.out.println("{" + key + "," + value + "}");
		}
		
		
		
	}
}
