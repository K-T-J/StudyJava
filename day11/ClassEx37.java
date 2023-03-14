package day11;

class Book2{
	String title = "";	//4번
	String author = "";
	
	
	Book2(){ // 아무것도 안써도 자동으로 나온다.
		this("무제","작자미상"); //2번   다른생성자 호출 : 매개변수 2개던짐, 매개변수 2개 호출
		System.out.println("생성자 호출");//두번쨰 호출
		
	}
	Book2(String title){
		this(title,"작자미상"); // (String,String) 형태의 생성자를 호출
		//this라고 부르는 애는 항상 첫번째 실행
		//생성자 안에서 다른 메서드를 부를때 *3번쨰거 호출
		System.out.println("생성자2  호출");
		
		//this.title = title;
		//this.author = "작자미상";
	}
	Book2(String title, String author){ //3번 날부른 2번으로 다시 간다
		System.out.println("생성자3 호출"); //첫번쨰 호출
		this.title = title;//저장 
		this.author = author;// 저장
	}
	
	void show() {
		//this("hello","test"); 생성자 안에서만 사용
		System.out.println(title + "  " + author); //5번 저장된값 출력
	}
}


public class ClassEx37 {
	public static void main(String[] args) {
		
		Book2 b = new Book2(); //1번
		//this는 new 해서 부른 객체 1개에 적용
		
		b.show();//4번
		
		
		
		
		
		
		

	}

}
