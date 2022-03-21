package Today_22_03_21;

public class no_24 {

	public static void main(String[] args) {
		
		int n = 5;
		int[]arr1 = {9, 20, 28, 18, 11};
		int[]arr2 = {30, 1, 21, 17, 28};
		String[]result = new String[n];
		
		
		for(int i=0;i<arr1.length;i++) {
			String fir = Integer.toBinaryString(arr1[i]);
			String sec = Integer.toBinaryString(arr2[i]);
			
			if(fir.length()<5) {
				while(fir.length()<5) fir = "0"+fir;
			}
			if(sec.length()<5) {
				while(sec.length()<5) sec = "0"+sec;
			}
			String answer = "";
			for(int j=0;j<n;j++) {
				if(fir.charAt(j)=='1'||sec.charAt(j)=='1') answer += "#";
				else answer += " ";
			}
			
			result[i] = answer;
		}
		
		for(String str : result) System.out.println(str);
	}
}
