package lambdaExpert;

import java.util.Scanner;

public class Mymath {
	// 연산자 1개를 전달받아서 알맞게 연산하도록 람다식 구현
	public static Calc calculator(String oper) {
		Calc calc = null;
		
		switch (oper) {
		case "+":
			calc = (num1, num2) -> num1 + num2;
			break;
		case "-":
			calc = (num1, num2) -> num1 - num2;
			break;
		}
		return calc;
		
	}

			
	
	public static void main(String[] args) {
		// 사용자가 수식 입력
		
		
		
		// 전체 수식에서 연산자만 분리하는 메소드 구현
		OperCheck operCheck = ex -> {
		
			String temp = "";
			
		for (int i = 0; i < ex.length(); i++) {
			char c = ex.charAt(i);
			if(c == '+' || c == '-') {
				temp += c; 
			}
		}
		return temp.split("");
	};
		
	String message = "수식을 입력하시오.\n", exampleMessage = "예)9+5-7";
	String expression = null;
	String[] numbers = null, opers = null;
	int number1 = 0, number2 = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println(message + exampleMessage);
	expression = sc.nextLine();
	expression = expression.trim();
	expression = expression.replaceAll(" ", "");
	
	numbers = expression.split("\\+|\\-");	// 정수 분리
	opers = operCheck.getOpers(expression);	// 연산자 분리
		
	number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
		for (int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;}
			number2 = Integer.parseInt(numbers[i + 1]);
			number1 = Mymath.calculator(opers[i]).calc(number1, number2);
		}
		
	System.out.println(number1);
		
	}
}
