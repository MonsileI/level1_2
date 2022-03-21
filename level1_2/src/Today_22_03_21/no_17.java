package Today_22_03_21;

public class no_17 {
	
	public static void main(String[] args) {
		
		int left = 13;
		int right = 17;
		int result = 0;
		
		for(int i=left;i<=right;i++) {
			
			int count = 0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) count++;
				
				
			}
			
			if(count%2==0) result += i;
			else result -= i;
			
		}
		
		System.out.println(result);
		
		int a = 3;
		
		
	}

}
