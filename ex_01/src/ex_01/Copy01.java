package ex_01;


public class Copy01 {

	public static void main(String[] args) {

		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <= i; j++){
				System.out.printf("*");
			}
			System.out.println("");
			i++;
		}
		
		System.out.println("=============================");
		for(int i = 1; i <= 6; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.printf(" ");
			}
			if(i == 1) {
				System.out.printf("*");
			} else if(i==3) {
				System.out.printf(" ***");
			} else if (i==5) {
				System.out.printf("  *****");								
			}
			System.out.println("");
			i++;
		}
		System.out.println("=============================");
		for(int i = 1; i <= 6; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.printf(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.printf("*");
			}
			for(int l = 2; l <= i; l++) {
				System.out.printf("*");
			}
			System.out.println("");
			i++;
		}
		System.out.println("=============================");
		
		int l = 1;
		for(int i = 5; i >= 3; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.printf(" ");
			}
			for(int k = 1; k <= l; k++) {
				System.out.printf("*");
			}
			l += 2;
			System.out.println("");
		}
	}
}
