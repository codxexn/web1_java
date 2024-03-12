package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {

//      심리 테스트, 번호로 입력받기
      /*
       * Q. 당신이 좋아하는 색을 선택하세요.
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       */

		
		// 출력 - 입력받기
		// 숫자로 입력
		
		Scanner sc = new Scanner(System.in);
		
		String message = "Q. 당신이 좋아하는 색을 선택하세요.";
		String choiceMessage = "\n 1. 빨간색 \n 2. 노란색 \n 3. 검은색 \n 4. 흰색 \n";
		String resultRed = "빨간색 : 불같고 열정적이고 적극적이다.";
		String resultYellow = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.";
		String resultBlack = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.";
		String resultWhite = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "다시 입력해주세요.";
		int choice = 0;
		String result = null;
		
		
		System.out.printf(message + choiceMessage);
		choice = sc.nextInt();
		result = choice == 1 ? resultRed : 
					choice == 2 ? resultYellow : 
						choice == 3 ? resultBlack : 
							choice == 4 ? resultWhite : errorMessage;
		System.out.println("심리테스트 결과는 ! \n" + result);
		
		

		
		
	}
}
