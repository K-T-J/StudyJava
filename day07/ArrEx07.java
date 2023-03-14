package day07;

import java.util.Scanner;

public class ArrEx07 {

	public static void main(String[] args) {
		// 문제1. 아래와 같은 형태의 정방배열을 만들어 값을 저장하고 출력해보세요. 
	    /*
	       10   20   30
	       40   50   60
	       70   80   90

		int[][]arr = {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	    */
		
	//----------------------------------------------------------------
	    // 문제2. int형 3행 2열의 정방배열을 만들고
	    //      각 방에 정수를 입력받아 저장하고 출력하세요. 
		
		/*
		//방 만들기
		int[][]arr = new int[3][2];
		
		//입력받아 저장
		
		//이중for문 외우는게 좋다
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("정수 입력 >>");
				int num = sc.nextInt();//방안에 값 입력받기
				arr[i][j] = num;//방안에 입력받은 값 넣기
			}
		}
		
		System.out.println("====출력====");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		*/
	//--------------------------------------------------------------------
	    
	    // 문제3. 아래와 같은 형태의 비정방배열을 만들어 
	    //      아래와 동일하게 값을 저장하고 출력하세요.
	    /*
	       10   11   12
	       20   21
	       30   31   32
	       40   41
	    */
		
		int[][]arr = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				arr[i][j] = (i+1)*10 + j; //<10
			}
		}
		
		System.out.println("====출력====");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		

	//------------------------------------------------------------------------
	    
       //문제4. 한층에 5호씩 있는 3층짜리 아파트가 있다. 
       //1) 배열로 만들어서 각 호마다 관리비를 입력받고, 전체 출력해보세요.
		Scanner sc = new Scanner(System.in);
		
		int[][]fee = new int[3][5]; //방만들기
		for(int i = 0; i<fee.length; i++) {
			for(int j = 0; j<fee[i].length; j++) {
				System.out.println("관리비 입력>>");
				fee[i][j] = sc.nextInt();
			}
		}
		 
		System.out.println("====출력====");
		for(int i = 0; i<fee.length; i++) {
			for(int j = 0; j<fee[i].length; j++) {
				System.out.print(fee[i][j] + "  ");
			}
			System.out.println();
		}
//--------------------------------------------------------------------			
       //2) 층별 관리비 평균을 구해서 출력해보세요.
		for(int j =0; j<fee.length; j++) {
			int tot = 0;  	//1층만 뽑았다
			for(int i =0; i <fee[0].length; i++) {
				tot += fee[0][i];
			}
			int avg = tot /fee[0].length;
			System.out.println(j + "층 관리비 평균 : " + avg);
		}
		
		/*
//---------------------------------------------------------------------
			
       //3) 전체 관리비 평균을 구해서 출력해보세요.
		int tot = 0;
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j<fee[i].length; j++) {
				tot += fee[i][j];
			}
		}
		int avg = tot / (fee.length * fee[0].length);
			
//---------------------------------------------------------------------
			
       //4) 103호와 203호의 관리비가 서로 바뀌었다고해요, 교환해주세요. 02 12
		
		int tmp = fee[0][2];
		fee[0][2] = fee[1][2];
		fee[1][2] = tmp
			
//---------------------------------------------------------------------			
			
		int[][] ho = {{101,102,103,104,105},{201,202,203,204,205},{301,302,303,304,305}};
		
       //5) 전체 관리비 평균보다 적게 사용한 호수들을 출력해보세요.
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j<fee[i].length; j++) {
				if(fee[i][j] > tot_avg) {
					System.out.println(ho[i][j] + "호");
				}
			}
		}
				
				
		*/		
					
//---------------------------------------------------------------------	
		/*
					
		int [][] fee = {{34,23,66,31,45},
						{43,12,48,45,78},
						{50,2,13,57,34}};
		int[][] ho = {{101,102,103,104,105},
						{201,202,203,204,205},
						{301,302,303,304,305}};
				
       //6) 관리비를 가장 적게 사용한 호수와 가장 많이 사용한 호수를 출력해보세요.
		int max = fee[0][0]; //최대 관리비 담아 비교를 위한 변수
		int maxIdxI=0;// 최대 관리비의 인덱스번호 i 담을변수 (층)
		int maxIdxj=0;//최대 관리비의 인덱스 번호 j 담을변수 (호)
		int min = fee[0][0];
		int minIdxI = 0;
		int minIdxJ = 0;
		
		for(int i =0; i<fee.length; i++) {
			for(int j =0; j<fee[i].length; j++) {
				if(max < fee[i][j]);
				max = fee[i][j];
				maxIdxI = i;
				maxIdxI = j;
			}
			if(min > fee[i][j]);
			min = fee[i][j];
			minIdxI = i;
			minIdxI = j;
				
			}
		}

		*/
		
		
		
		
		/*
		
	    //7) 심화: 관리비 적게 나온 순으로 정렬해보세요. 
	    int [] fee1 = new int[15];
	   
	    for(int i=0; i < fee1.length; i++) {
	    	int idxI = i % 3;
	    	int idxJ = i % 5;
	    	fee[i] = fee[idxI][idxJ];
	    }

	    for(int i =0; i<fee.length; i++) {
			for(int j =0; j<fee[i].length; j++) {
				int idx = (i+1) + 
			}
		}
	
	
	*/
	
		
		
		
		
		
		
	
	//sc.close();

	}
}
