package classTest;

class A {
	int data;
	
	public A(int data) {
		this.data = data;
	}
	
	public A() {;}
	
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
//		°´Ã¼È­
		A a = new A(10);
		A b = new A();
//		
//		a.data = 10;
//		
//		a.printData();
//		b.printData();
		
	}
}
