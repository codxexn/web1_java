package interfaceTest;

	public class Tiger extends PetAdapter {
		@Override
		public void poop() {
			System.out.println("볼일 알아서 잘 본다.");
		}
		
		public static void main(String[] args) {
			Tiger tiger = new Tiger();
			tiger.poop();	
			tiger.sitDown();
		
		// 재정의 된 메소드 동작
		// tiger.sitDown();	
		// petAdapter 가 부모클래스이므로 사용은 가능하지만
		// 재정의한 내용이 없으므로 아무것도 실행되지 않는다.
		
	}
}
