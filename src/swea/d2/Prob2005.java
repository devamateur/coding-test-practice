package swea.d2;

import java.util.Scanner;

/* 2005. 파스칼의 삼각형 */
public class Prob2005 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int[][] pascal = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<i+1; j++) {
					if(j==0 || i==j)		// 삼각형의 왼쪽과 오른쪽은 모두 1
						pascal[i][j] = 1;
					else {
						pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
					}
				}
			}
			
			System.out.println("#"+tc);
			for(int i=0; i<N; i++) {
				for(int j=0; j<i+1; j++) {
					System.out.print(pascal[i][j]+" ");
				}System.out.println();
			}
		}
		
		sc.close();
	}
}
