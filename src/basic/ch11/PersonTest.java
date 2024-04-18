package basic.ch11;

public class PersonTest {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 주석 - 1번 객체 생성
		Person person1 = new Person("홍길동", 100);
		// 주석 - 1번객체의 주소값 대입 (객체 생성x)
		Person personBox = person1;
		Person personBox2 = person1.getPerson();
		// 주석 - 2번 객체 생성
		Person personLee = new Person("이순신", 101);
		
		// 위 코드까지는 Heap 메모리 영역에 객체가 2개 생성된 상태이다.
		// 지역변수인 person1, personBox, pesonBox2 는 같은 객체를 가리킨다.
		
		// 연습 문제
		personBox2.setName("티모");
		person1.showInfo();
		System.out.println(personBox.getName());
		
	} // end of main

} // end of class
