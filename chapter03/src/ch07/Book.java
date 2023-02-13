package ch07;

/**
 * Object 클래스의 이해
 * 자바는 단일 상속만을 지원한다.
 * 하지만 모든 클래스의 최상위 클래스 Object 클래스는 예외이다. 
 */
public class Book {
	
	private int bookId;
	private String title;
	private String author;
	
	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	// 코드 힌트 살펴보기
	// extends Object 키워드를 작성하지 않더라도 컴파일러가 .class 생성시
	// 자동으로 넣어준다.
	
	
	// toString() <-- Object 클래스의 메서드이다.
	@Override
	public String toString() {
		return "[" + this.title + "]";
	}
	// toString 메서드는 필요하다면 재정의해서 사용할 수 있다.
	
	// equals
	// 책 제목과 작가 이름이 같다면 같은 책이라고 판별 해보자
	@Override
	public boolean equals(Object obj) {
		// 만약 외부에서 주입된 값의 title과 author이 같다면 true를 리턴
		// 아니라면 false를 리턴하자
		// Book 이라는 데이터 타입만 확인하자 !!! 방어적 코드
		if(obj instanceof Book) {
			Book targetBook = (Book)obj;
			if(this.title == targetBook.title && this.author == targetBook.author) {
				if(this.title == targetBook.title && this.author == targetBook.author) {
				System.out.println("같은 책 제목 입니다.");
				return true;
				}
			}
		}
		return false;
	}
	
	
} // end of class
