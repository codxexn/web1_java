package threadTest;

// 1번 방법: Thread 클래스 상속
public class Thread1 extends Thread {

	public String data;

	public Thread1() {
		;
	}

	public Thread1(String data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		// 자원
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
