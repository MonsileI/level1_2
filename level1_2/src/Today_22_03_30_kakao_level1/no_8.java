package Today_22_03_30_kakao_level1;

public class no_8 {
	
	public static void main(String[] args) {
		
		String dartResult = "1D2S#10S";
		int answer = 0;
		int [] num = new int[3];
		int idx = -1;
		
		for(int i=0;i<dartResult.length();i++) {
			
			String dart = dartResult.charAt(i)+"";
			
			if(dart.equals("1")) {
				if(dartResult.charAt(i+1)=='0') {
					dart = "10";
				}
			}
			if(dart.equals("0")&&i!=0) {
				if(dartResult.charAt(i-1)=='1') {
					continue;
				}
			}
			
			
			switch (dart) {
			case "*": if(idx==0) num[idx] *= 2;
					  else {
						  num[idx] *= 2;
						  num[idx-1] *= 2;
					  }
				break;
				
			case "#": num[idx] *= -1;			
				break;
				
			case "S": num[idx] = (int) Math.pow(num[idx], 1);
				break;
				
			case "D": num[idx] = (int) Math.pow(num[idx], 2);
				break;
				
			case "T": num[idx] = (int) Math.pow(num[idx], 3);
				break;

			default : idx++;
					  num[idx] = Integer.parseInt(dart+"");
					 
				break;
			}
			
			
		}
	
		for(int i : num) answer += i;
		
		System.out.println(answer);
		
	}

}
