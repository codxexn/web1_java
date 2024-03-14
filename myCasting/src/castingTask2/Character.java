package castingTask2;

// 오크는 "가죽을 얻었습니다." 출력
// 요정은 "날개를 얻었습니다." 출력
// 인간 "갑옷을 얻었습니다." 출력


public class Character {
	
	public void item(Monster monster) {
		monster.get();
	}
	
	
	public void hunt(Monster monster) {		// 매개변수 받으면서 업캐스팅 진행
		// 사냥 메소드 만들기
		// (매개변수는 몬스터 타입 : 모든 자식은 부모타입이다. 따라서 Fairy, Human, Ork 타입이 다 들어갈 수 있다.)
		if(monster instanceof Fairy) {		// 만약 매개변수가 Fairy 타입이면
			Fairy fairy = (Fairy)monster;	// 다운 캐스팅 진행
			fairy.get();					// 다운캐스팅해서 원래의 Fairy 클래스에서 오버라이딩 한 메소드 사용
		} else if(monster instanceof Human) {
			Human human = (Human)monster;
			human.get();
		} else if(monster instanceof Ork) {
			Ork ork = (Ork)monster;
			ork.get();
		}
	}

	
	public static void main(String[] args) {
		
//		Character a = new Character();		// hunt 메소드 사용하기 위해 클래스 객체 만들어줌
//		a.hunt(new Fairy());				// 매개변수 클래스 타입으로 넣어주고 hunt 메소드 사용하면
//		a.hunt(new Human());				// hunt 안에 코드에서 자동으로 매개변수 클래스의 메소드를 사용
//		a.hunt(new Ork());
		
//		Character a = new Character();
//		a.item(new Monster());
//		a.item(new Fairy());
//		
//		System.out.println();
		
		
		Monster fairy = new Fairy();	// 업캐스팅
		fairy.get();
		if (fairy instanceof Fairy) {((Fairy) fairy).eat();}	// 다운캐스팅
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	
}
