package Today_22_03_24_lv_2;

public class no_41 {

	public static void main(String[] args) {
		
		int n = 5000;
		
		//K칸 점프 혹은 현재까지 온 거리 x2
		//순간이동을 하면 건전지 사용량 줄지 않음
		//K칸을 점프하면 K만큼의 건전지 사용량이 듬
		//ex 5면 한칸 점프 후 순간이동,순간이동,한칸점프 하면 도착!(총 2개 건전지)
		
		//홀수 짝수를 다르게 해야할듯?
		
		//무조건 한칸 점프
		
		//반까지만 점프
		
		//n부터 시작
		int answer =0;
		while(n!=0) {
			if(n%2==0) n /= 2;
			else {
				n--;
				answer++;
			}
		}
		System.out.println(answer);
	}
}
