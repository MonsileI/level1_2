package Today_22_03_23_lv_2;

import java.util.HashMap;

public class no_37 {
	
	public static void main(String[] args) {
		
		String [] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int n = 3;
		
		int[]answer = new int[2];
		
		
		int person = 2;
		int round = 1;
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put(words[0], 1);
	
		char last = words[0].charAt(words[0].length()-1);
		
		for(int i=1;i<words.length;i++) {
		
			
			char first = words[i].charAt(0);
			String word = words[i];
			
			if(last!=first||map.containsKey(word)) {
				answer[0] = person;
				answer[1] = round;
				break;
					
			}
			
			last = words[i].charAt(words[i].length()-1);

			person++;
			
			if(person>n) {
				person=1;
				round++;
			}
			
			

			
			
		}
		
		
		for(int i : answer) System.out.println(i);
	}

}
