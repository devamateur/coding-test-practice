import java.util.Scanner;

/* 2579. 계단 오르기 */
public class Main {
	static int[] cache;
	static int[] stairs;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		stairs = new int[N];
		cache = new int[N];
		
		for(int i=0; i<N; i++) {
			stairs[i] = sc.nextInt();
		}
		
		System.out.println(dp(N-1));
		
		sc.close();

	}

	static int dp(int n) {
		cache[0] = stairs[0];
		
		if(n == 0) {        // 칸이 한 개인 경우
			return cache[0];
		}
		
		if(n == 1){        // 칸이 두 개인 경우
            return stairs[0] + stairs[1];
        }
        
        cache[1] = stairs[0] + stairs[1];
        
        // 세 칸 연속으로 계단을 밟을 수는 없으므로 0칸 + 2칸 / 1칸 + 2칸 중 최대를 구함
		cache[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);
		
		if(cache[n] != 0) {
			return cache[n];
		}
		
		int max=0;
        
		for(int i=3; i<=n; i++) {
			cache[i] = Math.max(cache[i-3] + stairs[i-1] + stairs[i], cache[i-2]+stairs[i]);		// 한 계단씩 or 두 계단
		}
		max = Math.max(max, cache[n]);
		
		return max;
	}
}