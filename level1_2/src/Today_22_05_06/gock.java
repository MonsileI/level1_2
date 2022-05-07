package Today_22_05_06;

public class gock {
	
	public static void main(String[] args) {
		
		String m = "CC#BCC#BCC#BCC#B";
		String [] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		String answer = "(None)";
		
		String sharp[] = {"C#","D#","E#","F#","G#","A#","B#"};
		String change[] = {"c","d","e","f","g","a","b"};
	
		
		
		for(int i=0;i<sharp.length;i++) m = m.replaceAll(sharp[i], change[i]);
		
		System.out.println(m);
		
		for(String str : musicinfos) {
			
			String [] temp = str.split(",");
			int time = timeChange(temp[0],temp[1]);
			String title = temp[2];
			String mel = temp[3];
			
			
			for(int i=0;i<sharp.length;i++) mel = mel.replaceAll(sharp[i], change[i]);
		
			String myMelody = "";
			
			for(int i=0;i<time;i++) myMelody += mel.charAt(i%mel.length());
			
			
			if(myMelody.contains(m)) answer = title;
			
			System.out.println(myMelody);
			
		
		}
		
		
		
		System.out.println(answer);
		
	}
	
	
	
	static int timeChange(String start,String end) {
		
		String []startTemp = start.split(":");
		String []endTemp = end.split(":");
		
		int hour = Integer.parseInt(endTemp[0]) - Integer.parseInt(startTemp[0]);
		int min = Integer.parseInt(endTemp[1]) - Integer.parseInt(startTemp[1]) + hour*60;
		return min;
	}

}
