package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.Random;

public class MyUserField {
	public static String userId;
	public ArrayList<User> users = DBConnecter.users;
	private final int KEY = 3;

//   ���̵� �ߺ��˻�
	public User checkId(String id) {
//      ���� for��, ���� for��, forEach
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	������ȣ �߼�
	
//	������ȣ �˻�
	

//   ȸ������
	public void join(User user) {
		user.setPassword(encrypt(user.getPassword()));
		users.add(user);
	}

//   �α���
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
		System.out.println("���������� �α׾ƿ� �Ǽ̽��ϴ�.");
	}

//   ��й�ȣ ����(����������)
	public void changePassword(User user) {
		User userInDb = checkId(user.getId());
		userInDb.setPassword(encrypt(user.getPassword()));
		System.out.println("��й�ȣ�� ���������� ����Ǿ����ϴ�.");
	}
	
//   ��й�ȣ ����(��й�ȣ ���� ������)
	public void changePassword(String originalPw, String newPw) {
		User foundUser = checkId(userId);
		if(foundUser.getPassword().equals(encrypt(originalPw))) {
			foundUser.setPassword(encrypt(newPw));
			System.out.println("��й�ȣ�� ���������� ����Ǿ����ϴ�.");
		} else {
			System.out.println("���� ��й�ȣ�� �ٽ� Ȯ�����ֽñ� �ٶ��ϴ�.");
		}
	}
	
//	������ȣ ����
	public int makeNumber(int count) {
		Random random = new Random();
		int number = 0;
		for (int i = 0; i < count; i++) {
			number += random.nextInt(10);
		}
		return number;
	}

//   ������ȣ ����
	
	
	
//   ������ȣ ����
//   ��ȣȭ
	public String encrypt(String password) {
		String encryptedPassword = "";
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char) (password.charAt(i) * KEY);
		}

		return encryptedPassword;
	}
}
