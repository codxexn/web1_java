package castingTask1;

public class Drama extends Video{
	public Drama() {;}
	
	
	
	@Override
	void playVideo() {
		System.out.print("���");
		super.playVideo();
	}

	void sellGoods() {
		System.out.println("����");
	}
}
