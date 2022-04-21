package Today_22_04_21;

public class no_3_level_1 {

	public static void main(String[] args) {
		
		
		String s = "one4seveneight";
		
		String[]num = {"0","1","2","3","4","5","6","7","8","9"};
		String[]alpha = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i=0;i<9;i++) s = s.replaceAll(alpha[i],num[i]);
		
		System.out.println(Integer.valueOf(s));
		
	}
}
