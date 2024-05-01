package useful.ch05;

public class MyThreadMainTest2 {

	// 메인 작업자
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread2 th1 = new MyThread2();
		
		// 새로운 작업자를 생성하기 위임 시킬때는 Thread 안에 있는 start() 메서드를 호출해야 한다.
		
		Thread th = new Thread(th1);
		
		th.start();
		// 결국 다른작업자에세 일을 위임하려면 쓰레드에 start()	를 호출 해야해  
		System.out.println("end main");
		
		
	}
}
