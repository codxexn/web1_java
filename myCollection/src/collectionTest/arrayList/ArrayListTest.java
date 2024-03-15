package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest <T extends Number>{
	
	T data;
	
	public static void main(String[] args) {
		
//		<?> - ���׸�(generic): ��������, �̸��� ����
//							 ���� ���� � ��(�ڷ���)�� �� �� �� �� ���� ��
//							 Ÿ���� ���ϴ� ���� ��üȭ�� ��
//						��üȭ�� Ÿ���� �����ϴ� ���
//						������ ���� Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
		
//		������Ʈ�� ������ ������ �ٿ�ĳ������ ������ ����� �ϰ� �ٿ�ĳ���� Ÿ�Ե� �𸥴�.
//		������Ʈ�� ���� ������, ���׸��� ���� Ÿ���� ������ �� �� �ִ�. (T extends Object �ڽ�Ÿ��)
//		<>�� �Ⱦ��� Object�� �ȴ�.
		
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
			datas.add(10);
			datas.add(30);
			datas.add(50);
			datas.add(60);
			datas.add(20);
			datas.add(70);
			datas.add(80);
			datas.add(90);

		System.out.println(datas.size());
		try {
			System.out.println(datas.get(0));
		} catch (Exception e) {
			System.out.println("�ε��� �ȹٷ�;");
		}
		
		System.out.println("-�߰����� �� ����-");
		
		
		Collections.shuffle(datas);
		
		// �߰�(����)
		// 50 �ڿ� 500 ���� (Insert)
		// 50�� �ֱ� �ϴ�? ���� �˻��ϱ�
		if(datas.contains(50))
			try {
				datas.add(datas.indexOf(50) + 1, 500);
			} catch (Exception e) {
				System.out.println("�ε��� �ȹٷ�;");
			}
		else {
			System.out.println("ã���ô� ���� �����ϴ�.");
		}
		
		// indexOf(the first occurrence : �ߺ��� �� ������ ù��° ������ ��)
		System.out.println(datas.size());
		System.out.println(datas);
		
		System.out.println("-����-");
		// ����
		// 90�� 9�� ����
		if(datas.contains(90)) {
		datas.set(datas.indexOf(90), 9);
		System.out.println(datas.size());
		System.out.println(datas);
		
		System.out.println("-����-");
		// ����
		// 80 ����
		// 1. �ε����� ����
//		if (datas.contains(80)){
//		int deletedDate = datas.remove(datas.indexOf(80));
//		}
//		System.out.println(datas.size());
		// 2. ������ ����
		if(datas.remove(Integer.valueOf(80))) {
			System.out.println("80 ���� ����!");
		}
		
		System.out.println("------����-------");
		
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.print(datas.get(i) + " ");
//		}
		System.out.println(datas);
		
		Collections.shuffle(datas);
		System.out.println("�ڴ�� ���� shuffle : " + datas);
		
		// �������� ����
		Collections.sort(datas);
		System.out.println("�������� : " + datas);
		
		// �ݴ�� (�������� �Ϸ��� sort �� �ڿ� �Ųٷ� reverse)
		Collections.reverse(datas);
		System.out.println("�������� : " + datas);
		
		
//		C reate
//		R ead
//		U pdate
//		D elete
		
		}
	}
}
