package day06;
import java.util.Scanner;

public class ArrEx04 {

	public static void main(String[] args) {
		
		// 문제 1-1. int형의 방5개 배열을 만들고, 10 20 30 40 50을 저장하고 출력.
		
		//int [] arr = {10,20,30,40,50};
		
		//---------------------------------------------------------------
		// 문제 1-2. 위에서 만든 배열을 이용하여,
		//			인덱스 번호 1번과 3번안에 있는 데이터를 더한 값을 출력.
		
		//System.out.println(arr[1] + arr[3]);
		//---------------------------------------------------------------
		
		// 문제 1-3.	인덱스 번호를 사용자로 부터 입력받고, 해당 인덱스의 데이터를 출력
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("인덱스 번호 입력 >>");
		int a = sc.nextInt();
		if(a > 5) {
			System.out.println("0부터 5까지만 출력해주세요");
		}
		
		//해당 인덱스의 데이터를 출력
		System.out.println(arr[a]);
		*/
		//----------------------------------------------------------------
		
		// 문제 1-4.	배열안의 모든 요소를 다 더한 값을 출력
		/*
		int tot = 0;
		for(int i = 0; i < arr.length; i++) {
			tot += arr[i];
		}
		System.out.println("총합 : " + tot);
		*/
		//--------------------------------------------------------------------
		
		// 문제 1-5.	배열안에 있는 값중 한개를 입력하면,
		//			그 값이 위치한 인덱스 번호를 출력
		/*
		System.out.println("10,20,30,40,50 중 값 하나 입력 : ");
		int val = sc.nextInt();
		

		for(int i = 0; i < arr.length; i++) {
			if(val == arr[i]) {
				System.out.println("인덱스번호 : " + i);
			}
		}
		*/
		//---------------------------------------------------------------------
		
		// 문제1-6.	인덱스번호 2번과 4번방의 값을 교환해서 저장.
		/*
		int tmp = arr[2];
		arr[2] = arr[4];
		arr[4] = tmp;
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		//----------------------------------------------------------------------
		
		
		// 문제1-7.	(심화) 내림차순으로 정력 (큰수 -> 작은수 순서로 다시 저장) 버블정렬 / 선택정렬
		
		//선택정렬
		
		int [] arr = {10,20,50,40,30};
		//선택정렬 : 가장큰수 구해서 앞으로 자리이동
		//			자리이동은 가장 큰 숫자가 들어있는 
		//			방번호를 알아야 방번호끼리 교환
		/*
		for(int i = 0; i < arr.length; i++) {
			int max = i; //시작값 넣기
			
			// 최대값 위치 찾기 인덱스 번호
			for(int j = i; j < arr.length; j++) {
				if(arr[max] < arr[j]) {//만약 max인덱스 번호의 값보다 j인덱스 번호의 값이 클경우
					max = j;//max를 j값으로 변환
				}
			}
			//max에 최대값의 인덱스번호가 남아있음
			int tmp = arr[i];	//tmp에 arr인덱스 번호를 넣고
			arr[i] = arr[max];	//arr인덱스에 max에 값을 넣고
			arr[max] = tmp;		//max에 tmp를 넣는
		}
		
		//출력해서 확인
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		
		}
		*/
		
		//			   i	i는 첫번째부터 4번째까지
		//int [] arr = {10,20,50,30,40}; //내림차순으로 : 큰수 앞 -> 작은수 뒤
		//				  j    j는 두번째부터 끝까지
		/* 버블정렬
		 * 			  20 10 50 30 40
		 * 			  50 10 20 30 40
		 * ------------------------------
		 * 			  50 20 10 30 40
		 * 			  50 30 10 20 40
		 * 			  50 40 10 20 30
		 * ------------------------------
		 * 			  50 40 20 10 30
		 * 			  50 40 30 10 20
		 * ------------------------------
		 * 			  50 40 30 20 10
		 
		 */
		for(int i = 0; i < arr.length-1; i++) { //즉 4번반복
			for(int j = i+1; j <arr.length; j++) {//j는 1번인덱스 부터 시작 5번반복
				if(arr[i] < arr[j]) {//만약 i인덱스 값이 j인덱스값보다 작으면
					int tmp = arr[i];	//tmp에 i인덱스 값을 넣고
					arr[i] = arr[j];	//i인덱스에 j값을 넣고
					arr[j] = tmp;		//j인덱스에 tmp값을 넣는다.
				}
			}
		}
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//선택정렬
		//제일 큰수를 찾아서 앞으로 자리교환 : 자리교환위해서 가장 큰수의 인덱스번호들고찾기
		//int [] arr = {10,20,50,30,40};

		/*				50 20 10 30 40 
		/*				50 40 10 30 20 
		/*				50 40 30 10 20 
		/*				50 40 30 20 10 
		 * 		
		 */
		
		for(int i = 0; i <arr.length-1; i++) { //즉 4번반복
			int max = i; //비교를 시작해야되니 i값으로 임의의 인덱스번호 넣어주기
			for(int j= i+1; j<arr.length; j++) {//1번인덱스부터 시작 5번 반복
				if(arr[max] < arr[j]) { //오름차순으로 할려면 등호만 바꾼다.
					max = j; //max 위치를 j로 바꾸기
				}
			}// max에는 값이 가장큰수의 인덱스 번화가 남아있다.
			int tmp = arr[max];	//tmp = 50  
			arr[max] = arr[i];// max = 10
			arr[i] = tmp;// i = 50
		}
		
		
//-----------------------------------------------------------------
		// 버블정렬 
		
		/*
		int [] arr = {10,20,50,40,30};
		
		for(int i = 0; i <arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp= arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;		
				}
			}
		}
		
		//출력해서 확인
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
