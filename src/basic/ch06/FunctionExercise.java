package basic.ch06;

import java.util.Scanner;

public class FunctionExercise {

	// 코드의 시작점
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름를 입력해 주세요 : ");
		String greet = sc.next();
		Greet(greet);
		System.out.println("--------------------------");

		System.out.print("아무 숫자를 입력해 주세요 : ");
		int squareNum = sc.nextInt();
		System.out.println(squareNum + "의 제곱은 : " + Square(squareNum));
		System.out.println("--------------------------");

		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		System.out.println("당신은 성인이 " + CheckAdult(age));
		System.out.println("--------------------------");

		System.out.print("아무 숫자를 입력해 주세요 : ");
		int signOfNumber = sc.nextInt();
		System.out.println("당신이 입력한 수는 : " + SignOfNumber(signOfNumber));
		System.out.println("--------------------------");

		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.println("두 수중 큰 수는 : " + FindMax(num1, num2));
		System.out.println("--------------------------");

	} // end of main

	static void Greet(String greet) { // 인사말 출력하기
		System.out.println("안녕하세요 " + greet + "님!");
	}

	static int Square(int a) { 	// 제곱 계산하기
		int square;				
		square = a * a;			// 제곱 계산
		return square;			// square 값 반환
	}

	static boolean CheckAdult(int a) {  // 나이 확인	
		boolean checkAdult;				// true, false 로 출력
		if (a >= 18) {					// 18세 이상 조건문
			checkAdult = true;
		} else {						
			checkAdult = false;
		}
		return checkAdult;				// checkAdult 값 반환
	}

	static String SignOfNumber(int age) {	// 수의 부호 판별하기 
		String numType;						// string 값으로 출력하기 위함
		if (age > 0) {						// 0보다 큰 수 일 경우
			numType = "Positive";
		} else if (age < 0) {				// 0보다 작은 수 일 경우
			numType = "negative";
		} else {							// else if (a == 0) 은 오류발생 
			numType = "zero";				// 0일 경우
		}
		return numType;						// numType갑 리턴
	}

	static int FindMax(int a, int b) { 		// 두 수중 큰 수 비교
		int result = a > b ? a : b;			// 삼항 연산자 사용
		return result;						// result 값 리턴
	}

} // end of class
