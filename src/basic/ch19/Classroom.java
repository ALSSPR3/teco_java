package basic.ch19;

public class Classroom {

	private String className;
	private Student[] students;
	private int studentCount;
	private final int MAX_STUDENT = 30;

	public Classroom(String ClassName) {
		this.className = ClassName;
		students = new Student[MAX_STUDENT];
		this.studentCount = 0;
	}

	// 학생을 추가하는 메서드 만들기
	public void addStudnet(Student student) {
		if (studentCount < MAX_STUDENT) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("정원 초과");
		}
	}

	// 학급에 속한 모든 학생 정보를 출력하는 기능을 만드시오
	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				// student[i] --> [객체주소] --> heap 영역 객체를 참조
				System.out.println("이름 : " + students[i].getName() + ", 나이 : " + students[i].getAge());
			}
		}
	}

}
