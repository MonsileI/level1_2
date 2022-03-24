package Today_22_03_24_lv_2;

public class no_47 {
	
	public static void main(String[] args) {
		
		String s = ")()(";
		
		int count = 0;
		boolean answer = true;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='(') count++;
			else count--;
			
			if(count<0) {
				answer = false;
				break;
			}
			
		}
		
		if(count!=0) answer=false;
		
		System.out.println(answer);
	}

}
