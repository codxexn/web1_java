package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		
//		3개의 정수를 한 번에 입력받은 후
//      세 정수의 곱셈 출력
//      next()만 사용.
		
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
		String message = "3가지 정수를 입력하시오. >> ", exampleMessage = "예)1 3 5";
		String format = "%d * %d * %d = %d\n";
		
		System.out.print(message);
		System.out.print(exampleMessage);
		number1 = Integer.parseInt(sc.next());
		number2 = Integer.parseInt(sc.next());
		number3 = Integer.parseInt(sc.next());
		
		result = number1 * number2 * number3;
		
		System.out.printf(format, number1, number2, number3, result);
		
		sc.close();
	}
}
