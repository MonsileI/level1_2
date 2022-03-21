package Today_22_03_21;

public class no_26 {
	
	public static void main(String[] args) {
		
		String dartResult = "1D2S#10S";
		int answer = 0;
		
		//S D T
		//* #
		int [] soo = new int[3];

		int idx = 0;
		String temp = "";
		for(int i=0;i<dartResult.length();i++) {
			
			String s = String.valueOf(dartResult.charAt(i));
			
			switch (s) {
			case "*": soo[idx-1]*=2;
					  if(idx>1) soo[idx-2] *=2;
					  
				break;

			case "#": soo[idx-1] *= -1;
					  
				break;
				
			case "S": soo[idx] = (int) Math.pow(Integer.parseInt(temp),1);
					  temp="";
					  idx++;
				
				break;
			case "D": soo[idx] = (int) Math.pow(Integer.parseInt(temp),2);
					  temp="";
					  idx++;
				break;
			case "T": soo[idx] = (int) Math.pow(Integer.parseInt(temp),3);
					  temp="";
					  idx++;
				break;
				
			default: temp += s;
				break;
			}
			
			
			
		}
		
		for(int i : soo) answer += i;
		System.out.println(answer);
	}

}
