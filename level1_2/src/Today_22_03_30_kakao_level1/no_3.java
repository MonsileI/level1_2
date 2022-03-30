package Today_22_03_30_kakao_level1;

public class no_3 {
	
	public static void main(String[] args) {
		
		String s = "one4seveneight";

		String[]num = {"0","1","2","3","4","5","6","7","8","9"};
		String[]alpha = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		int result = 0;
		
		for(int i=0;i<num.length;i++) {
			
			s = s.replaceAll(alpha[i],num[i]);
			
		}
		
		result = Integer.parseInt(s);
		
		System.out.println(result);
		
		
	}

}
