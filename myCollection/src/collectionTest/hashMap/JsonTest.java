package collectionTest.hashMap;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		
		User user1 = new User(1, "�ѵ���", 20, "����");
		User user2 = new User(2, "�̵���", 31, "������");
		User user3 = new User(3, "�̽���", 26, "ũ��������");
		User user4 = new User(4, "������", 32, "��ȣ��");
		User user5 = new User(5, "�̿���", 28, "��������");
		
		ArrayList<User> users = new ArrayList<User>();
		JSONArray usersJSON = new JSONArray();
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		
//		users.stream().map(user -> new JSONObject(user)).forEach(c -> usersJSON.put(c));
		users.stream().map(user -> new JSONObject(user)).forEach(usersJSON::put);
		// �Ʒ�ó���� �� �� �ִ�. �����ڿ� ���� �� Ÿ��::new
//		users.stream().map(JSONObject::new).forEach(usersJSON::put);
		
		
//		�� �ؼ�
//		ArrayList users�� ��� �͵��� stream�� ����ְ� stream �� map ����� ����ؼ�
//		stream �ȿ� ��� ������ ���ʷ� ������ ���� �� ������ ������ -> ���� ����� ���������� �ݺ��� ���� �ٽ� ��Ʈ���� ����.
//		�� ���� �װ� forEach�� �ݺ��۾�! (forEach �� zCurriculum.practiceRepeat.ForEachPractice ����)
//		
		System.out.println(usersJSON.toString());
		//��������, ��¿����� toString() ���� ����
		
//		map():  <R> Stream<R> map(Function<? super T, ? extends R> mapper);
//			Returns a stream consisting of the results of 
//			applying the given function to the elements of this stream. 
//		�־��� ����� ����� �� ��Ʈ�� ��ҵ��� ����� ��Ʈ�� �������� ����
		
	}
}
