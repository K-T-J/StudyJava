package day06;

public class ArrEx02 {

	public static void main(String[] args) {

		
		
		// 반복문 사용
		
		int [] num = new int[9];
		// 저장 방에다 100을 모두 넣고싶을때 
		for(int i =0; i<num.length; i++) { // 0 ~ 9번까지 : 인덱스번호로 활용
			num[i] = 100; //방마다 100을 넣기
			System.out.println("123123 : "+ num[i]);//출력
		}
		// 출력 : 방에 접근해서 값을 출력
		for(int j = 0; j < num.length; j++) {	//num.length 방이 바뀔때 자동으로 바뀌게 
			System.out.println(num[j]);
		}
		
		// 초기화
		int [] arr = {1,2,3,4,5};
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String [] str = {"java", "jsp", "spring"};  //문자열 여러개 입력하고싶을때
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		//문제. 최대값, 최소값 구하기 	for랑 if를 활용
		int [] score = {1,5,84,5,48,82,94}; //tip max라는 변수를 만든다.
		//최대값 
		int max = score[0];  //첫번째방의 값을 넣고 시작 0번째방에 있는것 부터 기준
		for(int i = 0; i < score.length; i++) {
			// max변수와 각 방의 값을 비교해서 max가 크면
			// max변수를 방의 값으로 덮어쓰기
			if(max < score[i]) {
				max = score[i];
			} //<--누가 더 크냐를 알아볼때는 if
		}
		System.out.println("최대값 : " + max);
		
		/*
		//최소값
		int min = score[0]; //가장 작은 수를 들고 있을 변수
		for(int i =0; i< score.length; i++) {
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최소값 : "+ min);
		
		
		//위에를 합친것
		
		
		/*
		int [] score = {1,5,84,5,48,82,94};
		int max = score[0];
		int min = score[0];
		
		for(int i =0; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}if(min > score[i]) {
				min = score[i];
			}
		}System.out.println("최소값 : " +min);
		System.out.println("최대값 : " + max);
		
		
		*/
		
		
		
		//문제. 최대값, 최소값 구하기 	for랑 if를 활용
		
//		int [] score = {1,5,84,5,48,82,94};
//		int max = score[0];
//		int min = score[0];
		
		/*
		for(int i =0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}if(min > score[i]) {
				min = score[i];
			}
		}System.out.println("최대값 : " + max);
	System.out.println("최대값 : " + min);
		*/
		
		
		int [] count = {1,53,250,302,3,532,5};
		int max1 = count[0];
		int min2 = count[0];
		for(int i = 0; i < count.length; i++) {
			if(max1 < count[i]) {
				max1 = count[i];
			}else if(min2 > count[i]) {
				min2 = count[i];
			}
		}
		System.out.println("max1 : " + max1);
		System.out.println("min2 : " + min2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
