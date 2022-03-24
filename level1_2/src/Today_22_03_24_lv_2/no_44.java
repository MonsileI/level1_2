package Today_22_03_24_lv_2;

public class no_44 {
	
	public static void main(String[] args) {
		
		//시간을 분형태로 바꿔서 돌려야 함 (1분씩이니까)
		//A#은 소문자나 다른 표시로 바꿔준다(replace 활용)
		
		String answer = "(None)";
		
		String m = "ABCDEFG";
		int max = 0;
		String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		
		m = m.replaceAll("A#", "a");
		m = m.replaceAll("B#", "b");
		m = m.replaceAll("C#", "c");
		m = m.replaceAll("D#", "d");
		m = m.replaceAll("E#", "e");
		m = m.replaceAll("F#", "f");
		m = m.replaceAll("G#", "g");
		
		
		for(int i=0;i<musicinfos.length;i++) {
			
			String [] check = musicinfos[i].split(",");
			
			String[]begin = check[0].split(":");
			String[]end = check[1].split(":");
			String title = check[2];
			String melody = check[3];
			
			melody = melody.replaceAll("A#", "a");
			melody = melody.replaceAll("B#", "b");
			melody = melody.replaceAll("C#", "c");
			melody = melody.replaceAll("D#", "d");
			melody = melody.replaceAll("E#", "e");
			melody = melody.replaceAll("F#", "f");
			melody = melody.replaceAll("G#", "g");
			
		int hour = Integer.parseInt(end[0]) - Integer.parseInt(begin[0]);
		int minute = Integer.parseInt(end[1]) - Integer.parseInt(begin[1]) + (hour * 60);
		
		String temp = "";
		
		for(int j=0;j<minute;j++) {
			temp += melody.charAt(j % melody.length());
		}
		
		if(temp.contains(m)) {
			if(max < temp.length()) {
				max = temp.length();
				answer = title;
			}
		}
			
			
			
			
		}
	
		System.out.println(answer);
	}

}
