package day11;
//생성자
//제목과 저자를 나타내는 title과 author 변수를 가진 Book클래스를 작성하고,
//생성자를 작성하여 변수를 초기화 해보자.

class Book{
String title;
String author;

Book(String t){
	title = t;
	author = "작자미상";
}

Book(String t, String a){
	title = t;
	author = a;
}


}




public class ClassEx34 {
	public static void main(String[] args) {
		
		
		Book b = new Book("어린왕자");
		System.out.println(b.title);
		System.out.println(b.author);
		
		
		//생성자가 없으면
		/*
		Book a = new Book("");
		a.title = "어린왕자";
		a.author = "생텍쥐베리";
		System.out.println(a.title);
		System.out.println(a.author);
		
		
		
		Book kong = new Book("콩쥐팥쥐");
		System.out.println(kong.title);
		System.out.println(kong.author);
		*/
		

	}

}
