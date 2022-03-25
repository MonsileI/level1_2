package HaveToRepeat;

import java.util.*;

public class no_11 {
	
	public static List<String> answerList =  new ArrayList<String>();
	public static Map<String,Integer> hashMap = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		
		String[]orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[]course = {2,3,4};
		
		//1.주문정렬
		
		for(int i=0;i<orders.length;i++) {
			
			char[] arr = orders[i].toCharArray();
			Arrays.sort(arr);
			orders[i] = String.valueOf(arr);
		}
		
		//2. 각 order 기준으로 courselength 만큼의 조합 만들기
		
		for(int courseLength : course) {
			for(String order : orders) combination("",order,courseLength);
		
		//3. 가장 많은 조합 answer에 저장
		if(!hashMap.isEmpty()) {
			List<Integer> countList = new ArrayList<>(hashMap.values());
			int max  = Collections.max(countList);
			
			if(max > 1){
				for(String key : hashMap.keySet()) {
					if(hashMap.get(key) == max) {
						answerList.add(key);
					}
					hashMap.clear();
				}
			}
		}
		
		Collections.sort(answerList);
		
		System.out.println(answerList);
		
			
	}
		
	}
	public static void combination(String order, String others,int count) {
		
		if(count == 0) {
			hashMap.put(order, hashMap.getOrDefault(order, 0)+1);
			
		}
		
		
		for(int i=0;i<others.length();i++) {
			combination(order + others.charAt(i), others.substring(i+1),count - 1);
		}
		
	}
}	
