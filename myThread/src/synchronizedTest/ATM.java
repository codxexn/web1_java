package synchronizedTest;

import java.util.Iterator;

public class ATM implements Runnable{
	
	int money = 10000;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withdraw(1000);
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
	}
	
	public synchronized void withdraw(int money) {
		// ����ȭ ����� �ϴ� �κи� ���� ��� CSz -> 6:synchronized
		// mutex �ڿ��� �ִ� ��ü �־��ֱ�(�ڿ� -> �� Ŭ���� ���� ������ this ���)
		// �ڵ� �ϳ��� �� �� ������ ���, �޼ҵ� ��ü�� �� �� ������ �޼ҵ� �տ� synchronized �Է�
//		synchronized (this) {
			this.money -= money;
		System.out.println(Thread.currentThread().getName() + "��(��)" + money + "�� ���");
		System.out.println("���� �ܾ�: " + this.money + "��");
//		}
	}
}
