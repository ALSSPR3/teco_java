package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	// 메인 함수
	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자.

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행에 흐름을 만들고.
		// 2번을 누르면 지하철을 태우는 실행에 흐름을 만들어 보자.

		Scanner sc = new Scanner(System.in);

		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		SubWay subway1 = new SubWay(1);
		SubWay subway2 = new SubWay(2);

		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("아무개", 100_000);

		boolean flag = true;

		while (flag) {
			System.out.print("학생을 선택하세요 : ");
			int studentNum = sc.nextInt();

			if (studentNum == 1) { // 1번 학생
				System.out.print("무엇을 타고갈지 선택하세요. : ");
				int rideNum = sc.nextInt();
				if (rideNum == 1) { // 버스
					System.out.print("몇번 버스를 탈지 선택하세요 : ");
					int busNum = sc.nextInt();
					if (busNum == 1) {
						s1.takeBus(bus1);
						System.out.println("-----------------------");
						s1.showInfo();
						System.out.println("---------승차---------");
						bus1.showInfo();
						s1.dropBus(bus1);
						System.out.println("---------하차---------");
						bus1.showInfo();
						return;
					} else if (busNum == 2) {
						s1.takeBus(bus2);
						System.out.println("-----------------------");
						s1.showInfo();
						System.out.println("---------승차---------");
						bus2.showInfo();
						s1.dropBus(bus2);
						System.out.println("---------하차---------");
						bus2.showInfo();
						return;
					} else {
						System.out.println("!!ERROR!! \r 처음부터 다시 선택해 주세요.");
						continue;
					}
				} else if (rideNum == 2) { // 지하철
					System.out.print("몇번 노선를 탈지 선택하세요 : ");
					int subwayNum = sc.nextInt();
					if (subwayNum == 1) {
						s2.takeSubWay(subway1);
						System.out.println("-----------------------");
						s2.showInfo();
						System.out.println("-----------------------");
						subway1.showInfo();
						s2.dropSubway(subway1);
						System.out.println("---------하차---------");
						subway1.showInfo();
						return;
					} else if (subwayNum == 2) {
						s1.takeSubWay(subway2);
						System.out.println("-----------------------");
						s1.showInfo();
						System.out.println("---------승차---------");
						subway2.showInfo();
						s1.dropSubway(subway2);
						System.out.println("---------하차---------");
						subway2.showInfo();
						return;
					}
				} else {
					System.out.println("!!ERROR!! \t 처음부터 다시 선택해 주세요.");
					continue;
				}
			} else if (studentNum == 2) { // 2번 학생
				System.out.print("무엇을 타고갈지 선택하세요. : ");
				int rideNum = sc.nextInt();
				if (rideNum == 1) { // 버스
					System.out.print("몇번 버스를 탈지 선택하세요 : ");
					int busNum = sc.nextInt();
					if (busNum == 1) {
						s2.takeBus(bus1);
						System.out.println("-----------------------");
						s2.showInfo();
						System.out.println("---------승차---------");
						bus1.showInfo();
						s2.dropBus(bus1);
						System.out.println("---------하차---------");
						bus1.showInfo();
						return;
					} else if (busNum == 2) {
						s2.takeBus(bus2);
						System.out.println("-----------------------");
						s2.showInfo();
						System.out.println("---------승차---------");
						bus2.showInfo();
						s2.dropBus(bus2);
						System.out.println("---------하차---------");
						bus2.showInfo();
						return;
					} else {
						System.out.println("!!ERROR!! \t 처음부터 다시 선택해 주세요.");
						continue;
					}
				} else if (rideNum == 2) { // 지하철
					System.out.print("몇번 노선를 탈지 선택하세요 : ");
					int subwayNum = sc.nextInt();
					if (subwayNum == 1) {
						s2.takeSubWay(subway1);
						System.out.println("-----------------------");
						s2.showInfo();
						System.out.println("---------승차---------");
						subway1.showInfo();
						s2.dropSubway(subway1);
						System.out.println("---------하차---------");
						subway1.showInfo();
						return;
					} else if (subwayNum == 2) {
						s2.takeSubWay(subway2);
						System.out.println("-----------------------");
						s2.showInfo();
						System.out.println("---------승차---------");
						subway2.showInfo();
						s2.dropSubway(subway2);
						System.out.println("---------하차---------");
						subway2.showInfo();
						return;
					} else {
						System.out.println("!!ERROR!! \t 처음부터 다시 선택해 주세요.");
						continue;
					}
				} else {
					System.out.println("!!ERROR!! \t 처음부터 다시 선택해 주세요.");
					continue;
				}
			} else {
				System.out.println("1번 학생과, 2번학생 중 하나를 골라주세요.");
				continue;
			}
		}
	} // end of main

}// end of class
