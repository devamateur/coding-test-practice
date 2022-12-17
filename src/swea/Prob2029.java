package swea;

import java.util.Scanner;

/* 2029. 몫과 나머지 출력하기 */
public class Prob2029 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int a, b;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("#"+test_case+" "+a/b+" "+a%b);
		}
		sc.close();
	}
}
