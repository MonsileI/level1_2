package Today_22_03_21;

public class no_47 {

	public static void main(String[] args) {
		
		int[]arr = {1,2,3,4};
		
		double answer = 0;
		double sum = 0;
		double length = arr.length;
		for(int i=0;i<arr.length;i++) {
			
			sum += arr[i];
			
		}
		
		answer = sum/length;
		
		System.out.println(answer);
		
	}
}
