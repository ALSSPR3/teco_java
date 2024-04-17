package basic.ch09;

public class field {

	public static void main(String[] args) {

		Warrior warrior = new Warrior("아레스", 19, 3);
		Archer archer = new Archer("시르카", 8, 6);
		Wizard wizard = new Wizard("스펠윈드", 14, 5);
		
		System.out.println("-------전사-------");
		warrior.showInfo();
		System.out.println("-------궁수-------");
		archer.showInfo();
		System.out.println("-------마법사-------");
		wizard.showInfo();

		
		warrior.archerhit(archer);
		System.out.println("-------hit-------");
		warrior.showInfo();
		archer.wizardhit(wizard);
		System.out.println("-------hit-------");
		archer.showInfo();
		wizard.warriorhit(warrior);
		System.out.println("-------hit-------");
		wizard.showInfo();
		

	} // end of main

} // end of class