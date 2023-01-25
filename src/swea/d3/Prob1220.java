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
			for(int i=0; i<side; i++) {
				for(int j=0; j<side-1; j++) {
					//String str = table[j][i] +""+ table[j+1][i];
					
					// 같은 열인데 값이 다를 때
					if(table[j][i]==1 && table[j+1][i] == 2) {
						count++;
					}
				}
			}
			System.out.println("#"+tc+" "+count);
		}
		
		sc.close();
	}
}
