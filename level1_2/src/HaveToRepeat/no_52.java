package HaveToRepeat;

import java.util.Arrays;
import java.util.Comparator;

public class no_52 {
	
	public static void main(String[] args) {
		
		//기본 시간 당 기본 요금이 빠지고 그다음에 단위 시간 곱하기 단위 요금
					//시간  //시간요금   //단위  //단위요금
		int[]fees = {180, 5000,     10, 600};
		String [] records = {"05:34 5961 IN", 
							"06:00 0000 IN", 
							"06:34 0000 OUT", 
							"07:59 5961 OUT", 
							"07:59 0148 IN", 
							"18:59 0000 IN", 
							"19:09 0148 OUT", 
							"22:59 5961 IN", 
							"23:00 5961 OUT"};
		
		Arrays.sort(records, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.substring(6,10).compareTo(o2.substring(6,10));
			}
		});
		
		for(int i=0;i<records.length;i++) {
			
			
			
			
		}
		
	}

}
