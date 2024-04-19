package basic.ch13;

public class LottoGame3 {

    public static void main(String[] args) {

        int gameNumber1 = LottoNumberMaker.makeNumber();
        int gameNumber2 = LottoNumberMaker.makeNumber();
        int gameNumber3 = LottoNumberMaker.makeNumber();
        int gameNumber4 = LottoNumberMaker.makeNumber();
        int gameNumber5 = LottoNumberMaker.makeNumber();
        int gameNumber6 = LottoNumberMaker.makeNumber();

        int index;

        // 비교 횟수에 따라 반복
        for (int pass = 1; pass <= 5; pass++) {
            if (gameNumber1 > gameNumber2) {
                index = gameNumber1;
                gameNumber1 = gameNumber2;
                gameNumber2 = index;
            }
            if (gameNumber2 > gameNumber3) {
                index = gameNumber2;
                gameNumber2 = gameNumber3;
                gameNumber3 = index;
            }
            if (gameNumber3 > gameNumber4) {
                index = gameNumber3;
                gameNumber3 = gameNumber4;
                gameNumber4 = index;
            }
            if (gameNumber4 > gameNumber5) {
                index = gameNumber4;
                gameNumber4 = gameNumber5;
                gameNumber5 = index;
            }
            if (gameNumber5 > gameNumber6) {
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
