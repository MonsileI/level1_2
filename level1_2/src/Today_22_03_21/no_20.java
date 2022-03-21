package Today_22_03_21;

public class no_20 {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 24;
		String answer = cal(a,b);
		System.out.println(answer);
	}

	public static String cal(int a, int b) {
		
		
		int []month = {31,29,31,30,31,30,31,31,30,31,30,31};
		String [] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		
		int day = 0;
		for(int i=0;i<a-1;i++) {
			
			day += month[i];
			
		}
		
		day += b;
		day--;
		
		return week[day%7];
		
		
		
	}
}
