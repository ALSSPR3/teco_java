package basic.exercise;

public class PhoneBook {

	private String name;
	private String phoneNumber;
	
	public PhoneBook(String phoneNumber,String name) {
		this.phoneNumber = phoneNumber;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
