package day04;
import java.util.Scanner;
public class Test24 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문제1. 369게임 : 1 ~ 99 까지의 정수를 입력받고, 
		//정수중에 3,6,9 중 하나라도 있는 경우 "박수짝" 출력
		//두개 있는 경우 "박수짝짝" 을 출력하는 프로그램을 작성하세요. 
		// # String 에서 문자한개를 char타입으로 가져오기 : .charAt(인덱스번호) 
		// ex)String str = "hello";  System.out.println(str.charAt(1)); => 'e'
		// # String 변수에 들어있는 문자열의 개수를 구하는 메서드 : .length()
		// System.out.println(str.length()); ==> 5
		
		// 1 ~ 99 까지 정수 입력받기.  -> Scanner 필요 -> 4단계 
		System.out.println("1 ~ 99 사이의 정수 한개 입력 : ");
		// 숫자인 문자열로 각 자리마다 3,6,9 포함되어있는지 확인을 위해 
		// 문자열로 입력받기 .
		String num = sc.nextLine(); 
		// 3,6,9 가 포함되지 않았을경우 입력된 숫자 출력하기 위해
		// 결과 변수 result에 입력받은 숫자 미리 저장하기
		String result = num; 
		if(num.length() == 1) { // 한자리 입력했을때 => 1자리만 비교
			if(num.charAt(0) == '3' || num.charAt(0) == '6' || num.charAt(0) == '9') {
				result = "박수짝";
			}
		}else { // 두자리 입력했을때 =>두자리 모두 비교 
			if(num.charAt(0) == '3' || num.charAt(0) == '6' || num.charAt(0) == '9') {
				result = "박수짝";
				if(num.charAt(1) == '3' || num.charAt(1) == '6' || num.charAt(1) == '9') {
					result += "짝"; // result = result + "짝";
				}
			}else if(num.charAt(1) == '3' || num.charAt(1) == '6' || num.charAt(1) == '9') {
				result = "박수짝";
			}
		}
		System.out.println(result); // 위 연산처리 후 마지막 결과만 출력 
		
		
		
		
		
		
		// 문제2. 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 
		//		오른쪽하단 모서리 두점으로 표현한다. 
		//		단, (0,0) 기준은 왼쪽 위이며, 오른쪽 아래로 갈수록 x,y가 커진다.
		//		(100,100) 과 (200,200)의 두점으로 이루어진 사각형이 있을때,
		//		Scanner를 이용하여, X, y 값을 입력받고, 
		//		점(x, y)가 이 직사각형 안에 있는지 판단하는 프로그램을 작성. 
		//		출력형태 : ( ? , ? )는 사각형안에 있습니다./없습니다.
		System.out.println("점 (x,y)의 좌표를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x >= 100 && x <= 200 && y >= 100 && y <= 200) {
			System.out.println("( "+ x + "," + y + " )는 사각형안에 있습니다.");
		}else {
			System.out.println("( "+ x + "," + y + " )는 사각형안에 없습니다.");
		}
		
		
		sc.next();
		
		//sc.close();
		
	}
}
