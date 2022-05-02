package Today_22_05_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Menu {

	static HashMap<String,Integer>menu = new HashMap<>();
	static ArrayList<String>answerList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		
		for(int i=0;i<orders.length;i++) {
			
			char[]temp = orders[i].toCharArray();
			Arrays.sort(temp);
			orders[i] = String.valueOf(temp);
			
		}
		
		for(int count : course) {
			for(String order : orders) {
				dfs("",count,order);
				
			}
			
			if(!menu.isEmpty()) {
				ArrayList<Integer>forMax = new ArrayList<>(menu.values());
				int max = Collections.max(forMax);
				if(max>1) {
					for(String key:menu.keySet()) {
						if(max==menu.get(key)) {
							answerList.add(key);
						}
					}
				}
			}
			
			
			
			menu.clear();
		}
		
		System.out.println(answerList);
		
	}
	static void dfs(String now,int count,String order) {
		
		if(count==0) {
			menu.put(now, menu.getOrDefault(now, 0)+1);
			return;
		}
		
		for(int i=0;i<order.length();i++) {
			dfs(now+order.charAt(i),count-1,order.substring(i+1));
		}
		
		
	}
}
