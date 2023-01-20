package swea.d3;

import java.util.Scanner;

/* 2806. N-Queen */
public class Prob2806 {
	static int[] cells;
	static int answer;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			cells = new int[N];		// 컬럼만 저장
			
			answer=0;
			dfs(0);
			
			System.out.println("#"+tc+" "+answer);
		}
		
		sc.close();
	}
	
	static void dfs(int count) {
		if(count == cells.length) {
			answer++;
			return;
		}
		
		for(int i=0; i<cells.length; i++) {
			cells[count] = i;
				
			// 퀸이 같은 행, 열, 대각선에 없다면 탐색
			if(bound(count))
				dfs(count+1);
		}
	}
	
	// 퀸의 attack 여부를 검사하는 메소드 bound
	static boolean bound(int count) {
		for(int i=0; i<count; i++) {
			if(cells[i] == cells[count])		// 같은 열에 있을 때
				return false;
			
			// 같은 대각선에 있을 때 -> 행의 차이의 절댓값 = 열의 차이의 절댓값
			if(Math.abs(count-i) == Math.abs(cells[count] - cells[i]))
				return false;
		}
		return true;
	}
}
