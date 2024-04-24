package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		ToyMachine[] product = new ToyMachine[20];
		ToyMachine result = new ToyMachine();
		ToyMachine lionDoll = new LionDoll();
		ToyMachine bearDoll = new BearDoll();
		ToyMachine airPot = new AirPot();

		for (int i = 0; i < product.length; i++) { // 인형 넣기
			int producttype = random.nextInt(3);
			switch (producttype) {
			case 0:
				product[i] = lionDoll;
				break;
			case 1:
				product[i] = bearDoll;
				break;
			case 2:
				product[i] = airPot;
				break;
			default:
				break;
			}
		}

		System.out.println("뽑으시려면 '시작' 을 입력하세요.");
		String start = sc.nextLine();

		if (start.equals("시작")) { // 인형 뽑기
			int pickUp = random.nextInt(2);
			if (pickUp == 0) {
				int pickType = random.nextInt(20);
				result.pickUpProduct(product[pickType].type);
				if (product[pickType] instanceof LionDoll) {
					((LionDoll) product[pickType]).pushSound();
				} else if (product[pickType] instanceof BearDoll) {
					((BearDoll) product[pickType]).pushSound();
				} else {
					((AirPot) product[pickType]).bluetoothPariling();
				}
			} else {
				result.failProduct();
			}
		}

	} // end of main

} // end of class
