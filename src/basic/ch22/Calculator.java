package basic.ch22;

public abstract class Calculator implements Calc{

	// 예상 테스트 값 n1 - 10, n2 - 0
	@Override
	public double divide(double n1, double n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			return 0;
		}
		return n1/n2;
	}
}
