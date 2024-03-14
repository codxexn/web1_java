package castingTask1;

public class Animation extends Video{

	public Animation() {;}
	
	
	@Override
	void playVideo() {
		System.out.println("애니메이션");
		super.playVideo();
	}


	void offerSubtitles() {
		System.out.println("자막 지원");
	}
}
