package methodTest;

//1~10���� println()���� ����ϴ� �޼ҵ�
//"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
//�̸��� n�� println()���� ����ϴ� �޼ҵ�
//�� ������ �������ִ� �޼ҵ�
//�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
//1~n������ ���� �����ִ� �޼ҵ�
//Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
//���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
//���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
//5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
//�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
//5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
//String Ŭ������ indexOf()�޼ҵ� �����, ���ڿ� ��ü�� �˻��� ���ڸ� ���޹޴´�.



public class MethodTask {
	
	void print() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	void printHgd(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("ȫ�浿");
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
		String hangul = "�����̻�����ĥ�ȱ�";
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
