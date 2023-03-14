package day18;

import java.util.Iterator;
import java.util.Vector;

public class IterEx01 {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		
		//반복자를 이용해서 모든 데이터 접근
		//# iterator
		Iterator<Integer> it = v.iterator();
		
		
		while(it.hasNext()) {	//요소가 끝날때까지 반복(다음으로갈 장소가 있는지만 체크)
			int n = it.next(); 	// 요소 꺼내기
			// ....  처리
		}
		
		
	
		
		
		
		
		
		
		
	}
}
