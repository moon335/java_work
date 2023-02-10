package ch11;

public class FruitMainTest {

	public static void main(String[] args) {
		// 다양한 형태로 클래스(타입) 바라 볼 수 있다. --> 다형성
		Fruit fruit1 = new Banana(); // 업 캐스팅
		// 컴파일 시점에는 컴파일러가 앞에 선언된 데이터 타입만 확인한다.
		Fruit fruit2 = new Peach();
		
		// 다운 캐스팅          강제형변환과 똑같음
		String bananaOrigin = ((Banana)fruit1).origin;
		System.out.println(bananaOrigin); 
		
		Fruit[] fruits = new Fruit[2];
		fruits[0] = fruit1;
		fruits[1] = fruit2;
		
		
		// 반복문
		// instanceof
		for(int i = 0; i < fruits.length; i++) {
			fruits[i].showInfo();
			// 바나나이면 원산지를 출력하시오!
//			if(fruits[i].name.equals("델몬트바나나")) {
//				System.out.println(((Banana)fruits[i]).origin);
//				fruits[i].showInfo();
//			}else {
//				fruits[i].showInfo();
//			}
//			System.out.println("------------------------------");
//			if(fruits[i] == fruit1) {
//				System.out.println(((Banana)fruits[i]).origin);
//				fruits[i].showInfo();
//			} else {
//				fruits[i].showInfo();
//			}
			if(fruits[i] instanceof Banana) {
				// 바나나 타입이 맞다면 여기 코드로 들어온다.
				// 다운 캐스팅 가능
				System.out.println(((Banana)fruits[i]).origin);
			}
			System.out.println("------------------------------");
		}
		
		
	} // end of main

} // end of class
