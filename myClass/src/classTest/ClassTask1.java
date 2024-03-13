package classTest;

import java.util.Scanner;

class SuperCar {
	// �귣��
	String brand;
	// ����
	String color;
	// ����
	long price;
	// ����
	boolean engine;
	// ��й�ȣ
	String pw;
	// �˻� ī��Ʈ
	int pwErrorCount;

	// static ��� : � �����ڵ� ���� ������ ȣ��� ���� ����Ǵ� �ڵ�
	{
		System.out.println("��� ���ϵ帳�ϴ�.");
	}

	// �ʱ�ȭ ��� : � �����ڰ� ȣ��ǵ� ����Ǵ� �ڵ�
	{
		this.pw = "0000";
	}

	// �⺻ ������
	public SuperCar() {
		;
	}

	// �ʱ�ȭ ������
	public SuperCar(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public SuperCar(String brand, String color, long price, String pw) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pw = pw;
	}

	// �õ��ѱ�
//	boolean engineStart() {
//		if(!engine) {
//			engine = true;
//			return true;
//		}
//		return false;
//	}

	void engineStart() {
		engine = true;
	}

	// ����ڰ� �Է��� ��й�ȣ�� ���� ������ �õ� �ѱ�
	// ���� 3ȸ ���н� ���� �⵿

	// ��й�ȣ �˻� �޼ҵ�

	boolean pwCheck(String pw) {
		return this.pw.equals(pw);
	}

	// �õ�����
	void engineStop() {
		engine = false;

	}
}

public class ClassTask1 {
	public static void main(String[] args) {

		SuperCar rambo = new SuperCar("ramborghini", "red", 700_000_000, "7777");

		String message = "1. �õ��ѱ�\n2. �õ�����";
		int choice = 0;
		String pw = null;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(message);
			choice = sc.nextInt();
			if (choice == 1) {
				if (!rambo.engine) {
					System.out.print("��й�ȣ : ");
					pw = sc.next();
					if (pw.equals(rambo.pw)) {
						rambo.pwErrorCount = 0;
						rambo.engineStart();
						System.out.println(rambo.brand + " �õ� ����");
					} else if (!pw.equals(rambo.pw)) {
						++rambo.pwErrorCount;
						if (rambo.pwErrorCount > 2) {
							System.out.println("���� �⵿");
							break;
						}
					}
				} else {
					System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
				}
			} else if (choice == 2) {
				if (rambo.engine) {
					rambo.engineStop();
					System.out.println(rambo.brand + " �õ� ����");
				} else {
					System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
				}
			} else {
				System.out.println("�ٽ� �Է����ֽñ� �ٶ��ϴ�.");
			}

		}
	}
}
