package ex12;

import java.util.Random;

public class MainTest {

	// 메인 함수
	public static void main(String[] args) {
		
		// 우리반 학생 이름들을 배열에 담아주세요.
		// 랜덤 클래스를 사용해서
		// 한명을 추출해 주세요.
		
		Random random = new Random();
		Student[] studentName = new Student[18];
		studentName[0] = new Student("이현서");
		studentName[1] = new Student("김민우");
		studentName[2] = new Student("김현우");
		studentName[3] = new Student("전대영");
		studentName[4] = new Student("이서영");
		studentName[5] = new Student("이치승");
		studentName[6] = new Student("정다운");
		studentName[7] = new Student("이지운");
		studentName[8] = new Student("박성희");
		studentName[9] = new Student("김지현");
		studentName[10] = new Student("김미정");
		studentName[11] = new Student("김유주");
		studentName[12] = new Student("손주이");
		studentName[13] = new Student("한범진");
		studentName[14] = new Student("강민정");
		studentName[15] = new Student("진석");
		studentName[16] = new Student("김효린");
		studentName[17] = new Student("편용림");
		
		int randomStudent = random.nextInt(18);
		
		System.out.println(studentName[randomStudent].getName());
		
		
	}

}
