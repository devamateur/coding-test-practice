package swea.d3;

import java.util.Scanner;

/* 2806. N-Queen */
public class Prob2806 {
	static boolean[][] board;
	static int answer;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			board = new boolean[N][N];		// NxN 보드
			
			answer=0;
			dfs(N, 0, 0);
			
			System.out.println("#"+tc+" "+answer);
		}
		
		sc.close();
	}
	
	static void dfs(int N, int row, int col) {
		if(N == 0) {
			answer++;
			return;
		}
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j] = true;
				
				// 퀸이 같은 행, 열, 대각선에 있는지 검사
				if(i != row && j != col && Math.abs(i-j) != Math.abs(row-col))
					dfs(N-1, i, j);
				
			}
		}
	}
}
