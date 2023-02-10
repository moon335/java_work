package ex_01;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("단의 시작점을 입력하세요.");
		int firstTable = scanner.nextInt();
		System.out.println("단의 마지막점을 입력하세요.");
		int lastTable = scanner.nextInt();
		
		
		for(int start = firstTable; start <= lastTable; start++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(start + " * " + j + " = " + (start * j));
			}
		}
		
	}

}
