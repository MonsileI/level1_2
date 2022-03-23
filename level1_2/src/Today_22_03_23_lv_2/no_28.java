package Today_22_03_23_lv_2;

import java.util.HashMap;
import java.util.Iterator;

public class no_28 {

	
	public static void main(String[] args) {
		
	
		String[][]clothes = {{"yellowhat", "headgear"}, 
					{"bluesunglasses", "eyewear"}, 
					{"green_turban", "headgear"}};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<clothes.length;i++) {
			
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
			
		}
		
		Iterator<Integer> it = map.values().iterator();
		
		int answer = 1;
		while(it.hasNext()) {
			
			answer *= it.next().intValue()+1;
			
			
		}
		
		System.out.println(answer-1);
	}
}
