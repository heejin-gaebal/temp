package practice;

public class MinusThread extends Thread{

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println("감소완료");
			Main.num--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
