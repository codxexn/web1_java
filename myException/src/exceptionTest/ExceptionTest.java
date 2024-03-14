package exceptionTest;

/*
 * ������ �߻��ߴٴ� �� ���� ��ü�� �޸𸮿� �Ҵ�ƴٴ� ��
 * ��, �����ڰ� ȣ��ƴٴ� ��
 * ������ �߻��ϸ� �޸𸮿� �ʵ尡 ����� ������ �߻��� ������ �ּҰ��� ����´�.
 * �ٵ� �� �ּҰ��� ���� ������ ������ ���α׷��� ���� ����ȴ�.
 * ���� Exception �ڿ� ������� ��ü�� e�� ������ �� �ּҰ��� ����.
 * �׷��� ��� �ּҰ����� �� �ʵ忡 �ٽ� ������ �� �ְ� �ȴ�.
 * 
 * ���� �߻���ų ��
 * throw new ArithmeticException();
 * ������ ȣ���ߴµ� ���� ���� ��ü�� ��� �ٷ� ������ ���� ��
 * 
 * catch�� ���� ���� �������� ����� �ŵ� �����ؾ� �ϴ� ������
 * catch �������� finally ������ ������ ���ش�.
 * �������ᰡ �ŵ� �� ���� ������ �����
 * 
 */

public class ExceptionTest {
	public static void main(String[] args) {
		int[] arData = new int[5];
		try {
		System.out.println(arData[5]);
		System.out.println("����!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


	