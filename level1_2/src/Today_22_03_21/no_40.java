package Today_22_03_21;

public class no_40 {
	
	public static void main(String[] args) {
		
		
		int N = 123;
		
		int answer = 0;
		
		String s = String.valueOf(N);
		
		for(int i=0;i<s.length();i++) answer +=Integer.parseInt(String.valueOf(s.charAt(i)));
	
		
		System.out.println(answer);
	}

}
