package ex_01;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	Random random = new Random();
	
	public void rNum() {
		int[] lotto = new int[7];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.print("당첨 번호는: ");
		for(int i = 0; i < lotto.length; i++) {
			if(i < 6) {
				System.out.print(lotto[i] + " ");
			} else {
				System.out.print("\n보너스 번호는: " + lotto[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.rNum();
	}
	
	
} // end of class
