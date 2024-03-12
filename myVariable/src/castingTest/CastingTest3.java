package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
	System.out.println("1" + 3);		// 문자열 + 숫자 (연결) = 13
	System.out.println("1" + 3 + 8);	// 13으로 연결 + 8 연결 = 138
	System.out.println("1" + (3 + 8));	// () 최우선 연산자 먼저 = 1 + 11 연결 = 111
	
	}
}