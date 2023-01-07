package swea.d2;

import java.util.Scanner;

/* 1284. 수도 요금 경쟁 */
public class Prob1284 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int result1=0, result2=0;
		for(int tc=1; tc<=T; tc++) {
			int P = sc.nextInt();		// A사의 1리터 당 요금
			int Q = sc.nextInt();		// B사의 기본 요금
			int R = sc.nextInt();		// B사의 초과 요금 기준 R리터
			int S = sc.nextInt();		// B사의 R리터 초과 1리터 당 요금 S
			int W = sc.nextInt();		// 종민이의 한 달 수도 사용량
			
			result1 = P*W;
			
			if(W > R) {
				result2 = Q+(W-R)*S;
			}
			else {
				result2 = Q;
			}
			
			System.out.println("#"+tc+" "+Math.min(result1, result2));
		}
		
		sc.close();
	}
}
