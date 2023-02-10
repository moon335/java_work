package ch04;

public class GameTest {

	// 메인 함수
	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("타락파워전사", 500);

		warrior1.attack();

		warrior1.skill(2);

		warrior1.damaged(3);

		warrior1.drinkPotion();

		warrior1.warriorInfo();

		System.out.println("-----------------------------------------");

		Wizard wizard1 = new Wizard("신남이", 150);

		wizard1.attack();

		wizard1.fireBall(3);

		wizard1.damaged(5);

		wizard1.drinkPotion();

		wizard1.warriorInfo();

	} // end of main

} // end of class
