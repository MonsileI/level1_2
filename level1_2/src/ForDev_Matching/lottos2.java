package ForDev_Matching;

public class lottos2 {
	
	public static void main(String[] args) {
		
		int[]lottos = {44, 1, 0, 0, 31, 25};
		int[]win_nums = {31, 10, 45, 1, 6, 19};
		

		int winNum = 0;
		int loseNum =0;
		
		for(int i=0;i<lottos.length;i++) {
			int num = lottos[i];
			if(num==0) {
				winNum++;
				continue;
			}
			for(int j=0;j<win_nums.length;j++) {
				if(num==win_nums[j]) {
					loseNum++;
					continue;
				}
			}
			
		}
		
		winNum += loseNum;
		
		System.out.println(check(winNum));
		System.out.println(check(loseNum));
	}
	
	static int check(int a) {
		if(a>=6) a=1;
		else if(a>=5) a=2;
		else if(a>=4) a=3;
		else if(a>=3) a=4;
		else if(a>=2) a=5;
		else a=6;
		
		return a;
		
	}

}
