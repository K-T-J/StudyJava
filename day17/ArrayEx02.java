package day17;

import java.util.ArrayList;

public class ArrayEx02 {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(2,100);
		
		//모든 방에 접근해서 요소 꺼내 출력
		for(int i = 0; i< arr.size(); i++) {
			int n = arr.get(i);
			System.out.println(n);
		}
		
		//arrayList의 모든 정수를 다한 총합
		int sum = 0;
		for(int i =0; i< arr.size(); i++) {//arr.length;
			sum += arr.get(i);//arr[i[
		}
		System.out.println("총합 : " + sum);
		
		
		
	}
}
