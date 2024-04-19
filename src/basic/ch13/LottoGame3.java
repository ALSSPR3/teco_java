package basic.ch13;

import java.util.Iterator;

public class LottoGame3 {

	public static void main(String[] args) {

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		int index = 0;

		// 반복의 횟수
		for (int pass = 1; pass <= 6; pass++) {
			if (gameNumber1 < gameNumber2) {
				index = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = index;
			} else if (gameNumber2 < gameNumber3) {
				index = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = index;
			} else if (gameNumber3 < gameNumber4) {
				index = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = index;
			} else if (gameNumber4 < gameNumber5) {
				index = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = index;
			} else if (gameNumber5 < gameNumber6) {
				index = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = index;
			}

		} // end of for

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6);

	} // end of main

}
