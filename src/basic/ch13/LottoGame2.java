package basic.ch13;

public class LottoGame2 {

	public static void main(String[] args) {

		// static 변수 --> 클래스 변수라고도 불린다.

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		int index = 0;

		// 전체 1~6 까지 나온 결과값을 오름 차순으로 정렬
		// 단, 중복 값 제외

		// 만약 if --> 반복문 사용 금지 if문 6개

		if (gameNumber1 > gameNumber2) {
			index = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = index;
		} else if (gameNumber2 > gameNumber3) {
			index = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = index;
		} else if (gameNumber3 > gameNumber4) {
			index = gameNumber3;
			gameNumber3 = gameNumber4; 
			gameNumber4 = index;
		} else if (gameNumber4 > gameNumber5) {
			index = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = index;
		} else if (gameNumber5 > gameNumber6) {
			index = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = index;
		}

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

	} // end of main

}
