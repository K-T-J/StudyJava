package day11;
//캡슐화 활용

class Person1{
	private int age = 10;
	public void setAge(int age) {
		if(age > 0 && age < 130) { //만약에 나이가 0보다 크고 130보다 작을때
			this.age = age;	//age 변수를 age 인스턴스 변수에 덮어씌우겠다.
		}else {//만약 나이가 안맞으면 아래 출력
			System.out.println("나이가 이상해요");
		}
	}
	
	public int getAge() {
		return age;
	}
}




public class ClassEx42 {

	public static void main(String[] args) {

		Person1 p = new Person1();
		
		p.setAge(30);
		System.out.println(" 나이는 : " + p.getAge());
		
	}

}
