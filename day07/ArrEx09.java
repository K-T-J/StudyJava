package day07;

public class ArrEx09 {
	public static void main(String[] args) {
/*
		// *** 랜덤 ***
		//System.out.println(Math.random()); // 0~1 사이의 실수 
		// 0 ~ 9사이 랜덤값을 출력 
		//System.out.println((int)(Math.random() * 10));
		
		// 문제0. 0 ~ 5 사이 랜덤값 // 0 1 2 3 4 
		//for(int i = 0; i < 20; i++) {
		System.out.println((int)(Math.random() * 6));
		//}
		// 문제1. 1 ~ 5 사이 랜덤값 출력 // 1 2 3 4 5
		System.out.println((int)(Math.random() * 5) + 1);	
	
		// 문제2. 12 ~ 17사이 랜덤값 출력 0 ~ 5
		System.out.println((int)(Math.random() * 6) + 12);
		
		// 문제3. 로또 번호 랜덤으로 생성하기 (배열) 
		//			1 ~ 45 사이 임의의 번호 6개 선택하고, 오름차순으로 정렬 -> 출력
		//		(심화) 중복제거 
		
		//풀이
		int[] rotto = new int [6];
		for(int i = 0; i < rotto.length; i++) {
			rotto[i] = (int)(Math.random()*45) +1;
			//처음부터 지금 뽑은것 전까지 반복해서
			// 지금 뽑은수가 이전수와 동일한지 검사
			for(int j = 0; j < i; j++) {
				if(rotto[i] == rotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 오름차순 정렬하고 
		// 출력
		*/
		
		// 랜덤 : Math.random 실수로 뽑아준다. 그러기 때문에 앞에 (int)
		System.out.println((int)Math.random()*10);//소숫점이 뒤로 int로 변환해서
		//0.00000001 ~ 0.99999999	//10을곱했을떄 0~9사이 임의의수
		
		
		System.out.println((int)Math.random()*10+1);//소숫점이 뒤로 int로 변환해서
		//1~10 값을 구하고싶을때
		//0,1,2,3,4<--+5  // *5 + 5 일때  
		//5,6,7,8,9 //로찍힌다.
		
		
		System.out.println(Math.random());//실수로 나온다.
		
		
		
		System.out.println((int)Math.random()*6);
		//0~5까지 하겠다. Tip : +1해주면 된다.
		//만약 0~13 하고싶으면 : *14
		//만약 1~13 하고싶으면 : *14 +1
		//만약 5~9  하고싶을때 : *10 + 5
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
