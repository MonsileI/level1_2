package Today_22_03_22_lv_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class no_16 {
	
	public static void main(String[] args) {
		
		
		String s = 	"{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		s = s.substring(1,s.length()-1);
		
		
		String[] arr = s.split("}");
		//첫번째는 좀 특별하게 하고
		arr[0] = arr[0].substring(1,arr[0].length());
		
		for(int i=1;i<arr.length;i++) {
			arr[i] = arr[i].substring(2,arr[i].length());
		}
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			String []check = arr[i].split(",");
			
			for(int j=0;j<check.length;j++) {
				
				if(map.containsKey(check[j])) {
					map.put(check[j], map.get(check[j])+1);
				}else {
					map.put(check[j],1);
					}
					
			}
			
		}
		System.out.println(map);
		int[] answer = new int[map.size()];
		// Map.Entry 리스트 작성
				List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());

				// 비교함수 Comparator를 사용하여 내림 차순으로 정렬
				Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
					// compare로 값을 비교
					public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
					{
						// 내림 차순으로 정렬
						return obj2.getValue().compareTo(obj1.getValue());
					}
				});
		
				
		Iterator<String> keys = map.keySet().iterator();
		
		for(int i=0;i<answer.length;i++) {
			
			String test  = keys.next();
			
			answer[i] = Integer.parseInt(test);
			
		}
		
		
		for(int i : answer) System.out.println(i);
		
		
		
	}

}
