package Today_22_03_31_Hash;

import java.util.Arrays;

public class no_1 {
	
	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[]completion = {"stanko", "ana", "mislav"};
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		
		String answer = "";
		
		for(int i=0;i< completion.length;i++) {
			if(!(completion[i].equals(participant[i]))) {
				answer = participant[i];
				break;
			}
		}
		
		
		if(answer.equals("")) answer=participant[participant.length-1];
		
		System.out.println(answer);
	}

}
