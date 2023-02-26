package lottoMachine;

import java.util.Random;
import java.util.Scanner;

public class WinningNumber extends LottoMachine {

	static int[] numberArr = new int[7];
	static int[] userNum = new int[6];
	private int userInputNum;
	private int arrNumber;
	private int dupNumber;
	private boolean flag;
	Scanner scanner = new Scanner(System.in);

	public WinningNumber(String name, int machineNum) {
		super(name, machineNum);
	}

	public int[] getNumberArr() {
		return numberArr;
	}

	public void setNumberArr(int[] numberArr) {
		this.numberArr = numberArr;
	}

	// 컴퓨터가 자동으로 추첨번호 만들어서 배열에 넣음
	public void winningNumber() {
		Random random = new Random();
		for (int arrNum = 0; arrNum < numberArr.length; arrNum++) {
			int rNumber = random.nextInt(45) + 1;
			numberArr[arrNum] = rNumber;
			// 중복 제거
			for (int dupNum = 0; dupNum < arrNum; dupNum++) {
				if (numberArr[arrNum] == numberArr[dupNum]) {
					arrNum--;
					break;
				}
			}
		}
		ascending();
		// 출력
		System.out.print("당첨된 번호는: ");
		for (int printNum = 0; printNum < numberArr.length; printNum++) {
			if (printNum < 6) {
				System.out.print(numberArr[printNum] + " ");
			} else {
				System.out.println("보너스 번호는: " + numberArr[printNum]);
			}
		}
	}

	// 오름 차순 정렬
	public void ascending() {
		for (int i = 0; i < (numberArr.length - 1); i++) {
			int temp = 0;
			for (int j = 0; j < (numberArr.length - 1); j++) {
				if (numberArr[i] < numberArr[j]) {
					temp = numberArr[i];
					numberArr[i] = numberArr[j];
					numberArr[j] = temp;
				}
			}
		}
	}

	// 사용자에게 직접 입력값 받기
	@Override
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
			if (userInputNum > 45 || userInputNum == 0) {
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

//	@Override
//	public void userNumber() {
//		Scanner scanner = new Scanner(System.in);
//		for (int arrNum = 0; arrNum < userNum.length; arrNum++) {
//			if (arrNum < 6) {
//				System.out.println("번호를 하나 입력해 주세요.(1 ~ 45까지)");
//				userInputNum = scanner.nextInt();
//				if (userInputNum > 45) {
//					System.out.println("입력 범위를 초과했습니다. 다시 입력해주세요.(1 ~ 45까지)");
//					userInputNum = scanner.nextInt();
//					userNum[arrNum] = userInputNum;
//					for (int dupNum = 0; dupNum < arrNum; dupNum++) {
//						if (userNum[arrNum] == userNum[dupNum]) {
//							System.out.println("중복된 번호입니다 다시 입력해 주세요.");
//							arrNum--;
//							break;
//						}
//					}
//				} else {
//					userNum[arrNum] = userInputNum;
//					for (int dupNum = 0; dupNum < arrNum; dupNum++) {
//						if (userNum[arrNum] == userNum[dupNum]) {
//							System.out.println("중복된 번호입니다 다시 입력해 주세요.");
//							arrNum--;
//							break;
//						}
//					}
//				}
//			} else {
//				System.out.println("보너스 번호를 입력해 주세요.(1 ~ 45까지)");
//				userInputNum = scanner.nextInt();
//				if (userInputNum > 45) {
//					System.out.println("입력 범위를 초과했습니다. 다시 입력해주세요.(1 ~ 45까지)");
//					userInputNum = scanner.nextInt();
//					userNum[arrNum] = userInputNum;
//					for (int dupNum = 0; dupNum < arrNum; dupNum++) {
//						if (userNum[arrNum] == userNum[dupNum]) {
//							System.out.println("중복된 번호입니다 다시 입력해 주세요.");
//							arrNum--;
//							break;
//						}
//					}
//				} else {
//					userNum[arrNum] = userInputNum;
//					for (int dupNum = 0; dupNum < arrNum; dupNum++) {
//						if (userNum[arrNum] == userNum[dupNum]) {
//							System.out.println("중복된 번호입니다 다시 입력해 주세요.");
//							arrNum--;
//							break;
//						}
//					}
//				}
//			}
//		}
//	}

//public void userNumber() {
//for (arrNumber = 0; arrNumber < userNum.length; arrNumber++) {
//	flag = true;
//	if (arrNumber < 6) {
//		System.out.println("번호를 하나 입력해 주세요.(1 ~ 45까지)");
//		userInputNum = scanner.nextInt();
//		if (userInputNum > 45) {
//			System.out.println("입력 범위를 초과했습니다. 다시 입력해주세요.(1 ~ 45까지)");
//			userInputNum = scanner.nextInt();
//			dupNumber();
//			userNum[arrNumber] = userInputNum;
//		} else {
//			userNum[arrNumber] = userInputNum;
//			dupNumber();
//		}
//	} else {
//		System.out.println("보너스 번호를 입력해 주세요.(1 ~ 45까지)");
//		userInputNum = scanner.nextInt();
//		if (userInputNum > 45) {
//			System.out.println("입력 범위를 초과했습니다. 다시 입력해주세요.(1 ~ 45까지)");
//			userInputNum = scanner.nextInt();
//			userNum[arrNumber] = userInputNum;
//			dupNumber();
//		} else {
//			userNum[arrNumber] = userInputNum;
//			dupNumber();
//		}
//	}
//}
//userAscending();
//userNumPrint();
//}
//
//public void dupNumber() {
//for (dupNumber = 0; dupNumber < arrNumber; dupNumber++) {
//	if (userNum[arrNumber] == userNum[dupNumber]) {
//		System.out.println("중복된 번호입니다 다시 입력해 주세요.");
//		arrNumber--;
//		break;
//	}
//}
//}
//
//public void userAscending() {
//for (int i = 0; i < (userNum.length - 1); i++) {
//	int temp = 0;
//	for (int j = 0; j < (userNum.length - 1); j++) {
//		if (userNum[i] < userNum[j]) {
//			temp = userNum[i];
//			userNum[i] = userNum[j];
//			userNum[j] = temp;
//		}
//	}
//}
//}
//
//public void userNumPrint() {
//System.out.print("입력하신 번호는: ");
//for (int printNum = 0; printNum < userNum.length; printNum++) {
//	if (printNum < 6) {
//		System.out.print(userNum[printNum] + " ");
//	} else {
//		System.out.println("입력하신 보너스 번호는: " + userNum[printNum]);
//	}
//}
//}
//
//public void rangeNum() {
//while(flag) {
//	if (userInputNum > 45) {
//		System.out.println("입력 범위를 초과했습니다. 다시 입력해주세요.(1 ~ 45까지)");
//		userInputNum = scanner.nextInt();
//		dupNumber();
//		userNum[arrNumber] = userInputNum;
//	} else {
//		userNum[arrNumber] = userInputNum;
//		dupNumber();
//		flag = false;
//	}
//}
//}