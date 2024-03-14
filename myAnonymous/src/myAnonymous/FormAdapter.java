package myAnonymous;

public class FormAdapter implements Form {

	@Override
	public String[] getMenu() {
		return new String[] {};
	}

	@Override
	public void sell(String menu) {;}
	
}

//	인터페이스를 implements 해서 내용 없는 메소드로 구현함
//	이 Adapter 를 extends 하면 이 추상메소드들을 골라서 구현 가능
