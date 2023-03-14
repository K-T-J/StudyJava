package day08;


import java.util.Scanner;
public class ArrEx10 {

	public static void main(String[] args) {
	
	//문제1. 2차원 배열 arr을 출력해보세요. *비정방 배열 문제
	/*
	 1
	 1	2	3
	 1
	 1	2	3	4
	 1	2
	*/
	/*
	int[][]arr = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
	for(int i =0; i < arr.length; i++) {
		for(int j = 0; j<arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	
	*/
//---------------------------------------------------------------------------------------	
	/*
	Scanner sc = new Scanner(System.in);
	
	
	//문제2. Scanner로 소문자 알파벳 하나 입력받고,
	//		아래와 같이 출력되게 해보세요.	tip char-> ascii(아스키) 숫자와 호환
	/* 콘솔예시)
		소문자 알파벳 하나를 입력하세요 >> e (<---사용자가입력)
		abcde		97 98 99 100 101
		abcd		97 98 99 100
		abc			97 98 99
		ab			97 98
		a			97
	
		
	
	//풀이
	System.out.println("소문자 알파벳 하나를 입력하세요>>");
	String alpha = sc.nextLine();
	char c = alpha.charAt(0);
	
	for(int i = c; i >= 97; i--) {
		for(int j = 97; j <= i; j++) {
			System.out.print((char)j);	//char를 안쓰면 숫자로 출력
		}
		System.out.println();
	}
	
	
	*/
		
		
//------------------------------------------------------------------------------------------
	/*
	// 문제3.	양의 정수 10개를 입력받아 배열에 저장하고,
	//		3의 배수만 출력하는 프로그램 작성해보세요.		//업그레이드 for문
	Scanner sc = new Scanner(System.in);
	int[] nums = new int[10];
	for(int i =0; i< nums.length; i++){
		System.out.println("숫자입력 : ");
		nums[i] = sc.nextInt();
	}
	for(int n : nums) {
		if(n % 3 == 0) {
			System.out.println(n);
		}
	}
	
	*/
		
		
//--------------------------------------------------------------------------------------------		
		
	
	
	// 문제4.	4x4의 2차원 배열 (총16개방)을 만들고,
	//		1 ~ 10까지 범위의 정수를 10개만 랜덤하게 생성하여
	//		임의의 위치에 저장하세요.
	//		동일한 랜덤값이 있어도 상관없으며, 나머지 6개의 숫자는 모두
	//		0으로 만들어 4x4x 형태로 출력
	/*
			출력예)
			3	0	7	2
			0	8	1	4
			2	6	0	6
			0	0	7	0
	  */
	
	int[][] board = new int [4][4]; // 4x4 판 만든것
	int[]randNums = new int [10];	// 랜덤 미리 뽑아서 10개 저장할 배열
	for(int i=0; i< board.length; i++) {
		for(int j = 0; j<board[i].length; j++) {
			board[i][j] = 0;
		}
	}
	// 1개 랜덤 받기
	for(int i = 0; i < randNums.length; i++) {
		randNums[i] = (int)(Math.random()*10 +1);
	}
	
	//임의의 위치에 랜덤값 저장, 위치 중복x ==> 랜덤위치의 값이 0이 아닐때
	for(int i = 0; i < randNums.length; i++) {
		//임의의 인덱스 번호 뽑기 x = 행, y = 열
		int x =(int)(Math.random()*4);// 0 1 2 3
		int y =(int)(Math.random()*4);// 0 1 2 3
		if(board[x][y] !=0) {//리미 한번 뽑힌 자리라면~~
			i--;
		}else {
			board[x][y] = randNums[i];
		}
		
	}
	
	for(int i=0; i< board.length; i++) {
		for(int j = 0; j<board[i].length; j++) {
			System.out.print(board[i][j] + " ");
		}
		System.out.println();
	}
	
	
		
		
		
		
		
	}

}
