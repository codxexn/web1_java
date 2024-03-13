package arrayTest;

import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
		
//      브론즈
//      1~10까지 배열에 담고 출력
		
//		int[] arInt1 = new int[10];
//		for (int i = 0; i < arInt1.length; i++) {
//			arInt1[i] = i + 1;
//		}
//		for (int i = 0; i < arInt1.length; i++) {
//			System.out.print(arInt1[i] + " ");
//		}
		
//      10~1까지 중 짝수만 배열에 담고 출력
		
//		int[] arInt2 = new int[5];
//		for (int i = 0; i < arInt2.length; i++) {
//			arInt2[i] = 10 - i * 2;
//		}
//		for (int i = 0; i < arInt2.length; i++) {
//			System.out.print(arInt2[i] + " ");
//		}
		
		
//      1~100까지 배열에 담은 후 홀수만 출력
		
//		int[] arInt3 = new int[100];
//		for (int i = 0; i < arInt3.length; i++) {
//			arInt3[i] = i + 1;
//		}
//		for (int i = 0; i < arInt3.length; i++) {
//			if(arInt3[i] % 2 == 0) continue;		// 인덱스가 홀수면 값은 짝수가 들어가 있다. (i % 2 != 0)
//			System.out.println(arInt3[i]);
//		}
      
		
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
		
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
		
//      A~F까지 배열에 담고 출력
		
//		char[] alphabet1 = new char[6];
//		for (int i = 0; i < alphabet1.length; i++) {
//			alphabet1[i] = (char)(i + 65);
//		}
//		for (int i = 0; i < alphabet1.length; i++) {
//			System.out.println(alphabet1[i]);
//		}
		
//      A~F까지 중 C제외하고 배열에 담은 후 출력
		
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
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		
//		String message = "5개의 정수를 입력하시오.\n 예)1 2 3 4 5\n >> ";
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
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		
		int[] arInput = null;
		int divide = 0;
		double average = 0;
		String message1 = "평균을 구하고 싶은 정수의 개수를 입력하시오. >> ";
		String message2 = "평균을 구하고 싶은 정수를 입력하시오.\n 예) 1 2 3 4 5\n >> ";
		String format = "입력하신 값들의 평균은 %.1f 입니다.";
		
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
