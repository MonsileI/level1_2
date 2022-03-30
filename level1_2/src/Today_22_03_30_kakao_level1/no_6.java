package Today_22_03_30_kakao_level1;


import java.util.HashMap;


public class no_6 {
	
	public static void main(String[] args) {
		
		int n = 5;
		int[]stages = {2, 1, 2, 6, 2, 4, 3, 3};
	    int[] answer = new int[n];
	    HashMap<Integer,Double> map = new HashMap<>();
	    
	    for(int i=0;i<n;i++) {
	    	
	    	double son =0;
	    	double mom =0;
	    	
	    	int now = i+1;
	    	
	    	for(int j=0;j<stages.length;j++) {
	    		if(now==stages[j]) son++;
	    		else if(now<stages[j]) mom++;
	    	}
	    	mom += son;
	    	map.put(now,son/mom);	
	    }
	    
	    for(int i=0;i<n;i++) {
	    	
	    	double max = -1;
	    	int maxKey = 0;
	    	
	    	for(int key : map.keySet()) {
	    		if(max < map.get(key)) {
	    			max = map.get(key);
	    			maxKey = key;
	    		}
	    		
	    	}
	    	
	    	answer[i] = maxKey;
	    	map.remove(maxKey);
	    	
	    	
	    }
	    
	  
	    for(int i : answer)System.out.println(i);
	    
	}

}
