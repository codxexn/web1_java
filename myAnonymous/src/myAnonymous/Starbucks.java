package myAnonymous;

public class Starbucks extends FormAdapter{
	// FormAdapter �� ��ӹ��� Starbucks Ŭ����
	// ��� �޼ҵ� �����
	// �Ű������� Form Ÿ��(Form �� FormAdapter �� �θ��̹Ƿ� FormAdapter Ÿ�Ե� �Ű����� ��������)
   public void register(Form form) {
	   // �Ű������� Form �̱� ������ Form �ȿ� �ִ� �޼ҵ带 ����� �� �ִ�.
	   // ���� getMenu() �޼ҵ带 ����ؼ� �޾ƿ� String �迭 �޴�����
	   // menu �迭�� �ִ´�.
	   // �׸��� �ݺ����� ������ i.�޴��� �� ����ϴ� �޼ҵ�
	   
      String[] menu = form.getMenu();
      for (int i = 0; i < menu.length; i++) {
         System.out.println(i + 1 + "." + menu[i]);
      }
      
//      ���ᳪ�� ��� ���̶��, "���ᳪ�� ��� ����" ���
//      ���ᳪ�� ��� ���� �ƴ϶��, �Ǹ� ��� ����
      
      // ���� register �� �־��� �Ű� ������ FormAdapter ���~
      // ���ᳪ�� ��縦 ���� �ʴ� ������ Form���� �Ű������� �־ �ǸŹ���� ���� �ް�
      // ���ᳪ�� ��縦 �ϴ� ������ FormAdapter �� �Ű������� �־ ��ü �˻縦 �� ��
      // �ǸŹ���� ���� ���� �ʰ� ���ᳪ�� ��縦 �����ϴ� �޼����� ����ϴ� �޼ҵ��̴�.
      
      if (form instanceof FormAdapter) {
    	  System.out.println("���ᳪ����� ����");
      } else {form.sell("ī���");
      }
   }
}