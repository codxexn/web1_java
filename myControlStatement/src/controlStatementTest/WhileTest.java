package controlStatementTest;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		String message = "Q. ����� �����ϴ� ���� �����ϼ���.";
		String choiceMessage = "\n 1. ������ \n 2. ����� \n 3. ������ \n 4. ��� \n 5. ������ \n";
		String resultRed = "������ : �Ұ��� �������̰� �������̴�.";
		String resultYellow = "����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String resultBlack = "������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String resultWhite = "��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String errorMessage = "�ٽ� �Է����ּ���.";
		int choice = 0;
		String result = null;
		
		while(true) {
		System.out.printf(message + choiceMessage);
		choice = sc.nextInt();
		
		if(choice == 5) {break;}
		
		switch(choice) {
		case 1 : result = resultRed; break;
		case 2 : result = resultYellow; break;
		case 3 : result = resultBlack; break;
		case 4 : result = resultWhite; break;
		default : result = errorMessage; break;
		}
		
		System.out.println("�ɸ��׽�Ʈ ����� ! \n" + result);
		
		}
		
	}
}
