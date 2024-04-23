package starcraft.ver02;

import java.util.Scanner;

public class StarcraftTest2 {

	public static void main(String[] args) {
		
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;

		Gateway gateway1 = new Gateway(1);
		Gateway gateway2 = new Gateway(2);
		
		Hatchery hatchery1 = new Hatchery(1);
		Hatchery hatchery2 = new Hatchery(2);
		
		Barracks barrack1 = new Barracks(1);
		Barracks barrack2 = new Barracks(2);
		
		System.out.println("게이트웨이");
		Zealot zealot1 = gateway1.gatewayUnitMake("질럿1");
		Zealot zealot2 = gateway1.gatewayUnitMake("질럿2");
		System.out.println(gateway1.getGatewayNumber()+" : "+gateway1.getUnitCount());
		System.out.println(gateway2.getGatewayNumber()+" : "+gateway2.getUnitCount());
		System.out.println("-----------------------------");
		
		System.out.println("해처리");
		Zergling zergling1 = hatchery1.hatcheryUnitMake("저글링1");
		Zergling zergling2 = hatchery1.hatcheryUnitMake("저글링2");
		System.out.println(hatchery1.getHatcheryNumber()+" : "+hatchery1.getUnitCount());
		System.out.println(hatchery2.getHatcheryNumber()+" : "+hatchery2.getUnitCount());
		System.out.println("-----------------------------");
		
		System.out.println("배럭");
		Marine marine1 = barrack1.barracksUnitMake("마린1");
		Marine marine2 = barrack1.barracksUnitMake("마린2");
		System.out.println(barrack1.getBarracksNumber()+" : "+ barrack1.getUnitCount());
		System.out.println(barrack2.getBarracksNumber()+" : "+ barrack2.getUnitCount());
		System.out.println("-----------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		int unitChoice = -1;
		
		// while <--, do while
		// while --> 조건식을 확인하고 코드를 수행하는 녀석
		// do while --> 무조건 한번은 수행을 하고 다시 조건을 확인하는 녀석
		
		do {
			System.out.println("유닛을 선택하세요");
			System.out.println("1. 질럿 \t 2. 마린\t 3. 저글링\t 0. 게임종료");
			unitChoice = sc.nextInt();
			
			if (unitChoice == ZEALOT) {
				
			} else if(unitChoice == MARINE) {
				
			} else if (unitChoice == ZERGLING) {
				
			} else {
				System.out.println("프로그램을 종료 합니다.");
				unitChoice = GAME_END;
			}
			
		} while (unitChoice != GAME_END);
		
		
	} // end of main

} // end of class
