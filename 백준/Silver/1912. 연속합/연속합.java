import java.util.Scanner;

public class Main {
	static int[] cache = new int[100001];
	static int[] numbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		numbers = new int[N+1];
		for(int i=1; i<=N; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println(dp(N));

	}
	
	static int dp(int n) {
		cache[1] = numbers[1];
		if(cache[n] != 0) {
			return cache[n];
		}
		
		int max = cache[1];		// 이전 합 저장
		for(int i=2; i<=n; i++) {
			cache[i] = Math.max(cache[i-1]+numbers[i], numbers[i]);
			max = Math.max(cache[i], max);		// 이전에 구한 합과 현재 연속합 중 최대
		}
		return max;
	}
}