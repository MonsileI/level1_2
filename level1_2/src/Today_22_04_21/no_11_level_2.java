package Today_22_04_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class no_11_level_2 {

	static HashMap<String,Integer> map = new HashMap<>();
	static ArrayList<String>answerList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		String [] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int [] course = {2,3,4};
		
		for(int i=0;i<orders.length;i++) {
			char[]arr = orders[i].toCharArray();
			Arrays.sort(arr);
			orders[i] = String.valueOf(arr);
		}
		
		for(int count : course) {
			for(String order : orders) {
				dfs(order,"",count);
			}
				if(!map.isEmpty()) {
					ArrayList<Integer>MaxValue = new ArrayList<>(map.values());
					int MaxInt = Collections.max(MaxValue);
					if(MaxInt>1) {
						for(String key : map.keySet()) {
							if(map.get(key)==MaxInt) {
								answerList.add(key);								
							}
						}
						
					}
				}
				
			
			map.clear();
		}
		
		Collections.sort(answerList);
		System.out.println(answerList);
		
	}
	public static void dfs(String order,String now,int count) {
		
		if(count==0) {
			map.put(now, map.getOrDefault(now, 0)+1);
			return;
		}
		
		for(int i=0;i<order.length();i++) {
			
			dfs(order.substring(i+1),now+order.charAt(i),count-1);
		}
		
	}
}
