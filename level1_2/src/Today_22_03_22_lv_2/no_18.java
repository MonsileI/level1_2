package Today_22_03_22_lv_2;

import java.util.HashMap;

public class no_18 {
	
	public static void main(String[] args) {
		
		String[]phone_book = {"119", "97674223", "1195524421"};
		boolean answer = true;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<phone_book.length;i++) {
			map.put(phone_book[i], i);
		}
		
		System.out.println(map);
		for(int i=0;i<phone_book.length;i++) {
			for(int j=1;j<phone_book[i].length();j++) {
				if(map.containsKey(phone_book[i].substring(0, j))) {
					
					answer = false;
				}
			}
		}
	
		System.out.println(answer);
		
	}

}
