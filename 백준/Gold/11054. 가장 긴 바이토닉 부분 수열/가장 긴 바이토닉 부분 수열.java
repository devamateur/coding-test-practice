import java.util.Scanner;

/* 11054. 가장 긴 바이토닉 부분 수열 */
public class Main {
	static int[] cache;
	static int[] cache2;
	static int[] num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		num = new int[N];
		cache = new int[N];
		cache2 = new int[N];
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
 		}
		
		dp(N-1);
		
		int max=0;
		for(int i=0; i<N; i++) {
			max = Math.max(max, cache[i] + cache2[i]);
		}
		System.out.println(max-1);
		
		sc.close();
	}
	static void dp(int n) {
		cache[0] = 1;		// LIS
		cache2[0] = 1;		// LDS

		// LIS: 최장 증가 수열
		for(int i=0; i<=n; i++) {
			cache[i] = 1;		/* 1로 초기화 */
			for(int j=0; j<i; j++) {
				if( num[i] > num[j] && cache[i] < cache[j]+1) {		
					cache[i] = cache[j]+1;		
				}

			}
		}
		
		// LDS: 최장 감소 수열
		for(int i=n; i>=0; i--) {
			cache2[i] = 1;		/* 1로 초기화 */
			for(int j=n; j>=i; j--) {
				if(num[i] > num[j] && cache2[i] < cache2[j]+1) {		
					cache2[i] = cache2[j]+1;		
				}

			}
		}
	}
}