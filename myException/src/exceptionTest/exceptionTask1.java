package exceptionTest;

import java.util.Arrays;
import java.util.Scanner;

public class exceptionTask1 {
// 5개 정수만 입력받기
//	- 무한 입력 받기 상태로 구현
//	- q 입력시 나가기
//	- 각 정수는 배열에 담기
//	- if 는 딱 한번만

	// alt + shift + z : 영역 단축키(영역을 잡고 사용해야 한다.)

	public static void main(String[] args) {

		int[] arData = new int[5];

		Scanner sc = new Scanner(System.in);
		String message = "번째 정수 : ", temp = null;

		int count = 0;
		while (true) {
			count++;
			try {
				System.out.print(count + message);
				temp = sc.next();
				if (temp.equals("q")) {break;}
				arData[count - 1] = Integer.parseInt(temp);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5번째 값까지만 입력이 가능합니다.");
				System.out.println("입력하신 값" + Arrays.toString(arData));
				break;
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력 가능합니다.");
				count--;
			} catch (Exception e) {
				System.out.println("알 수 없는 오류입니다.");
				count--;
			}

		}
	}

}
