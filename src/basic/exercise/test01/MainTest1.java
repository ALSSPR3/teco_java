package basic.exercise.test01;

public class MainTest1 {

	public static void main(String[] args) {

		// 문제 1
		A a = new A();
		// a 참조 변수로 시작해서 D에 name 값을
		// 화면에 출력하시오.

		System.out.println(a.b.c.d.getName());
		a.b.c.d.setName("1234");
		

	} // end of main

} // end of class
