package exceptionTest;

import java.util.Arrays;
import java.util.Scanner;

public class exceptionTask1 {
// 5�� ������ �Է¹ޱ�
//	- ���� �Է� �ޱ� ���·� ����
//	- q �Է½� ������
//	- �� ������ �迭�� ���
//	- if �� �� �ѹ���

	// alt + shift + z : ���� ����Ű(������ ��� ����ؾ� �Ѵ�.)

	public static void main(String[] args) {

		int[] arData = new int[5];

		Scanner sc = new Scanner(System.in);
		String message = "��° ���� : ", temp = null;

		int count = 0;
		while (true) {
			count++;
			try {
				System.out.print(count + message);
				temp = sc.next();
				if (temp.equals("q")) {break;}
				arData[count - 1] = Integer.parseInt(temp);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5��° �������� �Է��� �����մϴ�.");
				System.out.println("�Է��Ͻ� ��" + Arrays.toString(arData));
				break;
			} catch (NumberFormatException e) {
				System.out.println("������ �Է� �����մϴ�.");
				count--;
			} catch (Exception e) {
				System.out.println("�� �� ���� �����Դϴ�.");
				count--;
			}

		}
	}

}
