package interfaceTest;

	public class Tiger extends PetAdapter {
		@Override
		public void poop() {
			System.out.println("���� �˾Ƽ� �� ����.");
		}
		
		public static void main(String[] args) {
			Tiger tiger = new Tiger();
			tiger.poop();	
			tiger.sitDown();
		
		// ������ �� �޼ҵ� ����
		// tiger.sitDown();	
		// petAdapter �� �θ�Ŭ�����̹Ƿ� ����� ����������
		// �������� ������ �����Ƿ� �ƹ��͵� ������� �ʴ´�.
		
	}
}
