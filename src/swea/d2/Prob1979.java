package swea.d2;

import java.util.Scanner;


/* 1979. 어디에 단어가 들어갈 수 있을까 */
public class Prob1979 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int[][] puzzle;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();		// 단어의 길이
			
			puzzle = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					puzzle[i][j] = sc.nextInt();
				}
			}
			int count=0;
			for(int i=0; i<N; i++) {
				int sum=0;

				// 행에 대해
				for(int j=0; j<N; j++) {

					if(puzzle[i][j] == 1) {
						sum++;
					}
					else {
						if(sum == K) {
							count++;
						}
						sum=0;		// sum을 0으로 초기화! -> 퍼즐의 자리를 중복으로 세는 것 방지
					}					
				}
				if(sum == K)
					count++;
			}
			for(int i=0; i<N; i++) {
				int sum=0;

				// 열에 대해
				for(int j=0; j<N; j++) {

					if(puzzle[j][i] == 1) {
						sum++;
					}
					else {
						if(sum == K) {
							count++;
						}
						sum=0;
					}					
				}
				if(sum == K)
					count++;
			}

			System.out.println("#"+test_case+" "+count);

		}
		sc.close();
	}
}
