package ch04;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		
		// 데이터베이스에 접근해서 buyTBL에 대한 정보
		// 데이터베이스에 접근해서 userTBL에 대한 정보
		
		UserDao userDao = new UserDao();
		
		// insert 확인
		UserDTO dto = new UserDTO("유진스", "1995", "부산", "010-2222-2222");
//		int rowCount = userDao.insert(new UserDTO("아이즈원", "2020", "경기도", "010-1354-1681"));
//		System.out.println("rowCount: " + rowCount);
		int updateRowCount = userDao.update(dto, dto.getUserName());
		System.out.println("updateRowCount: " + updateRowCount);
		// 자식 테이블에 먼저 삭제하고 부모 테이블에 정보를 삭제한다.
		// 이승기는 구매 테이블 이력이 남아있기 때문에 유저 테이블에서 바로 삭제할 수 없다.
//		boolean isDelete = userDao.delete("이승기");
//		System.out.println("isDelete: " + isDelete);
//		if(isDelete == false) {
//			System.out.println("구매 테이블에 이력이 남아 있습니다.");
//		}
		
		// select 확인
//		ArrayList<UserDTO> list = userDao.select();
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUserName());
//			System.out.println(list.get(i).getBirthYear());
//			System.out.println(list.get(i).getAddr());
//			System.out.println(list.get(i).getMobile());
//			System.out.println("-------------------------------");
//		}
		
		
		
	} // end of main

} // end of class
