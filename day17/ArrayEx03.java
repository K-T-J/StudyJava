package day17;

import java.util.ArrayList;

public class ArrayEx03 {
	public static void main(String[] args) {

		
		// 제네릭타입 지정 없이 사용할때
		// 문자열을 저장하고, 문자열의 UpperCase기능으로 전체 대문자로 출력
		// 장점은 모든 타입이 올수있으나 단점은 Object으로 오기때문에 강제형변환 해줘야한다.
		
		ArrayList arr = new ArrayList();
		arr.add("Apple");
		arr.add("oRange");
		
		/*
		제네릭 타입이 없으면 모두 들어간다.
		arr.add(10);	
		arr.add(3.14);
		arr.add(true);
		
		System.out.println(arr);
		 */
		
		//전부 대문자로 바꿀려면
		for(int i = 0; i < arr.size(); i++) {
			Object o = arr.get(i);// 제네릭타입을 지정안해줘서,Object로 리턴을 해줌.
			String str = (String)o;// String의 메서드를 사용하기위해 String으로 형변환.
			//String str = (String)arr.get(i);로도 가능하다
			System.out.println(str.toUpperCase());
		}
		
		for(Object o : arr) {//업그레이드 for문
			String s = (String)o;
			System.out.println(s.toLowerCase());
		}
		
		
		
		
		
		
		
		//제네릭 o
		ArrayList<String>arr2 = new ArrayList<String>();
		arr.add("Apple");
		arr.add("oRange");
		System.out.println(arr2);
		
		for(int i = 0; i < arr2.size(); i++) {
			String str = arr2.get(i);
			System.out.println(str.toUpperCase());
		}
		
		for(String s : arr2) {
			System.out.println(s.toLowerCase());
			
		}
		
		
		
		
		
	
		
	}
}
