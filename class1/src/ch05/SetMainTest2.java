package ch05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMainTest2 {
	
	// 메인 함수
	public static void main(String[] args) {
		
		HashSet<Integer> numberSet = new HashSet<>();
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		System.out.println(numberSet.size());
//		System.out.println(numberSet.toString());
		
		// 무조건 6개 사이즈 가지는 numberSet 구성하시오!
		// hint 반복문 사용
		int count = 0;
		while(numberSet.size() < 6) {
			numberSet.add(getRandomNumber());
			count++;
		}
		System.out.println(count);
		System.out.println(numberSet.size());
		System.out.println(numberSet.toString());
		
		
	} // end of main
	
	public static int getRandomNumber() {
		
		Random random = new Random();
		return random.nextInt(45) + 1;
	}
	
} // end of class
