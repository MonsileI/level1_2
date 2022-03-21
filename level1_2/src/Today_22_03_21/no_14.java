package Today_22_03_21;

import java.util.HashSet;

public class no_14 {
	
	public static void main(String[] args) {
		
		int n = 5;
		int [] lost = {2,4};
		int [] reserve = {3};
		
		HashSet<Integer>hash = new HashSet<>();
        
        int answer = n - lost.length;
        
        for(int i : reserve) hash.add(i);
        
      
        
        for(int i=0;i<lost.length;i++){
            
            if(hash.contains(lost[i]-1)){
                answer++;
                hash.remove(lost[i]-1);
                
            }else if(hash.contains(lost[i]+1)){
                answer++;
                hash.remove(lost[i]+1);
                
            }
            
        }
        
        System.out.println(answer);
		
	}

}
