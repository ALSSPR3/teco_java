 package basic.ch12;

public class Card {

	// 멤버 변수, static 변수
	private String userName;
	private static int cardSerialNumber = 1000;

	// 생성자
	public Card(String name) {
		this.userName = name;
	}
	
	// 멤버 함수
	public int userSerialNumber() {
		int userSerialNumber;
		userSerialNumber = getCardSerialNumber();
		setCardSerialNumber(++cardSerialNumber);
		return userSerialNumber;
	}

	// get, set 작성
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public static int getCardSerialNumber() {
		return cardSerialNumber;
	}

	public static void setCardSerialNumber(int cardSerialNumber) {
		Card.cardSerialNumber = cardSerialNumber;
	}

	// 코드 테스트 (메인 함수)
	public static void main(String[] args) {
		Card user1 = new Card("홍길동");
		System.out.println(user1.userSerialNumber());
		
		Card user2 = new Card("이순신");
		System.out.println(user2.userSerialNumber());
		
		Card user3 = new Card("강감찬");
		System.out.println(user3.userSerialNumber());
		
		
		
	} // end of main
	
} // end of class
