package lottoMachine;

import java.util.Scanner;

public class Human {

	private String name;
	private int userInputNum;
//	static int[] userNum;

	public Human(String name) {
		this.name = name;
//		userNum = new int[7];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserInputNum() {
		return userInputNum;
	}

	public void setUserInputNum(int userInputNum) {
		this.userInputNum = userInputNum;
	}

//	public void userNumber() {
//		Scanner scanner = new Scanner(System.in);
//		for (int i = 0; i < userNum.length; i++) {
//			if (i < 6) {
//				System.out.println("번호를 하나 입력해 주세요.(1 ~ 45까지)");
//				userNum[i] = scanner.nextInt();
//			} else {
//				System.out.println("보너스 번호를 입력해 주세요.(1 ~ 45까지)");
//				userNum[i] = scanner.nextInt();
//			}
//		}
//	}

} // end of class
