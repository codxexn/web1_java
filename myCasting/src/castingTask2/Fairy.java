package castingTask2;

public class Fairy extends Monster{
	 public Fairy() {;}

	@Override
	void get() {
		System.out.println("날개를 얻었습니다.");
	}
	 
	public void eat() {
		System.out.println("(참)이슬만 먹는다.");
	}
	
}
