package ch11;

import java.util.Random;
import java.util.Scanner;


public class ClawCrane {

	public static void main(String[] args) {

		Goods[] goods = new Goods[4];

		goods[0] = new ToyCar();
		goods[1] = new Money();
		goods[2] = new ToyRobot();
		goods[3] = new Doll();

		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자 하나를 입력해 주세요. 1 ~ 3");
//		int userInput = scanner.nextInt();

		Random random = new Random();
//		int randomNum = random.nextInt(3) + 1;
//		int randomGoods = random.nextInt(4);
// 		
//		if(userInput == randomNum) {
//			System.out.println("축하합니다! 당첨된 경품은 " + goods[randomGoods].name + "입니다.");
//			if(goods[randomGoods] instanceof Money) {
//				System.out.println(goods[randomGoods].name + " 당첨 축하합니다!");
//			}
//		} else {
//			System.out.println("아쉽지만 꽝입니다. 다시 시도하려면 돈을 넣어주세요.");
//		}

		boolean flag = true;
		
		while (flag) {
			System.out.println("숫자 하나를 입력해 주세요. 1 ~ 3");
			int userInput = scanner.nextInt();
			int randomNum = random.nextInt(3) + 1;
			int randomGoods = random.nextInt(4);

			if (userInput == randomNum) {
				System.out.println("축하합니다! 당첨된 경품은 " + goods[randomGoods].name + "입니다.");
				if (goods[randomGoods] instanceof Money) {
					System.out.println(goods[randomGoods].name + " 당첨 축하합니다!");
				}
				flag = false;
			} else {
				System.out.println("아쉽지만 꽝입니다. 다시 시도하려면 돈을 넣어주세요.");
			}
		}

	}

}
