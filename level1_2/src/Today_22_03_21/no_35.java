package Today_22_03_21;

public class no_35 {
	
	public static void main(String[] args) {
		
	
		int n = 5;
		int answer = n-1;
        
		for(int i=2;i<=n;i++) {
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
                    answer--;
                    break;
			    }
			
            }
		}
		
		System.out.println(answer);
	}

}
