package basic.exercise;

import java.util.Scanner;

public class IfExercise {

	// 코드의 시작점
	public static void main(String[] args) {
		
		System.out.println("성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		System.out.println("로깅 - 받은값 확인 : " + point);
		
		if(point <= 59) {
			System.out.println("F학점 입니다.");
		} else if (point <= 69) {
			System.out.println("D학점 입니다.");
		} else if (point <= 79) {
			System.out.println("C학점 입니다.");
		} else if (point <= 89) {
			System.out.println("B학점 입니다.");			
		} else {
			System.out.println("A학점 입니다.");						
		}
		
		sc.close();

	} // end of main

} // end of class
