package Today_22_04_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		
		
		int[]fees = {180, 5000, 10, 600};
		String []records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
		TreeMap<String, Integer> result = new TreeMap<>();
		HashMap<String, Integer> map = new HashMap<>();
		

		for(int i=0;i<records.length;i++) {
			
			String[] temp = records[i].split(" ");
			
			String carNum = temp[1];
			String action = temp[2];
			int time = check(temp[0]);
			
			
			if(action.equals("IN")) {
				if(!result.containsKey(carNum)) result.put(carNum, 0);
				map.put(carNum, time);
			}else if(action.equals("OUT")) {
				result.put(carNum, result.get(carNum)+time-map.get(carNum));
				map.remove(carNum);
			}
			
		
		}
		
		if(!map.isEmpty()) {
			for(String key : map.keySet()) {
				result.put(key, result.get(key)+(23*60+59) - map.get(key));
			}	
		}
		
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i : result.values()) {
			if(i<fees[0]) arr.add(fees[1]);
			else {
				i = i - fees[0];
				int rest = (int)Math.ceil(i/fees[2]);
				rest *= fees[3];
				arr.add(rest+fees[1]);
			}
		}
		
		
		System.out.println(arr);
		
		
		
	}
	public static int check(String temp) {
		
		String[]num = temp.split(":");
		
		int hour = Integer.parseInt(num[0])*60;
		int min = Integer.parseInt(num[1]) + hour;
		
		return min;
		
		
		
		
	}
}
