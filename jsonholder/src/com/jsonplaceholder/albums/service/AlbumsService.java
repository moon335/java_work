package com.jsonplaceholder.albums.service;

import com.jsonplaceholder.albums.dao.AlbumsDao;

public class AlbumsService {
	
	AlbumsDao albumsDao;
	
	public AlbumsService() {
		albumsDao = new AlbumsDao();
	}
	
	// 정보 저장 로직 구현
	public String saveData(int userId, int id, String title) {
		String result = "저장에 실패했습니다.";
		int resultRow = albumsDao.insert(userId, id, title);
		if(resultRow != 0) {
			result = "저장에 성공했습니다.";
		}
		return result;
	}
	
	
	
} // end of class
