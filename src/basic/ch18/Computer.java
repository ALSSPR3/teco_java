package basic.ch18;

public class Computer {

	private Cpu cpu;

	public Computer() {
		cpu = new Cpu();
		cpu.setName("인텔 10");
	}

	public void start() {
		System.out.println("컴퓨터가 시작 됩니다.");
		cpu.process();
	}

	// 외부에서 접근 가능한 getter
	public Cpu getCpu() {
		return cpu;
	}

	// 필요하다면 setter 메서드를 만들 수 있다.
	// 외부에서 주입 받을 수 있다.
	public void setCPU(Cpu cpu) {
		this.cpu = cpu;
	}

}
