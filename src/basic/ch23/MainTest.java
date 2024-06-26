package basic.ch23;

public class MainTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		// 생성자 의존 주입 ( DI )
		Father father = new Father(account);
		father.start();

		// 어머니 클래스 new
		Mother mother = new Mother(account);
		mother.start();
		
		int resultMoney = account.getMoney();
		System.out.println("현재 잔액 : " + resultMoney);
		
	}

}
