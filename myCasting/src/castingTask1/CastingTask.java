package castingTask1;

//���ø���
//�ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
//����ڰ� ������ ������
//�ִϸ��̼��̶�� "�ڸ� ����" ��� ���
//��ȭ��� "4D" ��� ���
//��󸶶�� "����" ��� ���

public class CastingTask {
	
	void choiceVideo(Video video) {
		if(video instanceof Film) {
			Film film = (Film)video;
			film.playVideo();
		} else if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.playVideo();
		} else if(video instanceof Animation) {
			Animation animation = (Animation)video;
			animation.playVideo();
		}
	}
	
	
	public static void main(String[] args) {
	
		CastingTask castingTask = new CastingTask();
		Video film = new Film();
		
		castingTask.choiceVideo(new Film());
		film.playVideo();
		((Film)film).shackingChair();
		
		
	}
}	
