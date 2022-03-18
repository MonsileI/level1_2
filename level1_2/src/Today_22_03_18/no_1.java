package Today_22_03_18;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class no_1 {

	public static void main(String[] args) {
		//신고 결과 받기
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		int []result = new int[id_list.length];
		
		HashMap<String, Set<String>> reportArr = new HashMap<String, Set<String>>();
		HashMap<String,Integer> takeArr = new HashMap<String, Integer>();
		
		for(String s : id_list) {
			reportArr.put(s, new HashSet<>());
			takeArr.put(s, 0);
		}
		for(String s : report) {
			String[]check = s.split(" ");
			String reporter = check[0];
			String taker = check[1];
			reportArr.get(reporter).add(taker);
			takeArr.put(taker, takeArr.get(taker)+1);
			
		}
		for(String s : report) {
			String[]check = s.split(" ");
			String reporter = check[0];
			String taker = check[1];
			if(takeArr.get(taker)<k) reportArr.get(reporter).remove(taker);
		}
		
		for(int i=0;i<id_list.length;i++) {
			
			result[i] = reportArr.get(id_list[i]).size();
			
		}
		
		for(int i : result) System.out.println(i);
	}
}
