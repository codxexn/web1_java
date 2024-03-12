package variableTest;

public class FormatTest {

	public static void main(String[] args) {
		String name = "이도은";
		int age = 20;
		double height = 168.7;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n", age);
		System.out.printf("키 : %.1fcm", height);	// 반올림
		
	}
}
