package basic.ch21;

import java.util.Scanner;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("메인 화면");
	}
	
	@Override
	public void typing() {
		Scanner sc = new Scanner(System.in);
		String typing = sc.next();
		System.out.println(typing);
	}
	
	
}
