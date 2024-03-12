package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.println(name + "님 환영합니다.");
		
		
//		String firstName = null, lastName = null;
//		lastName = sc.next();
//		firstName = sc.next();
//		name = lastName + firstName;
//		name = sc.next();
		
		// 사용자가 입력한 문자열 값으로 봐야 한다.
		
		sc.close();
	}
}
