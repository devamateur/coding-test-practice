package swea.d2;

import java.util.Scanner;

/* 숫자 배열 회전 - 입력된 숫자 배열을 90도, 180도, 270도 회전한 결과를 출력 */
public class Prob1961 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[][] numbers;
		String[][] rotated;
		for(int tc=0; tc<T; tc++) {
			int N = sc.nextInt();
			
			numbers = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					numbers[i][j] = sc.nextInt();
				}
			}
			
			rotated = new String[N][3];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<3; j++) {
					rotated[i][j] = "";
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					for(int k=0; k<3; k++) {
						if(k == 0) {		// 90도 회전
							rotated[i][k] += String.valueOf(numbers[N-(j+1)][i]);
						}
						if(k == 1) {		// 180도 회전
							rotated[i][k] += String.valueOf(numbers[N-(i+1)][N-(j+1)]);
						}
						if(k == 2) {		// 270도 회전
							rotated[i][k] += String.valueOf(numbers[j][N-(i+1)]);
						}
							
					}
				}

			}
			System.out.println("#"+tc+" ");
			for(int i=0; i<N; i++) {
				for(int j=0; j<3; j++) {
					System.out.print(rotated[i][j]+" ");
				}System.out.println();
			}
		}
		
		sc.close();
	}
}
