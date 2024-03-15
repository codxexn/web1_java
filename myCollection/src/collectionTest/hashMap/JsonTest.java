package collectionTest.hashMap;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		
		User user1 = new User(1, "한동석", 20, "강사");
		User user2 = new User(2, "이도은", 31, "개발자");
		User user3 = new User(3, "이시율", 26, "크리에이터");
		User user4 = new User(4, "배정은", 32, "간호사");
		User user5 = new User(5, "이예빈", 28, "공기업사원");
		
		ArrayList<User> users = new ArrayList<User>();
		JSONArray usersJSON = new JSONArray();
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		
//		users.stream().map(user -> new JSONObject(user)).forEach(c -> usersJSON.put(c));
		users.stream().map(user -> new JSONObject(user)).forEach(usersJSON::put);
		// 아래처럼도 쓸 수 있다. 생성자에 넣을 때 타입::new
//		users.stream().map(JSONObject::new).forEach(usersJSON::put);
		
		
//		내 해석
//		ArrayList users에 담긴 것들을 stream에 담아주고 stream 의 map 기능을 사용해서
//		stream 안에 담긴 값들이 차례로 변수에 담기고 그 변수가 람다의 -> 다음 기능을 순차적으로 반복된 다음 다시 스트림에 담긴다.
//		그 다음 그걸 forEach로 반복작업! (forEach 는 zCurriculum.practiceRepeat.ForEachPractice 참조)
//		
		System.out.println(usersJSON.toString());
		//잊지말자, 출력에서만 toString() 생략 가능
		
//		map():  <R> Stream<R> map(Function<? super T, ? extends R> mapper);
//			Returns a stream consisting of the results of 
//			applying the given function to the elements of this stream. 
//		주어진 기능을 등록한 이 스트림 요소들의 결과를 스트림 구성으로 리턴
		
	}
}
