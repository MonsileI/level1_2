package Today_22_03_22_lv_2;

public class no_14 {
	
	public static void main(String[] args) {
		
		String[][]places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
							{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
							{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
							{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
							{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		
		
		int[]answer = new int[places.length];
	
		for(int t = 0 ;t < places.length;t++) {
			
			boolean flag = false;
			String[]map = places[t];
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(map[i].charAt(j)=='P') {
						if(check(i,j,map)) {
							flag = true;
							break;
						}
					}
				}
				if(flag) {
					answer[t] = 0;
				}
				
			}
			
			if(!flag) {
				answer[t] = 1;
			}
			
		}
		
		for(int i : answer)System.out.println(i);
		
		
	}
	public static boolean check(int i, int j,String[]map) {
		
		//상하좌우
		int []id = {1,-1,0,0};
		int []jd = {0,0,1,-1};
		for(int d=0;d<4;d++) {
			int ni = i + id[d];
			int nj = j + jd[d];
			if(ni<0|| nj<0|| ni>=5|| nj>=5) continue;
			if(map[ni].charAt(nj)=='P') return true;
		}
		//맨하튼
		//상하좌우
		int []id2 = {2,-2,0,0};
		int []jd2 = {0,0,2,-2};
		for(int d=0;d<4;d++) {
			int ni = i + id2[d];
			int nj = j + jd2[d];
			if(ni<0|| nj<0|| ni>=5|| nj>=5) continue;
			if(map[ni].charAt(nj)=='P') {
				if(map[(ni+i)/2].charAt((nj+j)/2)!='X') return true;
			}
			
		}
		//대각선
		int []id3 = {1,1,-1,-1};
		int []jd3 = {1,-1,1,-1};
		for(int d=0;d<4;d++) {
			int ni = i + id3[d];
			int nj = j + jd3[d];
			if(ni<0|| nj<0|| ni>=5|| nj>=5) continue;
			if(map[ni].charAt(nj)=='P') {
				if(!(map[i].charAt(nj)=='X'&& map[ni].charAt(j)=='X')) {
					return true;
				}
			}
		
		}
		return false;
	}
	

}