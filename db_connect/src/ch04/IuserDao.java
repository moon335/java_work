package ch04;

import java.util.ArrayList;

public interface IuserDao {
	
	// userTBL 전체 조회 기능
	ArrayList<UserDTO> select();
	
	// 인서트 기능
	int insert(UserDTO dto);
	
	// user 정보 수정 기능
	int update(UserDTO dto, String targetUserName);
	
	// user 정보 삭제 기능
	boolean delete(String targetUserName);
	
	
}
