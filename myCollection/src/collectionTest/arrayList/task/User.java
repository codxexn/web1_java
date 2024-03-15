package collectionTest.arrayList.task;

// Alt + Shift + A : �׸��� ��� -> Ŀ�� �ű�� �Ѳ����� �ֱ�

// DBConnecter ���� ����� Ÿ���� Ŭ����
// ������ �ʵ�� �޼ҵ���� ����Ѵ�.
public class User {
   private String name;
   private String id;
   private String password;
   private String phone;
   
   // �⺻ ������
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

   // String Ŭ������ toString() �޼ҵ� �������̵�, �ʵ尪�� �������� ������ �������̵� ���ش�.
   // ASs + s + enter
   @Override
   public String toString() {
      return "User [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone + "]";
   }
   
   // ASs + h : equals + hashCode �������̵�
   
   // hashCode �������̵�
   // ASs -> h -> �ߺ��� ���� ���� ������ true �� �߰Բ� �ϴ� ��
   @Override
   public int hashCode() {
      final int prime = 31;	
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
      // 31 + (id �� null �̸� 0, �ƴϸ� id�� hashCode �� ������ ���� ����)
   }

   // equals �������̵�
   @Override
   public boolean equals(Object obj) {	// .equals(����)
      if (this == obj)					// . �� �ڷ� �ּҰ��� ������ true
         return true;
      if (obj == null)					// ���� obj �� null �̸� false (��?)
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









