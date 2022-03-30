package Today_22_03_30_kakao_level1;

import java.util.HashMap;
import java.util.HashSet;

public class no_1 {

	public static void main(String[] args) {
		
		String[]id_list = {"muzi", "frodo", "apeach", "neo"};
		String[]report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 3;
		
		HashMap<String,HashSet<String>> reportArr = new HashMap<>();
		HashMap<String,Integer> takeArr = new HashMap<>();
		
		for(int i=0;i<id_list.length;i++) {
			reportArr.put(id_list[i], new HashSet<String>());
			takeArr.put(id_list[i], 0);
		}
		
		for(int i=0;i<report.length;i++) {
			String[]check = report[i].split(" ");
			String reporter = check[0];
			String taker = check[1];
			reportArr.get(reporter).add(taker);
		}
		
		for(int i=0;i<id_list.length;i++) {
			
			String taker = id_list[i];
			
			for(int j=0;j<reportArr.get(taker).size();j++) {
				
				if(reportArr.get(taker).contains(takeArr.get(taker))) {
					
					takeArr.put(taker, takeArr.get(taker)+1);
				}
				
				
				
			}
			
		}
		
		for(int i=0;i<id_list.length;i++) {
			
			if(takeArr.get(id_list[i])<k) {
				takeArr.remove(id_list[i]);
			}
			
		}
		
		System.out.println(takeArr);
		
	}
}
