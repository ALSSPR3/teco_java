package basic.ch22;

public class Studnet implements Romeo {

	String name;
	
	public Studnet(String name) {
		this.name = name;
	}
	@Override
	public void performAsRomeo() {
		System.out.println("학교 축제에서 " + name + "이 연극을 합니다.");
	}

	
}
