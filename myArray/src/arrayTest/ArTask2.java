package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
		
		// ����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
		// �빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
		
		
		String message = "���ڿ� �Է� >> ";
		String input = null;
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(message);
		input = sc.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c >= 65 && c <= 90)
			{ result += (char)(c + 32); }
			else if(c >= 97 && c <= 122)
			{ result += (char)(c - 32); }
			else {result += c;}
		}
		
		System.out.println(result);
		
		// null �� ""
		// null : �Ʒ����� ���� �����ڸ� ����� ��, �ٸ� ������ ��ü�� ��
		// "" : �Ʒ����� �ٸ� ���ڿ��� ������ ��, �ٸ� ���� ���� ����� ��
		
		// ������ �ѱ۷� ����
		
//		String korean = "�����̻�����ĥ�ȱ�";
//		String message1 = "�ѱ۷� ��ȯ�ϰ� ���� ������ �Է��Ͻÿ�. >> ", result1 = "";
//		String input1 = null;
//		
//		
//	
//		
//		System.out.print(message1);
//		input1 = sc.next();
//		
//		for (int i = 0; i < input1.length(); i++) {
//			result1 += korean.charAt(input1.charAt(i) - 48);
//		}
//		
//		System.out.println(result1);
		
	}
}
