package HaveToRepeat;

public class no_25 {

	public static void main(String[] args) {
		
		String [] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String [] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		int []result = new int[query.length];
		
		//언어,직무,주니어,소울푸드,점수
		
		String [] first = {"cpp", "java", "python"};
		String [] second = {"backend","frontend"};
		String [] third = {"junior","senior"};
		String [] fourth = {"chicken","pizza"};
		
		for(int i=0;i<query.length;i++) {
			
			String[]check = query[i].split("and");
			
			System.out.println(check[0]);
			System.out.println(check[1]);
			System.out.println(check[2]);
						
			for(int j=0;j<info.length;j++) {
				
			
				
			}
		
			
		}
		
		System.out.println(result[0]);
		
	}
}
