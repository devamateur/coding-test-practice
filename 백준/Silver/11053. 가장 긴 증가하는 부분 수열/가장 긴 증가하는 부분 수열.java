import java.util.Scanner;

/* 11053. 가장 긴 증가하는 부분 수열 */
public class Main {
	static int[] cache;
	static int[] numbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		cache = new int[N];
		numbers = new int[N];
		for(int i=0; i<N; i++) {
			numbers[i] = sc.nextInt();
		}
				
		sc.close();
	
		System.out.println(dp(N-1));

	}
	
	static int dp(int n) {
		cache[0] = 1;
		if(n == 0) {
			return cache[0];
		}
		if(cache[n] != 0) {
			return cache[n];
		}
		
		int max=0;
		for(int i=0; i<=n; i++) {
			cache[i] = 1;		/* 1로 초기화 */
			for(int j=0; j<i; j++) {
				if(numbers[i] > numbers[j] && cache[i] < cache[j]+1) {		// 뒤에 있는 원소가 더 큰 경우 -> 부분수열이다
					cache[i] = cache[j]+1;		// 이전 원소까지의 부분 수열 길이인 cache[j]에 현재 원소를 포함한 길이인 cache[j]+1로 갱신
				}
				max = Math.max(cache[i], max);
			}
		}
		cache[n] = max;
		
		return cache[n];
	}
}