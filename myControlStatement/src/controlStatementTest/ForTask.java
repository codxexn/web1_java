package controlStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
	
//      브론즈
//      1~100까지 출력
//      100~1까지 출력
//      1~100까지 중 짝수만 출력
		
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
//      실버
//      1~10까지 합 출력
//      1~n까지 합 출력
		
		int plus1 = 0;
		
		for(int i = 0; i < 10; i ++) {
			plus1 += i + 1;
		}
		System.out.println("1부터 10까지 합 : " + plus1);
		
		System.out.println();
		System.out.println("--------------");
		
		int plus2 = 0;
		int n = 0;
		String message = "정수를 입력하시오. >> ";
		
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		n = sc.nextInt();
		
		for (int i = 0; i < n + 1 ; i++) {
			plus2 += i;
		}
		System.out.println("1부터 입력하신 정수까지의 합 : " + plus2);
		
		System.out.println();
		System.out.println("--------------");
		
//      골드
//      A~F까지 출력
//      A~F까지 중 C제외하고 출력
		
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
      
//      다이아
//      012340123401234 출력
//      aBcDeF...Z출력
		
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
