package swea.d3;

import java.util.Scanner;

/* 1244. [S/W 문제해결 응용] 2일차 - 최대 상금 */
public class Prob1244 {
	static int result;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			String N = sc.next();
			int change = sc.nextInt();
			
			char[] num = N.toCharArray();

			result = 0;
			dfs(change, num);
			
			System.out.println("#"+tc+" "+result);
		}
		
		sc.close();
	}
	static void dfs(int count, char[] num) {
		if(count == 0) {
			String numbers="";
			for(int i=0; i<num.length; i++) {
				numbers += num[i];
			}
			result = Math.max(result, Integer.parseInt(numbers));
			return;
		}
		
		char temp;
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] <= num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
					dfs(count-1, num);
				}
			}
		}	
	}
}
