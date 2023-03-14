package day17;

import java.util.Vector;

public class VecEx01 {
	public static void main(String[] args) {

		//Vector
		
		Vector<Integer> v = new Vector<Integer>();
		
		
		v.add(10);
		v.add(100);
		v.add(1000);
		v.add(2, null);//null 2번인덱스에 넣기
		
		System.out.println(v);
		
		System.out.println(v.get(2));
		
		v.remove(new Integer(10));//10지우기
		System.out.println(v);
		
		
		System.out.println(v.size());//크기
		
		for(int i = 0; i < v.size(); i++){//모두 꺼내기
			System.out.println(v.get(i));
		}		
		
	}
}
