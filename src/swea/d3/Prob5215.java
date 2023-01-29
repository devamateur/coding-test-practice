package swea.d3;

import java.util.Scanner;

/* 5215. 햄버거 다이어트 */
public class Prob5215 {
	static int N, L;
	static int[][] diet;
	static int maxScore;
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();		// 재료의 수
			L = sc.nextInt();		// 제한 칼로리
			
			diet = new int[N][2];
			
			for(int i=0; i<N; i++) {
				diet[i][0] = sc.nextInt();		// 맛 점수
				diet[i][1] = sc.nextInt();		// 칼로리
			}
			
			maxScore = 0;
			search(0, 0, 0);
			System.out.println("#"+tc+" "+maxScore);
		}
		
		sc.close();
	}
	
	static void search(int i, int score, int cal) {
		if(cal > L) {		// 칼로리를 넘을 경우
			return;
		}
		else {
			maxScore = Math.max(maxScore, score);
		}
		if(i == N) {
			return;
		}
		
		search(i+1, score+diet[i][0], cal+diet[i][1]);		// 재료를 선택할 경우
		search(i+1, score, cal);							// 선택하지 않을 경우
	}
}