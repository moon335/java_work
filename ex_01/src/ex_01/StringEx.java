package ex_01;

public class StringEx {
	
	public static void main(String[] args) {
		
		String s = new String("s");
		s = s.concat(" 붙이기");
		s = s + " 붙이기";
		System.out.println(s);
		// String은 불변(immutable)하기 때문에
		// 기존 것을 버리고 새로 할당하는 식으로 사용 
		
		
		// StringBuffer는 멀티 스레드 환경에서 사용
		StringBuffer sbuffer = new StringBuffer("SB");
		sbuffer.append(" 붙이기");
		System.out.println(sbuffer);
		
		// StringBuilder는 단일 스레드 환경에서 사용
		StringBuilder sbuilder = new StringBuilder("SB");
		sbuilder.append(" 붙이기");
		// StringBuffer, StringBuilder는 변하기(mutable)하기 때문에
		// 기존 것에서 append를 사용해서 값 변경 가능
		
		sbuilder.append("붙이기"); // 삽입
		sbuilder.insert(0, "ASDASD"); // 중간에 삽입
		sbuilder.delete(3, 7); // 자르기
		sbuilder.indexOf("ASDB"); // index 확인
		sbuilder.substring(0, 4); // 자르기
		sbuilder.length(); // 길이 확인
		sbuilder.replace(0, 4, "CCCC"); // 글자 바꾸기(0부터 4번째 글자를 날리고 CCCC로 변경)
		
		System.out.println(sbuilder);
		System.out.println(sbuilder.indexOf("붙이기붙이기"));
		System.out.println(sbuilder.substring(0, 4)); // substring 예제
		System.out.println(sbuilder.reverse()); // 순서 뒤집기
		System.out.println(sbuilder.length()); // length 예제

	}
	
} // end of class
