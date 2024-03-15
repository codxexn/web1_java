package collectionTest.arrayList.task;

// Alt + Shift + A : 그리드 모드 -> 커서 옮기고 한꺼번에 넣기

// DBConnecter 에서 사용한 타입인 클래스
// 여기의 필드와 메소드들을 사용한다.
public class User {
   private String name;
   private String id;
   private String password;
   private String phone;
   
   // 기본 생성자
   public User() {;}

   // getter, setter
   // ASs + r + Aa + r
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   // String 클래스의 toString() 메소드 오버라이드, 필드값을 가져오는 것으로 오버라이드 해준다.
   // ASs + s + enter
   @Override
   public String toString() {
      return "User [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone + "]";
   }
   
   // ASs + h : equals + hashCode 오버라이드
   
   // hashCode 오버라이드
   // ASs -> h -> 중복이 없는 값이 같으면 true 가 뜨게끔 하는 것
   @Override
   public int hashCode() {
      final int prime = 31;	
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
      // 31 + (id 가 null 이면 0, 아니면 id의 hashCode 를 더해준 다음 리턴)
   }

   // equals 오버라이드
   @Override
   public boolean equals(Object obj) {	// .equals(뭐든)
      if (this == obj)					// . 앞 뒤로 주소값이 같으면 true
         return true;
      if (obj == null)					// 만약 obj 가 null 이면 false (왜?)
         return false;
      if (getClass() != obj.getClass())	//
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









