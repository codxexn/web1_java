package collectionTest.arrayList.task;

public class Login {
   public static void main(String[] args) {
//	   UserField 에 있는 메소드를 사용해야 하니까 UserField 객체화
      UserField userField = new UserField();
//      회원 정보 입력해야 하니까 User 객체화 
      User user = new User();
      
//      User user2 = new User();
      
      user.setId("hds1234");
      user.setName("한동석");
      user.setPassword("1234");
      user.setPhone("01012341234");
      
//      user2.setId("hds12345");
//      user2.setName("한동식");
//      user2.setPassword("4444");
//      user2.setPhone("0108889999");
      
      if(userField.checkId(user.getId()) == null) {
         
//         인증번호 발송
//         인증번호 검사{
            userField.join(user);
            System.out.println(DBConnecter.users);
//         }else{
//            System.out.println("인증번호를 확인해주세요");
//         }
      }else {	// checkId 가 null 이 아니면 ! 
         System.out.println("중복된 아이디");
      }
      
//      if(userField.checkId(user2.getId()) == null) {
//         userField.join(user2);
//         System.out.println(DBConnecter.users);
//      }else {
//         System.out.println("중복된 아이디");
//      }

      
      User userForLogin = new User();
      userForLogin.setId("hds1234");
      userForLogin.setPassword("1234");
      
      if(userField.login(userForLogin)) {
         System.out.println("로그인 성공");
         
      }else {
         System.out.println("로그인 실패");
         
      }
      
////      마이페이지
      User foundUser = userField.checkId(UserField.userId);
      foundUser.setPassword("6666");
//      
////      비밀번호 변경
      userField.update(foundUser);
      
//      비밀번호 변경 페이지(30일 넘게 비밀번호 사용함)
//      if(userField.update("1234", "8888")) {
//         System.out.println("비밀번호 변경 완료, 다시 로그인 해주세요.");
//      로그아웃
         userField.logout();
//      재로그인
         userForLogin = new User();
         userForLogin.setId("hds1234");
         userForLogin.setPassword("6666");
         
         if(userField.login(userForLogin)) {
            System.out.println("로그인 성공");
         }else {
            System.out.println("로그인 실패");
         }
//      }else {
//         System.out.println("비밀번호를 확인하세요.");
//      }
      
      
      
   }
}

