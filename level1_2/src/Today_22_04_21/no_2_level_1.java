package Today_22_04_21;

public class no_2_level_1 {
	
	public static void main(String[] args) {
		
		int[]lottos = {44, 1, 0, 0, 31, 25};
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		int[]answer = new int[2];
		
		int winScore = 0;
		int loseScore = 0;
		
		for(int i=0;i<lottos.length;i++) {
			
			if(lottos[i]==0) {
				winScore++;
				continue;
			}
			
			for(int j=0;j<win_nums.length;j++) {
				
				if(lottos[i]==win_nums[j]) {
					loseScore++;
					continue;
				}
				
			}
			
		}
		
		winScore += loseScore;
		
		answer[0] = check(winScore);
		answer[1] = check(loseScore);
		
		for(int i : answer)System.out.println(i);
	}

	public static int check(int a) {
		if(a>=6) a = 1;
		else if(a>=5) a=2;
		else if(a>=4) a=3;
		else if(a>=3) a=4;
		else if(a>=2) a=5;
		else a=6;
		return a;
	}
}
