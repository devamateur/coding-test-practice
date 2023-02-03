package swea.d3;

import java.util.Scanner;

/* 1860. 진기의 최고급 붕어빵 */
public class Prob1860 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();		// 손님수
			int M = sc.nextInt();		// M초
			int K = sc.nextInt();		// K개 붕어빵
			
			int[] arrived = new int[N];
			for(int i=0; i<N; i++) {
				arrived[i] = sc.nextInt();		// 손님의 도착 시간(초)
			}
			
			String result="";
			int sub=K;
			for(int i=0; i<N; i++) {
				sub -= 1;
				if(arrived[i] < M) {
					result = "Impossible";
					break;
				}
				else if(i != 0 && Math.abs(arrived[i]-arrived[i-1]) < M && sub<=0) {
					result = "Impossible";
					break;
				}
				else{
					result = "Possible";
				}
			}
			System.out.println("#"+tc+" "+result);
		}
		
		sc.close();
	}
}
