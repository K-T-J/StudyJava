package day19;

//#1 스레드 클래스 만들기 (상속)

class TimerThread extends Thread{
	
	int n = 0;
	//#2. run 메서드 오버라이딩 : 우리가 만드는 일꾼이 할일 작성
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
			sleep(1000);//1초에 번씩
			}catch(Exception e) {
				e.printStackTrace();
				return;
			}//try
		}//while
	}//run
}//class


public class ThreadEx01 {
	public static void main(String[] args) {

		//#3. 스레드 객체생성
		TimerThread th = new TimerThread();
		
		//#4. 스레드 시작!
		th.start();
		
		
		
		
		
	}
}
