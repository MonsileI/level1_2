package Today_22_04_07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class kakao4 {
	
	static char[][]map;
	static int answer = 0;
	
	public static void main(String[] args) {
 
		
		int m = 4;
		int n = 5;
		
		String [] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		
		map = new char[m][n];
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length();j++) {
				map[i][j] = board[i].charAt(j);
			}
		}
		
		while(updateBlocks(m,n));
		
		System.out.println(answer);
		
	}
	
	public static boolean updateBlocks(int m,int n) {
		boolean[][] c = new boolean[m][n];
		int cnt = 0;
		
		for(int i=0;i<m-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(map[i][j]=='0') continue;
				if(check(i,j)==true) {
					c[i][j] = true;
					c[i][j+1] = true;
					c[i+1][j] = true;
					c[i+1][j+1] = true;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			List<Character> temp = new ArrayList<Character>();
			for(int j= m-1;j>=0;j--) {
				if(c[j][i] == true) {
					cnt++;
					continue;
				}
				temp.add(map[j][i]);
			}
			
			for(int j=m-1, k=0; j>=0; j--,k++) {
				if(k < temp.size()) map[j][i] = temp.get(k);
				else map[j][i] = '0';
			}
			
		}
		answer += cnt;
		return cnt > 0 ? true : false;
		
		
	}
	public static boolean check(int i, int j) {
		char std = map[i][j];
		
		if(map[i+1][j+1]==std&&map[i+1][j]==std&&map[i][j+1]==std) return true;
		
		return false;
	}
	
}