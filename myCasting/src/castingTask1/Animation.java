package castingTask1;

public class Animation extends Video{

	public Animation() {;}
	
	
	@Override
	void playVideo() {
		System.out.println("�ִϸ��̼�");
		super.playVideo();
	}


	void offerSubtitles() {
		System.out.println("�ڸ� ����");
	}
}
