package Today_22_03_23_lv_2;

public class test {

	public static int answer = 0;
	public static void main(String[] args) {
		
		String[][]places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
	
		int [] answer= new int[places.length];
		
		for(int i=0;i<places.length;i++) {
			
			String [] map = places[i];
			boolean flag = false;
			
			for(int j=0;j<map.length;j++) {
				
				for(int k=0;k<map[j].length();k++) {
					
					if(map[j].charAt(k)=='P') {
						if(!check(map,j,k)) {
							flag = false;
							break;
						}
					}
					
				}
				
				if(!flag) {
					answer[i] = 0;
					break;
				}
				
				
			}
			if(flag) answer[i] = 1;
			
		}
		
		for(int i : answer) System.out.println(i);
		
	}
	public static boolean check(String[] map,int j,int k) {
		
		
		//상하좌우
		int[] di = {0,0,-1,1};
		int[] dj = {-1,1,0,0};
		
		for(int i=0;i<4;i++) {
			int ni = j + di[i];
			int nj = k + dj[i];
			if(ni<0||nj<0||5<=ni||5<=nj) continue;
			if(map[ni].charAt(nj)=='P') return false;
			
		}
		
		//맨헤튼
		int[] di2 = {0,0,-2,2};
		int[] dj2 = {-2,2,0,0};
		
		for(int i=0;i<4;i++) {
			int ni = j + di2[i];
			int nj = k + dj2[i];
			if(ni<0||nj<0||5<=ni||5<=nj) continue;
			if(map[ni].charAt(nj)=='P') {
				if(map[(ni+i)/2].charAt((nj+j))/2 != 'X') return false;
			}
		}
		//대각선

		int[] di3 = {1,1,-1,-1};
		int[] dj3 = {1,-1,1,-1};
		
		for(int i=0;i<4;i++) {
			int ni = j + di[i];
			int nj = k + dj[i];
			if(ni<0||nj<0||5<=ni||5<=nj) continue;
			if(map[ni].charAt(nj)=='P') {
				if(!(map[i].charAt(nj)=='X'&&map[ni].charAt(j)=='X')) return false;
			}
		
		}
		
		return true;
		
	}
}
