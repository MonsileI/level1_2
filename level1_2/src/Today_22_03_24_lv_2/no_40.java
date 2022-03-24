package Today_22_03_24_lv_2;

public class no_40 {
	
	public static void main(String[] args) {
		
		String s = "110010101001";
		
		int[]answer = new int[2];
		
		int count = 0;
		int zero = 0;
		
		while(!s.equals("1")) {
			
			for(int i =0;i<s.length();i++) if(s.charAt(i)=='0') zero ++;
				
			s = s.replaceAll("0", "");
			
			s = String.valueOf(Integer.toBinaryString(s.length()));
			
			count++;
			
		}
	
		answer[0] = count;
		answer[1] = zero;
		
		System.out.println(answer[0]+","+answer[1]);
	
		
	}

}
