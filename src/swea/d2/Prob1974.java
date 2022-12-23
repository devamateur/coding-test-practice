package swea.d2;

import java.util.Scanner;

/* 1974. 스도쿠 검증 */
public class Prob1974 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int[][] sudoku = new int[9][9];
		boolean[] rows = new boolean[10];		// 행에서 각 값의 중복 여부 저장
		boolean[] cols = new boolean[10];		// 행에서 각 값의 중복 여부 저장
		int result = 1;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sudoku[i][j] = sc.nextInt();
				}
			}
			
			
			for(int i=0; i<9; i++) {
				int row, col;
				for(int j=0; j<9; j++) {
					row = sudoku[i][j];
					col = sudoku[j][i];
					
					// 행, 열, 3x3 사각형 내 중복 판단...

				}
			}
			
			System.out.println("#"+test_case+" "+result);
		}
		
		sc.close();
	}
}
