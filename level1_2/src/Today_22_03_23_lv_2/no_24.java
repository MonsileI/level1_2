package Today_22_03_23_lv_2;

public class no_24 {
	
	public static void main(String[] args) {
		
		int N = 8;
		int A = 4;
		int B = 8;
		
		int answer = 0;
		
		//12 34  56 78
		//1   2  3  4
		//  1     2
		
		//5->3 /2 + 1
		//6->3 /2 홀수면 나누기2플러스 1
		
		while(A!=B) {
			
			if(A%2==0) A /= 2;
			else A = A/2+1;

			if(B%2==0) B /= 2;
			else B = B/2+1;
			
			answer++;
			
			
			
		}
			System.out.println(answer);
		
	}

}
