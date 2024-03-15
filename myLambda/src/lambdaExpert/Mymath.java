package lambdaExpert;

import java.util.Scanner;

public class Mymath {
	// ������ 1���� ���޹޾Ƽ� �˸°� �����ϵ��� ���ٽ� ����
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
		// ����ڰ� ���� �Է�
		
		
		
		// ��ü ���Ŀ��� �����ڸ� �и��ϴ� �޼ҵ� ����
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
		
	String message = "������ �Է��Ͻÿ�.\n", exampleMessage = "��)9+5-7";
	String expression = null;
	String[] numbers = null, opers = null;
	int number1 = 0, number2 = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println(message + exampleMessage);
	expression = sc.nextLine();
	expression = expression.trim();
	expression = expression.replaceAll(" ", "");
	
	numbers = expression.split("\\+|\\-");	// ���� �и�
	opers = operCheck.getOpers(expression);	// ������ �и�
		
	number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
		for (int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;}
			number2 = Integer.parseInt(numbers[i + 1]);
			number1 = Mymath.calculator(opers[i]).calc(number1, number2);
		}
		
	System.out.println(number1);
		
	}
}
