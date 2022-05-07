package Today_22_05_04;

import java.util.ArrayList;
import java.util.Collections;

public class Yanggoong {

	
	  static ArrayList<int[]> answer = new ArrayList<>();
	  static int[] ryan;
	  static int[] apeach;
	  static int N;
	  static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		int n = 5;
		int [] info = {2,1,1,1,0,0,0,0,0,0,0};
		N = n;
		apeach = info.clone();
		ryan = new int[info.length];
		dfs(0,0);
		
		
			
			Collections.sort(answer,(o1,o2)-> {
				for(int i=10;i>=0;i--) {
					if(o1[i] != o2[i]) return o2[i]-o1[i];
				}
				return 0;
			});
			
			for(int i : answer.get(0))System.out.print(i+",");
		
		
	}
	private static void dfs(int count, int s) {
		
		if(count==N) {
			int r = 0;
			int a = 0;
			for(int i=0;i<=10;i++) {
				if(ryan[i]==0 && apeach[i]==0)continue;
				if(ryan[i]>apeach[i]) r += 10-i;
				else a += 10 - i;
			}
			
			if(r>a) {
				int diff = r - a;
				if(diff>max) {
					max = diff;
					answer.clear();
					answer.add(ryan.clone());
				}else if(diff==max) {
					answer.add(ryan.clone());
				}
			}
			
			
			return;
		}
		
		for(int i=s;i<=10;i++) {
			ryan[i]++;
			dfs(count+1,i);
			ryan[i]--;
		}
		
	}
}
