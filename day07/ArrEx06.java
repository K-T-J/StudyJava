package day07;

public class ArrEx06 {

	public static void main(String[] args) {
		
		//정방 배열
		int[][]ar = new int[2][3];	// 선언 + 생성
		// 각 방에 값 대입 : [행인덱스] [열인덱스]
		ar[0][0] = 100;
		ar[0][1] = 200;
		ar[0][2] = 300;
		ar[1][0] = 400;
		ar[1][1] = 500;
		ar[1][2] = 600;
		
		System.out.println("-------------------------");
		//초기화 (new 생략하고 바로 선언과 동시에 값 대입)
		
		int[][]arr = {{100,200,300},
					  {400,500,600}}; //2행 3열 [보기힘들면 중간에 엔터해도 된다.]
		
		
		System.out.println(arr.length); //행의 개수 2 출력이된다
		System.out.println(arr[0].length); // 0번째 요소의 길이 즉, 열의 개수 3 출력
		System.out.println(arr.length * arr[0].length); //2*3 총 방의수 6출력
		
		System.out.println("-------------------------");
		
		//전체 출력
		for(int i = 0; i<arr.length; i++) {			// 행 기준 반복
			for(int j =0; j<arr[i].length; j++) {	// 열 기준 반복
				System.out.print(arr[i][j]);
			}System.out.println();
		}
		
		System.out.println("-------------------------");
		//비정방 배열
		int[][]arr2 = new int[2][]; //행이 몇줄인지는 지정해줘야한다. 내부는 비워둬야한다.
		arr2[0] = new int[3];	// 0번 행에는 방 3개 짜리 만들기
		arr2[1] = new int[2];	// 1번 행에는 방 2개 짜리 만들기
		//이제부터 사용가능.
		
		//비정방배열 초기화
		int[][] arr3 = {{10,20,30},{40,50}};
		System.out.println(arr3.length);	// 행의 길이 2
		System.out.println(arr3[0].length);	// 3
		System.out.println(arr3[1].length);	// 2
		
		//전체출력
		for(int i =0; i< arr3.length; i++) {
			for(int j=0; j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
