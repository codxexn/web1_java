package exceptionTest;

import java.util.Scanner;

public class ChattingReview {

	// �������� �Է¹ް� �ٺ� ��� Ű���尡 ������ ���� �޼��� ����
	
	public static void main(String[] args) {
		
		String message = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ä�� �Է� >> ");
		message = sc.nextLine();
		if(message.contains("�ٺ�")) {
		try {
			throw new BadWordsException("��Ӿ� ���!");
			} catch (BadWordsException e) {
			System.out.println("��Ӿ�� ���� ���ô�, �ΰ�������.");
			}
		} else {
			System.out.println(message);
		}
	}
}
