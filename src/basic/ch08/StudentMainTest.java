package basic.ch08;

public class StudentMainTest {

	// 코드의 시작점(메인 함수) 
	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 101, 3); // 객체
		// System.out.println(s1);		// 주소값이 출력이 된다.
		// s1.showInfo();
		
		//연습 문제
		// s2 참조 변수에 이름으로 학생을 메모리에 올리고
		// 
		Student s2 = new Student("아무개", 102, 4);
		// s2.showInfo();
		
		// 변수에 직접 접근해서 값을 초기화 해보세요
		Student s3 = new Student(); // 기본 생성자로 메모리가 올림
		s3.name = "김무개";
		s3.number = 103;
		s3.grade = 1;
		s3.showInfo();
		
		// 생성자를 여러개 만들어 줄 수 있다.
		// 생성자 오버로딩이라고 한다.
		
	} // end of main
	
} // end of class
