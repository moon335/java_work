package ch05;

import java.util.Scanner;

public class MainTest02 {

	// 메인 함수
	public static void main(String[] args) {
		// 객체 생성
		Student studentKim = new Student("홍길동", 10000);
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		// 1단계 - 사용해보기
//		studentKim.takeBus(bus1);
//		studentKim.showInfo();
//		
//		studentKim.takeSubway(subway2);
//		studentKim.showInfo();

		// 2단계 - 실행 흐름 만들어 보기
		Scanner sc = new Scanner(System.in);

		// 지정된 번호 안에서 고르기

		System.out.println("몇 번 버스를 타시겠습니까?(100 or 200)");
		int userChoice1 = sc.nextInt();
		if (userChoice1 == 100) {
			studentKim.takeBus(bus1);
			studentKim.showInfo();
			bus1.showInfo();
		} else if (userChoice1 == 200) {
			studentKim.takeBus(bus2);
			studentKim.showInfo();
			bus2.showInfo();
		} else {
			System.out.println("없는 번호의 버스 입니다.");
		}

		System.out.println("-----------------------------");

		System.out.println("몇 호선 지하철을 타시겠습니까? (1 or 2)");
		int choiceSubway = sc.nextInt();
		if (choiceSubway == 1) {
			studentKim.takeSubway(subway1);
			studentKim.showInfo();
			subway1.showInfo();
		} else if (choiceSubway == 2) {
			studentKim.takeSubway(subway2);
			studentKim.showInfo();
			subway2.showInfo();
		} else {
			System.out.println("해당되는 지하철이 없습니다.");
		}
		System.out.println("-----------------------------");

		// 사용자가 직접 번호 입력하기

		System.out.println("몇 번 버스를 타시겠습니까?");
		int busNumber = sc.nextInt();
		Bus bus3 = new Bus(busNumber);
		studentKim.takeBus(bus3);
		studentKim.showInfo();
		bus3.showInfo();

		System.out.println("-----------------------------");

		System.out.println("몇 호선 지하철을 타시겠습니까?");
		int subwayLine = sc.nextInt();
		Subway subway3 = new Subway(subwayLine);
		studentKim.takeSubway(subway3);
		studentKim.showInfo();
		subway3.showInfo();
		
		
		// 반복문 사용해서 사용해보기
		while(true) {
			System.out.println("몇 번 버스를 타시겠습니까?");
			
			int busNumber2 = sc.nextInt();
			Bus bus4 = new Bus(busNumber2);
			int money = studentKim.money;
			
			if (money == 0) {
				System.out.println("소지금이 부족합니다.");
				break;
			}
			
			if(busNumber2 == 0) {
				System.out.println("버스를 타지 않습니다.");
				break;
			} else {
				studentKim.takeBus(bus4);
				studentKim.showInfo();
				bus4.showInfo();
			}
		}
		
		while(true) {
			System.out.println("지하철 몇 호선을 타시겠습니까?");
			
			int subwayLine2 = sc.nextInt();
			Subway subway4 = new Subway(subwayLine2);
			int money = studentKim.money;
			
			if (money == 0) {
				System.out.println("소지금이 부족합니다.");
				break;
			}
			
			if(subwayLine2 == 0) {
				System.out.println("지하철을 타지 않습니다.");
				break;
			} else {
				studentKim.takeSubway(subway4);
				studentKim.showInfo();
				subway4.showInfo();
			}
		}
		

	} // end of main

} // end of class
