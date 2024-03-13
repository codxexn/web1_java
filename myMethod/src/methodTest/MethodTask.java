package methodTest;

//1~10까지 println()으로 출력하는 메소드
//"홍길동"을 n번 println()으로 출력하는 메소드
//이름을 n번 println()으로 출력하는 메소드
//세 정수를 뺄셈해주는 메소드
//두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//1~n까지의 합을 구해주는 메소드
//홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
//문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
//한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
//5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
//String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달받는다.



public class MethodTask {
	
	void print() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	void printHgd(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("홍길동");
		}
	}
	
	void printNmae(int n, String name) {
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
	int sub(int number1, int number2, int number3) {
		return number1 - number2 - number3;
	}
	
	double[] divide(double number1, double number2) {
		double[] arResult = new double[2];
		arResult[0] = number1 / number2;
		arResult[1] = number1 % number2;
		return arResult;
	}
	
	int add(int end) {
		int result = 0;
		for (int i = 0; i < end; i++) {
			result += i + 1;
		}
		return result;
	}
	
	int change(int number) {
		return number += 1;
	}
	
	String changeLetter(String letter) {
		int number = letter.length();
		String result = "";
		for (int i = 0; i < number; i++) {
			char c = letter.charAt(i);
			if (c >= 65 && c <= 90) {
				result += (char)(c + 32);
			} else if (c >= 97 && c <= 122) {
				result += (char)(c - 32);
			} else { result += c;}
		}
		return result;
	}
	
	int wantLetter(String content, char want) {
		int theNumber = 0;
		int number = content.length();
		for (int i = 0; i < number; i++) {
			char c = content.charAt(i);
			if(c == want) theNumber++;
		}
		return theNumber;
	}
	
	int getValueInArray(int one, int two, int three, int four, int five, int num) {
		int[] numbers = {one, two, three, four, five};
		return numbers[num];
	}
	
	String changeLanguage(String input) {
		int number = input.length();
		String hangul = "공일이삼사오육칠팔구";
		String result = "";
		
		for (int i = 0; i < number; i++) {
			result += hangul.charAt(input.charAt(i) - 48);
			}
		return result;
		}
	
	int[] max(int one, int two, int three, int four, int five) {
		int[] input = {one, two, three, four, five}; 
		int[] result = {one, one};
		for (int i = 0; i < 5; i++) {
			if (result[i] > input[i]) {
				result[0] = input[i];
			} 
			if (result[i] < input[i]) {
				result[1] = input[i];
			}
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		MethodTask mt = new MethodTask();
		int[] hey = mt.max(1, 3, 5, 7, 9);
		System.out.println(hey[0] + ", " +  hey[1]);
	
	
	}
}
