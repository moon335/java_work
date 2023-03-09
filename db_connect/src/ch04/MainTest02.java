package ch04;

import java.util.ArrayList;

public class MainTest02 {

	public static void main(String[] args) {
		
		BuyDAO buyDAO = new BuyDAO();
		
		BuyDTO dto = new BuyDTO("티모", "에어컨", 200, 1);
//		
//		int rowCount = buyDAO.insert(dto);
//		
//		System.out.println("rowCount: " + rowCount);
		
//		buyDAO.update(dto, dto.getUserName(), "냉장고");
		
		buyDAO.delete(dto.getUserName());
		
		
//		ArrayList<BuyDTO> list = buyDAO.select();
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i).getUserName() + "\t");
//			System.out.print(list.get(i).getProdName() + "\t");
//			System.out.print(list.get(i).getPrice() + "\t");
//			System.out.print(list.get(i).getAmount() + "\n");
//		}
		
		
		
	} // end of main

} // end of class
