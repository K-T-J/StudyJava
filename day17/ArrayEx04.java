package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx04 {
	public static void main(String[] args) {

		// 이름을 4개 입력받아 ArrayList에 저장 (영문이름으로)
		
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("이름 >>");
			String name = sc.nextLine();
			arr.add(name);//add
		}
		
		for(int i = 0; i< arr.size(); i++) {//size
			String s = arr.get(i);
			System.out.println("name : " + s);
		}
		
		// 모두 출력한 후, 제일 긴 이름을 출력하세요. (영문이름으로)
		int max = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(max).length() < arr.get(i).length()) {
				max = i;
			}
		}
		
		System.out.println("가장 긴 이름은 : " + arr.get(max));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
