package com.jsonplaceholder.albums.controller;

import com.jsonplaceholder.albums.service.AlbumsService;

public class AlbumsController {
	
	AlbumsService albumsService;
	
	public AlbumsController() {
		albumsService = new AlbumsService();
	}
	
	// 정보 저장 요청 받기
	public String requestSaveData(int userId, int id, String title) {
		String response = albumsService.saveData(userId, id, title);
		return response;
	}
	
	
	
} // end of class
