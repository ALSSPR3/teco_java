package basic.ch09;

public class Wizard {

	String wizardName;
	int wizardHealth;
	int wizardAttackDamage;

	public Wizard(String name, int health, int damage) {
		wizardName = name;
		wizardHealth = health;
		wizardAttackDamage = damage;
	}

	public void warriorhit(Warrior warrior) {
		if(wizardHealth <= 0) {
			System.out.println("이미 죽었습니다");
			return; // 실행에 흐름 반환
		}
		wizardHealth = wizardHealth - warrior.warriorAttackDamage;
	}
	
	public void archerhit(Archer archer) {
		if(wizardHealth <= 0) {
			System.out.println("이미 죽었습니다");
			return; // 실행에 흐름 반환
		}
		wizardHealth = wizardHealth - archer.archerAttackDamage;
	}

	public void showInfo() {
		System.out.println("이름 : " + wizardName);
		System.out.println("남은 체력 : " + wizardHealth);
		System.out.println("공격력 : " + wizardAttackDamage);
	}
}
