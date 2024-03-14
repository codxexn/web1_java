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
   public boolean equals(Object obj) {				// equals(매개변수) 재정의: true, false
      if(this == obj) {								// 만약 equals 앞에 객체랑 매개변수 객체의 주소가 같다?
         return true;								// 볼 것도 없이 true
      }												// 아닌 경우,
      if(obj instanceof Student) {					// 만약 매개변수 객체가 Student 타입이냐
         Student anotherStudent = (Student) obj;	// 그럼 Object로 업캐스팅 한 걸 다운캐스팅해서 객체 만들어줘.
         if(this.id == anotherStudent.getId()) {	// 만약 비교 객체의 필드 id랑 매개변수 객체 id 필드(직접접근 안되고 get으로 간접접근)
            return true;							// 필드 값이 같냐? 그럼 true
         }
      }
      return false;									// 둘다 아니면 false
   }
   
}

public class EqualsTest {
   
   
   public static void main(String[] args) {
      Student student = new Student(1, "제우스", 20);		// student 객체 만들어줌
      
      if(student.equals(new Student(1, "제우스", 20))) {	// 그 객체와 새로 만들어준 객체가 같냐?
         System.out.println("대여 완료");					// true일 때
         
      }else {
         System.out.println("도난 신고중");					// false일 때
      }
      
//      일단 student 와 ()안의 새로 만든 객체의 주소값을 비교하는데
//      객체를 따로 만들어준 것이니까 값이 같더라도 주소값은 다르기 때문에 false 가 뜬다.
//      그래서 우리가 재정의 해준 equals 로 사용하면 주소값이 아니라 id로 값 비교를 하게 돼서 true가 뜰 수 있다. 
      
      
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
////		// 같은 값을 다른 변수에 넣으면 같은 곳에 있는 값을 쓴다.
////		// 따라서 주소값이 같다.
////		System.out.println(data1 == data2);
////		System.out.println(data1.equals(data2));
////		
////		// new를 생성해서 비교를 하면 다른 주소값을 가진 것을 비교하기 때문에 false
////		System.out.println(data3 == data4);
////		System.out.println(data3.equals(data4));

