package ch03;

// 객체지향 프로그래밍이란
// 객체와 객체 간의 관계를 형성하고 상호 작용하게 코드를 설계해 나가는 것 
public class MainTest03 {
	// 메인 함수
	public static void main(String[] args) {

		// 1, 3, 홍길동
		// 2, 3, 이순신
		Student studentHong = new Student(1, 3, "홍길동");
		Student studentLee = new Student(2, 3, "이순신");

		// 변수로 접근해서 데이터 추가
		// 컴파일 시점의 오류를 확인할 수 없는 상태였다.(실행시점에 오류가 확인)
		// 메모리에 올라가지 않은 상태 --
		// 해결 방법 : 1. 클래스 내부에서 초기화 하기 2. 외부에서 초기화 하기
		studentHong.korea.subjectName = "국어";
		studentHong.korea.score = 90;

		studentHong.showInfo();
//		studentHong.korea;
//		System.out.println(studentHong.korea);

		// 이순신에 과목 국어, 수학 이름 데이터를 입력
		// 이순신에 과목 국어 100점, 수학 5점 입력
		// 출력하는 코드를 작성해주세요.
		studentLee.korea.subjectName = "국어";
		studentLee.korea.score = 100;
		studentLee.math.subjectName = "수학";
		studentLee.math.score = 5;

		studentLee.showInfo();

	} // end of main

} // end of class
