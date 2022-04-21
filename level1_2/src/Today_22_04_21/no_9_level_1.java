package Today_22_04_21;

import java.util.HashMap;

public class no_9_level_1 {

	
	public static void main(String[] args) {
		
		String[]participant = {"mislav", "stanko", "mislav", "ana"};
		String[]completion = {"stanko","ana","mislav"};
		String answer = "";
		HashMap<String,Integer>map = new HashMap<>();
		
		for(int i=0;i<participant.length;i++) map.put(participant[i], map.getOrDefault(participant[i],0)+1);
		
		for(int i=0;i<completion.length;i++) {
			
			if(map.get(completion[i])>1) {
				map.put(completion[i], map.get(completion[i])-1);
			}else {
				map.remove(completion[i]);
			}
			
		}
		
		for(String key: map.keySet()) answer = key;
		
		System.out.println(answer);
	}
}
