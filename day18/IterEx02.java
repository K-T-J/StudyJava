package day18;

import java.util.ArrayList;
import java.util.Iterator;

public class IterEx02 {
	public static void main(String[] args) {

		
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(2, 200);
		
		
		Iterator it = list.iterator();//리턴 타입 확인 일회성
		
		while(it.hasNext()){
			int n = (Integer)it.next();//제네릭 타입이 없을때는 강제 형변환 해야한다.
			System.out.println(n);
		}
		
		// 모든 정수를 더한 합 -> 반복자 사용
		int tot = 0;
		it = list.iterator(); //반복자 다시 얻어서 사용
		while(it.hasNext()) {
			//int n =it.next();
			//tot += n;
		}
		System.out.println("총합 : " + tot);
		
		
		
		
		
	}
}
