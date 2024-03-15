package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

   ArrayList<User> users = new ArrayList<User>(Arrays.asList(
         new User("�ѵ���", "hds", "1234"),
         new User("ȫ�浿", "hgd", "2314"),
         new User("�̼���", "lss", "5434"),
         new User("�輼ȯ", "ksh", "2232")
         ));
   
 
   
// Ŭ���� �ʵ�� ������ �� �ִ� ȸ�� DB�� ArrayList�� ������ش�.
   // users ArrayList���� �� ĭ�� User ��ü�� ����� �ִ�.
   // main ���� OptionalTest Ŭ������ ��üȭ ���ָ� �� users(User Ŭ���� ���� �ʵ�, �޼ҵ� ���)�� ����� ����������.

   @Override
   public String toString() {
	   return "OptionalTest [users=" + users + "]";
   }
   
//   ���� Optional ����ٰ� �� Optional�� ������ ���ƶ�!
//   �ݵ�� ���� Ÿ�Կ����� Optional�� ����ϰ�, ���� ��ü�� �����ش�.
//   - �������� : �ϳ� ��ȸ��
   
//   ��) Optional<List<User>> : ���� -> List�� Null�� ���� ����.
//   - ���: List
   

// id �� �޾Ƽ� ȸ�� �˻�
   public Optional<User> findById(Long id) {
      // Ŭ���� �ʵ带 User Ÿ���� usrInDb�� �ϳ��� ����ְ�
      // �� ����� ��ü���� id�� ������ �ͼ� �Ű������� �־��� id�� ��
      // ������ �װ��� ���� ������� user �� ����� ��
	  // user ����
	   
	  // ���������� ���ٿ��� �ٲ� �� ����? �׷��� for������ ���
	   User maybeUser = null;
      for(User userInDb : users) {
         if(userInDb.getId() == id) {
        	 maybeUser = userInDb;
         }
      }
      return Optional.ofNullable(maybeUser);
   }
   // if ���� �ϳ��� ���� ���� ��Ȳ = id �� ���� ��Ȳ = NPE
   
   
   
   
   public static void main(String[] args) {
	   
      OptionalTest optionalTest = new OptionalTest();
	  
//      System.out.println(optionalTest);
      
      // Optional �� ���� ��Ȳ
//      User user = optionalTest.findById(3000L);
//      if(user != null) {
//    	  System.out.println(user.getUserId());
//      } else {
//    	  System.out.println("�������� �ʴ� ȸ���Դϴ�.");
//      }
      
      // 1. ifPresent: Null �� ���� �����ϰ� Null �� �ƴ� ���� �������� �ʴ� ����.
//      optionalTest.findById(3000L).map(User::getUserId).ifPresent(System.out::println);
      // optionalTest�� findById �޼ҵ� �����ؼ� ������ �� user ��ü���� getUserID �����ؼ� �� ���� �ִٸ� ����Ʈ
      // 3000L �� ȸ���� ���ٸ� null �̹Ƿ� getUsedId �� �� ���� ����. 

      // 2. ifPresentOrElse: ���� ���� ���� Null �� �� �Ѵ� ����� �� �ִ� �ڵ� �ۼ�
//      optionalTest.findById(3000L).map(User::getUserId)
//      .ifPresentOrElse((userId) -> {							// ���� �ִٸ� ����
//    	  System.out.println(userId);
//    	  }, () -> {System.out.println("�������� �ʴ� ȸ���Դϴ�.");	// Null �̶�� ����
//    	  });	
      
	   // 3. �ǹ����� ���� ���� �ڵ�
      Optional<User> foundUser = optionalTest.findById(30L);
      // ���̵� �˻����� ã�� ��ü�� foundUser�� ����ش�.
      foundUser.map(User::getUserId).ifPresent(System.out::println); // ���� ������
      User user = foundUser.orElseThrow(() -> {throw new NoSuchUserException("�׷� ��� �����ϴ�.");});	//Null�̸�
      // foundUser�� ���� ������ user �� ����
      // Null�̸� throw ���� �߻�
      // handler
      
//      if(foundUser.isPresent()) {
//         foundUser.get();
//      }
      
      
//      
   }
}
