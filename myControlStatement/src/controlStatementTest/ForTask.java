package controlStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
	
//      �����
//      1~100���� ���
//      100~1���� ���
//      1~100���� �� ¦���� ���
		
		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + "\t");
		}
		
		System.out.println();
		System.out.println("--------------");
		
		for (int i = 0; i < 100; i++) {
			System.out.print(100 - i + "\t");
		}
		
		System.out.println();
		System.out.println("--------------");
		
		for (int i = 2; i < 101; i += 2) {
			System.out.print(i + "\t");
		}
      
		System.out.println();
		System.out.println("--------------");
//      �ǹ�
//      1~10���� �� ���
//      1~n���� �� ���
		
		int plus1 = 0;
		
		for(int i = 0; i < 10; i ++) {
			plus1 += i + 1;
		}
		System.out.println("1���� 10���� �� : " + plus1);
		
		System.out.println();
		System.out.println("--------------");
		
		int plus2 = 0;
		int n = 0;
		String message = "������ �Է��Ͻÿ�. >> ";
		
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		n = sc.nextInt();
		
		for (int i = 0; i < n + 1 ; i++) {
			plus2 += i;
		}
		System.out.println("1���� �Է��Ͻ� ���������� �� : " + plus2);
		
		System.out.println();
		System.out.println("--------------");
		
//      ���
//      A~F���� ���
//      A~F���� �� C�����ϰ� ���
		
		for (int i = 0; i < 6 ; i++) {
			System.out.print((char)(i + 65));
		}
		
		System.out.println();
		System.out.println("--------------");
		
		for (int i = 0; i < 6 ; i++) {
			System.out.print((char)(i + 65));
			if (i == 1) {
				i++;
			}
		}
		System.out.println();
		System.out.println("--------------");
      
//      ���̾�
//      012340123401234 ���
//      aBcDeF...Z���
		
		String repeat = "01234";
		for (int i = 0; i < 3 ; i++) {
			System.out.print(repeat);
		}
		
		System.out.println();
		System.out.println("--------------");
		
		
		for (int i = 0; i < 26 ; i++) {
			
			if (i % 2 != 0) {
			System.out.print((char)(i + 65));
			} else if (i % 2 == 0) {
				System.out.print((char)(i + 97));
			}
		}
		
		
	
	}
}
