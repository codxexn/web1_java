package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.println(name + "�� ȯ���մϴ�.");
		
		
//		String firstName = null, lastName = null;
//		lastName = sc.next();
//		firstName = sc.next();
//		name = lastName + firstName;
//		name = sc.next();
		
		// ����ڰ� �Է��� ���ڿ� ������ ���� �Ѵ�.
		
		sc.close();
	}
}
