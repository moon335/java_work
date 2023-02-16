package ex01;

public class MainTest {
	
	public static void main(String[] args) {
		
		Cooking<Egg> cooking1 = new Cooking<>();
		Cooking<Water> cooking2 = new Cooking<>();
		Cooking<Onion> cooking3 = new Cooking<>();
		
		
		cooking1.getMeterial();
		cooking1.setMeterial(new Egg());
		
		
		cooking2.getMeterial();
		cooking2.setMeterial(new Water());
		
		cooking3.getMeterial();
		cooking3.setMeterial(new Onion());
		
	} // end of main
	
} // end of class
