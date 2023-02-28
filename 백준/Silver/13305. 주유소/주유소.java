import java.util.Scanner;

/* 13305. 주유소 */
// 도시 사이 거리와 각 도시의 리터 당 주유 가격이 주어질 때, 
// 제일 왼쪽 도시에서 제일 오른쪽 도시로 이동하는 최소 비용을 계산하는 문제
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 도시 수
		
		long[] dist = new long[N-1];		// 도시 사이 거리
		long[] city = new long[N];		// 각 도시의 리터 당 주유 가격
		
		for(int i=0; i<N-1; i++) {
			dist[i] = sc.nextLong();
		}
		
		for(int i=0; i<N; i++) {
			city[i] = sc.nextLong();
		}
		
		// 리터 당 가격이 내림차순일 때 비용이 최소가 된다
		// ex) 거리가 2 3 1, 비용이 5 2 4 1일 경우
		// 처음은 무조건 주유하므로 2*5 = 10
		// 비용이 2일 때 3*2 = 6
		// 비용이 4일 경우, 2일 때 주유하는 게 더 이득이므로 4*1이 아닌 2*1 = 2
		// 10+6+2 = 18
		int count=0;
		count += city[0]*dist[0];

		long min = Long.MAX_VALUE;
		for(int i=1; i<N-1; i++) {
			min = Math.min(min, city[i]);
			
			count += min*dist[i];
		}
		
		System.out.println(count);
		
		sc.close();
	}
}