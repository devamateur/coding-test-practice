import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/* 2565. 전깃줄 */
// 전깃줄이 서로 교차하지 않게 하기 위해 없애야 하는 전깃줄의 최소 개수 구하기
// 전깃줄마다 교차 여부를 구하기는 어려우므로
// 역으로 교차하지 않고 놓을 수 있는 최대 전선의 수를 구해서 N에서 빼준다. N-(교차하지 않고 놓을 수 있는 최대 전선의 수) = 없애야 하는 전선의 최소 개수
public class Main {
	static int[] cache;
	static int[][] num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		num = new int[N][2];
		cache = new int[N];

		for(int i=0; i<N; i++) {
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt();
		}
		

		// A 전봇대를 기준으로 정렬 (num[i][0]을 기준으로 정렬)
		Arrays.sort(num, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}			
		});
		
		System.out.println(N - dp(N-1));

		sc.close();
	}
	
	static int dp(int n) {
		int max = 0;
		for(int i=0; i<=n; i++) {
			cache[i] = 1;
			
			for(int j=0; j<i; j++) {
				if(num[i][1] > num[j][1]) {		// 현재 B에 연결된 전선의 위치 인덱스는 이전에 B에 연결된 전선의 위치 인덱스보다 더 커야 함
					cache[i] = Math.max(cache[i], cache[j]+1);
				}
				max = Math.max(max, cache[i]);
			}
		}
		
		return max;
	}
}