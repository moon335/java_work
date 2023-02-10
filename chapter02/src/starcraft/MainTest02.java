package starcraft;

import java.util.Scanner;


public class MainTest02 {

	// 메인 함수
	public static void main(String[] args) {
		
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 4;
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marrine1 = new Marine("마린");
		Zergling zergling1 = new Zergling("저글링1");
		
		Scanner scanner = new Scanner(System.in);
		int unitChoice = -1;
		do {
			System.out.println("유닛을 선택하세요.");
			System.out.println("1.질럿\t2.마린\t3.저글링\t4.종료"); // \t -> 글자 다음 탭 간격만큼 띄워라 -> 이스케이프 문자
			// 사용자한테 입력값 받기
			unitChoice = scanner.nextInt();
			if(unitChoice == ZEALOT) {
				// 질럿을 선택하였습니다.
			} else if(unitChoice == MARINE) {
				// 마린을 선택하였습니다.
			} else if(unitChoice == ZERGLING) {
				// 저글링을 선택하였습니다.
			}
			
		} while (unitChoice != GAME_END);
		System.out.println("게임이 종료되었습니다.");
		
		
	} // end of main

} // end of class
