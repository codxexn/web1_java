package classTest;

class Market{				// ���� Ŭ����
	
	String productName;		// ��ǰ��
	int productPrice;		// ��ǰ����
	int productStock;		// ��ǰ���
	
	public Market() {;}		// �⺻ ������
	
	public Market(String productName, int productPrice, int productStock) {	// �ʱ�ȭ ������
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
	void sell(Customer customer) {
		this.productStock--;
		customer.account -= productPrice - (productPrice * (customer.discountRate / 100));
	}

}

class Customer {
	
	String name;			// ����
	String phoneNumber;		// �޴��� ��ȣ
	int account;			// �ܰ�
	int discountRate;		// ���η�
		
	public Customer() {;}	// �⺻ ������
	
	public Customer(String name, String phoneNumber, int account, int discountRate) {	// �ʱ�ȭ ������
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = account;
		this.discountRate = discountRate;
	}

}

public class ClassTask3Review {
	public static void main(String[] args) {
		
		Market lotteMart = new Market("���λ��̴�", 790, 1000);
		
		Customer zeus = new Customer("���콺", "01012341111", 1000, 10);
		
		lotteMart.sell(zeus);
		
		System.out.println( lotteMart.productName + " " + lotteMart.productStock + "�� ����" );
		System.out.println( zeus.name + " �ܾ� : " + zeus.account + "�� ����" );
		
		
	}
}
