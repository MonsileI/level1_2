package Today_22_03_23_lv_2;



public class no_31 {

	public static void main(String[] args) {
		
		int brown = 10;
		int yellow = 2;
		
		int [] answer= new int[2];
		
		int sum = brown + yellow;
			
		for(int i=3;i<sum;i++) {
			
			int j = sum/i;
			
			if(sum%i==0&&j>=3) {
				
				int col = Math.max(i, j);
				int row = Math.min(i, j);
				
				int center = (col-2)*(row-2);
				
				if(center==yellow) {
					
					answer[0] = col;
					answer[1] = row;
							
					
				}
				
			}
			
			
			
			
			
		}
	
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
		
		
	}
}
