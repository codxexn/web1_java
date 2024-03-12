package operTest;

import java.util.Arrays;
import java.util.Scanner;

public class Oper4_1 {
	public static void main(String[] args) {
		
		String height = null;
		String message = "키(신장)를 입력하시오. >> ";
		boolean isDouble = false;
		double result1 = 0.0;
		int result2 = 0;
		char[] c;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print(message);
		height = sc.nextLine();
		c = new char[height.length()];
		
		System.out.println("생성된 배열의 길이 : " + height.length());
		
		for (int i = 0; i < height.length(); i++) {
			c[i] = height.charAt(i); 
				if (c[i] == '.') {
					isDouble = true;
				}
		}
		
		if (isDouble == true) {
			result1 = Double.parseDouble(height);
		} else result2 = Integer.parseInt(height);
		
		System.out.println("당신의 키(신장)은 " + (isDouble ? result1 : result2) + "cm 입니다.");
		
		System.out.println("배열에 들어간 값 : " + Arrays.toString(c));
		System.out.println("double 공간 값  : " + result1);
		System.out.println("int 공간 값  : " + result2);
		
		
	}
}
