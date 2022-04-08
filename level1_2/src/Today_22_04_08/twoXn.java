package Today_22_04_08;

public class twoXn {

	public static void main(String[] args) {
		
		int n = 5;
		int answer = 0;
		
		
		//가로가 2 세로가 1
		//세로가 2인 바닥을 가득 채우는 방법
		
		//1 = 1
		//2 = 2
		//3 = 3
		//4 = 5
		//5 = 8
		
		System.out.println(check(n));
		
	}
	
	public static int check(int n) {
		
		if(n==1)return 1;
		else if(n==0) return 0;
		else {
			int[]arr = new int[n];
			arr[0] = 1;
			arr[1] = 2;
			for(int i=2;i<n;i++) {
				arr[i] = arr[i-1] + arr[i-2];
				arr[i] = arr[i]%1000000007;
			}
			return arr[n-1];
		}
		
	}
	
}
