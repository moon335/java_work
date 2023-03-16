package com.jsonplaceholder.albums;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jsonplaceholder.albums.controller.AlbumsController;

public class MainTest1 {

	public static void main(String[] args) {
		
		AlbumsController controller = new AlbumsController();
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/albums");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = null;
			
			StringBuffer sb = new StringBuffer();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			String str = sb.toString();
			Gson gson = new Gson();
			
//			AlbumsDto dto = gson.fromJson(str, AlbumsDto.class);
//			
//			String result = controller.requestSaveData(dto.getUserId(), dto.getId(), dto.getTitle());
//			System.out.println(result);
			
			Type listType = new TypeToken<List<AlbumsDto>>(){}.getType();
			ArrayList<AlbumsDto> albumsList = gson.fromJson(str, listType);
			for (AlbumsDto dto : albumsList) {
				String result = controller.requestSaveData(dto.getUserId(), dto.getId(), dto.getTitle());
				System.out.println(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // end of main

} // end of class
