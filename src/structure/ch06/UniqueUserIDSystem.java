package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;

	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}

	// 사용자 아이디 등록
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userId) {
		return userIDs.add(userId);
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ID를 입력해주세요");
			String userId = sc.nextLine();
			boolean flag = registerUserID(userId);
			if ("exit".equals(userId)) {
				System.out.println("시스템 종료");
				break;
			}
			if (flag) {
				System.out.println("정상적으로 등록 되었습니다.");
			} else {
				System.out.println("이미 가입된 아이디 입니다.");
			}
		}
	}

	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();
	}

}
