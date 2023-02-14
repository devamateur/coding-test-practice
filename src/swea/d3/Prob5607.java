package swea.d3;

import java.util.Scanner;

/* 5607. [Professional] 조합 */
public class Prob5607 {
	final static int MOD = 1234567891;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		long[] factorial = new long[1000001];		// 팩토리얼
		factorial[0] = 1;
		
		for(int i=1; i<1000001; i++) {
			factorial[i] = (factorial[i-1]*i)%MOD;
		}
		
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int R = sc.nextInt();
			
			// 페르마의 소정리 이용

		}
		
		sc.close();
	}
}
