package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		// Runnable ��ü ������� ��
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		// ������ Runnable �̶� start() �� ����.

		// Runnable ��ü�� Thread ��ü�� �Ű������� �־���!(��ĳ����) ������ �ڿ��� ���� ����
		Thread thread1 = new Thread(target1, "��");
		Thread thread2 = new Thread(target2, "��");
		// thread1.setName("��"); ���ε� �̸� ����
		
		// run �� ��Ƽ�� �����ٸ� ���ִ� �޼ҵ�
		thread1.start();
		thread2.start();
		
		// �ٸ� �ź��� �̰� ���� ���� �ض�!(���� �ϰ� ���� thread �� ����ϰ� �������� �� ��� ����)
		try {
			thread1.join();
			thread2.join();
		} catch(InterruptedException e) {;}
		
		
		// ���⸻�� join, start ���� �ۼ��ϸ� main ������� join() ���� ���� start() �ȴ�.
		// ���� join()���� ���� start()�� �ϸ�, join()�� ���õȴ�.
		// ���� ������� �ڵ� �� �� �ۼ��ϴ� ���� start() �ߵ�
		System.out.println("���� ������ ����");
      
      
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
