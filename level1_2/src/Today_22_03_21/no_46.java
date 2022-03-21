package Today_22_03_21;

public class no_46 {

	public static void main(String[] args) {
		
		
		int num = 626331;
		long n = num;
		int count = 0;
		
		while(n!=1) {
			
			if(n%2==0) {
				n = n/2;
			}else {
				n = n*3;
				n++; 
			}
			
			count++;
			
			if(count>=500) {
				count=-1;
				n=1;
			}
		}
		
		System.out.println(count);
		
	}
}
