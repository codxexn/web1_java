package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = 0;	
		int number2 = 0;
		int result = 0;
		
		// 정수 두개와 덧셈 결과를 담을 int형 변수 선언 및 초기화
		
		System.out.print("정수 두개를 입력하시오. >> ");
		number1 = Integer.parseInt(sc.next());	// 입력한 첫번째 문자열 값을 int로 형변환해서 number1에 담기
		number2 = Integer.parseInt(sc.next());	// 입력한 첫번째 문자열 값을 int로 형변환해서 number2에 담기
		result = number1 + number2;				// result에 두 정수를 더한 값을 담기
		
		System.out.println(result);				// result 출력
		
		sc.close();
	}
}
