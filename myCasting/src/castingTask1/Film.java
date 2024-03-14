package castingTask1;

public class Film extends Video {

	public Film() {;}
	
	
	@Override
	void playVideo() {
		System.out.println("영화");
		super.playVideo();
	}


	void shackingChair() {
		System.out.println("4D 제공");
	}
}
