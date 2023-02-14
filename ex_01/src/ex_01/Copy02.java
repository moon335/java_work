package ex_01;

import java.util.Scanner;

public class Copy02 {
	static int[] numberArr = new int[7];
	static int[] userNum = new int[7];
	private int userInputNum;
	private int arrNumber;
	private int dupNumber;
	private boolean flag;
	Scanner scanner = new Scanner(System.in);
	
	public void userNumber() {
		for (arrNumber = 0; arrNumber < userNum.length; arrNumber++) {
			flag = true;
			if (arrNumber < 6) {
				System.out.println("번호를 하나 입력해 주세요.(1 ~ 45까지)");
				userInputNum = scanner.nextInt();
				rangeNum();
			} else {
				System.out.println("보너스 번호를 입력해 주세요.(1 ~ 45까지)");
				userInputNum = scanner.nextInt();
				rangeNum();
			}
		}
		userAscending();
		userNumPrint();
	}

	public void dupNumber() {
		for (dupNumber = 0; dupNumber < arrNumber; dupNumber++) {
			if (userNum[arrNumber] == userNum[dupNumber]) {
				System.out.println("중복된 번호입니다 다시 입력해 주세요.");
				arrNumber--;
				break;
			}
		}
	}

	public void userAscending() {
		for (int i = 0; i < (userNum.length - 1); i++) {
			int temp = 0;
			for (int j = 0; j < (userNum.length - 1); j++) {
				if (userNum[i] < userNum[j]) {
					temp = userNum[i];
					userNum[i] = userNum[j];
					userNum[j] = temp;
				}
			}
		}
	}

	public void userNumPrint() {
		System.out.print("입력하신 번호는: ");
		for (int printNum = 0; printNum < userNum.length; printNum++) {
			if (printNum < 6) {
				System.out.print(userNum[printNum] + " ");
			} else {
				System.out.println("입력하신 보너스 번호는: " + userNum[printNum]);
			}
		}
	}
	
	public void rangeNum() {
		while(flag) {
			if (userInputNum > 45) {
				System.out.println("입력 범위를 초과했습니다. 다시 입력해주세요.(1 ~ 45까지)");
				userInputNum = scanner.nextInt();
				dupNumber();
				userNum[arrNumber] = userInputNum;
			} else {
				userNum[arrNumber] = userInputNum;
				dupNumber();
				flag = false;
			}
		}
	}


} // end of class