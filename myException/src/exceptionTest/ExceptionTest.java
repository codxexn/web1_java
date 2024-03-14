package exceptionTest;

/*
 * 오류가 발생했다는 건 오류 객체가 메모리에 할당됐다는 것
 * 즉, 생성자가 호출됐다는 뜻
 * 오류가 발생하면 메모리에 필드가 생기고 오류가 발생한 곳으로 주소값이 날라온다.
 * 근데 그 주소값을 받을 공간이 없으면 프로그램이 강제 종료된다.
 * 따라서 Exception 뒤에 만들어준 객체명 e의 공간에 그 주소값이 담긴다.
 * 그래서 담긴 주소값으로 그 필드에 다시 접근할 수 있게 된다.
 * 
 * 예외 발생시킬 때
 * throw new ArithmeticException();
 * 생성자 호출했는데 값을 담을 객체가 없어서 바로 오류가 나게 됨
 * 
 * catch로 잡지 못한 오류들이 생기게 돼도 실행해야 하는 문장은
 * catch 마지막에 finally 영역에 문장을 써준다.
 * 강제종료가 돼도 그 전에 무조건 실행됨
 * 
 */

public class ExceptionTest {
	public static void main(String[] args) {
		int[] arData = new int[5];
		try {
		System.out.println(arData[5]);
		System.out.println("성공!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실패..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


	