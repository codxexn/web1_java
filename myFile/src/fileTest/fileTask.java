package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class fileTask {
	public static void main(String[] args) throws IOException {

		// ���� 4�� ���
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("taskText.txt"));
		ArrayList<String> foods = new ArrayList<String>(Arrays.asList("���߳��� ", "��Ÿ�� ", "�쵿 ", "���� "));
		
		for (int i = 0; i < 4; i++) {
			bufferedWriter.write(foods.get(i) + "\n");		
			}
		bufferedWriter.close();
		
		
		// ���� ��� �����ͼ� �ֿܼ� ���
		
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader("taskText.txt"));
				String food = null;
				while((food = bufferedReader.readLine()) != null) {
					System.out.println(food);
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			bufferedReader.close();
		}
			
		
		// ���� (�ٽ� �غ���!)
		BufferedReader bufferedReader1 = new BufferedReader(new FileReader("taskText.txt"));
		String line = null;
		String temp = "";
		while((line = bufferedReader1.readLine()) != null) {
			if (line.equals("��Ÿ��")) {
				temp += line + "�粿ġ\n";
				continue;
			}
			temp += line + "\n";
		}
		
		bufferedReader1.close();
		
		BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("taskText.txt"));	
		bufferedWriter1.write(temp);
		
		bufferedWriter1.close();
			
			
		// ����
//		BufferedReader bufferedReader1 = new BufferedReader(new FileReader("taskText.txt"));
//		String line = null;
//		String temp = "";
//		while((line = bufferedReader1.readLine()) != null) {
//			if (line.equals("�쵿")) {
//				continue;
//			}
//			temp += line + "\n";
//		}
//		
//		bufferedReader1.close();
//		
//		BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("taskText.txt"));	
//		bufferedWriter1.write(temp);
//		
//		bufferedWriter1.close();
			
			
			
			
			
			
			
			
			
			
		
		
	}
}
