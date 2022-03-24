package Today_22_03_24_lv_2;

public class no_50 {

	public static void main(String[] args) {
		
		int answer = 0;
		int num = 110011;
		int k = 10;
		String s = "";
		while(num > 0) {
		    int quotient = num / k;
		    int remainder = num % k;
		    s = remainder + s;
		    num = quotient;
		}
		
		s = s.replaceAll("0", "k");
		
		String[]check = s.split("k");
		
		for(int i=0;i<check.length;i++) {
			
			int a = 0;
			try {
				a = Integer.parseInt(check[i]);
			} catch (Exception e) {
				a = 922;
			}
			
		
			if(a==1) continue;
			
			
			int count = 0;
			
			for(int j=2;j<=Math.sqrt(a);j++) {
				
				if(a%j==0) {
					System.out.println(a);
					count++;
					break;
				}
				
			}
			
			if(count==0||a==2) answer++;
			
			
		}
	
		System.out.println(answer);
	}
}
