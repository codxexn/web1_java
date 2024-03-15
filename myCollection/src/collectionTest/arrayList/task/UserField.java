package collectionTest.arrayList.task;

import java.util.ArrayList;

// ��κ��� DB�� �����ϴ� �޼ҵ��̱� ������ 
// DBConnector �� ��� ��üȭ�ؼ� ���� �ͺ��ٴ�
// DBConnector �� static �� ���̸� ���� ���� �޸𸮿� �ö󰡱� ������
// DBConnector.users �ϸ� �ٷ� DB ���� ����

public class UserField {
   public static String userId;
   // ArrayList �ϳ� ������ִµ� �� ���� �ȿ��� User �ʵ常 ���� �� �ִ�.
   public ArrayList<User> users = DBConnecter.users;
   private final int KEY = 3;
   
//   ���̵� �˻�
   public User checkId(String id) {
//      ���� for��, ���� for��, forEach
//	   : �ڿ��� ������ �ִ� �迭, ArrayList�� �־��ְ�
//	   : �ڿ� �ִ� ������ �տ� �ִ� ������ ������� ����. 
//	   ȸ���� �Ѹ� �� ������ �� �� �ִ�.
      for(User user : users) {
//    	  users �� �ִ� ȸ������ �Ѹ� user ������ ����ְ�
         if(user.getId().equals(id)) {
            return user;
         }
//        ���� �� user �� ��� ȸ���� id�� ������ ���� �� 
//        �Ű������� �־��� id�� ������ �ߺ��� �� ����
//        user�� ����(ȸ�� ��ü�� ����)
      }
      return null;		// ���� �ʴٸ� �ƹ� �͵� �� ����
   }
   
   
//   ȸ������
   public void join(User user) {
      user.setPassword(encrypt(user.getPassword()));
//    	������ ����ڰ� ȸ������ �� �Է��� ����� ������ �ͼ�
//     	��ȣȭ �޼ҵ带 ����ؼ� ��ȯ�� ����� �ٽ� user.setPassword() �� �־��� ����
      users.add(user);
//      DB�� �ִ� users �� ����ش�.
   }
   
//   �α���
   public boolean login(User user) {
      User userInDb = checkId(user.getId());
      if(userInDb != null) {
         if(userInDb.getPassword().equals(encrypt(user.getPassword()))) {
//        ����� ��ȣȭ�� ������ �񱳸� �ؾ� �ϱ� ������ ����� ��ȣȭ �޼ҵ带 �Ἥ equals ���ش�.
            userId = user.getId();
            return true;
         }
      }
      return false;
      
   }
   
//   �α׾ƿ�
   public void logout() {
      userId = null;
   }
   
//   ��й�ȣ ����(����������)
   public void update(User user) {
      User userInDb = checkId(user.getId());
      userInDb.setPassword(encrypt(user.getPassword()));
   }
   
//   ��й�ȣ ����(��й�ȣ ���� ������)
   public boolean update(String password, String newPassword) {
      User foundUser = checkId(userId);
      if(foundUser.getPassword().equals(encrypt(password))) {
         foundUser.setPassword(encrypt(newPassword));
         return true;
      }
      return false;
   }
   
//   ������ȣ ����
   
//   ������ȣ ����
//   ��ȣȭ
   public String encrypt(String password) {
      String encryptedPassword = "";
      for (int i = 0; i < password.length(); i++) {
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
      return encryptedPassword;
   }
}


