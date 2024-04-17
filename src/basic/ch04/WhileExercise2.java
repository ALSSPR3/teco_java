package basic.ch04;

public class WhileExercise2 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		int start = 1;
		int end = 10;
		int result = 0;
		
		while (true) {
			result += start;
			start ++;
			if (start == end) {
				System.out.println(result);
				return;
			}
		}
		
	} // end of main

} // end of class
