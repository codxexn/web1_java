package operTest;

import java.util.Scanner;

public class Oper4_solve {
	public static void main(String[] args) {
		
		double height = 0.0;
		Scanner sc = new Scanner(System.in);
		String message = "Ű : ", format = null;
		boolean isInteger = false;
		
		System.out.print(message);
		height = sc. nextDouble();
		
		isInteger = height - (int)height == 0;
		
		format = isInteger ? "%.0fcm" : "%.2fcm";
		format += "\n";
		
		System.out.printf(format, height);
	}
}
