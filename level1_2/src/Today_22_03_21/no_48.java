package Today_22_03_21;

public class no_48 {
	
	public static void main(String[] args) {
		
		int arr = 11;
		boolean answer = true;
		
		String s = String.valueOf(arr);
		int num = 0;
		for(int i=0;i<s.length();i++) {
			
			num += Integer.parseInt(String.valueOf(s.charAt(i)));
			
			
		}
		
		if(arr%num!=0) answer=false;
		
		System.out.println(answer);
		
	}

}
