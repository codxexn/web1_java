package lambdaTask;

public class PrintNameTest {
	public static void main(String[] args) {
//		외부에서 전달받은 성 씨, 이름을 받아서 전체 이름을 제작한다.
//		PrintName printName = new PrintName() {
//			
//			@Override
//			public String getFullName(String lastName, String firstName) {
//				return lastName + firstName;
//			}
//		};
//		
//		System.out.println(printName.getFullName("이", "도은"));
		
		PrintName printName = (last, first) -> last + first;
		// printName 이라는 함수 메소드에는 메소드가 하나뿐이므로 이름 안 써도 됨
		// (받아야 할 매개변수 2개를 작성), 타입 안써도 되고 변수명 마음대로
		// -> 이후에 실행할 코드 작성
		// {} 안 열었기 때문에 return도 생략 가능
		
		System.out.println(printName.getFullName("이", "도은"));
		// 메소드 사용
	}
}
