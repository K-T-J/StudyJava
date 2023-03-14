package day07;
import java.util.Scanner;


public class ArrEx05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문제 1-1. arr이라는 이름의(방5개) 하나의 배열에 사용자로부터 서로 다른 5개의
		//			정수를 입력받아 저장해보고,출력.
		/*
		int [] arr = new int[5]; //방 5개 생성
		
		for(int i = 0; i < arr.length; i++) {   //반복문 생성
		
			System.out.println("서로 다른 5개 정수 입력 >>");
			int num = sc.nextInt();  //출력문 생성
			
			arr[i] = num;	// 
		}
		
		for(int i = 0; i < arr.length; i++) {  //출력결과
			System.out.println(arr[i]);
		}
		*/
		
//-----------------------------------------------------------------------
		// 문제 1-2. 위에서 만든 배열 arr에 저장된 값들을 오름차순으로 정렬하여 출력.
		/*
		for(int i = 0; i < arr.length-1; i++) { //반복문 생성 
		
			for(int j = i+ 1; j < arr.length; j++) { // 버블정렬
				if(arr[i]>arr[j]) {	// 등호만 < 바꾸면 내림차순으로 변경 가능
					int tmp= arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;	//교환 값
				}
			}
				
		}
		for(int i=0; i<arr.length; i++) {	//출력
			System.out.println(arr[i]);
		}
		*/
		
		
		
		
		
//--------------------------------------------------------------------------
		// 문제 1-3. 정수 한개를 더 입력받아 저장하기.
		//			입력받은 정수는 기존 배열의 마지막 데이터 다음방에 저장되어야한다.
		//			단, 배열은 문법적으로 방 크기 수정이 불가하고,
		//			데이터가 하나더 추가 되려면 방이 6개여야한다.
		
		/*
		int[]arr1 = {1,2,3,4,5};
		//정수 한개 입력 받고
		System.out.println("새 정수 입력 : ");
		int newNum = sc.nextInt(); 
		//방을 6개로 만들어서 마지막꺼 추가
		// arr1을 잠시 복사를 해두고 -> 주소값 복사 (레퍼런스 공유)
		int[]tmp = arr1;
		//arr1을 다시 방 6개로 할당해주고
		arr1 = new int[6];
		//반복문 돌려서 
		for(int i=0; i<tmp.length; i++) {
			arr1[i] = tmp[i]; //0~4번 인덱스까지 arr1을 채우고
		}
		//새로 입력받은 숫자를 마지막방 5번 인덱스에 저장
		arr1[5] = newNum;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		*/
	
//---------------------------------------------------------------------------		
		// 문제 2-1	게임랭킹보드. 5개의 데이터를 저장할 수 있는 users와 scores라는
		//			이름의 배열이 있고, users 배열에는 유저네임, scores배열에는
		//			게임점수를 입력받아 저장한다.
		//			단, 유저 네임과 게임점수는 배열 인덱스상 서로 일치한다.
		//			ex)users첫번쨰방 유저의 점수는 scores첫번쨰방에 저장
		//			ex) int size = 20;	//변수를 하나 만들어 방개수를 변수값만 바꾸면 다바뀐다
		
		//String[]users = new String[size];
		//int[]Scores=new int[size];
		
		// 방 5개 짜리 users 배열 만들기	: 이름 저장 String[]
		String[]users = new String[5];
		// 방 5개 짜리 scores 배열 만들기	: 게임점수저장 : 숫자 int[]
		int[]Scores= new int[5];
		
		
		//위 배열에 입력받아 저장 -> 방이 다섯개 -> 5개 입력 + 저장(이름,점수) + 저장
		//한명 이름 입력받아 저장 -> 그사람의 점수 입력받아 저장
		// -> 5번반복 : 한번 반복할때, 이름입력 + 저장 하고 점수입력 + 저장
		
		for(int i =0; i<users.length; i++) {
			//이름 입력받고
			System.out.println("이름 입력 : ");
			users[i] = sc.nextLine(); //users 에 저장
			//점수 입력받고
			System.out.println("점수 입력 :"); 
			//scores에 저장
			Scores[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = 0; i < users.length; i++) {
			System.out.println("이름 : " + users[i] + ", 점수 :" + Scores[i]);
		}
		
//--------------------------------------------------------------------------
		
		// 문제 2-2 위 저장된 users와 scores를 아래와 같은 형태로 출력. *입력받은대로 출력
		//	콘솔출력 예)
		// user_name		score
		//---------------------------
		//	피카츄			87
		//	파이리			24
		//		....
		
		
		System.out.println("user_name  score");
		System.out.println("---------------------------");
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i] + "       " +  Scores[i]);
		}
		
		
//-----------------------------------------------------------------------		
		// 문제 2-3	두번째 유저의 점수와 세번째 유저의 점수가 서로 바뀌어서 저장이
		//			되었다합니다. 두개의 점수만 교환해주세요.
		int tmp = Scores[1];
		Scores[1] = Scores[2];
		Scores[2] = tmp; 
		
		for(int i = 0; i< users.length; i++) {
			System.out.println(users[i] + "       " +  Scores[i]);
		}
		
		
		
//----------------------------------------------------------------------
		// 문제 2-4	점수가 높은 순으로 출력되는 게임 랭킹보드를 출력하세요.
		//			랭킹 보드는 1위~5위 까지
		//	콘솔출력 예)
		//		rank	user_name	score
		//		-------------------------
		//		1		꼬북이		137
		//		2		피카츄		87
		//		3		.....
		/*
		
		for(int i = 0; i < Scores.length-1; i++) { //반복문 생성 
			for(int j = i+ 1; j < Scores.length; j++) { // 버블정렬
				if(Scores[i]<Scores[j]) {	// 등호만 < 바꾸면 내림차순으로 변경 가능
					//점수 자리 교환
					int temp= Scores[i];
					Scores[i] = Scores[j];
					Scores[j] = temp;	//교환 값
					//이름 자리 교환도 동시에
					String sTmp = users[i];
					users[i] = users[j];
					users[j] = sTmp;
				}
			}
		}
		System.out.println("rank\t user_name\t score");
		System.out.println("------------------------");
		
		for(int i=0; i<users.length; i++) {	//출력
			System.out.println((i+1) + "\t" + users[i] + "\t" + Scores[i]);
		}
		
		*/
		
//------------------------------------------------------------------------
		
		// 문제 2-5	또 한명의 유저가 게임을 끝냈습니다.
		//			점수와 유저네임을 입력받고, 기존의 게임랭킹보드를 업데이트해
		//			출력해주세요. 이때 입력받은 새로운 유저의 데이터는
		//			기존의 데이터에 추가 되어야함 (1-3 문제 참고)
		//			업데이트 방법 : 1) 랭킹은 5위까지만 출력.
		//			새로 입력받은 유저의 점수가 5위보다 낮으면 출력x
		//			순위권 안에 들어오는 점수면 순위에 맞춰 출력
		
		// 배열 방 크게 만들기
		int len = Scores.length; //배열 기존 길이 담기
		//두개의 배열 주소 복사해놓기 (레퍼런스 공유)
		int[] ScoresTmp = Scores;
		String[] usersTmp = users;
		
		// 기존 배열 두개의 공간 6개로 만들기
		Scores = new int[len +1];	//6
		users = new String[len +1];	//6
		// xxxTmp 복사해둔 기존 데이터 옮겨담기
		for(int i = 0; i< ScoresTmp.length; i++) {
			Scores[i] = ScoresTmp[i];
			users[i] = usersTmp[i];
		}// 5명은 정렬이 된 상태로 다시 복사됐을을것임
		//새로운 유저의 이름과 점수 입력받아 마지막에 저장
		System.out.println("이름>>");
		users[len] = sc.nextLine();	//user[5]
		System.out.println("점수>>");
		Scores[len] = Integer.parseInt(sc.nextLine());
		
		//다시 정렬
		for(int i = 0; i < Scores.length-1; i++) { //반복문 생성 
			for(int j = i+ 1; j < Scores.length; j++) { // 버블정렬
				if(Scores[i]<Scores[j]) {	// 등호만 < 바꾸면 내림차순으로 변경 가능
					//점슈 자리 교환
					int temp= Scores[i];
					Scores[i] = Scores[j];
					Scores[j] = temp;	//교환 값
					// 이름 자리 교환도 동시에
					String sTmp = users[i];
					users[i] = users[j];
					users[j] = sTmp;
				}
			}
		}
		// 랭킹 출력 : 5위까지만 (꼴찌인 6번째는 출력안됨)
		System.out.println("rank\t user_name\t score");
		System.out.println("------------------------");
		
		for(int i=0; i<5; i++) {	//출력
			System.out.println((i+1) + "\t\t" + users[i] + "\t" + Scores[i]);
		}
		
		sc.close();
	}

}
