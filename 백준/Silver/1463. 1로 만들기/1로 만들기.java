import java.util.Scanner;

/* Prob1463. 1로 만들기 */
public class Main {
	static int[] cache = new int[1000001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(dp(N));
		
		sc.close();
	}
	
	static int dp(int n) {
		cache[1] = 0;
		if(n==1) {
			return cache[1];
		}
		
		cache[2] = 1;

		if(n==2) {
			return cache[2];
		}
		cache[3] = 1;

		if(n==3) {
			return cache[3];
		}
		
		if(cache[n] != 0) {
			return cache[n];
		}

		
		int min=Integer.MAX_VALUE;
		for(int i=4; i<=n; i++) {
			if(i%2 == 0 && i%3 == 0) {		// 2와 3으로 모두 나눠떨어지는 경우
				cache[i] = Math.min(cache[i/2]+1, cache[i/3]+1);
			}
			else if(i%2 == 0) {				// 2로만 나눠떨어지는 경우
				cache[i] = Math.min(cache[i/2]+1, cache[i-1]+1);
			}
			else if(i%3 == 0) {				// 3으로만 나눠떨어지는 경우
				cache[i] = Math.min(cache[i/3]+1, cache[i-1]+1);
			}
			else {							// 2와 3으로 나눠지지 않으면 -1
				cache[i] = cache[i-1]+1;
			}
		}
		
		min = Math.min(min, cache[n]);
		return min;
	}
}