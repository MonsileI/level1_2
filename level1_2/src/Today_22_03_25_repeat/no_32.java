package Today_22_03_25_repeat;

public class no_32 {
	
	public static void main(String[] args) {
	
		String number = "1924";
		int k = 2;
		
		int max = 0;
		String answer = "";
		int index = 0;
		
		for(int i=0;i<number.length()-k;i++) {
			max = 0;
			for(int j=index;j<=k+i;j++) {
			
				int a = Integer.parseInt(String.valueOf(number.charAt(j)));
				
				if(max < a) {
					max = a;
					index = j + 1;
				}
				
				
			}
			
			answer += String.valueOf(max);
			
		}
		
		
		System.out.println(answer);
		
	}
}
