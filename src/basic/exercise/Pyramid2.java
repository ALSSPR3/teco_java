package basic.exercise;

public class Pyramid2 {

	// 코드의 시작점
	public static void main(String[] args) {

		for (int a = 1; a < 10; a+=2) {
			for (int i = 1; i <= a; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} // end of main

} // end of class
