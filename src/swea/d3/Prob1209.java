package swea.d3;

import java.util.Scanner;

public class Prob1209 {
	final static int size = 100;
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		


		for(int tc = 1; tc <= 10; tc++)
		{
			int N=sc.nextInt();		// 테스트 케이스 번호

			int[][] numbers = new int[size][size];
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					numbers[i][j] = sc.nextInt();
				}
			}
			
			int sum=0;
			int result=0;
			
			// 가로
			for(int i=0; i<size; i++) {
				sum = 0;
				for(int j=0; j<size; j++) {
					sum += numbers[i][j];
				}
				result = Math.max(result, sum);
			}
			
			// 세로
			for(int i=0; i<size; i++) {
				sum = 0;
				for(int j=0; j<size; j++) {
					sum += numbers[j][i];
				}
				result = Math.max(result, sum);
			}
			
			// 대각선1
			for(int i=0; i<size; i++) {
				sum = 0;
				for(int j=0; j<size; j++) {
					if(i == j)
						sum += numbers[i][j];
				}
				result = Math.max(result, sum);
			}
			
			// 대각선2
			for(int i=0; i<size; i++) {
				sum = 0;
				for(int j=size-1; j>=0; j--) {
					if(i+j == size-1)
						sum += numbers[i][j];
				}
				result = Math.max(result, sum);
			}
			
			System.out.println("#"+tc+" "+result);

		}
		
		sc.close();
	}
}
