package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	// 코드의 시작점
	public static void main(String[] args) {
		// 사용자의 입력값을 받아서 1부터 x 까지 숫자에 홀수를 덧셈하고 출력 하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요. : ");
		int max_Num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= max_Num; i += 2) {
			sum += i;
			System.out.print("sum : " + sum + " \n");
		}
		System.out.println("홀수의 총합 : " + sum);
		
		
	} // end of main
	
} // end of class
