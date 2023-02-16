package ch05;

public class BoxMainTest {
	
	public static void main(String[] args) {
//		Box<String> box = new Box<>();
//		box.put("안녕 반가워");
//		System.out.println(box.isEmpty());
//		System.out.println("------------------");
//		
//		String msg = box.take();
//		System.out.println("msg: " + msg);
//		System.out.println(box.isEmpty());
		
		Book book = new Book("플러터UI실전");
		Picture picture = new Picture("모나리자");
		
		Box<Book> box1 = new Box<>();
		box1.put(book);
		System.out.println(box1.isEmpty());
		
		Book item1 = box1.take();
		System.out.println("박스 안에 있던 물건은: " + item1);
		System.out.println(box1.isEmpty());
		
		System.out.println("------------------------------");
		
		Box<Picture> box2 = new Box<>();
		box2.put(picture);
		System.out.println(box2.isEmpty());
		
		Picture item2 = box2.take();
		System.out.println("박스 안에 있던 물건은: " + item2);
		System.out.println(box2.isEmpty());
		
	} // end of main
	
} // end of class
