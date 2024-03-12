package operTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고 
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		삼항 연산자를 사용!
		
		String height = null;
		String message = "키(신장)을 입력하시오. >> ";
		boolean isDouble = false;
		char check = ' ';
		double result1 = 0.0;
		int result2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(message);
		height = sc.next();
		
		
		for(int i = 0; i < height.length(); i++) {		// height 길이만큼 반복
			check = height.charAt(i);					// height 0번째 문자부터 check에 담기
			if (check == '.') {							// 만약 check에 담긴 값이 '.'(소수점) 과 같다면
				isDouble = true;						// isDouble 에 true 담기
				break;									// 그리고 그만~
			} 
		}
		
		System.out.println(isDouble);					// 소수점 여부에 따라 isDouble에 값이 잘 담겼는지 확인
		
		if (isDouble == true) {							// 만약 isDouble이 true라면 (height에 소수점이 있었다면)
			result1 = Double.parseDouble(height);		// result1 에 height를 double 타입으로 변환해서 담기
		} else result2 = Integer.parseInt(height);		// isDouble이 false 라면 result2 에 height를 int 타입으로 변환해서 담기
		
		System.out.println(isDouble);					// 삼항 연산자에서 result2가 실수로 나와서 isDouble 값 확인
		System.out.println(result1);					// 삼항 연산자에서 result2가 실수로 나와서 result1 값 확인
		System.out.println(result2);					// 삼항 연산자에서 result2가 실수로 나와서 result2 값 확인
		
		
		System.out.println("당신의 키(신장)은 " + (isDouble ? result1 : result2) + "cm 입니다.");
		
		System.out.println(result2);					// 삼항 연산자에서 result2가 실수로 나와서 result2 값 또 확인
		
		sc.close();
		
		
		
	}
}
