package ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class MainTest5 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/users/1");
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
			User user = gson.fromJson(str, User.class);
			
			JsonArray array = new JsonArray();
			
			JsonObject jsonObject1 = new JsonObject();
			JsonObject jsonObject2 = new JsonObject();
			JsonObject jsonObject3 = new JsonObject();
			JsonObject jsonObject4 = new JsonObject();
			
			jsonObject4.addProperty("name", user.getCompany().getName());
			jsonObject4.addProperty("carchPhrase", user.getCompany().getCatchPhrase());
			jsonObject4.addProperty("bs", user.getCompany().getBs());
			
			jsonObject3.addProperty("lat", user.getAddress().getGeo().getLat());
			jsonObject3.addProperty("lat", user.getAddress().getGeo().getLng());
			
			jsonObject2.addProperty("street", user.getAddress().getStreet());
			jsonObject2.addProperty("suite", user.getAddress().getSuite());
			jsonObject2.addProperty("city", user.getAddress().getCity());
			jsonObject2.addProperty("zipcode", user.getAddress().getZipcode());
			jsonObject2.add("geo", jsonObject3);
			
			jsonObject1.addProperty("id", user.getId());
			jsonObject1.addProperty("name", user.getName());
			jsonObject1.addProperty("username", user.getUsername());
			jsonObject1.addProperty("email", user.getEmail());
			jsonObject1.add("address", jsonObject2);
			jsonObject1.addProperty("phone", user.getPhone());
			jsonObject1.addProperty("website", user.getWebsite());
			jsonObject1.add("company", jsonObject4);
			
			
			array.add(jsonObject1);
			System.out.println(array);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
		
		
		
	} // end of main

} // end of class
