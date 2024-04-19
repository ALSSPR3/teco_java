package basic.ch12;

public class Bank {

	private static String bankName;
	private String bankNum;;

	public Bank() {
		bankName = "우리 은행";
	}
	
	public static String getBankName() {
		return bankName;
	}
	public static void setBankName(String bankName) {
		Bank.bankName = bankName;
	}

	public void userAccount(Account account) {
		account.bankAccount(bankNum);
	}
	

}
