package basic.exercise;

public class Exercise1 {

	// 코드의 시작점 (main)함수
	public static void main(String[] args) {
		// 1. 데이터 10, 100, 100 을 변수 선언과 동시에 초기화를 하고 화면에 출력해 보세요.
		
		int ten = 10; // 변수에 선언과 동시에 초기화(값을 넣다)
		int hun1 = 100;
		int hun2 = 100;
		
		System.out.println(ten);
		System.out.println(hun1);
		System.out.println(hun2);
		System.out.println();
		
		// ------------------------- //
		
		// 2 int ageBox 상자에 20을 담기
		int ageBox;
		ageBox = 20;
		
		// 2.1 ageBox 상자의 값을 30으로 변경하고 기존에
		// 담겨있던 데이터 
		int telBox;
		telBox = ageBox;
		
		System.out.println("befor ageBox : " + ageBox);
		ageBox = 30;
		System.out.println("----------------------");
		System.out.println("after ageBox : "+ ageBox);
		System.out.println("etc : "+ telBox);
		System.out.println();
		
		// --------------------//
		
		
		// 3. int a = 1; int b = 3;
		// 선언하고 a와 b에 담겨 있는 값을 서로 스위칭
		int a = 1;
		int b = 3;
		int c = a;
		
		// 값이 사라지지 않게 하기 위해서는 메모리 상자를 하나 더 만들어서
		//넣어 두면 된다.
		
		a = b;
		b = c;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	} // end of main
} // end of class
