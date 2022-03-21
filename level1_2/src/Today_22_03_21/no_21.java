package Today_22_03_21;

public class no_21 {
	
	public static void main(String[] args) {
		
		int [][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		int result = 0;
		int garo = 0;
		int sero = 0;
		
		for(int i=0;i<sizes.length;i++) {
			
			garo = Math.max(garo, Math.max(sizes[i][0],sizes[i][1]));
			sero = Math.max(sero,Math.min(sizes[i][0], sizes[i][1]));
			
		}
		
		System.out.println(garo * sero);
	}

}
