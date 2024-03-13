package classTest;

import java.util.Scanner;

class SuperCar {
	// 브랜드
	String brand;
	// 색상
	String color;
	// 가격
	long price;
	// 엔진
	boolean engine;
	// 비밀번호
	String pw;
	// 검사 카운트
	int pwErrorCount;

	// static 블록 : 어떤 생성자든 최초 생성자 호출될 때만 실행되는 코드
	{
		System.out.println("출고 축하드립니다.");
	}

	// 초기화 블록 : 어떤 생성자가 호출되든 실행되는 코드
	{
		this.pw = "0000";
	}

	// 기본 생성자
	public SuperCar() {
		;
	}

	// 초기화 생성자
	public SuperCar(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public SuperCar(String brand, String color, long price, String pw) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pw = pw;
	}

	// 시동켜기
//	boolean engineStart() {
//		if(!engine) {
//			engine = true;
//			return true;
//		}
//		return false;
//	}

	void engineStart() {
		engine = true;
	}

	// 사용자가 입력한 비밀번호가 맞을 때에만 시동 켜기
	// 연속 3회 실패시 경찰 출동

	// 비밀번호 검사 메소드

	boolean pwCheck(String pw) {
		return this.pw.equals(pw);
	}

	// 시동끄기
	void engineStop() {
		engine = false;

	}
}

public class ClassTask1 {
	public static void main(String[] args) {

		SuperCar rambo = new SuperCar("ramborghini", "red", 700_000_000, "7777");

		String message = "1. 시동켜기\n2. 시동끄기";
		int choice = 0;
		String pw = null;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(message);
			choice = sc.nextInt();
			if (choice == 1) {
				if (!rambo.engine) {
					System.out.print("비밀번호 : ");
					pw = sc.next();
					if (pw.equals(rambo.pw)) {
						rambo.pwErrorCount = 0;
						rambo.engineStart();
						System.out.println(rambo.brand + " 시동 켜짐");
					} else if (!pw.equals(rambo.pw)) {
						++rambo.pwErrorCount;
						if (rambo.pwErrorCount > 2) {
							System.out.println("경찰 출동");
							break;
						}
					}
				} else {
					System.out.println("이미 시동이 켜져있습니다.");
				}
			} else if (choice == 2) {
				if (rambo.engine) {
					rambo.engineStop();
					System.out.println(rambo.brand + " 시동 꺼짐");
				} else {
					System.out.println("이미 시동이 꺼져있습니다.");
				}
			} else {
				System.out.println("다시 입력해주시기 바랍니다.");
			}

		}
	}
}
