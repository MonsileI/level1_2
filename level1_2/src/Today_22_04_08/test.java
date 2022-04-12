package Today_22_04_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class test {
	
	static TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
	static HashMap<String, Integer> map = new HashMap<>();
	static ArrayList<String> answerList = new ArrayList<String>();
	
	public static void main(String[] args) {
	
		int [] fees = {180, 5000, 10, 600};
		String [] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
	
		
		for(int i=0;i<records.length;i++) {
			char[] temp = records[i].toCharArray();
			Arrays.sort(temp);
			
		}
		
	}
	
}