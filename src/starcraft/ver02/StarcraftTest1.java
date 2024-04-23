package starcraft.ver02;

public class StarcraftTest1 {

	public static void main(String[] args) {
		
		// 질럿 2
		Zealot zealot1 = new Zealot("1번 질럿");
		Zealot zealot2 = new Zealot("2번 질럿");
		// 마린 2
		Marine marine1 = new Marine("1번 마린");
		Marine marine2 = new Marine("2번 마린");
		// 저글링 2
		Zergling zergling1 = new Zergling("1번 저글링");
		Zergling zergling2 = new Zergling("2번 저글링");
		
		for (int i = 0; i < 15; i++) {
			zealot1.attack(marine2);
		}
		marine2.showInfo();
		
	} // end of main

} // end of class
