package day07;

public class ArrEx08 {

	public static void main(String[] args) {

		int[] num = {1,45,354,8487,314};
		
		//for문
		/*
		for(int i =0; i< num.length; i++ ) {
			System.out.println(num[i]);
		}
		*/
		
		// forEach, 업그레이드 for
		// for(변수선언 : 배열) {변수 활용....;}
		
		for(int n : num) {	//콜론 기준으로 오른편에
			System.out.println(n);
		}
		
		
		String [] str = {"java","jsp","html","spring"};
		for(String s : str) {
			System.out.println(s);
		}
		
		System.out.println("--------------");
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		
		
		
	}

}
