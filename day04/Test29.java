package day04;
import java.util.Scanner;
public class Test29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//* while 문 문제
		//문제1. 0~10까지 출력
		
		/*
		int a=0; //초기값
		while(a <= 10) { //조건식
			System.out.println(a);
			a++; //증감식
		} //0~10까지 반복
		
		*/
		//문제2. 1~15까지 출력
		/*
		int b=1; //초기값
		while(b<=15) { //조건식
			System.out.println(b);
			b++;//증감식
		}//1~15까지 반복
			*/
		
		
		//문제3. 0~100까지 10단위로 출력. 0 10 20 30....
		
		/*
		int c = 0; //초기값
		while(c<=100) {//조건식
			System.out.println(c);
			c += 10; 	//증감식 10씩 늘릴것이다.
		}//0 10 20 30 ... 100 까지 반복
		
		*/
		
		
		
		//문제4. 1~20까지 홀수만 출력
		/*
		int c = 1; //초기값
		while(c<=20) {//반복,조건식
			if(c % 2 == 1){ //조건식
				System.out.println(c);
			}
			c++;
		}
		*/
		
		//문제5. 1~10까지의 총 합 출력
		/*
		int a = 1; //초기값
		int total = 0; //총합을 계속 담고 있을 변수
		while(a <= 10) {//조건식
			total += a;  //total = total + a;
			a++;
		}
		System.out.println("총합은 : " + total);
		
		*/
		
		
		//문제6. 1~50까지의 짝수의 총합 출력
		/*
		int a = 1;
		int tot = 0;	//누적해 더한값 들고있을 변수  곱하기 일경우 0이 아닌 1로
						//기존값이 유지 될려면 while 밖에
		while(a <= 50) {
			//짝수 체크
			if(a%2 == 0) {	//짝수라면
			tot += a;	//tot에 누적해라~			
			}a++;		//if문이 아닌 while문 안에 있어야한다.
		}
		System.out.println("짝수의 총합 :" + tot);
		
		*/
		
		
		//문제7. 주문 프로그램
		/*
		 * ***글로벌 카페 메뉴 ***
		 * 1. 아메리카노	: 2500원
		 * 2. 카페라떼	: 3000원
		 * 3. 카푸치노	: 3500원
		 * 4. 카라멜프라푸치노	: 4000원
		 * 5. 햄치즈샌드위치	: 6000원
		 * 6. 종료
		 	1단계 :	위 메뉴를 콘솔에 출력하여, 종료(6)를 선택할때 까지 반복해서
		 			메뉴 번호로 주문을 받고, 종료 선택후 총 주문 금약 출력
		 	2단계 : int money=y = 20000; 내돈에서 주문시 주문금액 차감,
		 			돈이 부족하면 주문 추가 불가, 종료시 총액 출력, 잔액도 출력
		 			
		 */
		
		//문제1
		int tot = 0; //총합변수 미리 선언 : 메뉴 주문시 각 가격 누적해서 더할 변수
		
		
		int money = 20000;
		// 반복의 횟수가 정해지지 않았다.
//		while(true) {
//			System.out.println("***글로벌 카페 메뉴 ***");
//			System.out.println("1. 아메리카노	: 2500원");
//			System.out.println("2. 카페라떼	: 3000원");
//			System.out.println("3. 카푸치노	: 3500원");
//			System.out.println("4. 카라멜프라푸치노	: 4000원");
//			System.out.println("5. 햄치즈샌드위치	: 6000원");
//			System.out.println("6. 종료");
//				
//			System.out.println("메뉴 번호 선택 >>");		// 메세지 출력
//			int num = Integer.parseInt(sc.nextLine());	// 메뉴번호 입력
//			// 입력받은 메뉴번호 검사 몇번인지 확인해서
//			// 각 번호에 따른 처리 하기
//			if(num==1) {	//1선택 했다면
//				System.out.println("아메리카노를 선택하셨습니다.");
//				tot += 2500;
//				System.out.println("총액 : " + tot);
//			}else if(num==2) {	//2선택 했다면
//				System.out.println("카페라떼를 선택하셨습니다.");
//				tot += 3000;
//				System.out.println("총액 : " + tot);
//			}else if(num==3) {	//3선택 했다면
//				System.out.println("카푸치노를 선택하셨습니다.");
//				tot += 3500;
//				System.out.println("총액 : " + tot);
//			}else if(num==4) {	//4선택 했다면
//				System.out.println("카라멜프라푸치노를 선택하셨습니다.");
//				tot += 4000;
//				System.out.println("총액 : " + tot);
//			}else if(num==5) {	//5선택 했다면
//				System.out.println("햄치즈샌드위치를 선택하셨습니다.");
//				tot += 6000;
//				System.out.println("총액 : " + tot);
//			}else if(num==6) {	//6선택 했다면
//				System.out.println("주문 종료되었습니다.");
//				break;
//			}else {	// 1~6이 아닌 다른 번호 잘못 눌렀을때 예외처리
//				System.out.println("메뉴번호가 아닙니다. 다시 시도해주세요");
//			}
//			
//		}//whlie 괄호
//		System.out.println("총 금액 : " + tot + "원 입니다.");
		
		//문제2 (보류)
		while(true) {
			System.out.println("***글로벌 카페 메뉴 ***");
			System.out.println("1. 아메리카노	: 2500원");
			System.out.println("2. 카페라떼	: 3000원");
			System.out.println("3. 카푸치노	: 3500원");
			System.out.println("4. 카라멜프라푸치노	: 4000원");
			System.out.println("5. 햄치즈샌드위치	: 6000원");
			System.out.println("6. 종료");
				
			System.out.println("메뉴 번호 선택 >>");		// 메세지 출력
			int num = Integer.parseInt(sc.nextLine());	// 메뉴번호 입력
			
			if(money>0) {
				if(num==1) {	//1선택 했다면
					System.out.println("아메리카노를 선택하셨습니다.");
					money -= 2500;
					System.out.println("남은금액 : " + money);
				}else if(num==2) {	//2선택 했다면
					System.out.println("카페라떼를 선택하셨습니다.");
					money -= 3000;
					System.out.println("총액 : " + money);
				}else if(num==3) {	//3선택 했다면
					System.out.println("카푸치노를 선택하셨습니다.");
					money -= 3500;
					System.out.println("남은금액 : " + money);
				}else if(num==4) {	//4선택 했다면
					System.out.println("카라멜프라푸치노를 선택하셨습니다.");
					money -= 4000;
					System.out.println("남은금액 : " + money);
				}else if(num==5) {	//5선택 했다면
					System.out.println("햄치즈샌드위치를 선택하셨습니다.");
					money -= 6000;
					System.out.println("남은금액 : " + money);
				}else if(num==6) {	//6선택 했다면
					System.out.println("주문 종료되었습니다.");
					break;
				}else {	// 1~6이 아닌 다른 번호 잘못 눌렀을때 예외처리
					System.out.println("메뉴번호가 아닙니다. 다시 시도해주세요");
				}
			}else {
				System.out.println("남은 금액은 : " + money);
				break;
			}
		}//whlie 괄호
		
		
		

		
		
		
		
		/*
		//문제8. -1이 입력될때까지 정수를 계속 입력받고,
		//		-1 입력시, 총합과 평균을 출력하는 프로그램
		// 무한반복해서 입력받고, 출력 -1 입력할떄까지
		// 총합 -> total, 평균->몇번입력했는지 count변수
		int total = 0; //총합
		int count = 0; // 몇번 입력했는지 횟수 저장
		while(true){
			System.out.println("정수 입력 >>");
			int num = Integer.parseInt(sc.nextLine());	//입력
			System.out.println(num);	//출력
			if(num == -1) {	// -1인지 체크해서 : 종료시점
				System.out.println("종료");
				break;	//while문 종료				
			}
			total += num;	// 입력받은 수 누적시키기
			count++;		// 카운트 1 올리기
		}
		System.out.println("총합 : " + total);
		if(count == 0) {//시작과 동시에 바로 -1 입력했을때 == count ==0
			System.out.println("숫자 입력이 안되어 평균을 구할 수 없습니다.");
		}else {
			System.out.println("평균 : " +(double)total / count);	//-1을 쓰면 오류가남
		}
		
	*/

		
		//문제9. 문자열을 계속 입력받고 출력하되,
		//		"exit"를 입력받으면 종료되는 프로그램
		//		힌트 : 문자열 비교는 == 불가, String의 기능중 .equals() 사용
		//		String str = "abc";
		//		System.our.println(str.equals("abc")); ==> true 출력
		
			/*
		while(true) {
			System.out.println("문자열 입력 >>");
			String str = sc.nextLine();
			System.out.println(">>" + str);
			if(str.equals("exit")) {
				System.out.println("while문 종료!!!");
				break;
			}
		}
		
		
		
		
		
		
		*/
		
		sc.close();
		
	}

}
