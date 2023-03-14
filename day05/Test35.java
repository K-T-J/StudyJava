package day05;

public class Test35 {

	public static void main(String[] args) {

		//if(){if( ){  } }			if안에if 
		//while(){while( ){ } }		while 안에 while
		//for(){for( ){ } }			for안에 for
		//중첩 반복 : 반복문안에 반복문
		
		
		for(int i = 0; i<3; i++) {
			
			for(int j =0; j<3; j++) {
				
				System.out.println(i + " " + j); //밖에 for가 1번 돌떄 안에 for가 전부다 돈다
			}
		}
		
		
		
		
		
		
		
	}

}
