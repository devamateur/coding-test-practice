import java.util.Scanner;

/* 2156. 포도주 시식 */
// 주어진 규칙대로 마실 수 있는 최대 포도주의 양 구하기
public class Main {
	static int[] cache;
	static int[] amount;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		cache = new int[n+1];
		amount = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			amount[i] = sc.nextInt();
		}
		
		System.out.println(dp(n));
		
		sc.close();
	}
	static int dp(int n) {
		cache[1] = amount[1];
		if(n == 1) {
			return cache[1];
		}
		
		cache[2] = amount[1] + amount[2];
		if(n == 2) {
			return cache[2];
		}
		
		cache[3] = Math.max(amount[1]+amount[3], amount[2] + amount[3]);
		cache[3] = Math.max(amount[1]+amount[2], cache[3]);
		if(n == 3) {
			return cache[3];
		}
		int max = 0;
		for(int i=4; i<=n; i++) {
			cache[i] = Math.max(cache[i-3] + amount[i-1] + amount[i], cache[i-2] + amount[i]);
			cache[i] = Math.max(cache[i], cache[i-1]);		// 개수를 더 적게 했을 때와 비교, 개수가 더 적은데 값이 크다면 그 값으로 갱신
		}
		max = Math.max(max, cache[n]);
		return max;
	}
}