package Today_22_03_20;

import java.util.ArrayList;
import java.util.Arrays;

public class no_11 {

	public static void main(String[] args) {
		
		String [] participant = {"leo", "kiki", "eden"};
		String [] completion = {"eden","kiki"};
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		
		for(int i =0 ;i<completion.length;i++) {
			
			if(!(participant[i].equals(completion[i]))) {
				answer = participant[i];
				break;
			}
			
			
		}
		if(answer.equals("")) answer=participant[participant.length-1];
		
		System.out.println(answer);
		
	}
}
