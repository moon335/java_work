package ex12;

public class MainTest02 {
	
	// 메인 함수
	public static void main(String[] args) {
		int[] myNumbers = new int[10];
		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;
		
		// 오름 차순으로 정렬
		// for, if문 사용
		for(int i = 0; i < myNumbers.length; i++) {
			int temp = 0;
			for(int j = 0; j < myNumbers.length; j++) {
				if(myNumbers[i] < myNumbers[j]) {
					temp = myNumbers[i];
					myNumbers[i] = myNumbers[j];
					myNumbers[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < myNumbers.length; i++) {
			System.out.println(myNumbers[i]);
		}
		
		
	} // end of main

} // end of class
