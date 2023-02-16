package ex01;

import java.util.Arrays;
import java.util.Random;

// 기능
// 랜덤 번호 발생하는 클래스 1 ~ 45
// get, set
// 6개 번호를 리턴하는 기능, 정렬까지 책임
public class LottoRandomNumber {
	
	final int LOTTO_NUMBER_SIZE = 6;
	
	// 6개 난수 발생 배열 리턴하는 기능
	public int[] createNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIZE];
		Random random = new Random();
		for(int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			// lottoWinNum[1] = 30
			// 중복 검증
			// i = 0 --> inner for X
			// 2번째 for문 실행시
			// ex) 10, 20
			// j == 0, i == 1 --> 1번 for문 실행
			// lottoWinNum[0] => 10
			// lottoWinNum[1] => 10
			for(int j = 0; j < i; j++) {
				// 현재 i = 1, j = 0
				// lottoWinNum[1] == 30
				// lottoWinNum[0] == 10
				if(lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoWinNum); // 오름차순 정렬
		return lottoWinNum;
	}
}
