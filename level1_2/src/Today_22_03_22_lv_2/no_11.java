package Today_22_03_22_lv_2;

import java.util.*;

public class no_11 {
	
	public static List<String> answerList =  new ArrayList<String>();
	public static Map<String,Integer> hashMap = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		
		String[]orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[]course = {2,3,4};
		
		//정렬하기
		for(int i=0;i<orders.length;i++) {
			
			char[] temp = orders[i].toCharArray();
			Arrays.sort(temp);
			orders[i] = String.valueOf(temp);
			
		}
		//oders만큼 돌기
		
		for(int courselength : course) {
			for(String order : orders) {
				combination("",order,courselength);
				
				
				if(!hashMap.isEmpty()) {
					List<Integer> countList = new ArrayList<>(hashMap.values());
					int max = Collections.max(countList);
					if(max >1) {
						for(String key : hashMap.keySet()) {
							if(hashMap.get(key)==max) {
								answerList.add(key);
							}
							hashMap.clear();
						}
					}
					
				}
			}
		}
		
	Collections.sort(answerList);
	String [] answer = new String[answerList.size()];
	
	for(int i=0;i<answerList.size();i++) {
		answer[i] = answerList.get(i);
	}
	
	for(String s : answer) System.out.println(s);
	
	
	}
	public static void combination(String order,String others,int count) {
		
		//탈출
		if(count ==0) {
			hashMap.put(order, hashMap.getOrDefault(order, 0) +1);
		}
		
		//수행동작
		for(int i=0;i<others.length();i++) {
			combination(order + others.charAt(i), others.substring(i+1),count--);
			
		}
		
	}
}
