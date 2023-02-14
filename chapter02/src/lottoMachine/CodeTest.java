package lottoMachine;

import java.util.Scanner;

public class CodeTest {
	static int[] numberArr = new int[7];
	static int[] userNum = new int[7];
	private int userInputNum;
	private int arrNumber;
	private int dupNumber;

	public void userNumber() {
		Scanner scanner = new Scanner(System.in);
		for (int arrNum = 0; arrNum < userNum.length; arrNum++) {
			if (arrNum < 6) {
				System.out.println("번호를 하나 입력해 주세요.(1 ~ 45까지)");
				userInputNum = scanner.nextInt();
				if (userInputNum > 45) {
					System.out.println("입력 범위를 초과했습니다. 다시 입력해주세요.(1 ~ 45까지)");
					userInputNum = scanner.nextInt();
					userNum[arrNum] = userInputNum;
					for (int dupNum = 0; dupNum < arrNum; dupNum++) {
						if (userNum[arrNum] == userNum[dupNum]) {
							System.out.println("중복된 번호입니다 다시 입력해 주세요.");
							arrNum--;
							break;
						}
					}
				} else {
					userNum[arrNum] = userInputNum;
					for (int dupNum = 0; dupNum < arrNum; dupNum++) {
						if (userNum[arrNum] == userNum[dupNum]) {
							System.out.println("중복된 번호입니다 다시 입력해 주세요.");
							arrNum--;
							break;
						}
					}
				}
			} else {
				System.out.println("보너스 번호를 입력해 주세요.(1 ~ 45까지)");
				userInputNum = scanner.nextInt();
				if (userInputNum > 45) {
					System.out.println("입력 범위를 초과했습니다. 다시 입력해주세요.(1 ~ 45까지)");
					userInputNum = scanner.nextInt();
					userNum[arrNum] = userInputNum;
					for (int dupNum = 0; dupNum < arrNum; dupNum++) {
						if (userNum[arrNum] == userNum[dupNum]) {
							System.out.println("중복된 번호입니다 다시 입력해 주세요.");
							arrNum--;
							break;
						}
					}
				} else {
					userNum[arrNum] = userInputNum;
					for (int dupNum = 0; dupNum < arrNum; dupNum++) {
						if (userNum[arrNum] == userNum[dupNum]) {
							System.out.println("중복된 번호입니다 다시 입력해 주세요.");
							arrNum--;
							break;
						}
					}
				}
			}
		}
	} // end of for

//	public void userNum() {
//		for (arrNumber = 0; arrNumber < userNum.length; arrNumber++) {
//			if (arrNumber < 6) {
//				System.out.println("번호를 하나 입력해 주세요.(1 ~ 45까지)");
//				userInputNum = scanner.nextInt();
//			} else {
//				System.out.println("보너스 번호를 입력해 주세요.(1 ~ 45까지)");
//				userInputNum = scanner.nextInt();
//			}
//			if (userInputNum > 45) {
//				System.out.println("입력 범위를 초과했습니다. 다시 입력해주세요.(1 ~ 45까지)");
//				userInputNum = scanner.nextInt();
//				userNum[arrNumber] = userInputNum;
//				for (int dupNum = 0; dupNum < arrNumber; dupNum++) {
//					if (userNum[arrNumber] == userNum[dupNum]) {
//						System.out.println("중복된 번호입니다 다시 입력해 주세요.");
//						arrNumber--;
//						break;
//					} else {
//						userNum[arrNumber] = userInputNum;
//						for (int dupNum = 0; dupNum < arrNumber; dupNum++) {
//							if (userNum[arrNumber] == userNum[dupNum]) {
//								System.out.println("중복된 번호입니다 다시 입력해 주세요.");
//								arrNumber--;
//								break;
//							}
//						}
//					}
//				}
//			}
//		}
//	}
	
	public void dupNum() {
		for (dupNumber = 0; dupNumber < arrNumber; dupNumber++) {
			if (userNum[arrNumber] == userNum[dupNumber]) {
				System.out.println("중복된 번호입니다 다시 입력해 주세요.");
				arrNumber--;
				break;
			}
		}
	}
	
	

} // end of class
