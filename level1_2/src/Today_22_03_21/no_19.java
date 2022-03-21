package Today_22_03_21;


import java.util.HashSet;
import java.util.Iterator;

public class no_19 {
	
	public static void main(String[] args) {
		
		int []numbers = {2,1,3,4,1};
		
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=i+1;j<numbers.length;j++) {
				
				set.add(numbers[i]+numbers[j]);
				
			}
		}
		
		System.out.println(set);
		
		int []result = new int[set.size()];
		Iterator iter = set.iterator();
		for(int i =0 ;i<set.size();i++) {
			
			result[i] = (int) iter.next();
			
		}
		
		for(int i : result) System.out.println(i);
		
	}

}
