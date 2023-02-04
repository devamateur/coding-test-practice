package swea.d3;

import java.util.Scanner;

/* 1493. 수의 새로운 연산 */
public class Prob1493 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			
			int[] xy1 = getXY(p);		// 좌표 계산
			int[] xy2 = getXY(q);		// 좌표 계산
			
			int[] newXY = {xy1[0] + xy2[0], xy1[1] + xy2[1]};		// 두 좌표의 합
			
			int answer = getValue(newXY[0], newXY[1]);		
			
			System.out.println("#"+tc+" "+answer);
		}
		
		sc.close();
	}
	
	static int[] getXY(int n) {
		int count=1;
		
		for(int idx=1; ; idx++) {
			for(int x=1, y=idx; x<=idx; x++, y--) {
				if(n == count) {
					return new int[] {x, y};
				}
				count++;
			}
		}

	}
	
	static int getValue(int i, int j) {
		int count = 1;
		
		for(int idx=1; ; idx++) {
			for(int x=1, y=idx; x<=idx; x++, y--) {
				if(x == i && y == j) {
					return count;
				}
				count++;
			}
		}
	}
}
