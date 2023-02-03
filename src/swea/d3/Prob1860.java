package swea.d3;

import java.util.Arrays;
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
			
			Arrays.sort(arrived);		// 도착시간 순으로 정렬
			
			String result="";
			
			for(int i=1; i<=N; i++) {
				int sub = arrived[i-1]/M*K-i;
				
				if(sub < 0) {
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
