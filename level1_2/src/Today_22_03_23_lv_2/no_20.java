package Today_22_03_23_lv_2;

import java.util.HashSet;

public class no_20 {

	public static HashSet<Integer> set = new HashSet<>();
	
	public static void main(String[] args) {
		
		String numbers = "1231";
		
		
		boolean [] isVisited = new boolean[numbers.length()];
		
		dfs(isVisited,"",numbers);
		
		int answer = set.size();
		
		System.out.println(answer);
		
		System.out.println(set);
		
	}
	
	public static void dfs(boolean [] isVisited,String now,String numbers) {
		
		if(!(now.equals(""))) {
			
			int temp = Integer.parseInt(now);
			boolean check = true;
			
			if(temp %2 !=0 && temp != 1) {
				for(int i=3;i<=Math.sqrt(temp); i += 2) {
					if(temp%i==0) {
						check = false;
						break;
					}
				}
				
			}else check = false;
			
			if(temp == 2) check = true;
			
			if(check) {
				set.add(temp);
			}
			
			
		}
		
		for(int i=0;i<numbers.length();i++) {
			
			if(!isVisited[i]) {
				isVisited[i] = true;
				String yes = now + numbers.charAt(i);
				dfs(isVisited,yes,numbers);
				isVisited[i] = false;
			}
			
		}
		
		
	}
}
