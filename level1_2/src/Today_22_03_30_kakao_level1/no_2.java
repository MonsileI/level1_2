package Today_22_03_30_kakao_level1;

public class no_2 {
	
	public static void main(String[] args) {
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		//1
		new_id = new_id.toLowerCase();
		//2
		new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
		//3
		new_id = new_id.replaceAll("[.]{2,}", ".");
		//4
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		//5
		if(new_id.equals(""))new_id="a";
		//6
		if(new_id.length()>15) {
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("[.]$", "");
		}
		if(new_id.length()<3) {
			while(new_id.length()<3) {
				new_id += new_id.charAt(new_id.length()-1);
			}
		}
		
		
		System.out.println(new_id);
	}

}
