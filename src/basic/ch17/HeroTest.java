package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 100);
		Archer archer = new Archer("궁수", 75);
		Wizard wizard = new Wizard("마법사", 50);

		warrior.attack();
		warrior.comboAttack(2);

		archer.attack();
		archer.fireArrow();

		wizard.attack();
		wizard.freezing();
	}
	
}
