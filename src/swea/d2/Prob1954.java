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
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i==0 && j != N-1) {
						snail[i][j] = number++;
					}
				}
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(j==N-1) {
						snail[i][j] = number++;
					}
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=N-1; j>=0; j--) {
					if(i==N-1 && j != N-1) {
						snail[i][j] = number++;
					}
				}
			}

			
			for(int i=N-1; i>=0; i--) {
				for(int j=N-1; j>=0; j--) {
					if(i != 0 && i != N-1 && j==0) {
						snail[i][j] = number++;
					}
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i != 0 && i != N-1 && j != 0 && j != N-1) {
						snail[i][j] = number++;
					}
				}
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
