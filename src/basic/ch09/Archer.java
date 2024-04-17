package basic.ch09;

public class Archer {

	String archerName;
	int archerHealth;
	int archerAttackDamage;

	public Archer(String name, int health, int damage) {
		archerName = name;
		archerHealth = health;
		archerAttackDamage = damage;
	}

	public void warriorhit(Warrior warrior) {
		if(archerHealth <= 0) {
			System.out.println("이미 죽었습니다");
			return; // 실행에 흐름 반환
		}
		archerHealth = archerHealth - warrior.warriorAttackDamage;
	}
	
	public void wizardhit(Wizard wizard) {
		if(archerHealth <= 0) {
			System.out.println("이미 죽었습니다");
			return; // 실행에 흐름 반환
		}
		archerHealth = archerHealth - wizard.wizardAttackDamage;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + archerName);
		System.out.println("남은 체력 : " + archerHealth);
		System.out.println("공격력 : " + archerAttackDamage);
	}

}
