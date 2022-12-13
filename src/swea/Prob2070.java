package swea;

import java.util.Scanner;

/* 2070. 큰 놈, 작은 놈, 같은 놈 */
// 두 수를 비교해서 <, =, >를 출력하는 문제
public class Prob2070 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int left = sc.nextInt();
			int right = sc.nextInt();
			
			// 두 수의 대소 관계를 출력
			printBigEqualSmall(test_case, left, right);

		}
	}
	
	// 두 수의 대소 관계를 출력하는 메소드
	static void printBigEqualSmall(int test_case, int left, int right) {
		if(left > right)
			System.out.println("#"+test_case+" "+">");
		else if(left == right)
			System.out.println("#"+test_case+" "+"=");
		else
			System.out.println("#"+test_case+" "+"<");
	}
}
