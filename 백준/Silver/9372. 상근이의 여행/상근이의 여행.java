import java.util.Scanner;

/* 9372. 상근이의 여행 */
// 모든 국가를 여행하기 위해 타야하는 최소 비행기 수
// MST(최소 신장 트리) - n개의 정점을 가지는 그래프의 최소 간선 수 = n-1
public class Main {
	static int count;
	static int minCount=Integer.MAX_VALUE;
	static int N, M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			N = sc.nextInt();		// 국가의 수
			M = sc.nextInt();		// 비행기의 종류
						
			for(int j=1; j<=M; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
			}
			
			System.out.println(N-1);
		}
		
		sc.close();
	}
}
