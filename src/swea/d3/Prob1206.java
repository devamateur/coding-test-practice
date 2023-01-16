package swea.d3;

import java.util.Scanner;

/* 1206. [S/W 문제해결 기본] 1일차 - View */
public class Prob1206 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int[] heights;
		for(int tc=1; tc<=10; tc++) {
			int N = sc.nextInt();		// 건물의 개수
			heights = new int[N];
			
			for(int i=0; i<N; i++) {
				heights[i] = sc.nextInt();
			}
						
			int result = 0;
			for(int i=2; i<=N-2; i++) {

				for(int k=1; k<=heights[i]; k++) {
					if(heights[i-2] < k && heights[i-1] < k
							&& heights[i+1] < k && heights[i+2] < k) {
						result++;
					}

				}

			}
			System.out.println("#"+tc+" "+result);
		}
		sc.close();
	}
}
