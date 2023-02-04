package swea.d3;

import java.util.Scanner;

/* 1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱 */
public class Prob1217 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			int n = sc.nextInt();
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println("#"+tc+" "+myPow(num1, num2));
		}
		
		sc.close();
	}
	
	static int myPow(int n, int times) {
		if(times == 1) {		// n의 1제곱 = n
			return n;
		}
		return n* myPow(n, times-1);
	}
}
