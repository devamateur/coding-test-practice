import java.util.Scanner;

public class Main {
	static int[][] cache;
	static int[][] input;
	final static int SIZE = 3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		cache = new int[N][SIZE];
		input = new int[N][SIZE];
		for(int i=0; i<N; i++) {
			for(int j=0; j<SIZE; j++) {
				input[i][j] = sc.nextInt();
			}
		}
		System.out.println(dp(N-1));
		
		sc.close();
	}
	
	static int dp(int n) {
		cache[0][0] = input[0][0];
		cache[0][1] = input[0][1];
		cache[0][2] = input[0][2];
		
		for(int i=1; i<=n; i++) {
			cache[i][0] = Math.min(cache[i-1][1], cache[i-1][2]) + input[i][0];			// 빨강(0)으로 칠할 때, 이전 집은 초록(1)과 파랑(2) 선택
			cache[i][1] = Math.min(cache[i-1][2], cache[i-1][0]) + input[i][1];			// 초록(1)으로, 이전 집은 빨강(0) 파랑(2) 선택
			cache[i][2] = Math.min(cache[i-1][0], cache[i-1][1]) + input[i][2];
		}
		int min = Math.min(cache[n][0], cache[n][1]);
		min = Math.min(min, cache[n][2]);
		return min;
	}
}