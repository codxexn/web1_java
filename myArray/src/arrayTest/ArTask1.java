package arrayTest;

import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
		
//      �����
//      1~10���� �迭�� ��� ���
		
//		int[] arInt1 = new int[10];
//		for (int i = 0; i < arInt1.length; i++) {
//			arInt1[i] = i + 1;
//		}
//		for (int i = 0; i < arInt1.length; i++) {
//			System.out.print(arInt1[i] + " ");
//		}
		
//      10~1���� �� ¦���� �迭�� ��� ���
		
//		int[] arInt2 = new int[5];
//		for (int i = 0; i < arInt2.length; i++) {
//			arInt2[i] = 10 - i * 2;
//		}
//		for (int i = 0; i < arInt2.length; i++) {
//			System.out.print(arInt2[i] + " ");
//		}
		
		
//      1~100���� �迭�� ���� �� Ȧ���� ���
		
//		int[] arInt3 = new int[100];
//		for (int i = 0; i < arInt3.length; i++) {
//			arInt3[i] = i + 1;
//		}
//		for (int i = 0; i < arInt3.length; i++) {
//			if(arInt3[i] % 2 == 0) continue;		// �ε����� Ȧ���� ���� ¦���� �� �ִ�. (i % 2 != 0)
//			System.out.println(arInt3[i]);
//		}
      
		
//      �ǹ�
//      1~100���� �迭�� ���� �� ¦���� �� ���
		
//		int sum = 0;
//		int[] arInt4 = new int[100];
//		for (int i = 0; i < arInt4.length; i++) {
//			arInt4[i] = i + 1;
//		}
//		for (int i = 0; i < arInt4.length; i++) {
//			if (arInt4[i] % 2 == 0) {
//				sum += arInt4[i];
//			}
//		}
//		System.out.println(sum);
		
//      A~F���� �迭�� ��� ���
		
//		char[] alphabet1 = new char[6];
//		for (int i = 0; i < alphabet1.length; i++) {
//			alphabet1[i] = (char)(i + 65);
//		}
//		for (int i = 0; i < alphabet1.length; i++) {
//			System.out.println(alphabet1[i]);
//		}
		
//      A~F���� �� C�����ϰ� �迭�� ���� �� ���
		
//		char[] alphabet2 = new char[5];
//		for (int i = 0; i < alphabet2.length; i++) {
//			alphabet2[i] = (char)(i + 65);
//			if(i > 1) { 
//				alphabet2[i] = (char)(i + 66);
//			}
//		}
//		for (int i = 0; i < alphabet2.length; i++) {
//			System.out.println(alphabet2[i]);
//		}
      
//      ���
//      5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
		
//		String message = "5���� ������ �Է��Ͻÿ�.\n ��)1 2 3 4 5\n >> ";
//		
//		int[] arData1 = new int[5];
//		int max = 0, min = 0;
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print(message);
//		for (int i = 0; i < arData1.length; i++) {
//			arData1[i] = sc.nextInt();
//		}
//		for (int i = 0; i < arData1.length; i++) {
//			if (arData1[i] > max) max = arData1[i];
//			min = arData1[0];
//			if (arData1[i] < min) min = arData1[i];
//		}
//		System.out.println("�ִ밪 : " + max);
//		System.out.println("�ּҰ� : " + min);
      
//      ���̾�
//      ����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		
		int[] arInput = null;
		int divide = 0;
		double average = 0;
		String message1 = "����� ���ϰ� ���� ������ ������ �Է��Ͻÿ�. >> ";
		String message2 = "����� ���ϰ� ���� ������ �Է��Ͻÿ�.\n ��) 1 2 3 4 5\n >> ";
		String format = "�Է��Ͻ� ������ ����� %.1f �Դϴ�.";
		
		System.out.print(message1);
		divide = sc.nextInt();
		arInput = new int[divide];
		
		System.out.print(message2);
		for (int i = 0; i < arInput.length; i++) {
			arInput[i] = sc.nextInt();
		}
		for (int i = 0; i < arInput.length; i++) {
			average += arInput[i];
		}
		
		average /= arInput.length;
		
		System.out.printf(format, average);
		
		sc.close();
   }
}
