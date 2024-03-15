package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.Random;

public class MyUserField {
	public static String userId;
	public ArrayList<User> users = DBConnecter.users;
	private final int KEY = 3;

//   아이디 중복검사
	public User checkId(String id) {
//      빠른 for문, 향상된 for문, forEach
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	인증번호 발송
	
//	인증번호 검사
	

//   회원가입
	public void join(User user) {
		user.setPassword(encrypt(user.getPassword()));
		users.add(user);
	}

//   로그인
	public boolean login(User user) {
		User userInDb = checkId(user.getId());
		if (userInDb != null) {
			if (userInDb.getPassword().equals(encrypt(user.getPassword()))) {
				userId = user.getId();
				return true;
			}
		}
		return false;
	}
	
	public void logout(User user) {
		userId = null;
		System.out.println("성공적으로 로그아웃 되셨습니다.");
	}

//   비밀번호 변경(마이페이지)
	public void changePassword(User user) {
		User userInDb = checkId(user.getId());
		userInDb.setPassword(encrypt(user.getPassword()));
		System.out.println("비밀번호가 성공적으로 변경되었습니다.");
	}
	
//   비밀번호 변경(비밀번호 변경 페이지)
	public void changePassword(String originalPw, String newPw) {
		User foundUser = checkId(userId);
		if(foundUser.getPassword().equals(encrypt(originalPw))) {
			foundUser.setPassword(encrypt(newPw));
			System.out.println("비밀번호가 성공적으로 변경되었습니다.");
		} else {
			System.out.println("현재 비밀번호를 다시 확인해주시기 바랍니다.");
		}
	}
	
//	인증번호 제작
	public int makeNumber(int count) {
		Random random = new Random();
		int number = 0;
		for (int i = 0; i < count; i++) {
			number += random.nextInt(10);
		}
		return number;
	}

//   인증번호 전송
	
	
	
//   인증번호 생성
//   암호화
	public String encrypt(String password) {
		String encryptedPassword = "";
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char) (password.charAt(i) * KEY);
		}

		return encryptedPassword;
	}
}
