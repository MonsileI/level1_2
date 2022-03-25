package Today_22_03_25_repeat;

public class no_25 {

	public static void main(String[] args) {
		
		String [] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String [] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
	
		int [] answer = new int[query.length];
		
		for(int i=0;i<query.length;i++) {
			
			int count = 0;
			
			String [] check = query[i].split(" and ");
			String fir = check[0];
			String sec = check[1];
			String thi = check[2];
			
			String [] temp = check[3].split(" ");
			String four = temp[0];
			String score = temp[1];
			
			for(int j=0;j<info.length;j++) {
				
				String []check2 = info[j].split(" ");
				String fir2 = check2[0];
				String sec2 = check2[1];
				String thi2 = check2[2];
				String four2 = check2[3];
				String score2 = check2[4];
				
				if(fir.equals(fir2) || fir.equals("-")) 
					if(sec.equals(sec2) || sec.equals("-"))
						if(thi.equals(thi2) || thi.equals("-"))
							if(four.equals(four2) || four.equals("-")) {
								
								if(score.equals("-")) count++;
								else {
									int comp = Integer.parseInt(score);
									int comp2 = Integer.parseInt(score2);
									if(comp<=comp2) count++;								
								}
							}
			}	
			
			answer[i] = count;
			
		}
			
		for(int i : answer)System.out.println(i);
		
		
	}
}
