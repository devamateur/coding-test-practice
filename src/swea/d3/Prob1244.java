package swea.d3;

import java.util.Scanner;

/* 1244. [S/W 문제해결 응용] 2일차 - 최대 상금 */
public class Prob1244 {
	static int result;
	static char[] num;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			String N = sc.next();
			int change = sc.nextInt();
			
			num = N.toCharArray();

			result = 0;
			dfs(change, 0);
			
			System.out.println("#"+tc+" "+result);
		}
		
		sc.close();
	}
	static void dfs(int count, int index) {
		String numbers="";
		if(count == 0) {		// 종료 조건	
			for(int i=0; i<num.length; i++) {
				numbers += Character.toString(num[i]);
			}
			result = Math.max(result, Integer.parseInt(numbers));
			return;
		}
		
		if(count % 2 == 0) {		// 남은 교환 횟수가 짝수일 때
			for(int i=0; i<num.length; i++) {
				numbers += Character.toString(num[i]);
			}
			result = Math.max(result, Integer.parseInt(numbers));
		}
		
		char temp;
		
		for(int i=index; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] <= num[j] || count%2 == 1) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
					dfs(count-1, i);
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;	
				}
			}
		}	
	}
}
