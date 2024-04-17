package basic.ch09;

public class Warrior {

	String warriorName;
	int warriorHealth;
	int warriorAttackDamage;

	public Warrior(String name, int health, int damage) {
		warriorName = name;
		warriorHealth = health;
		warriorAttackDamage = damage;
	}

	public void archerhit(Archer archer) {
		if(warriorHealth <= 0) {
			System.out.println("이미 죽었습니다");
			return; // 실행에 흐름 반환
		}
		warriorHealth = warriorHealth - archer.archerAttackDamage;
	}
	
	public void wizardhit(Wizard wizard) {
		if(warriorHealth <= 0) {
			System.out.println("이미 죽었습니다");
			return; // 실행에 흐름 반환
		}
		warriorHealth = warriorHealth - wizard.wizardAttackDamage;
	}

	public void showInfo() {
		System.out.println("이름 : " + warriorName);
		System.out.println("남은 체력 : " + warriorHealth);
		System.out.println("공격력 : " + warriorAttackDamage);
	}

}
