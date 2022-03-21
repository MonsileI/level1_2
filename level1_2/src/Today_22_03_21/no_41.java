package Today_22_03_21;


public class no_41 {

	public static void main(String[] args) {
		
		int n = 12345;
		String s = String.valueOf(n);
		
		int[]answer = new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
			
		answer[i] = Integer.parseInt(String.valueOf(s.charAt(s.length()-i-1)));
			
		}
		
		for(int i : answer) System.out.println(i);
	}
}
