package swea.d2;

import java.util.Scanner;

/* 1974. 스도쿠 검증 */
public class Prob1974 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int[][] sudoku = new int[10][10];
		int[] rows = new int[10];		// 행에서 각 값의 중복 여부 저장(0/1)
		int[] cols = new int[10];		// 행에서 각 값의 중복 여부 저장(0/1)
		int result = 1;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sudoku[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<9; i++) {
				int row = 0, col = 0;
				for(int j=0; j<9; j++) {
					row = sudoku[i][j];
					col = sudoku[j][i];
					// 행
					if(rows[row] == 1)
						result = 0;
					// 열
					if(cols[col] == 1)
						result = 0;
					
					rows[row] = 1;
					cols[col] = 1;
					
					// 3x3
					if(i%3==0 && j%3==0) {
						int[] squares = new int[10];
						for(int k=i; k<i+3; k++) {
							for(int l=j; l<j+3; l++) {
								int square = sudoku[k][l];
								
								if(squares[square] == 1)
									result=0;
								
								squares[square] = 1;
							}
						}
					}
				}			

			}
			
			System.out.println("#"+test_case+" "+result);
		}
		
		sc.close();
	}
}
