package day16;

public class SBEx01 {
	public static void main(String[] args) {

		//String vs StringBuffer 속도 차이
		
		
		long start, end;
		
		String str = new String("1 ~ 10000까지 : ");
		StringBuffer sb = new StringBuffer("1~10000까지 : ");
		
		start = System.currentTimeMillis();
		for(int i = 1; i <= 10000; i++) {
			str += i;
			str += "+";
		}
		end = System.currentTimeMillis();
		System.out.println("String ; " + (end - start));
		
		start = System.currentTimeMillis();
		for(int i = 1; i <= 10000; i++) {
			sb.append(i);
			sb.append("+");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer : " + (end = start));
		
		
		
		
		//Integer i;
		
		
		
		
		
		
		
		
		
		/*
		StringBuffer sb = new StringBuffer("sunny");
		StringBuffer sb2 = new StringBuffer("day");
		System.out.println(sb.equals(sb2));
		//StringBuffer의 equals()는 오버라이딩 되지 않아서 문자가 아닌 주소비교라 false
		
		
		sb.insert(2,"HAHAHA");	//2번에다 껴놓기
		System.out.println(System.identityHashCode(sb2));
		
		sb.delete(2,4);			//문자열 부분삭제
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb2));
		
		
		//StringBuffer 대량에 문제열을 넣고 수정을 해야할때 사용한다.
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		sb.append(sb2); //두개 붙여준다. 바로수정
		System.out.println(sb);
		
		
		sb.append("hello"); //두개 붙여준다.
		System.out.println(sb);
		*/
		
		
		
		/*
		System.out.println(sb);
		int s = sb.capacity();//capacity 공간
		System.out.println(s);
		int len = sb.length();
		System.out.println(len);
		
		*/
	}
}
