package Today_22_03_21_lv_2;

public class no_5 {
	
	public static void main(String[] args) {
		
		int w = 8;
		int h = 12;
		
	
		//8이랑 12면, 16이라는 숫자 20 - 4
		//6이랑 4였으면, 8이라는 숫자 10 - 2
		//최대공약수
		int answer = (w*h) - ((w+h)-gcd(w,h));
	
		System.out.println(answer);
		
	}
	
	public static int gcd(int x, int y) {
		
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		
		while(min>0) {
			int r = max%min;
			max = min;
			min = r;
		}
		
		return max;
	}

}
