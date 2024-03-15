package collectionTest.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

// 중복제거할 때 써라!
// DBMS의 기본 구조가 Set 이다!

public class HashSetTest {
	public static void main(String[] args) {
//		데이터를 가져오고 싶을 때 순서를 부여해야 한다.
//		iterator가 정답이다.
//		순서가 없을 때 순서 부여, 순서 있어도 이 순서대로 부여, 메소드로 돼 있다.
		HashSet<String> bloodTypeSet = new HashSet<String>();
		bloodTypeSet.add("A");
		bloodTypeSet.add("O");
		bloodTypeSet.add("B");
		bloodTypeSet.add("AB");
		System.out.println(bloodTypeSet);
		
		
		
		Iterator<String> iter = bloodTypeSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
//		중복 제거의 현장..
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 5, 4, 5, 6, 7, 8, 9, 9, 9, 1, 2));
//		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
//		System.out.println(datas);
		
		
		
		
		
//		HashSet<String> bloodTypeSet = new HashSet<String>();
//		bloodTypeSet.add("A");
//		bloodTypeSet.add("B");
//		bloodTypeSet.add("O");
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));	// 중복된 값이면 false 가 나옴
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		
//		System.out.println(bloodTypeSet.size());
//		System.out.println(bloodTypeSet);
	}
}
