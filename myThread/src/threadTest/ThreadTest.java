package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		// Runnable 객체 만들어준 것
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		// 하지만 Runnable 이라서 start() 가 없다.

		// Runnable 객체를 Thread 객체의 매개변수로 넣어줌!(업캐스팅) 각각의 자원을 쓰고 있음
		Thread thread1 = new Thread(target1, "♥");
		Thread thread2 = new Thread(target2, "★");
		// thread1.setName("♥"); 으로도 이름 가능
		
		// run 을 멀티로 스케줄링 해주는 메소드
		thread1.start();
		thread2.start();
		
		// 다른 거보다 이걸 제일 먼저 해라!(먼저 하고 싶은 thread 에 사용하고 나머지는 다 대기 상태)
		try {
			thread1.join();
			thread2.join();
		} catch(InterruptedException e) {;}
		
		
		// 여기말고 join, start 위에 작성하면 main 쓰레드는 join() 보다 먼저 start() 된다.
		// 만약 join()보다 먼저 start()를 하면, join()은 무시된다.
		// 메인 쓰레드는 코드 한 줄 작성하는 순간 start() 발동
		System.out.println("메인 쓰레드 종료");
      
      
//-----------------------------------------------------------------


//      Thread1 thread1 = new Thread1("?");
//      Thread1 thread2 = new Thread1("!");
//      
//      thread1.start();
//      thread2.start();

//      thread1.run();
//      thread2.run();
	}
}
