package exceptionTest;

import java.util.Scanner;

public class ChattingReview {

	// 상대방한테 입력받고 바보 라는 키워드가 있으면 오류 메세지 띄우기
	
	public static void main(String[] args) {
		
		String message = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("채팅 입력 >> ");
		message = sc.nextLine();
		if(message.contains("바보")) {
		try {
			throw new BadWordsException("비속어 사용!");
			} catch (BadWordsException e) {
			System.out.println("비속어는 쓰지 맙시다, 인간적으로.");
			}
		} else {
			System.out.println(message);
		}
	}
}
