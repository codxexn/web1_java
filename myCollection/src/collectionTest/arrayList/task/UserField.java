package collectionTest.arrayList.task;

import java.util.ArrayList;

// 대부분이 DB에 접근하는 메소드이기 때문에 
// DBConnector 를 계속 객체화해서 쓰는 것보다는
// DBConnector 에 static 을 붙이면 가장 먼저 메모리에 올라가기 때문에
// DBConnector.users 하면 바로 DB 접근 가능

public class UserField {
   public static String userId;
   // ArrayList 하나 만들어주는데 그 공간 안에는 User 필드만 들어올 수 있다.
   public ArrayList<User> users = DBConnecter.users;
   private final int KEY = 3;
   
//   아이디 검사
   public User checkId(String id) {
//      빠른 for문, 향상된 for문, forEach
//	   : 뒤에는 순서가 있는 배열, ArrayList를 넣어주고
//	   : 뒤에 있는 값들이 앞에 있는 공간에 순서대로 담긴다. 
//	   회원들 한명씩 다 가지고 올 수 있다.
      for(User user : users) {
//    	  users 에 있는 회원들을 한명씩 user 공간에 담아주고
         if(user.getId().equals(id)) {
            return user;
         }
//        만약 그 user 에 담긴 회원의 id를 가지고 왔을 때 
//        매개변수로 넣어준 id와 같으면 중복이 된 거임
//        user를 리턴(회원 자체를 리턴)
      }
      return null;		// 같지 않다면 아무 것도 안 리턴
   }
   
   
//   회원가입
   public void join(User user) {
      user.setPassword(encrypt(user.getPassword()));
//    	위에서 사용자가 회원가입 때 입력한 비번을 가지고 와서
//     	암호화 메소드를 사용해서 변환된 비번을 다시 user.setPassword() 로 넣어준 다음
      users.add(user);
//      DB에 있는 users 에 담아준다.
   }
   
//   로그인
   public boolean login(User user) {
      User userInDb = checkId(user.getId());
      if(userInDb != null) {
         if(userInDb.getPassword().equals(encrypt(user.getPassword()))) {
//        비번을 암호화된 것으로 비교를 해야 하기 때문에 비번은 암호화 메소드를 써서 equals 해준다.
            userId = user.getId();
            return true;
         }
      }
      return false;
      
   }
   
//   로그아웃
   public void logout() {
      userId = null;
   }
   
//   비밀번호 변경(마이페이지)
   public void update(User user) {
      User userInDb = checkId(user.getId());
      userInDb.setPassword(encrypt(user.getPassword()));
   }
   
//   비밀번호 변경(비밀번호 변경 페이지)
   public boolean update(String password, String newPassword) {
      User foundUser = checkId(userId);
      if(foundUser.getPassword().equals(encrypt(password))) {
         foundUser.setPassword(encrypt(newPassword));
         return true;
      }
      return false;
   }
   
//   인증번호 전송
   
//   인증번호 생성
//   암호화
   public String encrypt(String password) {
      String encryptedPassword = "";
      for (int i = 0; i < password.length(); i++) {
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
      return encryptedPassword;
   }
}


