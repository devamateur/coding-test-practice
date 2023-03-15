import java.util.Arrays;
import java.util.Scanner;

/* 1449. 수리공 항승 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 물이 새는 곳의 개수
		int L = sc.nextInt();		// 테이프의 길이
		
		int[] pipe = new int[N];
		for(int i=0; i<N; i++) {
			pipe[i] = sc.nextInt();
		}
		
		Arrays.sort(pipe);
		
		int range = (int)(pipe[0]-0.5+L);		// 테이프로 붙일 수 있는 범위
		int count=1;
		
		for(int i=1; i<N; i++) {
			if(range < pipe[i]) {				// 현재 테이프로 붙일 수 있는 범위를 벗어난 경우
				range = (int)(pipe[i]-0.5+L);		
				count++;						// 테이프를 추가한다
			}
		}
		
		System.out.println(count);
		
		sc.close();

	}
}
