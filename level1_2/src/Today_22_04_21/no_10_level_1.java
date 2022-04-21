package Today_22_04_21;

import java.util.Arrays;

public class no_10_level_1 {

	public static void main(String[] args) {
		
		int[]array = {1, 5, 2, 6, 3, 7, 4};
		int[][]commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[]answer = new int[commands.length];
			
		for(int i=0;i<commands.length;i++) {
			int[]temp = Arrays.copyOfRange(array, commands[i][0],commands[i][1]-1);
			int arr = commands[i][2];
			answer[i] = temp[arr];
		}
		
		for(int i : answer)System.out.println(i);
	}
}
