package basic.ch13;

import java.util.Random;

public class LottoNumberMaker {

	// 멤버 변수
	private String version = "1.0.0";
	
	
	// 메인 함수
	public static void main(String[] args) {
	
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		
		
	}
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// 자바 도구 --> 표준 API
		// 난수 발생기 - 랜덤적이 값을 생성
		// static 함수안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 !!
		// System.out.println("ver : " + version);
		Random random = new Random();
		int resutlNumber = random.nextInt(1, 45);
		
		
		return resutlNumber;
	}
	
}
