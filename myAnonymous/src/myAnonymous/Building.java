package myAnonymous;

public class Building {
	public static void main(String[] args) {
		// Starbucks 클래스에 등록 메소드를 만들어놨기 때문에 등록을 하려면 Starbucks로 객체 생성
		Starbucks gangnam = new Starbucks();
		
		// 객체.등록메소드 사용(무료나눔행사 안하는 강남점은 Form 타입으로 객체 생성)
		// 일회성으로 받고 끝나기 때문에 이름 지정하지 않고 익명 내부 클래스로 만들어서
		// 일회성으로 Form 인터페이스의 추상메소드를 구현해준다.
		gangnam.register(new Form() {

			@Override
			public String[] getMenu() {
				return new String[] { "아메리카노", "카페라떼", "에이드", "디카페인" };
			}
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenu();
				// getMenu() 메소드로 만들어준 메뉴 String 배열을 menus 에 넣어준다.

				for (int i = 0; i < menus.length; i++) {
					if (menus[i].equals(menu)) {
						System.out.println(menus[i] + " 판매 완료");
						break;
					}
				}
			}

		});

		
//	      잠실점 오픈
//	      무료나눔 행사중
		
		// 무료나눔 행사중이라서 객체를 FormAdapter 로 넣어준다.
		// sell 메소드에서는 판매방식을 검토하지 않고
		// 무료나눔행사 승인이라는 메시지를 출력하게 되기 때문에 sell 메소드는 재정의 해주지 않는다.
		
		Starbucks jamsil = new Starbucks();
		
		// 이것 또한 register 메소드의 객체가 일회성이기 때문에 이름을 붙이지 않고
		// 익명 내부 클래스로 생성해준다.
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노", "플랫화이트", "아인슈페너", "조각케익"};
			}
		});

	}
}
