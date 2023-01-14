package swea.d2;

import java.util.Scanner;

/* 1954. 달팽이 숫자 */
public class Prob1954 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			
			int[][] snail = new int[N][N];
			
			int number=1;
			int step=N-1;
			int row = 0, col = 0;
			
			snail[0][0] = 1;
			
			while(true) {
				if(number == N*N)	break;
				if(number==1) {
					for (int i = 0; i < step; i++)
						snail[row][++col] = ++number;
				} 
				for (int i = 0; i < step; i++)
					snail[++row][col] = ++number;
				for (int i = 0; i < step; i++)
					snail[row][--col] = ++number;
				step--;
				for (int i = 0; i < step; i++)
					snail[--row][col] = ++number;
				for (int i = 0; i < step; i++)
					snail[row][++col] = ++number;
				step--;
			}

			System.out.println("#"+tc);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(snail[i][j]+" ");
				}System.out.println();
			}
		}
		
		sc.close();
	}
}
