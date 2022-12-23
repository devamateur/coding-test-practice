package swea.d2;

import java.util.Scanner;

/* 2001. 파리 퇴치 */
// NxN 배열 안에 있는 파리를 MxM크기의 파리채로 잡을 때, 파리를 가장 많이 잡는 경우의 파리 수 출력
public class Prob2001 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int[][] fly;
		int[][] swatter;	
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			fly = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					fly[i][j] = sc.nextInt();
				}
			}
			
			swatter = new int[M][M];
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<M; j++) {
					swatter[i][j] = 0;
				}
			}
			
			int max = fly[0][0] + fly[0][1] + fly[1][0] + fly[1][1];
			for(int i=0; i<N-M+1; i++) {
				for(int j=0; j<N-M+1; j++) {
					int sum=0;

					for(int k=i; k<i+M; k++) {
						for(int l=j; l<j+M; l++) {
							sum += fly[k][l];
							//System.out.print(fly[k][l]+" ");
						}

					}
					if(max < sum)
						max = sum;
				}

			}
			System.out.println("#"+test_case+" "+max);

		}
		
		sc.close();
	}
}
