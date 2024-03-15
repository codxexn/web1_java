package synchronizedTest;

public class CU {
	public static void main(String[] args) {
		// 자원은 하나
		ATM atm = new ATM();
		
		// 쓰레드 두개
		Thread mom = new Thread(atm, "엄마");
		Thread daughter = new Thread(atm, "딸");
		
		mom.start();
		daughter.start();
		
		// 멀티 환경에서 그 부분만 단일로 바꿔주는 것: 동기화: synchronized
//		동기화를 사용하면, 하나의 쓰레드 작업 종료후 다음 쓰레드가 시작된다.
//		자원 공유시 연산을 건너뛰는 경우를 방지할 수 있다.
//		동기화: 단일/ 비동기: 멀티 -> 14분부터 다시 보기!


	}
}
