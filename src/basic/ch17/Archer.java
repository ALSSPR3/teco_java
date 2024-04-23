package basic.ch17;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void attack() {
		System.out.println(super.getName() + "의 기본 공격");
	}

	public void fireArrow() {
		System.out.println(super.getName() + "의 불 화살 공격");
	}
}
