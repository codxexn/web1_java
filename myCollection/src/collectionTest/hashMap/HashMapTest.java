package collectionTest.hashMap;

import java.util.HashMap;

import org.json.JSONObject;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		// Object �� ������ ��� Ÿ���� ��ĳ���� �ż� ����.
		
		userMap.put("id", "hds1234");		// add �޼ҵ�� ����.
		userMap.put("password", "1234");
		userMap.put("name", "�ѵ���");
		userMap.put("age", 20);
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json.toString());
		
		
//		System.out.println("ũ�� : " + userMap.size() + "��");
//		System.out.println(userMap.get("id"));			
		// ���� ������ �� �� ��ü��.get(Key��) ���ָ� Value���� ������ �´�.
		
		
		
//		HashMap �� ���ʿ� ������ ����.
//		�ѽ־� �и��ؼ� Key,Value �Ѵ� ���� ���� ��
//		(Key + Value) -> Entry ��� Ÿ���̴�.
// 		entry: k, v �ѽ־� �ִ� Ÿ��
//		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		// Iterator �����. <������ ���´�.<�Ű����� Ÿ��>> Iterator ��ü�� = Map��.Key+Value.�����ο�(); ��ü�� �־���
		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		iter �� ���� �� Entry Ÿ������ ������ ��� �־���� ������ ���� ������ �� �� ������ ������ �´�.
//		Entry.toString�� "Key=Value" �� ������ �Ǿ��ִ�. 
		
//		Key�� �˻��ؼ� Value�� ������ ���� �˰���(�� ����. - ����get()�� ����.)
//		while(iter.hasNext()) {
//			Entry<String, Object> entry = iter.next();
//			if(entry.getKey().equals("name")) {
//			System.out.println(entry.getValue());
//			}
//		}
		
		
		
	}
}

