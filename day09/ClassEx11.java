package day09;

// 계산기 클래스 : 입력값, 리턴값 모두 있는 형태

class Calc {
	//덧셈 sum, 뺄셈 sub, 곱셉 mul, 나눗셈 div
	int sum(int a,int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	double div(int a, int b) {
		if(b==0) {
			System.out.println("0은 나눌수 없습니다");
			return 0.0;
		}else {
			return(double)a / b;
		}
	}
	
}



public class ClassEx11 {
	public static void main(String[] args) {
		
		Calc num = new Calc();
		
		int i =num.sum(100, 200);
		System.out.println(i);
		//System.out.println(num.sum(100, 200)); 출력만 할거면
	
//------------------------------------------
		int j = num.sub(500, 300);
		System.out.println(j);
		
		
//---------------------------------------------
		int k = num.mul(20, 30);
		System.out.println(k);
		
//--------------------------------------------
	
		System.out.println(num.div(10,20));
		
		
		
		
	}

}
