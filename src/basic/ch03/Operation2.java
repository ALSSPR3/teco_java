package basic.ch03;

public class Operation2 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
		// int result4 = 5 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;
		
		System.out.println("result 1 : " + result1);
		System.out.println("result 2 : " + result2);
		System.out.println("result 3 : " + result3);
		System.out.println("result 4 : " + result4);
		System.out.println("result 5 : " + result5);
		
		// 문제
		// 1. (12 + 3) / 3 값을 화면에 출력해 보세요
		// 변수명, 데이터 유형 스스로 결정하고 식을 만들어 보세요
		
		double num1 = 12.0;
		double num2 = 3.0;
		double num3 = 3.0;
		
		double result = (num1 + num2) / num3;
		
		System.out.println("계산 결과 : " + result);
		System.out.println();
		
		// 2. (25 % 2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을때 나머지가 0이면 짝수 1이면 홀수
		int count1 = 25;
		int count2 = 2;
		
		int output;
		
		output = count1 % count2;
		
		System.out.println(output);
		if (output == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		// 3. 15를 4로 나눈 후 , 그 결과의 절대값을 출력하세요
		int a = 15;
		int b = 4;
		int c = a/b;
		
		System.out.println();
		System.out.println(Math.abs(c));
		
		
	} // end of main
} // end of class