package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = 0;	
		int number2 = 0;
		int result = 0;
		
		// ���� �ΰ��� ���� ����� ���� int�� ���� ���� �� �ʱ�ȭ
		
		System.out.print("���� �ΰ��� �Է��Ͻÿ�. >> ");
		number1 = Integer.parseInt(sc.next());	// �Է��� ù��° ���ڿ� ���� int�� ����ȯ�ؼ� number1�� ���
		number2 = Integer.parseInt(sc.next());	// �Է��� ù��° ���ڿ� ���� int�� ����ȯ�ؼ� number2�� ���
		result = number1 + number2;				// result�� �� ������ ���� ���� ���
		
		System.out.println(result);				// result ���
		
		sc.close();
	}
}
