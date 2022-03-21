package Today_22_03_21;

public class no_16 {
	
	public static void main(String[] args) {
		
		int N = 5;
		int [] stages =  {2, 1, 2, 6, 2, 4, 3, 3};
		double [] result = new double[N];
		
		//1/8
		//3/7
		//1/2
		
		for(int i=0;i<N;i++) {
			
			int now  = i+1;
			double mom = 0;
			double son = 0;
			
			for(int j=0;j<stages.length;j++) {
				if(now==stages[j]) son++;
				
				if(now<=stages[j]) mom++;
				
				
			}
			
			result[i] = son/mom;
			
		}
		
		
		

	}
	
}
