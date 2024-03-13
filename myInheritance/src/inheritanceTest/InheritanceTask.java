package inheritanceTest;

class Car {
   String brand;
   String color;
   int price;
   
   public Car() {;}

   public Car(String brand, String color, int price) {
      this.brand = brand;
      this.color = color;
      this.price = price;
   }
   
   void engineStart() {
      System.out.println("���� �õ� ����");
   }
   
   void engineStop() {
      System.out.println("���� �õ� ����");
   }
}

class SuperCar extends Car{
	
	String mode;
	
	public SuperCar() {;}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);		// �θ� Ŭ������ �ʱ�ȭ �����ڿ� �־���
		this.mode = mode;
	}

	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("���� �õ� ����");
	}

	@Override
	void engineStop() {
		super.engineStop();
		System.out.println("���� �õ� ����");
	}
   
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 70_000, "sports");
		
		ferrari.engineStart();
		ferrari.engineStop();
	}
}


