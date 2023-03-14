package day06;

public class ArrEx03 {

	public static void main(String[] args) {  //어떤 데이터를 넣을지 모르니 문자열String으로
	
		int [] arr = {1,2,3,4,5};
		int [] myArr = arr;
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
		
		
		
		
		String[] memvers = {"최진혁", "최유빈", "한이란"};
		for(String e : memvers) { //업그레이드 for문
			System.out.println(e + "이 상담을 받았습니다");
		}
		
		
		
		
		
		
		
		
	}

}
