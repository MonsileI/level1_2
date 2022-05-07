package Today_22_05_06;
import java.util.*;

public class tetet {
	
	public static void main(String[] args) {
		
		int N  = 1235353;
		long start = System.currentTimeMillis();
		solution(N);
		long end = System.currentTimeMillis();
		
		System.out.println((end - start)/1000+"초 첫번째");
		
		solution2(N);
		long start2 = System.currentTimeMillis();
		long end2 = System.currentTimeMillis();
		

		System.out.println((end2 - start2)/1000 +"초 두번째");
	}

	public static void solution(int N) {
		
		int answer=0;
		String s = String.valueOf(N);
		String[] list = s.split("");
		for(String t : list) {
			answer+=Integer.parseInt(t);
		}
		System.out.println(answer);
	}
	
	public static void solution2(int N) {
		int answer = 0;
        while(true){
            answer+=N%10;
            if(N<10)
                break;

            N/=10;
        }
        
        System.out.println(answer);
	}
}
