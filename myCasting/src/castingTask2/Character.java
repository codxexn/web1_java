package castingTask2;

// ��ũ�� "������ ������ϴ�." ���
// ������ "������ ������ϴ�." ���
// �ΰ� "������ ������ϴ�." ���


public class Character {
	
	public void item(Monster monster) {
		monster.get();
	}
	
	
	public void hunt(Monster monster) {		// �Ű����� �����鼭 ��ĳ���� ����
		// ��� �޼ҵ� �����
		// (�Ű������� ���� Ÿ�� : ��� �ڽ��� �θ�Ÿ���̴�. ���� Fairy, Human, Ork Ÿ���� �� �� �� �ִ�.)
		if(monster instanceof Fairy) {		// ���� �Ű������� Fairy Ÿ���̸�
			Fairy fairy = (Fairy)monster;	// �ٿ� ĳ���� ����
			fairy.get();					// �ٿ�ĳ�����ؼ� ������ Fairy Ŭ�������� �������̵� �� �޼ҵ� ���
		} else if(monster instanceof Human) {
			Human human = (Human)monster;
			human.get();
		} else if(monster instanceof Ork) {
			Ork ork = (Ork)monster;
			ork.get();
		}
	}

	
	public static void main(String[] args) {
		
//		Character a = new Character();		// hunt �޼ҵ� ����ϱ� ���� Ŭ���� ��ü �������
//		a.hunt(new Fairy());				// �Ű����� Ŭ���� Ÿ������ �־��ְ� hunt �޼ҵ� ����ϸ�
//		a.hunt(new Human());				// hunt �ȿ� �ڵ忡�� �ڵ����� �Ű����� Ŭ������ �޼ҵ带 ���
//		a.hunt(new Ork());
		
//		Character a = new Character();
//		a.item(new Monster());
//		a.item(new Fairy());
//		
//		System.out.println();
		
		
		Monster fairy = new Fairy();	// ��ĳ����
		fairy.get();
		if (fairy instanceof Fairy) {((Fairy) fairy).eat();}	// �ٿ�ĳ����
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	
}
