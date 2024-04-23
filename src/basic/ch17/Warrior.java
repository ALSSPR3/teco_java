package basic.ch17;

public class Warrior extends Hero{

	public Warrior(String name, int hp) {
		super(name, hp);
	}
	
	public void attack() {
		System.out.println(super.getName() + "의 기본 공격");
	}
	
	public void comboAttack(int combo) {
		System.out.println(super.getName() + "의 " + combo + "단 공격");
	}

}
