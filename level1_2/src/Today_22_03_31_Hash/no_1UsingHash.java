package Today_22_03_31_Hash;

import java.util.HashMap;

public class no_1UsingHash {

	
	public static void main(String[] args) {
		
		String answer = "";
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[]completion = {"stanko", "ana", "mislav"};
		
		HashMap<String,Integer> map = new HashMap<>();

		for(String s : participant) map.put(s, map.getOrDefault(s, 0)+1);
		for(String s : completion)map.put(s,map.get(s)-1);
		
		
		for(String s : map.keySet()) {
			if(map.get(s)!=0) answer = s;
		}
		
		System.out.println(answer);
	}
}
