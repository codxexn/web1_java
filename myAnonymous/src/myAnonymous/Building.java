package myAnonymous;

public class Building {
	public static void main(String[] args) {
		// Starbucks Ŭ������ ��� �޼ҵ带 �������� ������ ����� �Ϸ��� Starbucks�� ��ü ����
		Starbucks gangnam = new Starbucks();
		
		// ��ü.��ϸ޼ҵ� ���(���ᳪ����� ���ϴ� �������� Form Ÿ������ ��ü ����)
		// ��ȸ������ �ް� ������ ������ �̸� �������� �ʰ� �͸� ���� Ŭ������ ����
		// ��ȸ������ Form �������̽��� �߻�޼ҵ带 �������ش�.
		gangnam.register(new Form() {

			@Override
			public String[] getMenu() {
				return new String[] { "�Ƹ޸�ī��", "ī���", "���̵�", "��ī����" };
			}
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenu();
				// getMenu() �޼ҵ�� ������� �޴� String �迭�� menus �� �־��ش�.

				for (int i = 0; i < menus.length; i++) {
					if (menus[i].equals(menu)) {
						System.out.println(menus[i] + " �Ǹ� �Ϸ�");
						break;
					}
				}
			}

		});

		
//	      ����� ����
//	      ���ᳪ�� �����
		
		// ���ᳪ�� ������̶� ��ü�� FormAdapter �� �־��ش�.
		// sell �޼ҵ忡���� �ǸŹ���� �������� �ʰ�
		// ���ᳪ����� �����̶�� �޽����� ����ϰ� �Ǳ� ������ sell �޼ҵ�� ������ ������ �ʴ´�.
		
		Starbucks jamsil = new Starbucks();
		
		// �̰� ���� register �޼ҵ��� ��ü�� ��ȸ���̱� ������ �̸��� ������ �ʰ�
		// �͸� ���� Ŭ������ �������ش�.
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"�Ƹ޸�ī��", "�÷�ȭ��Ʈ", "���ν����", "��������"};
			}
		});

	}
}
