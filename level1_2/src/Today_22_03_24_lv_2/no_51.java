package Today_22_03_24_lv_2;

public class no_51 {
	
	public static void main(String[] args) {
		
		int n = 15;
		int answer = 0;
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			sum =0;
			for(int j=i;j<=n;j++) {
				sum += j;
				if(sum==n) {
					answer++;
					break;
				}else if(sum>n) break;
				
			}
		}
		
		System.out.println(answer);
	}

}
