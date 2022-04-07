package Today_22_04_07;

import java.util.ArrayList;


public class melody {

	public static void main(String[] args) {

		String m = "CC#BCC#BCC#BCC#B";
		String [] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		String answer = "(None)";
		int maxTime = 0;
		
		String[]sharp = {"C#","D#","E#","F#","G#","A#","B#"};
		String[]change = {"c","d","e","f","g","a","b"};
		
		for(int i=0;i<sharp.length;i++) {
			m = m.replaceAll(sharp[i], change[i]);	
			for(int j=0;j<musicinfos.length;j++) {
				musicinfos[j] = musicinfos[j].replaceAll(sharp[i], change[i]);
			}
			
		}
		
		
		for(int i=0;i<musicinfos.length;i++) {
			
			
			
			String[]check = musicinfos[i].split(",");
			
			String []end = check[0].split(":");
			String []start = check[1].split(":");
			String title = check[2];
			String melody = check[3];
			
			int hour = Integer.parseInt(end[0]) - Integer.parseInt(start[0]);
			int minute = Integer.parseInt(end[1]) - Integer.parseInt(start[1]) + hour*60;
			
			String melTemp ="";
			
			for(int j=0;j<minute;j++) {
				melTemp += melody.charAt(j%minute);
			}
			
			if(melTemp.contains(m)) {
				if(maxTime<melTemp.length()) {
					maxTime = melTemp.length();
					answer = title;
				}
			}
			
			
		}
		
		
		System.out.println(answer);
		
	}
}
