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
	   
//      1~10까지 ArrayList에 담고 출력
	   System.out.println("1. 1~10까지 ArrayList에 담고 출력");
	   ArrayList<Integer> datas = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 10).forEach(datas::add);
	   System.out.println(datas);
	   
//      ABCDEF를 각 문자별로 출력
	   System.out.println("\n2. ABCDEF를 각 문자별로 출력");
	   String alphabet = "ABCDEF";
	   alphabet.chars().forEach(c -> {System.out.print(((char)c) + " ");});
	   System.out.println();
	   
//      1~100까지 중 홀수만 ArrayList에 담고 출력
	   System.out.println("\n3. 1~100까지 중 홀수만 ArrayList에 담고 출력");
	   ArrayList<Integer> datas3 = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 100).filter(st::checkOdd).forEach(datas3::add);
	   System.out.println(datas3);
	   
//      A~F까지 중 D제외하고 ArrayList에 담고 출력
	   System.out.println("\n4. A~F까지 중 D제외하고 ArrayList에 담고 출력");
	   ArrayList<String> exceptD = new ArrayList<String>();
	   IntStream.rangeClosed(65, 71).filter(c -> c != 68).forEach(c -> exceptD.add((char)c + ""));
//	   IntStream.rangeClosed('A', 'E').map(c -> c > 67 ? c + 1 : c).forEach(c -> exceptD.add((char)c + ""));
	   System.out.println(exceptD);
	   
//      5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
	   // 대문자면 소문자로 변경, 소문자면 그대로
	   System.out.println("\n5. 5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()");
	   ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
	   List<String> lowerCaseColors = new ArrayList<String>();
	   // lowerCaseColors 가 String 타입이기 때문에 String으로 접근해서 메소드 쓸 수 있다.
	   lowerCaseColors = colors.stream().map(String::toLowerCase).collect(Collectors.toList());
	   System.out.println("List: " + lowerCaseColors);
	   
	   String colorsResultString = colors.stream().map(String::toLowerCase).collect(Collectors.joining(", "));
	   System.out.println("String: " + colorsResultString);
	   
//      Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
	   System.out.println("\n6. Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력");
	   ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
	   List<String> upperCaseFruits = new ArrayList<String>();
	   
	   upperCaseFruits = fruits.stream().filter(st::checkUpperCase).collect(Collectors.toList());
	   System.out.println(upperCaseFruits);
	   
//      한글을 정수로 변경
	   System.out.println("\n7. 한글을 정수로 변경");
	   
	   String message = "정수로 변경하고 싶은 한글을 입력하시오. >> ", exampleMessage =  "예) 공팔이이";
	   String message2 = "한글로 변경하고 싶은 정수를 입력하시오. >> ", exampleMessage2 =  "예) 0822";
	   String input1 = null, input2 = null;
	   
	   System.out.println(message + exampleMessage);
	   input1 = sc.next();
//	   
	   ArrayList<String> hangul = new ArrayList<String>(Arrays.asList("공","일","이","삼","사","오","육","칠","팔","구"));
	   input1.chars().forEach(c -> {System.out.print(hangul.indexOf((char)c + ""));});
	   
 
	   System.out.println();
//      정수를 한글로 변경
	   System.out.println("\n8. 정수를 한글로 변경");
	   System.out.println(message2 + exampleMessage2);
	   input2 = sc.next();
	   
	   ArrayList<String> num = new ArrayList<String>();
	   
	   // 받은 정수를 하나하나 나눠서 hangul.get(정수) 이렇게 넣어줘야 함
	   input2.chars().forEach(c -> num.add((char)c + ""));
	   		// 정수 문자열을 하나씩 char 타입으로 떼서
	   		// (아스키코드로 변하기 때문에 char 타입으로 다시 변환) "" 붙여서 String 타입 리스트로 한칸씩 넣어줌 
	  
	   // 매개변수: hangul의 index -> hangul.get(매개변수) 반복 출력
	   
	   // num 에는 String 형태의 숫자가 들어가 있다. 
	   // num -> int로 변환한 다음 hangul.get(indexOf) 에 넣어주기
	   num.stream().map(c -> (Integer.parseInt(c))).forEach(c -> {System.out.print(hangul.get(c));});
	   
   }
}