package Today_22_03_23_lv_2;

import java.util.Arrays;

public class no_38 {

	public static void main(String[] args) {
		
		int[]people= {70,50,80,50};
		int limit = 100;
		int answer = 0;
		Arrays.sort(people);
		int i = 0;
		for(int j=people.length-1;j>=i;j--) {
			
			if(people[j]+people[i]>limit) {
				answer++;
			}else {
				answer++;
				i++;
			}
			
		}
		
		System.out.println(answer);
		
	}
}
