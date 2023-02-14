package swea.d3;

import java.util.Scanner;

/* 5607. [Professional] 조합 */
public class Prob5607 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int R = sc.nextInt();
			
			int num1 = 1;
			int num2 = 1;
				
			for(int i=N; i>N-R; i--) {
				num1 *= i;
			}
				
			for(int i=R; i>=1; i--) {
				num2 *= i;
			}
			
			System.out.println("#"+tc+" "+num1/num2);

		}
		
		sc.close();
	}
}
