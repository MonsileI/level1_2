package Today_22_03_23_lv_2;

public class no_22 {

	public static void main(String[] args) {
		
		String name = "JAN";
		
		int answer = 0;
		int LR = name.length()-1;
		int len = name.length();
		
		
		for(int i=0;i<len;i++) {
			
			char now = name.charAt(i);
			
			answer += Math.min(now - 'A', 'Z' - now+1);
			
			int indexA = i+1;
			
			while(indexA < len && name.charAt(indexA) == 'A') {
				
				indexA++;
				
			}
			
			
			LR = Math.min(LR, i*2+len-indexA);
			
			
			
		}
		
		System.out.println(answer + LR);
		
	}
}
