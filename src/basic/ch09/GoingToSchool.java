package basic.ch09;

public class GoingToSchool {

	// 메인 함수
	public static void main(String[] args) {

		// 객체지향 프로그래밍이란 객체와 객체간에 관계를 형성하고
		// 상호 작용하게 프로그래밍 하는 것

		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		SubWay subway1 = new SubWay(1);
		SubWay subway2 = new SubWay(2);
		SubWay subway3 = new SubWay(3);

		// 집중!
		Student student1 = new Student("홍길동", 10_000);
		student1.showInfo();
		bus2.showInfo();
		// 학생이 버스를 탄다
		System.out.println("-----------------------");
		student1.takeBus(bus2);
		student1.showInfo();
		// 버스의 상태값을 확인해보자.
		System.out.println("-----------------------");
		bus2.showInfo();
		System.out.println("-----------------------");
		student1.takeSubWay(subway1);
		student1.showInfo();
		System.out.println("-----------------------");
		subway1.showInfo();
		System.out.println("-----------------------");
		subway2.showInfo();
		
	} // end of main

} // end of class
