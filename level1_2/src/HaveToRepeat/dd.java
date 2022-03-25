package HaveToRepeat;

public class dd {

	public static void main(String[] args) {
		
		int m =5,n=6;
		int[] two = {1,4,2,3,4,5};
		int end = 0;
		int sum =0;
		int answer = 0;
		for(int start=0;start<two.length;start++) {
			
			while(end<n&&sum<m) {
				
				sum += two[end];
				end++;
			}
			
			if(sum==m) {
				answer++;
			}
			
			sum -= two[start];
			
		}
		
		System.out.println(answer);
		
	}
}
