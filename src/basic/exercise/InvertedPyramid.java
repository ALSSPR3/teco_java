package basic.exercise;

public class InvertedPyramid {

	// 코드의 시작점
	public static void main(String[] args) {

		int a;
		int i;
		for (a = 4; a > 0; a--) {
			for (i = a; i > 0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}

	} // end of main

} // end of class
