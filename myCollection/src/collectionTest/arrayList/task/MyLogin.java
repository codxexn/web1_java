package collectionTest.arrayList.task;

public class MyLogin {
   public static void main(String[] args) {
      MyUserField userField = new MyUserField();
      User user = new User();
      User user2 = new User();
      
      user.setId("hds1234");
      user.setName("한동석");
      user.setPassword("1234");
      user.setPhone("01012341234");
      
      
      user2.setId("hds123");
      user2.setName("한동식");
      user2.setPassword("4444");
      user2.setPhone("0108889999");
      
      // 아이디 중복검사
      if(userField.checkId(user.getId()) == null) {
         userField.join(user);
         System.out.println(DBConnecter.users.get(0));
      }else {
         System.out.println("중복된 아이디");
      }
      
      // 아이디 중복 검사
      if(userField.checkId(user2.getId()) == null) {
    	  userField.join(user2);
    	  System.out.println(DBConnecter.users.get(1));
      }else {
    	  System.out.println("중복된 아이디");
      }
      
      

      // 로그인 시도
      User userForLogin = new User();
      userForLogin.setId("hds1234");
      userForLogin.setPassword("1234");
      
      if(userField.login(userForLogin)) {
         System.out.println("로그인 성공");
      }else {
         System.out.println("로그인 실패");
      }
      
      // 비밀번호 변경(변경 페이지)
      userField.changePassword("1234", "12345");
      
      // 로그아웃
      userField.logout(userForLogin);
      
      // 재로그인
      userForLogin.setId("hds1234");
      userForLogin.setPassword("12345");
      if(userField.login(userForLogin)) {
          System.out.println("로그인 성공");
       }else {
          System.out.println("로그인 실패");
       }
      
      // 비밀번호 변경(마이 페이지)
      User foundUser = userField.checkId(MyUserField.userId);
      foundUser.setPassword("1111");
      
      userField.changePassword(foundUser);
      
      // 로그아웃
      userField.logout(foundUser);
      
   // 재로그인
      userForLogin = new User();
      userForLogin.setId("hds1234");
      userForLogin.setPassword("1111");
      if(userField.login(userForLogin)) {
          System.out.println("로그인 성공");
       }else {
          System.out.println("로그인 실패");
       }
   
   }
}



