package optionalTest;

public class User {
	
	// static 필드 seq로 전체 객체 공유
	private static Long seq;
	
	private Long id;				// 나중에 회원수가 많아지면 id가 길어질 수도 있기 때문에 그것을 대비해서 큰 타입인 Long 사용
	private String userName;
	private String userId;
	private String userPassword;
   
   // 회원번호인 id는 가입할 때마다 1씩 증가해서 자동생성 돼야 하기 때문에 전체 회원이 공유해야 한다.
   // 따라서 static으로 선언해주고 객체가 하나씩 늘어날 때마다 1씩 증가시켜서 가장 먼저 생성돼야 하기 때문에
   
	// static 블럭: 프로그램 실행 가장 처음 딱 한번 실행되는 코드{static seq 초기화}
   static {
      seq = 0L;	// Long 타입이기 때문에 L 붙여줌
   }
   
   // 초기화 블럭: 생성자 부를 때마다 실행되는 코드{객체 만들때마다 1씩 증가시켜서 만들어진 객체 seq 에 넣어줌}
   {
      this.id = seq++;
   }
   
   public User() {;}
   
   // id 는 자동생성되기 때문에 매개변수로 받을 필요가 없다.
   public User(String userName, String userId, String userPassword) {
      this.userName = userName;
      this.userId = userId;
      this.userPassword = userPassword;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserPassword() {
      return userPassword;
   }

   public void setUserPassword(String userPassword) {
      this.userPassword = userPassword;
   }

   @Override
   public String toString() {
      return "User [id=" + id + ", userName=" + userName + ", userId=" + userId + ", userPassword=" + userPassword
            + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      User other = (User) obj;
      if (id == null) {
         if (other.id != null)
            return false;
      } else if (!id.equals(other.id))
         return false;
      return true;
   }
}