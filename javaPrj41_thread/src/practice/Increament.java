package practice;

public class Increament extends Thread{

	@Override
	public void run() {
		while(true) {
			Main.num++;
		}
	}
}
