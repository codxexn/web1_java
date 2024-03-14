package objectTest;

class Workout{

	int weight;
	int times;
	String equipments;
	
	
	// 기본 생성자 ctrl+space
	public Workout() {;}

	// 초기화 생성자 Alt+Shift+s -> o
	public Workout(int weight, int times, String equipments) {
		super();
		this.weight = weight;
		this.times = times;
		this.equipments = equipments;
	}

	// getter, setter
	// Alt+Shift+s -> r -> Alt+a + r
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public String getEquipments() {
		return equipments;
	}

	public void setEquipments(String equipments) {
		this.equipments = equipments;
	}

	
	// Object.toString Override
	// Alt+Shift+s -> s -> Alt+a -> g
	@Override
	public String toString() {
		return "Workout [weight=" + weight + ", times=" + times + ", equipments=" + equipments + "]";
	}
	
}

public class Practice {
	public static void main(String[] args) {
		
		Workout wo = new Workout(40, 15, "스쿼트");
		
		System.out.println(wo);
		
	}
}
