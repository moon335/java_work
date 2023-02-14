package lottoMachine;

import java.util.Random;
import java.util.Scanner;

public class WinningNumber extends LottoMachine {

	static int[] numberArr = new int[7];
	static int[] userNum = new int[7];
	private int userInputNum;

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

	@Override
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
	}

} // end of class
