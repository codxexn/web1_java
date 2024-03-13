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
		
		// offset 은 시작점
		// 배열은 첫번째 주소를 가지고 + 를 하는데
		// 클래스는 애초에 시작점을 다르게 둔다.
		// 따라서, offset 이라는 것은 어떤 주소부터 읽을지에 대한 주소값
		// default 는 처음 시작값
		// 무언가를 찾을 때 가까운 것부터 찾는다.
		// 자식부터 찾기 때문에 offset 기본값은 자식 클래스 시작값이고
		// super 와 자식 객체를 출력하면 주소값이 똑같이 나온다.
		// 그래서 super. 이라고 하면 그 super의 오프셋으로 시작점을 가지고 찾는다.(?)
		
	}
}
