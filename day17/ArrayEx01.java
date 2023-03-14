package day17;

import java.util.ArrayList;

public class ArrayEx01 {
	public static void main(String[] args) {
		
		//#1. ArrayList 생성
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//ArrayList<Integer> arr2 = new ArrayList<Integer>(20);//20개짜리 공간 굳이 만들필요x
		
		
		
		//#2. 요소 추가
		arr.add(new Integer(10));
		arr.add(new Integer(20));
		arr.add(new Integer(-100));
		
		
		arr.add(10);//자동 박싱 new Integer(1) 한거랑 같다.
		arr.add(20);
		arr.add(30);
		
		arr.add(null);//null 삽입 가능함에 주의
		
		System.out.println(arr+"전");
		
		arr.add(2,10000);//2번 인덱스에 10000을 넣을려할때
		
		System.out.println(arr + "후");
		
		//#3. 요소 꺼내기
		int a = arr.get(0); // get(index)
		System.out.println(a);
		
		//#4. 크기(수)
		System.out.println("저장된 데이터의 수 : " + arr.size());
		
		//#5. 삭제
		arr.remove(2); // remove(index) 2번 삭제 
		System.out.println(arr);
		
		
		//arr.remove(10);	10을지우고싶을때 정수가 올때는 에러가 뜬다
		//System.out.println(arr);
		arr.remove(new Integer(10));//remove(요소) 요소는 객체로 지정
		System.out.println(arr);
		
		System.out.println("-----------");
		
		//입력한 값이 있으면 true 없으면 false 
		System.out.println(arr.contains(-20));
		
		
		//모두 삭제
		arr.clear();
		System.out.println(arr);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
