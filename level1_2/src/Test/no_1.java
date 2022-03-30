package Test;

public class no_1 {
	
	public static void main(String[] args) {
		
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int []win_nums = {31, 10, 45, 1, 6, 19};
		int [] answer = new int[2];
		int temp = 0;
		int winNum=0;
		int loseNum=0;
		
		for(int i=0;i<lottos.length;i++) {
			temp = lottos[i];
			for(int j=0;j<win_nums.length;j++) {
				if(temp==win_nums[j]) {
					loseNum++;
					break;
				}
				if(temp==0) {
					winNum++;
					break;
				}
			}
		}
		
		
		winNum += loseNum;
		
		answer[0] = check(winNum);
		answer[1] = check(loseNum);
		
		for(int i : answer)System.out.println(i);
		
	}
	
	public static int check(int n) {
		
		if(n>=6) n=1;
		else if(n>=5) n=2;
		else if(n>=4) n=3;
		else if(n>=3) n=4;
		else if(n>=2) n=5;
		else n=6;
		
		return n;
		
	}

}
