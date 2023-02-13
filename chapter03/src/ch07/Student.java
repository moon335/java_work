package ch07;

public class Student {
	
	// 학번과 이름을 정의
	private static int serialNum = 0;
	private String name;
	private int studentNum;

	
	public Student(String name) {
		serialNum++;
		studentNum = serialNum;
		this.name = name;
	}
	
	
	// toString -> 학번과 이름이 화면에 출력할 수 있도록 설계
	// equals 메서드를 재정의 해주세요.
	// 이름이 같다면 동명이인입니다라고 출력 해주세요.
	
	@Override
	public String toString() {
		return name + " " + studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student targetName = (Student)obj; 
			if(targetName.name == this.name) {
				System.out.println("동명이인 입니다.");
				return true;
			}
		}
		return false;
	}
	
} // end of class
