package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
		
		// 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
		// 대문자는 모두 소문자로 변경한다.
		
		
		String message = "문자열 입력 >> ";
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
		
		// null 과 ""
		// null : 아래에서 대입 연산자를 사용할 때, 다른 값으로 대체할 때
		// "" : 아래에서 다른 문자열과 연결할 때, 다른 값이 누적 연결될 때
		
		// 정수를 한글로 변경
		
//		String korean = "공일이삼사오육칠팔구";
//		String message1 = "한글로 변환하고 싶은 정수를 입력하시오. >> ", result1 = "";
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
