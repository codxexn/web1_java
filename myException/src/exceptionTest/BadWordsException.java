package exceptionTest;

// RuntimeException: �����Ϸ��� �˻����� ����(���� ���� ��Ű�� ���� �� ���)
// Exception: �����Ϸ��� �˻���(���� ���ᰡ �ƴ� �ش� ��Ȳ ó���� ���� �� ���)

public class BadWordsException extends Exception {
	
	// �ʱ�ȭ ������
	public BadWordsException(String message) {
		super(message);
	}
}
