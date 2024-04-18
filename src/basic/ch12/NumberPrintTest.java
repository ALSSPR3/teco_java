package basic.ch12;

public class NumberPrintTest {

	public static void main(String[] args) {
		
		NumberPrinter n1 = new NumberPrinter(1); // 왼쪽
		NumberPrinter n2 = new NumberPrinter(2); // 오른쪽
		
		n1.printWaitNumber(); // 고객1
		n1.printWaitNumber(); // 고객2
		n1.printWaitNumber(); // 고객3
		n1.printWaitNumber(); // 고객4
		
		n2.printWaitNumber(); // 고객5
		n2.printWaitNumber(); // 고객6
		n2.printWaitNumber(); // 고객7
		n2.printWaitNumber(); // 고객8
		
	} // end of main
	
} // end of class
