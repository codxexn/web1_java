package classTest;

class Market{				// 상점 클래스
	
	String productName;		// 상품명
	int productPrice;		// 상품가격
	int productStock;		// 상품재고
	
	public Market() {;}		// 기본 생성자
	
	public Market(String productName, int productPrice, int productStock) {	// 초기화 생성자
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
	
	String name;			// 고객명
	String phoneNumber;		// 휴대폰 번호
	int account;			// 잔고
	int discountRate;		// 할인률
		
	public Customer() {;}	// 기본 생성자
	
	public Customer(String name, String phoneNumber, int account, int discountRate) {	// 초기화 생성자
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = account;
		this.discountRate = discountRate;
	}

}

public class ClassTask3Review {
	public static void main(String[] args) {
		
		Market lotteMart = new Market("제로사이다", 790, 1000);
		
		Customer zeus = new Customer("제우스", "01012341111", 1000, 10);
		
		lotteMart.sell(zeus);
		
		System.out.println( lotteMart.productName + " " + lotteMart.productStock + "개 남음" );
		System.out.println( zeus.name + " 잔액 : " + zeus.account + "원 남음" );
		
		
	}
}
