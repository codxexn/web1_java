package synchronizedTest;

public class CU {
	public static void main(String[] args) {
		// �ڿ��� �ϳ�
		ATM atm = new ATM();
		
		// ������ �ΰ�
		Thread mom = new Thread(atm, "����");
		Thread daughter = new Thread(atm, "��");
		
		mom.start();
		daughter.start();
		
		// ��Ƽ ȯ�濡�� �� �κи� ���Ϸ� �ٲ��ִ� ��: ����ȭ: synchronized
//		����ȭ�� ����ϸ�, �ϳ��� ������ �۾� ������ ���� �����尡 ���۵ȴ�.
//		�ڿ� ������ ������ �ǳʶٴ� ��츦 ������ �� �ִ�.
//		����ȭ: ����/ �񵿱�: ��Ƽ -> 14�к��� �ٽ� ����!


	}
}
