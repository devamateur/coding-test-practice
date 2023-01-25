package swea.d3;

import java.util.Scanner;

/* [S/W 문제해결 기본] 5일차 - Magnetic */
public class Prob1220 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			int side = sc.nextInt();		// 한 변의 길이(100)
			
			int[][] table = new int[side][side];
			for(int i=0; i<side; i++) {
				for(int j=0; j<side; j++) {
					table[i][j] = sc.nextInt();
				}
			}

			int count=0;
			
			// 교착 상태는 12일 때 발생하므로 1인 상태를 기억해놓고 2가 나왔을 때 count를 증가시킨다
			for(int i=0; i<side; i++) {

				int prev = 0;		// 이전 상태를 기억
				for(int j=0; j<side; j++) {
					if(table[j][i] == 1) {
						prev=1;
					}
					if(table[j][i] == 2 && prev == 1) {
						count++;
						prev=0;
					}
				}

			}
			System.out.println("#"+tc+" "+count);
		}
		
		sc.close();
	}
}
