package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	
	public boolean checkOdd (int number) {
		return number % 2 != 0;
	}
	
	public boolean checkUpperCase(String word) {
		char c = word.charAt(0);
		if (c >= 65 && c <= 90) {
			   return true;
		}
		return false;
	}
	
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   StreamTask st = new StreamTask();
	   
//      1~10���� ArrayList�� ��� ���
	   System.out.println("1. 1~10���� ArrayList�� ��� ���");
	   ArrayList<Integer> datas = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 10).forEach(datas::add);
	   System.out.println(datas);
	   
//      ABCDEF�� �� ���ں��� ���
	   System.out.println("\n2. ABCDEF�� �� ���ں��� ���");
	   String alphabet = "ABCDEF";
	   alphabet.chars().forEach(c -> {System.out.print(((char)c) + " ");});
	   System.out.println();
	   
//      1~100���� �� Ȧ���� ArrayList�� ��� ���
	   System.out.println("\n3. 1~100���� �� Ȧ���� ArrayList�� ��� ���");
	   ArrayList<Integer> datas3 = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 100).filter(st::checkOdd).forEach(datas3::add);
	   System.out.println(datas3);
	   
//      A~F���� �� D�����ϰ� ArrayList�� ��� ���
	   System.out.println("\n4. A~F���� �� D�����ϰ� ArrayList�� ��� ���");
	   ArrayList<String> exceptD = new ArrayList<String>();
	   IntStream.rangeClosed(65, 71).filter(c -> c != 68).forEach(c -> exceptD.add((char)c + ""));
//	   IntStream.rangeClosed('A', 'E').map(c -> c > 67 ? c + 1 : c).forEach(c -> exceptD.add((char)c + ""));
	   System.out.println(exceptD);
	   
//      5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
	   // �빮�ڸ� �ҹ��ڷ� ����, �ҹ��ڸ� �״��
	   System.out.println("\n5. 5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()");
	   ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
	   List<String> lowerCaseColors = new ArrayList<String>();
	   // lowerCaseColors �� String Ÿ���̱� ������ String���� �����ؼ� �޼ҵ� �� �� �ִ�.
	   lowerCaseColors = colors.stream().map(String::toLowerCase).collect(Collectors.toList());
	   System.out.println("List: " + lowerCaseColors);
	   
	   String colorsResultString = colors.stream().map(String::toLowerCase).collect(Collectors.joining(", "));
	   System.out.println("String: " + colorsResultString);
	   
//      Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
	   System.out.println("\n6. Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���");
	   ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
	   List<String> upperCaseFruits = new ArrayList<String>();
	   
	   upperCaseFruits = fruits.stream().filter(st::checkUpperCase).collect(Collectors.toList());
	   System.out.println(upperCaseFruits);
	   
//      �ѱ��� ������ ����
	   System.out.println("\n7. �ѱ��� ������ ����");
	   
	   String message = "������ �����ϰ� ���� �ѱ��� �Է��Ͻÿ�. >> ", exampleMessage =  "��) ��������";
	   String message2 = "�ѱ۷� �����ϰ� ���� ������ �Է��Ͻÿ�. >> ", exampleMessage2 =  "��) 0822";
	   String input1 = null, input2 = null;
	   
	   System.out.println(message + exampleMessage);
	   input1 = sc.next();
//	   
	   ArrayList<String> hangul = new ArrayList<String>(Arrays.asList("��","��","��","��","��","��","��","ĥ","��","��"));
	   input1.chars().forEach(c -> {System.out.print(hangul.indexOf((char)c + ""));});
	   
 
	   System.out.println();
//      ������ �ѱ۷� ����
	   System.out.println("\n8. ������ �ѱ۷� ����");
	   System.out.println(message2 + exampleMessage2);
	   input2 = sc.next();
	   
	   ArrayList<String> num = new ArrayList<String>();
	   
	   // ���� ������ �ϳ��ϳ� ������ hangul.get(����) �̷��� �־���� ��
	   input2.chars().forEach(c -> num.add((char)c + ""));
	   		// ���� ���ڿ��� �ϳ��� char Ÿ������ ����
	   		// (�ƽ�Ű�ڵ�� ���ϱ� ������ char Ÿ������ �ٽ� ��ȯ) "" �ٿ��� String Ÿ�� ����Ʈ�� ��ĭ�� �־��� 
	  
	   // �Ű�����: hangul�� index -> hangul.get(�Ű�����) �ݺ� ���
	   
	   // num ���� String ������ ���ڰ� �� �ִ�. 
	   // num -> int�� ��ȯ�� ���� hangul.get(indexOf) �� �־��ֱ�
	   num.stream().map(c -> (Integer.parseInt(c))).forEach(c -> {System.out.print(hangul.get(c));});
	   
   }
}