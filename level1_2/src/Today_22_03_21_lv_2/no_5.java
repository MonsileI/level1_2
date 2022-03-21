package Today_22_03_21_lv_2;

public class no_5 {
	
	public static void main(String[] args) {
		
		int w = 8;
		int h = 12;
		
		// 8 * 12 = 96인데, 16은 어디에서 나온 숫자일까?
		// 3 * 4 = 12 근데 6은 어떻게 된거지?
		System.out.println(w*h-(w+h)+(gcd(w,h)));
		
		//20 - 최대공약수
		
		
		//다시 한번 풀어보자
		
	}
	public static int gcd(int w,int h) {
		
		int max = Math.max(w, h);
		int min = Math.min(w, h);
		
		while(min>0) {
			int r = max%min;
			max = min;
			min = r;
		}
		
		return max;
		
	}

}
