package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {

//      �ɸ� �׽�Ʈ, ��ȣ�� �Է¹ޱ�
      /*
       * Q. ����� �����ϴ� ���� �����ϼ���.
       * 1. ������
       * 2. �����
       * 3. ������
       * 4. ���
       * 
       * ������ : �Ұ��� �������̰� �������̴�.
       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
       * 
       */

		
		// ��� - �Է¹ޱ�
		// ���ڷ� �Է�
		
		Scanner sc = new Scanner(System.in);
		
		String message = "Q. ����� �����ϴ� ���� �����ϼ���.";
		String choiceMessage = "\n 1. ������ \n 2. ����� \n 3. ������ \n 4. ��� \n";
		String resultRed = "������ : �Ұ��� �������̰� �������̴�.";
		String resultYellow = "����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String resultBlack = "������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String resultWhite = "��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String errorMessage = "�ٽ� �Է����ּ���.";
		int choice = 0;
		String result = null;
		
		
		System.out.printf(message + choiceMessage);
		choice = sc.nextInt();
		result = choice == 1 ? resultRed : 
					choice == 2 ? resultYellow : 
						choice == 3 ? resultBlack : 
							choice == 4 ? resultWhite : errorMessage;
		System.out.println("�ɸ��׽�Ʈ ����� ! \n" + result);
		
		

		
		
	}
}
