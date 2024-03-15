package collectionTest.arrayList.task;

import java.util.ArrayList;

// DB를 아직 배우지 않았기 때문에 저장소역할이 필요해서 자료구조를 배우고 있다.
// ArrayList 라는 자료구조를 DB처럼 쓰자!
// 모든 회원 정보를 여기에 담자!

public class DBConnecter {
   public static ArrayList<User> users = new ArrayList<User>();
   // ArrayList 틀의 users 를 만들어주는데 변수는 우리가 만들어줄 User 라는 클래스
   // User 라는 클래스의 필드를 사용해서 ArrayList 의 기능 사용!
   
   // 회원도 여러명, 회원의 정보도 여러명
   // 순서대로 필요한 것이 아니라 이름, 아이디, 비번 등 이름으로 접근하려면 클래스에 담아야 한다.
   // 순서와 규칙성이 필요하면 배열에 담아야 한다.
   
   // ex) user.name, user.id, user.pw, ...
   
   // 따라서, 회원이 여러명이기 때문에 객체가 여러개다.
   // ArrayList 에는 회원 정보들이 필드로 담긴 클래스를 변수로 선언하고
   // 그 클래스를 회원수만큼 객체를 만들어주면 된다.
   
   // DB 에 접근할 수 있는 4가지 방식 -> 메소드로 만들어야 한다.
   // 1. 추가 
   // 2. 조회
   // 3. 수정
   // 4. 삭제
   
   
   
}
