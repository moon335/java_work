package ch07;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		
		// 문제
		// d object에 있는 value 값을 화면에 출력해주세요.
		String s = a.b.c.d.value;
		System.out.println(s);
		
		for(int i = 0; i < a.b.c.d.arrayList.size(); i++) {
			System.out.println(a.b.c.d.arrayList.get(i));
		}
		
		for (String d : a.b.c.d.arrayList) {
			System.out.println(d);
		}
		
	} // end of main

} // end of class
