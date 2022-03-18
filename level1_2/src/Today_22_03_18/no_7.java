package Today_22_03_18;

public class no_7 {
	
	public static void main(String[] args) {
		
		int[]numbers = {1,2,3,4,6,7,8,0};
		int result =45;
		
		for(int i : numbers) result -= i;
		
		System.out.println(result);
	}

}
