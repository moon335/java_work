package ch09;

import java.util.Scanner;

public class BookStoreManager {

	// 메인 함수
	public static void main(String[] args) {

		// 책을 저장하는 기능을 만들고
		// 정보를 출력하는 프로그래밍을 만들어 주세요.
		// 스캐너
		// 문자열
		// 값을 비교 할때는 ==
		// 문자열 비교는 equals
//		String temp = "안녕";
//		if (temp.equals("안녕")) {
//			System.out.println("같은 값 확인");
//		} else {
//			System.out.println("값이 달라요.");
//		}
//		System.out.println("------------------");
//		if ("반가워".equals(temp)) {
//			System.out.println("같은 값 확인");
//		} else {
//			System.out.println("값이 달라요.");
//		}

		// while문을 사용해서
		// CRUD의 개념
		// 1. 저장
		// 2. 전체 조회 3. 선택조회 4. 전체 삭제 5. 선택 삭제 0. 프로그램 종료
		Scanner scanner = new Scanner(System.in);
		int bookNumber = 0;
		int book1Num = 0;
		Book[] books1 = new Book[100];
		boolean flag = true;
		int count = 0;

		while (flag) {
			System.out.println("번호를 눌러주세요.1. 저장, 2. 전체 조회, 3. 선택조회, 4. 전체 삭제, 5. 선택 삭제, 0. 프로그램 종료");
			int userInputNumber = scanner.nextInt();
			if (userInputNumber == 0) {
				System.out.println("시스템을 종료합니다.");
				flag = false;
			} else if (userInputNumber == 1) {
				System.out.println("저장할 책의 제목을 입력하세요.");
				scanner.nextLine();
				String title = scanner.nextLine();
				System.out.println("저장할 책의 저자를 입력하세요.");
				String author = scanner.nextLine();
				bookNumber++;
				book1Num++;
				Book[] books = new Book[bookNumber];
				books[bookNumber - 1] = new Book(title, author);
				books1[book1Num] = books[bookNumber - 1];
				count++;
			} else if (userInputNumber == 2) {
				System.out.println("전체 책을 조회합니다.");
				for (int i = 0; i < books1.length; i++) {
					if (books1[i] != null) { // 방어적 코드 짜기
						books1[i].showInfo();
					}
				}
				if(count == 0) {
					System.out.println("조회할 책이 없습니다.");
				}
			} else if (userInputNumber == 3) {
				System.out.println("조회 할 책 번호를 지정해주세요.");
				int bookNum = scanner.nextInt();
				books1[bookNum].showInfo();
			} else if (userInputNumber == 4) {
				System.out.println("목록 전체를 삭제합니다.");
				for (int i = 0; i < books1.length; i++) {
					if (books1[i] != null) { // 방어적 코드 짜기
						books1[i] = null;
					}
				}
			} else if (userInputNumber == 5) {
				System.out.println("삭제할 책 번호를 입력해 주세요.");
				int deleteBook = scanner.nextInt();
				System.out.println("삭제되었습니다.");
				books1[deleteBook - 1] = null;
				count--;
			}
		}

	} // end of main

} // end of class
