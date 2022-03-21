package Today_22_03_21;

import java.util.Arrays;
import java.util.Collections;

public class no_32 {

	public static void main(String[] args) {
		
		String s ="Zbcdefg";
		String answer = "";
		String[]list = s.split("");
		Arrays.sort(list, Collections.reverseOrder());
		for(String check : list) answer += check;
		
		System.out.println(answer);
	}
}
