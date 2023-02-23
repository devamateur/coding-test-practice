import java.util.Scanner;

/* 12865. 평범한 배낭 */
public class Main  {
	static int[] weight, value;
	static int[][] cache;
	static int K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 물건의 수
		K = sc.nextInt();		// 견딜 수 있는 무게
		
		weight = new int[N+1];
		value = new int[N+1];
		cache = new int[N+1][K+1];
		
		for(int i=1; i<=N; i++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}
		
		System.out.println(dp(N));
		
		sc.close();
	}
	
	static int dp(int n) {
		int max = 0;
		for(int i=1; i<=n; i++) {		// i: i번째 물건까지 고려
			for(int j=1; j<=K; j++) {		// j: j 무게
				if(weight[i] <= j) {		// 물건의 무게가 무게 j보다 작거나 같다면
					cache[i][j] = Math.max(cache[i-1][j], cache[i-1][j-weight[i]] + value[i]);		// 이전 물건까지의 value와 현재 물건을 포함했을 때의 value
				}
				else {
					cache[i][j] = cache[i-1][j];		// 제한 무게를 넘을 경우 이전 value를 그대로
				}
				max = Math.max(max, cache[i][j]);
			}
		}

		return max;
	}
}