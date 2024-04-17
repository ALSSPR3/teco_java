package basic.ch04;

public class WhileTest2_1 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		int start = 1; // 시작값은 1
		int end = 5; // 5번
		int sum = 0;
		
		// 첫번째 반복
		// 6번째
		//        6  <= 5 --> 거짓
		// 특정 조건식을 만들어 반복문을 멈추게 해야 한다.
		// 만약 start 값이 10일 때 종료 하라.
		boolean flag = true;
		while (flag) {		
			if (start == end) {
				// 실행에 제어권을 반납한다.
				flag = false;
				return;
			}
		// 1: 1  =   0  +  1   ;
		// 2: 3  =   1  +  2   ;
		// 3: 6  =   3  +  3   ;
		// 4: 10 =   6  +  4   ;
		// 5: 15 =  10  +  5   ;
			sum = sum + start;
			System.out.println("sum(" + start + ") : " + sum);
			start++;
		} // end of while
		
		
	} // end of main

} // end of class
