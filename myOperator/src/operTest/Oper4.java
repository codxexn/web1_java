package operTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް� 
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		���� �����ڸ� ���!
		
		String height = null;
		String message = "Ű(����)�� �Է��Ͻÿ�. >> ";
		boolean isDouble = false;
		char check = ' ';
		double result1 = 0.0;
		int result2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(message);
		height = sc.next();
		
		
		for(int i = 0; i < height.length(); i++) {		// height ���̸�ŭ �ݺ�
			check = height.charAt(i);					// height 0��° ���ں��� check�� ���
			if (check == '.') {							// ���� check�� ��� ���� '.'(�Ҽ���) �� ���ٸ�
				isDouble = true;						// isDouble �� true ���
				break;									// �׸��� �׸�~
			} 
		}
		
		System.out.println(isDouble);					// �Ҽ��� ���ο� ���� isDouble�� ���� �� ������ Ȯ��
		
		if (isDouble == true) {							// ���� isDouble�� true��� (height�� �Ҽ����� �־��ٸ�)
			result1 = Double.parseDouble(height);		// result1 �� height�� double Ÿ������ ��ȯ�ؼ� ���
		} else result2 = Integer.parseInt(height);		// isDouble�� false ��� result2 �� height�� int Ÿ������ ��ȯ�ؼ� ���
		
		System.out.println(isDouble);					// ���� �����ڿ��� result2�� �Ǽ��� ���ͼ� isDouble �� Ȯ��
		System.out.println(result1);					// ���� �����ڿ��� result2�� �Ǽ��� ���ͼ� result1 �� Ȯ��
		System.out.println(result2);					// ���� �����ڿ��� result2�� �Ǽ��� ���ͼ� result2 �� Ȯ��
		
		
		System.out.println("����� Ű(����)�� " + (isDouble ? result1 : result2) + "cm �Դϴ�.");
		
		System.out.println(result2);					// ���� �����ڿ��� result2�� �Ǽ��� ���ͼ� result2 �� �� Ȯ��
		
		sc.close();
		
		
		
	}
}
