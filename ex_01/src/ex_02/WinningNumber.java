package ex_02;

import java.util.Random;

public class WinningNumber extends LottoMachine{
	
	private int[] numberArr = new int[6];

	public WinningNumber(String name, int machineNum) {
		super(name, machineNum);
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
			if (printNum < 5) {
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
				if(numberArr[i] < numberArr[j]) {
					temp = numberArr[i];
					numberArr[i] = numberArr[j];
					numberArr[j] = temp;
				}
			}
		}
	}
	
	
} // end of class
