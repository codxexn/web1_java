package lambdaTask;

public class PrintNameTest {
	public static void main(String[] args) {
//		�ܺο��� ���޹��� �� ��, �̸��� �޾Ƽ� ��ü �̸��� �����Ѵ�.
//		PrintName printName = new PrintName() {
//			
//			@Override
//			public String getFullName(String lastName, String firstName) {
//				return lastName + firstName;
//			}
//		};
//		
//		System.out.println(printName.getFullName("��", "����"));
		
		PrintName printName = (last, first) -> last + first;
		// printName �̶�� �Լ� �޼ҵ忡�� �޼ҵ尡 �ϳ����̹Ƿ� �̸� �� �ᵵ ��
		// (�޾ƾ� �� �Ű����� 2���� �ۼ�), Ÿ�� �Ƚᵵ �ǰ� ������ �������
		// -> ���Ŀ� ������ �ڵ� �ۼ�
		// {} �� ������ ������ return�� ���� ����
		
		System.out.println(printName.getFullName("��", "����"));
		// �޼ҵ� ���
	}
}
