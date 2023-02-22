import java.util.Scanner;

/* 10844. 쉬운 계단 수 */
public class Main {
	static long[][] cache = new long[101][10];
	final static int mod = 1000000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(dp(N)%mod);
		
		sc.close();
	}
	
	static long dp(int n) {
		
		// 한자리 계단수는 1부터 9까지 9개
		for(int i=1; i<=9; i++) {
			cache[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				if(j==0) {
					cache[i][j] = cache[i-1][j+1]%mod;	// 끝이 0인 경우 뒤에 1만 올 수 있음
				}
				else if(j==9) {				// 끝이 9인 경우 뒤에 8만 올 수 있음
					cache[i][j] = cache[i-1][j-1]%mod;
				}
				else {
					cache[i][j] = (cache[i-1][j-1] + cache[i-1][j+1])%mod;
				}
			}
		}
		
		long sum=0;
		for(int i=0; i<=9; i++) {
			sum += cache[n][i]%mod;
		}
		
		return sum;
	}
}