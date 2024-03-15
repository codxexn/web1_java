package collectionTest.hashMap;

import java.util.HashMap;

import org.json.JSONObject;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		// Object 에 넣으면 모든 타입이 업캐스팅 돼서 들어간다.
		
		userMap.put("id", "hds1234");		// add 메소드는 없다.
		userMap.put("password", "1234");
		userMap.put("name", "한동석");
		userMap.put("age", 20);
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json.toString());
		
		
//		System.out.println("크기 : " + userMap.size() + "쌍");
//		System.out.println(userMap.get("id"));			
		// 값만 가지고 올 땐 객체명.get(Key값) 해주면 Value값을 가지고 온다.
		
		
		
//		HashMap 은 애초에 순서가 없다.
//		한쌍씩 분리해서 Key,Value 둘다 쓰고 싶을 때
//		(Key + Value) -> Entry 라는 타입이다.
// 		entry: k, v 한쌍씩 있는 타입
//		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		// Iterator 만든다. <쌍으로 묶는다.<매개변수 타입>> Iterator 객체명 = Map명.Key+Value.순서부여(); 객체명에 넣어줌
		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		iter 에 넣을 때 Entry 타입으로 쌍으로 묶어서 넣어줬기 때문에 값을 가지고 올 때 쌍으로 가지고 온다.
//		Entry.toString은 "Key=Value" 로 재정의 되어있다. 
		
//		Key를 검사해서 Value를 가지고 오는 알고리즘(안 쓴다. - 보통get()만 쓴다.)
//		while(iter.hasNext()) {
//			Entry<String, Object> entry = iter.next();
//			if(entry.getKey().equals("name")) {
//			System.out.println(entry.getValue());
//			}
//		}
		
		
		
	}
}

