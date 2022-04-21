package Today_22_04_21;

import java.util.Collections;
import java.util.TreeMap;

public class est {
	
	public static void main(String[] args) {
		
		int [] input = {1,2,2,3,3,3,4,4,4,4,5,5,5,5};
		
		int answer = 0;
		
		TreeMap<Integer,Integer> tree = new TreeMap<>();
		
		for(int i: input) tree.put(i, tree.getOrDefault(i, 0)+1);
		
		for(int key : tree.keySet()) {
			if(key==tree.get(key)) answer = key;
		}
		
		
		System.out.println(answer);
		
				
	}

}
