package classTest;

//�ִ밪�� �ּҰ� ���ϴ� �޼ҵ� ����
//
//��� Ŭ������ ���� �ִ밪 �ּҰ� �޼ҵ�� ���� ���� ������ �Ű� ������ �ޱ�?
//	�ִ밪
//	�ּҰ�

//Ŭ������ ������ ��
//�� �ʵ带 ���� �����Ͽ� ���ϴ� ��ġ�� ����� ��
	
//�迭�� ������ ��
//��� �����͸� ������� ����� ��
	


class Result {				// ��� Ŭ����
	int max;				// �ʵ� 
	int min;
	
	public Result() {;}		// �⺻ ������

	public Result(int max, int min) {	// �ʱ�ȭ ������
		super();
		this.max = max;
		this.min = min;
	}
	
}

public class ClassTask4Review {
	
	Result getMaxAndMIn(int[] arData) {						
		// ��� Ŭ���� Ÿ������ ��ȯ���ִ� �޼ҵ�, �Ű������� int �迭
		Result result = new Result(arData[0], arData[0]);	
		// �޼ҵ� �����ϸ� Result ��ü �����ϰ� �Ű������� ����� �迭�� 0��° ���� �־��ش�.
		
		for (int i = 1; i < arData.length; i++) {	// �ִ밪, �ּҰ� �����ִ� �ݺ���
			if(result.max < arData[i]) {			// ������ ������� Result Ÿ�� ��ü�� �ʵ忡 �־���
				result.max = arData[i];
			}
			if(result.min > arData[i]) {
				result.min = arData[i];
			}
		}
		return result;								// �׸��� �޼ҵ� ���ϰ��� �� Result Ÿ�� ��ü�� �ּҰ�
	}
	
	public static void main(String[] args) {
		
		ClassTask4Review ct4 = new ClassTask4Review();	// �ִ밪, �ּҰ� ������ִ� �޼ҵ� ���� Ŭ���� ����
		int[] arData = {2, 56, 384, 48, 20};			// �޼ҵ� �Ű������� �迭 ���� �� �ʱ�ȭ
		
		
		
		Result result = ct4.getMaxAndMIn(arData);		
		// Result Ÿ���� ��ü�� ���� �ڿ� �����ڰ� ���;� �ϴµ�
		// ������ new Result(); �� ��� �� ��ü�� �ּҰ����� ���� �Ѵ�.
		// �׷��� �ִ밪, �ּҰ� ������ִ� �޼ҵ带 ���� Ŭ������ ������ �ؼ� 
		// �迭 �Ű������� ���� �޼ҵ带 ����ϸ� ���ϰ��� Result Ÿ�� ��ü�� �ּҰ��̱� ������
		// main ���� ������� ���� result �ڿ� �޼ҵ� ���ϰ��� ���� ����
		// new Result();ó�� ��üȭ �� ���̳� ���������̴�.
		// ���� ��ü�� ��������� ������ �Ʒ����� �� ��ü�� �ʵ忡 ������ �ؼ� ���� �ҷ��� �� �ִ�.
		
		System.out.println("�ִ밪 : " + result.max);
		System.out.println("�ּҰ� : " + result.min);
		
	}
}
