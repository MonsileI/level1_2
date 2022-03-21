package Today_22_03_21;

public class no_22 {
	
	public static void main(String[] args) {
		
		int n = 10;
		int result = 0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==1) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
	

}
