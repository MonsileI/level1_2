package Today_22_03_18;

public class no_4 {

	public static void main(String[] args) {
		
		String s = "one4seveneight";
		
		String []word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String []num = {"0","1","2","3","4","5","6","7","8","9"};
		
		for(int i=0;i<num.length;i++) {
			
			s = s.replaceAll(word[i], num[i]);
			
			
		}
		
		System.out.println(s);
		
	}
}
