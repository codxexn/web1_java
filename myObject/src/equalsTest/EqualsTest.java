package equalsTest;

class Student {
   private int id;
   private String name;
   private int age;
   
   public Student() {;}

   public Student(int id, String name, int age) {
      super();
      this.id = id;
      this.name = name;
      this.age = age;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
   }
   
   
   @Override
   public boolean equals(Object obj) {				// equals(�Ű�����) ������: true, false
      if(this == obj) {								// ���� equals �տ� ��ü�� �Ű����� ��ü�� �ּҰ� ����?
         return true;								// �� �͵� ���� true
      }												// �ƴ� ���,
      if(obj instanceof Student) {					// ���� �Ű����� ��ü�� Student Ÿ���̳�
         Student anotherStudent = (Student) obj;	// �׷� Object�� ��ĳ���� �� �� �ٿ�ĳ�����ؼ� ��ü �������.
         if(this.id == anotherStudent.getId()) {	// ���� �� ��ü�� �ʵ� id�� �Ű����� ��ü id �ʵ�(�������� �ȵǰ� get���� ��������)
            return true;							// �ʵ� ���� ����? �׷� true
         }
      }
      return false;									// �Ѵ� �ƴϸ� false
   }
   
}

public class EqualsTest {
   
   
   public static void main(String[] args) {
      Student student = new Student(1, "���콺", 20);		// student ��ü �������
      
      if(student.equals(new Student(1, "���콺", 20))) {	// �� ��ü�� ���� ������� ��ü�� ����?
         System.out.println("�뿩 �Ϸ�");					// true�� ��
         
      }else {
         System.out.println("���� �Ű���");					// false�� ��
      }
      
//      �ϴ� student �� ()���� ���� ���� ��ü�� �ּҰ��� ���ϴµ�
//      ��ü�� ���� ������� ���̴ϱ� ���� ������ �ּҰ��� �ٸ��� ������ false �� ���.
//      �׷��� �츮�� ������ ���� equals �� ����ϸ� �ּҰ��� �ƴ϶� id�� �� �񱳸� �ϰ� �ż� true�� �� �� �ִ�. 
      
      
//      String data1 = "ABC";
//      String data2 = "ABC";
//      String data3 = new String("ABC");
//      String data4 = new String("ABC");
//      
//      System.out.println(data1 == data2);
//      System.out.println(data1.equals(data2));
//      System.out.println(data3 == data4);
//      System.out.println(data3.equals(data4));
   }
}
	
////		String data1 = "ABC";
////		String data2 = "ABC";
////		String data3 = new String("ABC");
////		String data4 = new String("ABC");
////		
////		// ���� ���� �ٸ� ������ ������ ���� ���� �ִ� ���� ����.
////		// ���� �ּҰ��� ����.
////		System.out.println(data1 == data2);
////		System.out.println(data1.equals(data2));
////		
////		// new�� �����ؼ� �񱳸� �ϸ� �ٸ� �ּҰ��� ���� ���� ���ϱ� ������ false
////		System.out.println(data3 == data4);
////		System.out.println(data3.equals(data4));

