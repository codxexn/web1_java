package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		// �޼ҵ� �ȿ��� �� ���ܴ� �߻����� �ʰ� �����Ϸ��� �˾Ƽ� ���ش�.
//		throw�� �ش� �޼ҵ带 ����� ������ ���ܸ� �߻���Ų��.
//		���� �޼ҵ� �������� throws�� �ۼ��� ���ܰ� �߻����� �ʴ´�.
		
//		���� ���: ��𿡼� �ۼ��ص� ã�ư� �� �ִ� ���, "���ѹα� ����� ������ ���ﵿ 123-22 ���� 302ȣ", "C:/a/b"
		
//		��� ���: ���� ��ġ�� ���� ����Ǵ� ���, "�����ؼ� ��ȸ���ϼ���.", "../../a/b", "./a" = "a"
		// .. �ڷ� ����, . �����ο��� -> ���� ����
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));
		// �Է��� ������ ����, ����� ������ ��� �������� �ʰ� ������ش�.
		// FileWriter(�Ű�����, �Ű�����2): 
		// �Ű�����1 = ���ϸ�, �Ű�����2�� true�� ����� ����� �ʰ� �̾ ���ش�.
		
		// new BufferedWriter: ������ ������!
		// new FileWriter: ������!
		// ( ) : ��� �� -> ���� ���� ��δ� �� ��(���Ȼ�)
		// �����δ� ������Ʈ�� ���� �� ����
		
		bufferedWriter.write("�̸� ��ħ�� ī�䰡�� �����ϴ� �� ���� �ʹ� ����, ����");	// �����
		bufferedWriter.close();
		
		
//		BufferedReader bufferedReader = new BufferedReader(new FileReader(null));
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader("taskText.txt"));
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("���� ���");
		} finally {
			bufferedReader.close();
		}
		
	}
}
