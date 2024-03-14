package castingTask1;

public class Drama extends Video{
	public Drama() {;}
	
	
	
	@Override
	void playVideo() {
		System.out.print("드라마");
		super.playVideo();
	}

	void sellGoods() {
		System.out.println("굿즈");
	}
}
