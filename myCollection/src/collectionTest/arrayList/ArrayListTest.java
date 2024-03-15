package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest <T extends Number>{
	
	T data;
	
	public static void main(String[] args) {
		
//		<?> - 제네릭(generic): 포괄적인, 이름이 없는
//							 지금 당장 어떤 값(자료형)이 들어갈 지 알 수 없을 때
//							 타입을 정하는 것은 객체화할 때
//						객체화시 타입을 지정하는 기법
//						설계할 때는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
		
//		오브젝트로 변수를 받으면 다운캐스팅을 일일이 해줘야 하고 다운캐스팅 타입도 모른다.
//		오브젝트는 뭐든 받지만, 제네릭은 들어올 타입을 제한을 줄 수 있다. (T extends Object 자식타입)
//		<>를 안쓰면 Object가 된다.
		
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
			datas.add(10);
			datas.add(30);
			datas.add(50);
			datas.add(60);
			datas.add(20);
			datas.add(70);
			datas.add(80);
			datas.add(90);

		System.out.println(datas.size());
		try {
			System.out.println(datas.get(0));
		} catch (Exception e) {
			System.out.println("인덱스 똑바로;");
		}
		
		System.out.println("-추가했을 때 길이-");
		
		
		Collections.shuffle(datas);
		
		// 추가(삽입)
		// 50 뒤에 500 삽입 (Insert)
		// 50이 있긴 하니? 부터 검사하기
		if(datas.contains(50))
			try {
				datas.add(datas.indexOf(50) + 1, 500);
			} catch (Exception e) {
				System.out.println("인덱스 똑바로;");
			}
		else {
			System.out.println("찾으시는 것이 없습니다.");
		}
		
		// indexOf(the first occurrence : 중복될 수 있지만 첫번째 등장한 것)
		System.out.println(datas.size());
		System.out.println(datas);
		
		System.out.println("-수정-");
		// 수정
		// 90을 9로 수정
		if(datas.contains(90)) {
		datas.set(datas.indexOf(90), 9);
		System.out.println(datas.size());
		System.out.println(datas);
		
		System.out.println("-삭제-");
		// 삭제
		// 80 삭제
		// 1. 인덱스로 삭제
//		if (datas.contains(80)){
//		int deletedDate = datas.remove(datas.indexOf(80));
//		}
//		System.out.println(datas.size());
		// 2. 값으로 삭제
		if(datas.remove(Integer.valueOf(80))) {
			System.out.println("80 삭제 성공!");
		}
		
		System.out.println("------최종-------");
		
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.print(datas.get(i) + " ");
//		}
		System.out.println(datas);
		
		Collections.shuffle(datas);
		System.out.println("멋대로 섞는 shuffle : " + datas);
		
		// 오름차순 정렬
		Collections.sort(datas);
		System.out.println("오름차순 : " + datas);
		
		// 반대로 (내림차순 하려면 sort 한 뒤에 거꾸로 reverse)
		Collections.reverse(datas);
		System.out.println("내림차순 : " + datas);
		
		
//		C reate
//		R ead
//		U pdate
//		D elete
		
		}
	}
}
