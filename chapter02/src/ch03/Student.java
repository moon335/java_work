package ch03;

public class Student {

	// Subject 클래스는 Student 클래스의 포함관계
	int studentId;
	int grade;
	// 참조 입니다.
	String name;
	// 참조 타입
	Subject korea;
	Subject math;

	// 생성자
	public Student(int studentId, int grade, String name) {
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;

		this.korea = new Subject();
		this.math = new Subject();
	}

	// 메서드
	public void showInfo() {
		System.out.println("**상태창**");
		System.out.println(this.name + " : 입니다.");
		System.out.println(this.grade + " : 학년 입니다.");
		System.out.println(this.studentId + " : 번 입니다.");
		System.out.println(this.korea.subjectName + "의 점수는 " + this.korea.score);
		System.out.println(this.math.subjectName + "의 점수는 " + this.math.score);
	}

	// 학번
	// 이름
	// 국어 성적
	// 수학 성적
	// 수강하는 과목

} // end of class
