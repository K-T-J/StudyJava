package day20;

class TimeRunnable implements Runnable{
	int n = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);
			}catch(Exception e) {e.printStackTrace(); return;}
		}
	}
}


public class TreadEx03 {
	public static void main(String[] args) {

		
		Thread th = new Thread(new TimeRunnable());
		th.start();
		
		
		
		
	}
}
