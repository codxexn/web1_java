package marker;

public class Lab {
	// method
//	Lab.checkkinds(Animal 타입의 배열 매개변수 : 모든 동물 생성자 가능){
//	배열 길이만큼 반복
//	만약 i번째 칸 객체가 CarnivoreMarker 타입이라면
//	"육식동물" 출력
//	만약 i번째 칸 객체가 HerbivoreMarker 타입이라면
//	"초식동물" 출력
//	둘다 아니라면 
//	"잡식동물" 출력
	
//	저장공간에 객체 안 담고 바로 객체. 메소드 사용(차례로 객체 생성자를 변수로 사용)
//	매개변수는 Animal 타입만 가능하지만 모든 자식은 부모타입이므로 모두 가능

	public void checkKinds(Animal[] arAnimal) {
		for (int i = 0; i < arAnimal.length; i++) {
			
			if(arAnimal[i] instanceof CarnivoreMarker) {
				System.out.println("육식동물");
			}else if(arAnimal[i] instanceof HerbivoreMarker) {
				System.out.println("초식동물");
			}else {
				System.out.println("잡식동물");
			}
		}
	}
	
	public static void main(String[] args) {
		
		new Lab().checkKinds(new Animal[] {new Bear(), new Cow(), new Dog(), new Tiger()});
	}
}






















