package classTest;

class Student{
	
	String name;
	int studentNumber;
	int korean;
	int english;
	int math;
	int total;
	double average;
	
	public Student(String name, int studentNumber, int korean, int english, int math) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.korean = korean;
		this.english = english;
		this.math = math;
		
		this.total = this.korean + this.english + this.math;
		this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
	}
	

}
public class ClassTask2 {
	public static void main(String[] args) {
		
		Student student1 = new Student("È«±æµ¿", 1, 98, 100, 95);
		
		System.out.println("ÃÑÁ¡ : "  + student1.total);
		System.out.println("Æò±Õ : " + student1.average);
		
	}
}
