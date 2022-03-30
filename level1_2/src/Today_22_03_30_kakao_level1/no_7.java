package Today_22_03_30_kakao_level1;

public class no_7 {
	
	public static void main(String[] args) {
		
		int n = 5;
		int [] arr1 = {9, 20, 28, 18, 11};
		int [] arr2 = {30,1,21,17,28};
		String [] answer = new String[n];
		
		String[] s1 = new String[n];
		String[] s2 = new String[n];
		
		
		for(int i=0;i<n;i++) {
			
			String a = Integer.toBinaryString(arr1[i]);
			if(a.length()<n) {
				while(a.length()<n) {
					a = "0"+a;
				}
			}
			String b = Integer.toBinaryString(arr2[i]);
			if(b.length()<n) {
				while(b.length()<n) {
					b = "0"+b;				
				}
			}
			
			String tempAnswer = "";

			for(int j=0;j<a.length();j++) {
				
				
				if(a.charAt(j)=='1'||b.charAt(j)=='1') tempAnswer += "#";
				else tempAnswer += " ";
				
			}
					
			answer[i] = tempAnswer;
		}
		
		for(String ans : answer)System.out.println(ans);
		
	}

}
