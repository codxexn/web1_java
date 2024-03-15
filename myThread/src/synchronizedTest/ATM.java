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
		// 동기화 해줘야 하는 부분만 영역 잡고 CSz -> 6:synchronized
		// mutex 자원이 있는 객체 넣어주기(자원 -> 이 클래스 내에 있으니 this 사용)
		// 코드 하나만 할 거 같으면 블록, 메소드 자체를 할 거 같으면 메소드 앞에 synchronized 입력
//		synchronized (this) {
			this.money -= money;
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
		System.out.println("현재 잔액: " + this.money + "원");
//		}
	}
}
