package Today_22_03_21;

public class no_33 {

	
	public static void main(String[] args) {
		
		String s = "a234";
		boolean answer = false;
		if(s.length()==4||s.length()==6) {
		
			try {
				int x = Integer.parseInt(s);
				answer = true;
			} catch (NumberFormatException e) {
				answer = false;
			}
			
			
		}
		
		System.out.println(answer);
		
	}
}
