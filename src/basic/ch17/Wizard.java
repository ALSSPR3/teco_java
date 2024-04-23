package basic.ch17;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void attack() {
		System.out.println(super.getName() + "의 기본 공격");
	}

	public void freezing() {
		System.out.println(super.getName() + "의 얼음 공격");
	}
}
