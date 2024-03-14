package abstractTest;

public class WashingMachine extends Electronics {

	@Override
	public void on() {
		System.out.println("밀어서 전원 켬");
	}

	@Override
	public void off() {
		System.out.println("당겨서 전원 끔");
	}

	public static void main(String[] args) {
		
		WashingMachine tromm = new WashingMachine();
		
		tromm.safe();
		tromm.on();
		tromm.off();
	}
	
}
