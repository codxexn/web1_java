package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

   ArrayList<User> users = new ArrayList<User>(Arrays.asList(
         new User("한동석", "hds", "1234"),
         new User("홍길동", "hgd", "2314"),
         new User("이순신", "lss", "5434"),
         new User("김세환", "ksh", "2232")
         ));
   
 
   
// 클래스 필드로 접근할 수 있는 회원 DB를 ArrayList로 만들어준다.
   // users ArrayList에는 각 칸에 User 객체가 담겨져 있다.
   // main 에서 OptionalTest 클래스를 객체화 해주면 저 users(User 클래스 안의 필드, 메소드 모두)도 사용이 가능해진다.

   @Override
   public String toString() {
	   return "OptionalTest [users=" + users + "]";
   }
   
//   제발 Optional 배웠다고 다 Optional로 감싸지 말아라!
//   반드시 리턴 타입에서만 Optional을 사용하고, 단일 객체만 감싸준다.
//   - 상세페이지 : 하나 조회해
   
//   예) Optional<List<User>> : 망함 -> List는 Null일 수가 없다.
//   - 목록: List
   

// id 를 받아서 회원 검색
   public Optional<User> findById(Long id) {
      // 클래스 필드를 User 타입인 usrInDb에 하나씩 담아주고
      // 그 담아준 객체에서 id를 가지고 와서 매개변수로 넣어준 id와 비교
      // 같으면 그것을 위에 만들어준 user 에 담아준 뒤
	  // user 리턴
	   
	  // 지역변수는 람다에서 바꿀 수 없다? 그래서 for문으로 사용
	   User maybeUser = null;
      for(User userInDb : users) {
         if(userInDb.getId() == id) {
        	 maybeUser = userInDb;
         }
      }
      return Optional.ofNullable(maybeUser);
   }
   // if 문에 하나도 들어가지 않은 상황 = id 가 없는 상황 = NPE
   
   
   
   
   public static void main(String[] args) {
	   
      OptionalTest optionalTest = new OptionalTest();
	  
//      System.out.println(optionalTest);
      
      // Optional 안 해준 상황
//      User user = optionalTest.findById(3000L);
//      if(user != null) {
//    	  System.out.println(user.getUserId());
//      } else {
//    	  System.out.println("존재하지 않는 회원입니다.");
//      }
      
      // 1. ifPresent: Null 일 때만 실행하고 Null 이 아닐 때는 실행하지 않는 람다.
//      optionalTest.findById(3000L).map(User::getUserId).ifPresent(System.out::println);
      // optionalTest의 findById 메소드 실행해서 가지고 온 user 객체에서 getUserID 실행해서 그 값이 있다면 프린트
      // 3000L 번 회원이 없다면 null 이므로 getUsedId 를 할 수가 없다. 

      // 2. ifPresentOrElse: 값이 있을 때와 Null 일 때 둘다 사용할 수 있는 코드 작성
//      optionalTest.findById(3000L).map(User::getUserId)
//      .ifPresentOrElse((userId) -> {							// 값이 있다면 실행
//    	  System.out.println(userId);
//    	  }, () -> {System.out.println("존재하지 않는 회원입니다.");	// Null 이라면 실행
//    	  });	
      
	   // 3. 실무에서 많이 쓰는 코드
      Optional<User> foundUser = optionalTest.findById(30L);
      // 아이디 검색으로 찾은 객체를 foundUser에 담아준다.
      foundUser.map(User::getUserId).ifPresent(System.out::println); // 값이 있으면
      User user = foundUser.orElseThrow(() -> {throw new NoSuchUserException("그런 사람 없습니다.");});	//Null이면
      // foundUser가 값이 있으면 user 로 들어가고
      // Null이면 throw 예외 발생
      // handler
      
//      if(foundUser.isPresent()) {
//         foundUser.get();
//      }
      
      
//      
   }
}
