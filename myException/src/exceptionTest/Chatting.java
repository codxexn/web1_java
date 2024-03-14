package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String message = null;
		System.out.print("상대방에게 보내는 메시지: ");
		message = sc.nextLine();
		
		if(message.contains("바보")) {
			try {
				throw new BadWordsException("비속어 사용");
			} catch (BadWordsException e) {
				System.out.println("비속어는 사용하지 말아주세요!");
			}
		} else {
			System.out.println(message);
		}
		
	}
}
