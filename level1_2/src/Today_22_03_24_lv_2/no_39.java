package Today_22_03_24_lv_2;

public class no_39 {
	
	public static void main(String[] args) {
		
		String word = "AAAAE";
		int answer = word.length();
	
		String str = "AEIOU";
		
		int[]x = {781,156,31,6,1};

		for(int i=0;i<word.length();i++) {
			int idx = str.indexOf(word.charAt(i));
			answer += idx*x[i];
			
			
		}
		System.out.println(answer);
		
		
		
		
	}

}
