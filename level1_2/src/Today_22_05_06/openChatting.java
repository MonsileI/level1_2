package Today_22_05_06;

import java.util.ArrayList;
import java.util.HashMap;

public class openChatting {
	
	public static void main(String[] args) {
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		ArrayList<String> answerList = new ArrayList<>();
		
		HashMap<String,String> idNick = new HashMap<>();
		
		
		for(String str : record) {
			
			String[]temp = str.split(" ");
			if(temp[0].equals("Leave"))continue;
			
			idNick.put(temp[1], temp[2]);
			
			
		}
		
		for(String str : record) {
			
			String[]temp = str.split(" ");
			if(temp[0].equals("Change"))continue;
			String id = temp[1];
			String nick = idNick.get(id);
			
			String ans = nick+"님이  " +(temp[0].equals("Enter") ?"들어왔습니다." : "나갔습니다.");
			
			answerList.add(ans);
			
			
			
			
		}
		
		String[]answer = new String[answerList.size()];
		
		for(int i = 0; i <answer.length;i++) answer[i] = answerList.get(i);
		
		for(String str : answer)System.out.println(str);
		
		
		
	}

}
