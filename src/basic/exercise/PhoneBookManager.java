package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static final int PHONE_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 스캐너 사용
		// 배열 선언 100개
		// while()

		Scanner sc = new Scanner(System.in);
		PhoneBook[] phonebooks = new PhoneBook[100];

		// 샘플데이터
		phonebooks[0] = new PhoneBook("010-0000-0000", "김씨");
		phonebooks[1] = new PhoneBook("010-1111-1111", "이씨");
		phonebooks[2] = new PhoneBook("010-2222-2222", "박씨");
		phonebooks[3] = new PhoneBook("010-3333-3333", "전씨");

		boolean flag = true;

		while (flag) {
			System.out.println("======= 메뉴 선택 =======");
			System.out.println("1. 저장 | 2. 전체 조회 | 3. 전화 번호로 검색 | 4. 이름으로 검색  | 5. 수정 | 6. 선택 삭제 | 7. 초기화 | 0. 종료");
			final int SELECT = sc.nextInt();
			if (SELECT == 1) { // 저장
				phonNumberSave(sc, phonebooks, PHONE_INDEX_NUMBER);
			} else if (SELECT == 2) { // 전체 조회
				totalRead(phonebooks);
			} else if (SELECT == 3) { // 전화 번호로 검색
				readByPhoneNumber(sc, phonebooks);
			} else if (SELECT == 4) { // 이름으로 검색
				readByPhoneName(sc, phonebooks);
			} else if (SELECT == 5) { // 수정
				phoneDataUpdate(sc, phonebooks);
			} else if (SELECT == 6) { // 선택 삭제
				selectDataDelete(sc, phonebooks);
			} else if (SELECT == 7) { // 초기화
				phoneDataDelete(phonebooks);
			} else if (SELECT == 0) { // 종료
				System.out.println("종료 합니다.");
				flag = false;
			} else { // 잘못된 입력
				System.out.println("잘못된 입력입니다.");
			}

		}
	}

	// 저장
	public static void phonNumberSave(Scanner sc, PhoneBook[] phonebooks, int PHONE_INDEX_NUMBER) {
		System.out.println("----- 저장 하기 -----");
		System.out.println("등록하실 전화번호를 입력하세요. : ");
		String phoneNumber = sc.next();
		System.out.println("등록하실 이름을 입력하세요 : ");
		String phoneName = sc.next();

		PhoneBook phonebook = new PhoneBook(phoneNumber, phoneName);
		if (PHONE_INDEX_NUMBER >= phonebooks.length) {
			System.out.println("저장 공간이 부족합니다");
			return;
		}
		for (int i = 0; i < phonebooks.length; i++) {
			if (phonebooks[i] == null) {
				phonebooks[i] = phonebook;
				PHONE_INDEX_NUMBER++;
				break;
			}
		}
	}

	// 전체 조회
	public static void totalRead(PhoneBook[] phoneBooks) {
		System.out.println("------ 전체 조회 ------");
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				System.out.println(phoneBooks[i].getPhoneNumber() + " , " + phoneBooks[i].getName());
			}
		}
	}

	// 전화 번호로 검색
	public static void readByPhoneNumber(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("------ 전화 번호로 검색 ------");
		System.out.println("전화 번호 입력");
		String phoneNumber = sc.next();

		boolean flag = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null && phoneBooks[i].getPhoneNumber().equals(phoneNumber)) {
				System.out.println(phoneBooks[i].getPhoneNumber() + " , " + phoneBooks[i].getName());
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("저장된 번호가 없습니다.");
		}
	}

	// 이름으로 검색
	public static void readByPhoneName(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("------ 이름으로 검색 ------");
		System.out.println("이름 입력");
		String phoneName = sc.next();

		boolean flag = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null && phoneBooks[i].getName().equals(phoneName)) {
				System.out.println(phoneBooks[i].getPhoneNumber() + " , " + phoneBooks[i].getName());
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("저장된 번호가 없습니다.");
		}
	}

	// 수정
	public static void phoneDataUpdate(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("------ 수정 ------");
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				System.out.println(phoneBooks[i].getPhoneNumber() + " , " + phoneBooks[i].getName());
			}
		}
		System.out.println("몇번째 숫자를 수정하겠습니까?(0번부터 시작)");
		int updateNumber = sc.nextInt();
		for (int i = 0; i < phoneBooks.length; i++) {
			if (i == updateNumber) {
				System.out.println("수정할 전화번호를 입력하세요. : ");
				String phoneNumber = sc.next();
				System.out.println("수정할 이름을 입력하세요 : ");
				String phoneName = sc.next();

				PhoneBook phonebook = new PhoneBook(phoneNumber, phoneName);
				phoneBooks[i] = phonebook;
				break;
			}
		}
	}

	// 선택 삭제
	public static void selectDataDelete(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("------ 선택 삭제 ------");
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				System.out.println(phoneBooks[i].getPhoneNumber() + " , " + phoneBooks[i].getName());
			}
		}
		System.out.println("몇번째 번호를 삭제하겠습니까?(0번부터 시작)");
		int deleteNumber = sc.nextInt();
		for (int i = 0; i < phoneBooks.length; i++) {
			if (i == deleteNumber) {
				phoneBooks[i] = null;
				break;
			}
		}
	}

	// 초기화
	public static void phoneDataDelete(PhoneBook[] phoneBooks) {
		System.out.println("------ 초기화 ------");
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				phoneBooks[i] = null;
			}
		}
	}

} // end of class
