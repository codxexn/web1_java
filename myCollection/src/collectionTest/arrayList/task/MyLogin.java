package collectionTest.arrayList.task;

public class MyLogin {
   public static void main(String[] args) {
      MyUserField userField = new MyUserField();
      User user = new User();
      User user2 = new User();
      
      user.setId("hds1234");
      user.setName("�ѵ���");
      user.setPassword("1234");
      user.setPhone("01012341234");
      
      
      user2.setId("hds123");
      user2.setName("�ѵ���");
      user2.setPassword("4444");
      user2.setPhone("0108889999");
      
      // ���̵� �ߺ��˻�
      if(userField.checkId(user.getId()) == null) {
         userField.join(user);
         System.out.println(DBConnecter.users.get(0));
      }else {
         System.out.println("�ߺ��� ���̵�");
      }
      
      // ���̵� �ߺ� �˻�
      if(userField.checkId(user2.getId()) == null) {
    	  userField.join(user2);
    	  System.out.println(DBConnecter.users.get(1));
      }else {
    	  System.out.println("�ߺ��� ���̵�");
      }
      
      

      // �α��� �õ�
      User userForLogin = new User();
      userForLogin.setId("hds1234");
      userForLogin.setPassword("1234");
      
      if(userField.login(userForLogin)) {
         System.out.println("�α��� ����");
      }else {
         System.out.println("�α��� ����");
      }
      
      // ��й�ȣ ����(���� ������)
      userField.changePassword("1234", "12345");
      
      // �α׾ƿ�
      userField.logout(userForLogin);
      
      // ��α���
      userForLogin.setId("hds1234");
      userForLogin.setPassword("12345");
      if(userField.login(userForLogin)) {
          System.out.println("�α��� ����");
       }else {
          System.out.println("�α��� ����");
       }
      
      // ��й�ȣ ����(���� ������)
      User foundUser = userField.checkId(MyUserField.userId);
      foundUser.setPassword("1111");
      
      userField.changePassword(foundUser);
      
      // �α׾ƿ�
      userField.logout(foundUser);
      
   // ��α���
      userForLogin = new User();
      userForLogin.setId("hds1234");
      userForLogin.setPassword("1111");
      if(userField.login(userForLogin)) {
          System.out.println("�α��� ����");
       }else {
          System.out.println("�α��� ����");
       }
   
   }
}



