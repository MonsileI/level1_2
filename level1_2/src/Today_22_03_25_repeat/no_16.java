package Today_22_03_25_repeat;

import java.util.*;

public class no_16 {
	
	public static void main(String[] args) {
		
		
		String s = 	"{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		s = s.substring(2,s.length()-2).replace("},{", "-");
		
		String[] arr = s.split("-");
		
		Arrays.sort(arr,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
			
		});
		
		for(String w : arr)System.out.println(w);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(String check : arr) {
			
			String [] temp = check.split(",");
			
			for(int i = 0 ;i<temp.length;i++) {
				
				int num = Integer.parseInt(temp[i]);
				
				if(!list.contains(num)) {
					list.add(num);
				}
				
			}
			
		}
		
		
		System.out.println(list);
		
	}

}
