package operTest;

import java.util.Arrays;
import java.util.Scanner;

public class Oper4_1 {
	public static void main(String[] args) {
		
		String height = null;
		String message = "Ű(����)�� �Է��Ͻÿ�. >> ";
		boolean isDouble = false;
		double result1 = 0.0;
		int result2 = 0;
		char[] c;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print(message);
		height = sc.nextLine();
		c = new char[height.length()];
		
		System.out.println("������ �迭�� ���� : " + height.length());
		
		for (int i = 0; i < height.length(); i++) {
			c[i] = height.charAt(i); 
				if (c[i] == '.') {
					isDouble = true;
				}
		}
		
		if (isDouble == true) {
			result1 = Double.parseDouble(height);
		} else result2 = Integer.parseInt(height);
		
		System.out.println("����� Ű(����)�� " + (isDouble ? result1 : result2) + "cm �Դϴ�.");
		
		System.out.println("�迭�� �� �� : " + Arrays.toString(c));
		System.out.println("double ���� ��  : " + result1);
		System.out.println("int ���� ��  : " + result2);
		
		
	}
}
