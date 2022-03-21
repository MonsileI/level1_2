package Today_22_03_21;

public class no_49 {
	
	public static void main(String[] args) {
		
	String phone_number = "01033334444";
	
	String answer = "";
	
	for(int i=0;i<phone_number.length()-4;i++) answer += "*";
	for(int i=phone_number.length()-4;i<phone_number.length();i++) answer += phone_number.charAt(i);
	
	System.out.println(answer);
	
	
	}

}
