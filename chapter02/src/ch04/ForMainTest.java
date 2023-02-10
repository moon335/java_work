package ch04;

import java.util.Scanner;

public class ForMainTest {

	// 메인 함수
	public static void main(String[] args) {

//		for(int i = 1; i < 11; i++) {
//			Warrior warrior = new Warrior();
//			String w = "w" + i;
//			warrior.warriorName = w;
//			warrior.power = 150;
//			warrior.hp = 1000;
//			warrior.mp = 500;
//			
//			
//			warrior.warriorInfo();
//			
//			warrior.attack();
//			
//			warrior.damaged(2);
//			
//			warrior.drinkPotion();
//			
//			warrior.skill(3);
//			
//			warrior.warriorInfo();
//		}
		
		
		Warrior warrior1 = new Warrior("타락파워전사", 500);
		
		System.out.println("턴 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int myTurn = sc.nextInt();
		
		for(int i = 1; i <= myTurn; i++) {
			
			int action = warrior1.playGame();
			
			if(action == 1) {
				warrior1.attack();
			} else if(action == 2) {
				warrior1.damaged(1);
			} else if(action == 3) {
				warrior1.drinkPotion();
			} else if(action == 4) {
				warrior1.skill(1);
			}
		}
		
		
		
		
		
	} // end of main

} // end of class
