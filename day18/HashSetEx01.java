package day18;

import java.util.HashSet;
import java.util.Set;

class Tv{
	
	
}


public class HashSetEx01 { //ex) 반 애들중에 서로 다른 성이 몇개인가? 
	public static void main(String[] args) {

		Object[] obj = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		Set set = new HashSet(); //다형성  List List - new ArrayList(); Map map = new HashMap();
		for(int i = 0; i < obj.length; i++) {
			set.add(obj[i]);
		}
		System.out.println(set);
		
		
	}
}
