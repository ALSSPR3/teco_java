package basic.exercise;

import java.util.Scanner;

public class Dog {

	String dogName;
	String dogBreed;
	int dogAge;
	
	public void dogStatus() {
		System.out.println("---------개의 상태---------");
		System.out.println("개의 이름 : " + dogName);
		System.out.println("개의 종류 : " + dogBreed);
		System.out.println("개의 나이 : " + dogAge);
	}
	
	public void barking() {
		System.out.println(dogName + " (이)가 짖음");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog dog1 = new Dog();
		 
		System.out.print("개의 이름을 입력해 주세요 : ");
		dog1.dogName = sc.next();
		System.out.print("개의 종류를 입력해 주세요 : ");		
		dog1.dogBreed = sc.next();
		System.out.print("개의 나이를 입력해 주세요 : ");
		dog1.dogAge = sc.nextInt();
		
		dog1.dogStatus();
		dog1.barking();
	}
	
	
} // end of class
