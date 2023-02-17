package ex_02;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int arrNum;
	private int dupNum;
	private int[] rNum = new int[6];
	Random random = new Random();

	public void winNum() {
		for (arrNum = 0; arrNum < rNum.length; arrNum++) {
			rNum[arrNum] = random.nextInt(45) + 1;
			dupNumber();
		}
		Arrays.sort(rNum);
		printNum();
	}

	public void dupNumber() {
		for (dupNum = 0; dupNum < arrNum; dupNum++) {
			if (rNum[arrNum] == rNum[dupNum]) {
				arrNum--;
				break;
			}
		}
	}

	public void printNum() {
		System.out.print("당첨 번호는: ");
		for (int i = 0; i < rNum.length; i++) {
			System.out.print(rNum[i] + "\t");
		}
	}

} // end of class
