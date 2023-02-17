import java.util.Scanner;

public class Main {
	static int count=0, count2=0;
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		dp = new int[N+1];
		
		fib1(N);		// 재귀 호출을 이용한 피보나치 수
		fib2(N);		// 동적 프로그래밍을 이용한 피보나치 수

		System.out.println(count+" "+count2);
		sc.close();
	}
	
	static int fib1(int n) {
		if(n>=3) {
			return fib1(n-1) + fib1(n-2);
		}
		else {
			count++;
			return 1;
		}
	}
	
	static int fib2(int n) {
		dp[1] = 1;
		dp[2] = 1;
		for(int i=3; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			count2++;
		}

		return dp[n];

	}
}