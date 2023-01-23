package swea.d3;

import java.util.Scanner;

/* 2817. 부분 수열의 합 */
public class Prob2817 {
	static int[] numbers;
	static int result;
	static int N, K;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			
			numbers = new int[N];
			
			for(int i=0; i<N; i++) {
				numbers[i] = sc.nextInt();
			}
			
			int sum=0;
			
			result=0;
			
			dfs(0, 0);
			
			System.out.println("#"+tc+" "+result);
		}
		
		sc.close();
	}
	
	static void dfs(int index, int sum) {
		if(sum == K) {
			result++;
			return;
		}
		
		if(index == N) {
			return;
		}
		dfs(index+1, sum);
		dfs(index+1, sum+numbers[index]);
	}
}
