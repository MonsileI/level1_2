package ForDev_Matching;

public class lottos {
	
	public static void main(String[] args) {
		
		int[]lottos = {44, 1, 0, 0, 31, 25};
		int[]win_nums = {31, 10, 45, 1, 6, 19};
		
		int winNum =0;
		int loseNum =0;
		
		for(int i=0;i<lottos.length;i++) {
			int now = lottos[i];
			for(int j=0;j<win_nums.length;j++) {
				if(now==win_nums[j]) loseNum++;
			}
			if(now==0) winNum++;
		}
		
		winNum += loseNum;
		
		
		
		int []answer = new int[2];
		
		answer[0] = check(winNum);
		answer[1] = check(loseNum);
		
		
		for(int i : answer)System.out.println(i);
		
	}
	public static int check(int num) {
		
		if(num>=6) num=1;
		else if(num>=5) num=2;
		else if(num>=4) num=3;
		else if(num>=3) num=4;
		else if(num>=2) num=5;
		else num=6;
		
		
		return num;
		
	}

}
