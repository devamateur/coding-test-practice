import java.util.Scanner;

public class Main {
	static long[] cache = new long[101];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			System.out.println(dp(N));
		}
		
		sc.close();
	}
	
	static long dp(int n) {
		cache[1] = 1;
		cache[2] = 1;
		cache[3] = 1;
		
		if(cache[n] != 0) {
			return cache[n];
		}
		for(int i=4; i<=n; i++) {
            // 점화식
			cache[i] = cache[i-2] + cache[i-3];
		}
		return cache[n];
	}
}