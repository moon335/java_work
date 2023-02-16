package ch09;

import java.util.Arrays;
import java.util.Random;

// 기능
// 랜덤 번호 발생하는 클래스 1 ~ 45
// get, set
// 6개 번호를 리턴하는 기능, 정렬까지 책임
public class LottoRandomNumber {
	private int[] lottoNumber = new int[6];
	
	public int[] getLottoNumber() {
		return lottoNumber;
	}

	public void setLottoNumber(int[] lottoNumber) {
		this.lottoNumber = lottoNumber;
	}

	public void randomNumber() {
		Random random = new Random();
		for(int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = random.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lottoNumber[i] == lottoNumber[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lottoNumber);
	}
}
