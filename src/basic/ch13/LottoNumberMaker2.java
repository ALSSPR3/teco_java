package basic.ch13;

import java.util.Arrays;
import java.util.Random;

public class LottoNumberMaker2 {

	// 멤버 변수
	private String version = "1.0.0";

	// 메인 함수
	public static void main(String[] args) {
		int[] lottos = makeNumbers();
		Arrays.sort(lottos);
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + "\t");
		}
	}

	// 인스턴스에 속하지 않는 함수 만들기 
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		// 중복된 랜덤 1 ~ 45 숫자가 나온다면 
		// 다시 반복문을 돌려서 중복 안되게 만들어야 한다. 
		// 0  --> 33 
		// 1  --> 33
		for(int i = 0; i < 6; i++) {
			numbers[i] = random.nextInt(45) + 1;
			//      j = 0 , 0 < 0  <-- 동작 안함
			//      j = 0 , 0 < 1  <-- 동작 안함
			for(int j = 0; j < i; j++) {
					// j --> 0 , i --> 1 
					if(numbers[j] == numbers[i]) {
						i--;
						break;
					}
			} 
		}
		return numbers;
	}

}
