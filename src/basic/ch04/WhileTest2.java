package basic.ch04;

import java.util.Scanner;

public class WhileTest2 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 특정 조건일 때 반복문을 종료 시켜 보자.
		
		boolean flag = true;
		
		int start = 1;
		int end = 3;
		// Scanner sc = new Scanner(System.in);
		// int end = sc.nextInt();
		
		while (flag) {
			if (start == end) {
				System.out.println("if 구문이 동작함");
				flag = !flag;
				return;
			}
			System.out.println("start : " + start);
			
			start++;
		}
		

	} // end of main

} // end of class
