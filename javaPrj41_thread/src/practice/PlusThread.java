package practice;

public class PlusThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("증가완료");
			Main.num++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
