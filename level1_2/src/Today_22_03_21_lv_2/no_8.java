package Today_22_03_21_lv_2;

public class no_8 {
	
	static int answer = 0;
	public static void main(String[] args) {
		
		int[]numbers = {1,1,1,1,1};
		int target = 3;
		dfs(numbers,target,0,0);
		
		System.out.println(answer);
	}
	
	public static void dfs(int[]numbers,int target,int depth, int sum) {
		
		if(numbers.length==depth) {
			if(target==sum) answer++;
		}else {
			
			dfs(numbers,target,depth+1,sum-numbers[depth]);
			dfs(numbers,target,depth+1,sum+numbers[depth]);
			
		}
		
		
	}

}
