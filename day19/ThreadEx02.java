package day19;

class ThreadEx extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
		System.out.println("run");
		}
		//while(true)<-- 무한반복 조심
	}
}



public class ThreadEx02 {
	public static void main(String[] args) {
		
		ThreadEx th1 = new ThreadEx();
		ThreadEx th2 = new ThreadEx();
		th1.start(); //<-- start하면 main과 thread가 같이 실행
		th2.start(); //<-- start하면 main과 thread가 같이 실행
		//th.run(); //<-- 이렇게하면 run먼저 실행되고 mmm실행된다
		
		
		for(int i =0; i < 100; i++) { //main + thread
			System.out.println("mmm");
		}
		System.out.println("main 종료");
		

	}
}
