package basic.ch22;

public class CompleteCalc extends Calculator {

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int substract(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}
	
	public void showInfo() {
		System.out.println("계산 완료");
	}

	// 코드 테스트 메인 테스트
	public static void main(String[] args) {

		Calc calc = new CompleteCalc();

		System.out.println(calc.add(165, 50));
		System.out.println(calc.substract(22, 4));
		System.out.println(calc.times(2, 3));
		System.out.println(calc.divide(60, 2));
		System.out.println(calc.divide(45, 0));
		System.out.println("------------------------");

		// 반복문, 제어문 활용한다면 instanceof 연산자를 기억하자
		if (calc instanceof CompleteCalc) {
			((CompleteCalc) calc).showInfo();
		}
	}

}
