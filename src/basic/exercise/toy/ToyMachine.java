package basic.exercise.toy;

// 클래스 인형뽑기
// 상품들이 존재 가능
// 사자 인형, 곰 인형 , 에어팟
// 요구 조건
// 배열을 활용해서 개체들을 담아 주세요
public class ToyMachine {

	String[] product;
	String type;

	public void pickUpProduct(String type) {
		System.out.println(type + "을 뽑았습니다!");
	}

	public void failProduct() {
		System.out.println("놓쳤습니다.");
	}

}
