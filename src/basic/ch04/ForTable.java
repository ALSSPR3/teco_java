package basic.ch04;

public class ForTable {

	// 코드의 시작점
	public static void main(String[] args) {

		int row;
		int column;
		
		int num = 0;
		for (column = 1; column <= 3; column++) {
			for (row = 1; row <= 3; row++) {
				System.out.print(num + "\t");
				num++;	
			}
			num = 0;
			System.out.println("\n");
		}

	} // end of main

} // end of class
