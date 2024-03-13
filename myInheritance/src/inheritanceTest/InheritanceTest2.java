package inheritanceTest;

class Human {
	String name;
	
	public Human() {;}
	
	public Human(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println("먹기");
	}
	
	void sleep() {
		System.out.println("잠자기");
	}
	
	void walk() {
		System.out.println("두발로 걷기");
	}
	
}

class Monkey extends Human {
	
	// 부모클래스에 기본 생성자가 없고 초기화 생성자만 있으면
	// 부모클래스는 매개변수를 받아야만 만들어지기 때문에
	// 구현이 되지 않아서 메모리에 올라가지를 못한다.
	// 따라서 자식클래스의 생성자를 만들면 부모 생성자부터 만들어지기 때문에
	// 클래스는 무조건 기본 생성자를 만들어주도록 한다.
	
	public Monkey() {;}

	@Override
	void walk() {
		super.walk();
		System.out.println("네발로도 걷기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		
		Monkey kingkong = new Monkey();
		kingkong.walk();
		
//		 메소드도 저장공간이다!
//		 text라는 메모리 영역에 상수, 소스코드가 저장되는 영역
//		 메소드 안에 작성한 코드가 text 영역에 할당이 되고 주소가 생긴다.
//		 그리고 메소드명의 저장공간이 생기고 그 주소값이 들어간다.
		 
//		 + 메소드를 메소드 밖 영역에서 작성하고 메인 메소드에서 실행할 때
//		 다시 작성한 영역으로 가서 읽고 돌아오는 것이 아니라
//		 그 메소드가 저장된 저장공간으로 가서 주소값을 읽은 후
//		 text 영역의 그 주소로 찾아가서 읽고 돌아오는 것
		 
//		 + 메소드에 리턴이 있으면 주소값에서 리턴값으로 바뀌게 된다.
//		 따라서 리턴이 있는 메소드는 메소드 자체를 리턴값으로 보면 된다는 것이다.
//		 그래서 메소드는 아무튼 주소값, 리턴값을 담는 저장공간인 것이다.
		
//		+ 자식이 부모의 메소드를 오버라이드 하면
//		부모 메소드의 저장공간과 자식 메소드의 저장공간이 따로 생기지만
//		같은 이름이므로 부모 메소드 저장공간에 자식 메소드의 주소값이 들어가게 된다.
//		그래서 철저히 부모 메소드는 무시가 된다는 의미해서 override(재정의)가 된다.
		 
//		 Q. 그럼 walk(); 이것의 저장공간이 생기는 게 아니라
//		 monkey.walk(); 라는 것의 저장공간이 생기고
//		 밑에서 또 사용하면 또 생기는 건가?
				 
				 
		
		
	}
}
















