package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		// 메소드 안에서 이 예외는 발생하지 않고 컴파일러가 알아서 해준다.
//		throw는 해당 메소드를 사용한 쪽으로 예외를 발생시킨다.
//		따라서 메소드 내에서는 throws에 작성한 예외가 발생하지 않는다.
		
//		절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로, "대한민국 서울시 강남구 역삼동 123-22 빌딩 302호", "C:/a/b"
		
//		상대 경로: 현재 위치에 따라 변경되는 경로, "직진해서 우회전하세요.", "../../a/b", "./a" = "a"
		// .. 뒤로 가서, . 현재경로에서 -> 생략 가능
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));
		// 입력은 없으면 오류, 출력은 파일이 없어도 오류나지 않고 만들어준다.
		// FileWriter(매개변수, 매개변수2): 
		// 매개변수1 = 파일명, 매개변수2에 true를 써줘야 덮어쓰지 않고 이어서 써준다.
		
		// new BufferedWriter: 파일을 열었어!
		// new FileWriter: 쓸려고!
		// ( ) : 경로 씀 -> 보통 절대 경로는 안 씀(보안상)
		// 현재경로는 프로젝트로 설정 돼 있음
		
		bufferedWriter.write("이른 아침에 카페가서 공부하는 그 느낌 너무 좋다, 요즘");	// 덮어쓰기
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
			System.out.println("없는 경로");
		} finally {
			bufferedReader.close();
		}
		
	}
}
