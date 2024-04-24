package basic.ch21;

public class ComputerMainTest {

	public static void main(String[] args) {
		
		Computer computer1 = new DeskTop();
		Computer computer2 = new MyNoteBook();
		
		computer1.display();
		computer2.typing();
		computer1.turnOn();
		computer2.turnOff();
	}
}
