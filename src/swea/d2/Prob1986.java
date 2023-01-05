package swea.d2;

import java.util.Scanner;

/* 1986. 지그재그 숫자 */
public class Prob1986 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			
			int sum=0;
			for(int i=1; i<=N; i++) {
				if(i%2 == 0) {		
					sum -= i;
				}
				else{
					sum += i;
				}
			}
			
			System.out.println("#"+tc+" "+sum);
		}
		
		sc.close();
	}
}
