package abstractTest;

public class WashingMachine extends Electronics {

	@Override
	public void on() {
		System.out.println("�о ���� ��");
	}

	@Override
	public void off() {
		System.out.println("��ܼ� ���� ��");
	}

	public static void main(String[] args) {
		
		WashingMachine tromm = new WashingMachine();
		
		tromm.safe();
		tromm.on();
		tromm.off();
	}
	
}
