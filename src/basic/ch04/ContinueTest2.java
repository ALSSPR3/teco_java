package basic.ch04;

public class ContinueTest2 {

	// 코드의 시작점
	public static void main(String[] args) {
		// 1부터 100까지 숫자 중에 3의 배수를 출력 하세요
		// 1 ~ 100 --> 반복적인 패턴이 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요
		// 반복문은 while 을 사용해 주세요
		int i = 1;
		boolean flag = true;
		// 풀이 - 2 : 특정 조건이 되었을 때 반복문을 멈추어라
		while (flag) {
			if (i % 3 == 0) {		
				System.out.println("3의 배수 : " + i);
			}
			// 특정 조건 --> 멈추기
			if (i == 100) {
				break;
			}
			i++;
		}

		// 풀이 - 1
//		while (i < 101) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}

	} // end of main

} // end of class
