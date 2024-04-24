package basic.ch19;

public class ClassroomTest {

	public static void main(String[] args) {
		
		Classroom classroomA = new Classroom("C4");
		Student student1 = new Student("홍길동", 20);
		Student student2 = new Student("이순신", 24);
		
		classroomA.addStudnet(student1);
		classroomA.addStudnet(student2);
		classroomA.showStudents();
		
		
		
	}
}
