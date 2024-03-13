package inheritanceTest;

class A {
	String name;
	int data;
	
	public A() {
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A {
	
	public B() {;}
	
	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		
		B b = new B();
		b.printName();
		System.out.println(b);
		
		// offset �� ������
		// �迭�� ù��° �ּҸ� ������ + �� �ϴµ�
		// Ŭ������ ���ʿ� �������� �ٸ��� �д�.
		// ����, offset �̶�� ���� � �ּҺ��� �������� ���� �ּҰ�
		// default �� ó�� ���۰�
		// ���𰡸� ã�� �� ����� �ͺ��� ã�´�.
		// �ڽĺ��� ã�� ������ offset �⺻���� �ڽ� Ŭ���� ���۰��̰�
		// super �� �ڽ� ��ü�� ����ϸ� �ּҰ��� �Ȱ��� ���´�.
		// �׷��� super. �̶�� �ϸ� �� super�� ���������� �������� ������ ã�´�.(?)
		
	}
}
