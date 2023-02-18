import java.util.Scanner;

/* 1932. 정수 삼각형 */
public class Main {
	static long[][] cache, triangle;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		triangle = new long[n][n];
		cache = new long[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				triangle[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(dp(n));
		
		sc.close();
	}
	
	static long dp(int n) {
		cache[0][0] = triangle[0][0];

		if(n == 1) {		// n이 1인 경우!
			return cache[0][0];
		}

		long max = 0;
		for(int i=1; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(j == 0) {		// 그 줄의 맨 앞 원소는 이전번 맨 앞 원소가 선택되야 포함될 수 있음
					cache[i][j] = cache[i-1][j] + triangle[i][j];
				}
				else{
					cache[i][j] = Math.max(cache[i-1][j] + triangle[i][j], cache[i-1][j-1] + triangle[i][j]);
				}

				max = Math.max(cache[i][j], max);
			}
		}

		return max; 
	}
}