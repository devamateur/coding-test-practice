package swea.d3;

import java.util.Scanner;

public class Prob2805 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		String[][] farm;
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			
			farm = new String[N][N];
			for(int i=0; i<N; i++) {
				String str = sc.next();
				farm[i] = str.split("");
			}
			
			int result=0;
			
			int start = N/2, end = N/2;
			for(int i=0; i<N; i++) {
				for(int j=start; j<=end; j++) {
					result += Integer.parseInt(farm[i][j]);
				}
				if(i < N/2) {
					start--;
					end++;
				}
				else {
					start++;
					end--;
				}
			}
			System.out.println("#"+tc+" "+result);
		}
		
		sc.close();
	}
}
