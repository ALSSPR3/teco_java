package basic.ch09;

public class Student {

	String name;
	int money; // 소지금

	public Student(String myname, int myMoney) {
		name = myname;
		money = myMoney;
	}

	// 학생이 버스를 탄다.
	public void takeBus(Bus bus) {
		// 어떻게 코드를 만들어야 할까?
		bus.take(1500);
		money = money - 1500;
	}

	// 학생이 지하철을 탄다.
	public void takeSubWay(SubWay subway) {
		subway.take(1100);
		money = money - 1100;
	}

	public void dropBus(Bus bus) {
		bus.drop();
	}

	public void dropSubway(SubWay subway) {
		subway.drop();
	}

	// 상태창을 보여 준다.
	public void showInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("소지금 : " + money);
	}
}
