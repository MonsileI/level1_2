package Today_22_04_08;

public class dpFibonacci {
	
	public static void main(String[] args) {
		
		
		int n = 300000;
		long begin = System.currentTimeMillis();
		System.out.println(fibonacciR(n));
		long end = System.currentTimeMillis();
		
		System.out.println("실행 시간 : " + (end - begin) / 1000.0);
		
	}
	
	public static int fibonacci(int n) {
		
		if(n==0) return 0;
		else if(n==1) return 1;
		else {
			int[]arr = new int[n];
			arr[0] = 0;
			arr[1] = 1;
			for(int i=2; i<n;i++) {
				arr[i] = arr[i-1] + arr[i-2];
			}
			
			return arr[n-1];
		}
	}
	public static int fibonacciR(int n) {
		
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=2;i<n;i++) {
			
			c = a+b;
			a = b;
			b = c;
			
			
		}
		
		
		return c;
		
		
	}
}
