package classTest;

//최대값과 최소값 구하는 메소드 선언
//
//결과 클래스를 만들어서 최대값 최소값 메소드로 구한 것을 생성자 매개 변수로 받기?
//	최대값
//	최소값

//클래스로 리턴할 때
//각 필드를 직접 접근하여 원하는 위치에 사용할 때
	
//배열로 리턴할 때
//모든 데이터를 순서대로 사용할 때
	


class Result {				// 결과 클래스
	int max;				// 필드 
	int min;
	
	public Result() {;}		// 기본 생성자

	public Result(int max, int min) {	// 초기화 생성자
		super();
		this.max = max;
		this.min = min;
	}
	
}

public class ClassTask4Review {
	
	Result getMaxAndMIn(int[] arData) {						
		// 결과 클래스 타입으로 반환해주는 메소드, 매개변수는 int 배열
		Result result = new Result(arData[0], arData[0]);	
		// 메소드 실행하면 Result 객체 생성하고 매개변수에 담아준 배열의 0번째 값을 넣어준다.
		
		for (int i = 1; i < arData.length; i++) {	// 최대값, 최소값 구해주는 반복문
			if(result.max < arData[i]) {			// 값들은 만들어준 Result 타입 객체의 필드에 넣어줌
				result.max = arData[i];
			}
			if(result.min > arData[i]) {
				result.min = arData[i];
			}
		}
		return result;								// 그리고 메소드 리턴값은 그 Result 타입 객체의 주소값
	}
	
	public static void main(String[] args) {
		
		ClassTask4Review ct4 = new ClassTask4Review();	// 최대값, 최소값 만들어주는 메소드 가진 클래스 생성
		int[] arData = {2, 56, 384, 48, 20};			// 메소드 매개변수인 배열 선언 및 초기화
		
		
		
		Result result = ct4.getMaxAndMIn(arData);		
		// Result 타입의 객체에 원래 뒤에 생성자가 나와야 하는데
		// 생성자 new Result(); 는 사실 그 객체의 주소값으로 봐야 한다.
		// 그래서 최대값, 최소값 만들어주는 메소드를 가진 클래스에 접근을 해서 
		// 배열 매개변수를 넣은 메소드를 사용하면 리턴값이 Result 타입 객체의 주소값이기 때문에
		// main 에서 만들어준 여기 result 뒤에 메소드 리턴값을 넣은 것이
		// new Result();처럼 객체화 한 것이나 마찬가지이다.
		// 따라서 객체가 만들어졌기 때문에 아래에서 이 객체의 필드에 접근을 해서 값을 불러올 수 있다.
		
		System.out.println("최대값 : " + result.max);
		System.out.println("최소값 : " + result.min);
		
	}
}
