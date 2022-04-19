package Today_22_04_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapAndTree {

	
	public static void main(String[] args) {
		
	int [] fees = {180, 5000, 10, 600};
	
	String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
	TreeMap<String,Integer> tree = new TreeMap<>();
	
	HashMap<String,Integer> hash = new HashMap<>();
	
	for(String str : records) {
		
		String [] temp = str.split(" ");
		
		String tempTime = temp[0];
		String num = temp[1];
		String action = temp[2];
		
		int time = changeTime(tempTime);
		
		if(action.equals("IN")) {
				hash.put(num, time);
		}else {
			
			if(tree.containsKey("num")) {
				tree.put(num, tree.get(num) + (time - hash.get(num)));
			}else {
				tree.put(num, time - hash.get(num));
				
			}
			
			hash.remove(num);
			
		
		}
		
	}
	
	if(!hash.isEmpty()) {
		
		for(String key : hash.keySet()) {
			
			tree.put(key, tree.get(key) + ((23*60)+59) -(hash.get(key)));
			hash.remove(key);
		}
		
	}
	
	ArrayList<Integer> list = new ArrayList<>();
	
	int basicT = fees[0];
	int basicF = fees[1];
	int extraT = fees[2];
	int extraF = fees[3];

	for(String key : tree.keySet()) {
		
		if(tree.get(key)<=basicT) {
			list.add(basicF);
		}else {
			int time = tree.get(key) - basicT;
			double restTime = Math.ceil(time/extraT);
			System.out.println(time);
			System.out.println(extraT);
			System.out.println(restTime);
			int fee = (int)(restTime*extraF) + basicF;
			list.add(fee);
			
		}
		
	}
		
		
	System.out.println(list);
	
	
	}
	
	public static int changeTime(String s) {
		
		String[]temp = s.split(":");
		
		int hour = Integer.parseInt(temp[0]) * 60;
		int min = Integer.parseInt(temp[1]) + hour;
		
		return min;
	}
}
