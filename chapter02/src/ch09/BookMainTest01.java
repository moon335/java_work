package ch09;

import java.util.Iterator;

public class BookMainTest01 {

	// 메인 함수
	public static void main(String[] args) {

		// 연관된 하나의 데이터를 통으로 관리하고 싶다면 - 배열(자료구조) 사용
		Book[] books = new Book[10]; // 배열 선언 (메모리 공간 만들어 주기)
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다.", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발 하라리");

		// books[5] = new Book("홍길동전", "허균"); ajva.lang.ArrayIndexOutOfBoundsException
//		System.out.println(books[0].getTitle());
//		System.out.println(books[4].getAuthor());
		// 배열은 for문과 많이 쓰임
		// books.length --> 배열의 길이(10)
		for (int i = 0; i < books.length; i++) {
			// i --> 0, 1, 2, 3, 4, 5(에서 오류)
//			if(books[i] == null) {
//				break;
//			} else {
//				System.out.println(books[i].getTitle());
//			}
			if(books[i] != null) { // 방어적 코드 짜기
				System.out.println(books[i].getTitle());
			}
		}
		
		System.out.println("-----------------------------");

		// 주의1
		// 인덱스의 크기는 n - 1개다.
		// 배열의 길이와 인덱스의 길이는 다르다.

		// 주의2
		// 배열의 크기와 실제 들어가 있는 값의 갯수는 다를 수 있다.

		// 문제
		// double 배열 4개 선언해서 임의 값 넣고 출력해 주세요.
		// 3번 인덱스는 값을 할당하지 마시오.
		// 출력은 for문
		double[] arr = new double[4];
		arr[0] = 0.34;
		arr[1] = 0.532;
		arr[2] = 0.537;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0.0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("--------------------------------");
		// 예제 books를 사용하세요 !
		// 문제2
		// 0번째 인덱스에 있는 녀석과 인덱스 2번째 녀석의 값을 스왑해주세요.
//		books[0] = books[2];
//		books[2] = new Book("플러터UI실전", "김근호");
//		books[5] = books[0];
//		books[0] = books[2];
//		books[2] = books[5];
		Book temp = books[0];
		books[0] = books[2];
		books[2] = temp;
		
		System.out.println(books[0].getTitle());
		System.out.println(books[0].getAuthor());
		System.out.println(books[2].getTitle());
		System.out.println(books[2].getAuthor());
		
		
		System.out.println("------------------------------");
		// 문제 3
		// 인덱스 3번의 값을 삭제 해주세요.
		books[3] = null;
		//System.out.println(books[3].getTitle());
		//System.out.println(books[3].getAuthor());
		for (int i = 0; i < books.length; i++) {
			// i값 활용
			if(books[i] != null) { // 방어적 코드 짜기
				books[i].showInfo();
			}
		}
		

	} // end of main

} // end of class
