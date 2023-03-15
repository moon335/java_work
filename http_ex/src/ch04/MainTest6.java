//package ch04;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//
//public class MainTest6 {
//
//	public static void main(String[] args) {
//		
//		JsonArray array = new JsonArray();
//		
//		User user = new User();
//		
//		user.setId(1);
//		user.setName("Leanne Graham");
//		user.setEmail("Sincere@april.biz");
//		user.getAddress().setStreet("Kulas Light");
//		user.getAddress().setSuite("Apt. 556");
//		user.getAddress().setCity("Gwenborough");
//		user.getAddress().setZipcode("92998-3874");
//		user.getAddress().getGeo().setLat("-37.3159");
//		user.getAddress().getGeo().setLng("81.1496");
//		user.setPhone("1-770-736-8031 x56442");
//		user.setWebsite("hildegard.org");
//		user.getCompany().setName("Romaguera-Crona");
//		user.getCompany().setCatchPhrase("Multi-layered client-server neural-net");
//		user.getCompany().setBs("harness real-time e-markets");
//		
//		JsonObject jsonObject1 = new JsonObject();
//		JsonObject jsonObject2 = new JsonObject();
//		JsonObject jsonObject3 = new JsonObject();
//		JsonObject jsonObject4 = new JsonObject();
//		
//		jsonObject3.addProperty("lat", user.getAddress().getGeo().getLat());
//		jsonObject3.addProperty("lng", user.getAddress().getGeo().getLng());
//		
//		jsonObject4.addProperty("name", user.getCompany().getName());
//		jsonObject4.addProperty("catchPhrase", user.getCompany().getCatchPhrase());
//		jsonObject4.addProperty("bs", user.getCompany().getBs());
//		
//		jsonObject2.addProperty("street", user.getAddress().getStreet());
//		jsonObject2.addProperty("suit", user.getAddress().getSuite());
//		jsonObject2.addProperty("city", user.getAddress().getCity());
//		jsonObject2.addProperty("zipcode", user.getAddress().getZipcode());
//		jsonObject2.add("geo", jsonObject3);
//		
//		jsonObject1.addProperty("id", user.getId());
//		jsonObject1.addProperty("name", user.getName());
//		jsonObject1.addProperty("username", user.getUsername());
//		jsonObject1.addProperty("email", user.getEmail());
//		jsonObject1.add("address", jsonObject2);
//		jsonObject1.addProperty("phone", user.getPhone());
//		jsonObject1.addProperty("website", user.getWebsite());
//		jsonObject1.add("company", jsonObject4);
//		
//		array.add(jsonObject1);
//		
//		System.out.println(array);
//		
//		
//	} // end of main
//
//} // end of class
