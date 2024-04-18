package basic.ch12;

public class Account {

	private static String bankUserNumber;

	public static String getBankUserNumber() {
		return bankUserNumber;
	}

	public static void setBankUserNumber(String bankUserNumber) {
		Account.bankUserNumber = bankUserNumber;
	}
	
	public void bankAccount(String bankNum) {
		System.out.println("고객님이 입력하신 번호는 " + bankNum + " 입니다.");
		bankUserNumber = bankNum;
	}
}
