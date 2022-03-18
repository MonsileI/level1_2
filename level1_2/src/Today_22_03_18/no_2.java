package Today_22_03_18;

public class no_2 {
	
	public static void main(String[] args) {
		
		int[]lottos = {0,0,0,0,0,0};
		int[]win_nums = {38, 19, 20, 40, 15, 25};
		int[]result = new int[2];
		
		int good = 0;
		int bad = 0;
		
		for(int i=0;i<lottos.length;i++) {
			
			int num = lottos[i];
			
			if(num==0) good++;

			for(int j=0;j<win_nums.length;j++) {
				if(num==win_nums[j]) bad++;
			}
			
		}
	
		good += bad;
		System.out.println(check(good));
		System.out.println(check(bad));
		
	
		
	}
	public static int check(int a) {
		if(a>=6) a=1;
		else if(a>=5) a=2;
		else if(a>=4) a=3;
		else if(a>=3) a=4;
		else if(a>=2) a=5;
		else a=6;
		
		return a;
	}

}
