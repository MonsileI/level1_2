package Today_22_03_21_lv_2;

import java.util.ArrayList;
import java.util.HashMap;

public class no_2 {

	public static void main(String[] args) {
		
		String [] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		HashMap<String, String> map = new HashMap<>();
		
		for(String s : record) {
		
			String [] check = s.split(" ");
			String action = check[0];
			
			if(action.equals("Leave")) continue;

			String id = check[1];
			String nick = check[2];
			
			map.put(id, nick);
			
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(String s : record) {
			
			String[] check = s.split(" ");
			String action = check[0];
			
			if(action.equals("Change")) continue;
			
			String id = check[1];
			String nick = map.get(id);
			String str = nick + "님이 " + (action.equals("Enter") ? "들어왔습니다." : "나갔습니다.");
			
			
			list.add(str);
			
		}
		
		String[] answer = new String[list.size()];
		
		answer = list.toArray(answer);
		
		for(String s : answer) System.out.println(s);
		
	}
	
}
