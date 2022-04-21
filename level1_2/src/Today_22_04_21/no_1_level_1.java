package Today_22_04_21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class no_1_level_1 {

	
	public static void main(String[] args) {
		
	String[]id_list = {"muzi", "frodo", "apeach", "neo"};
	String[]report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
	int k = 2;
	int[]result = new int[id_list.length];
	
	HashMap<String,Integer> singoArr = new HashMap<>(); //내가 신고 당한 횟수
	HashMap<String,Set<String>> reportArr = new HashMap<>(); //내가 신고한 리스트
	
	for(String s : id_list) {
		singoArr.put(s, 0);
		reportArr.put(s, new HashSet<String>());
	}
	
	for(String s : report) {
		String[]temp = s.split(" ");
		reportArr.get(temp[0]).add(temp[1]);
	}
	
	System.out.println(reportArr);
	
	for(int i=0;i<reportArr.size();i++) {
		
		Set<String> list = reportArr.get(id_list[i]);
		
		for(String s :list) {
			
			singoArr.put(s, singoArr.getOrDefault(s, 0)+1);
			
		}
			
	}
	

	for(int i=0;i<reportArr.size();i++) {
		
		if(singoArr.get(id_list[i])<k) {
			for(int j=0;j<id_list.length;j++) {
				reportArr.get(id_list[j]).remove(id_list[i]);
			}
		}
		
	}
	
	int []answer = new int[id_list.length];
	
	for(int i=0;i<reportArr.size();i++) answer[i] = reportArr.get(id_list[i]).size();
	for(int i : answer)System.out.println(i);
	}
}
