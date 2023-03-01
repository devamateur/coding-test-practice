import java.util.PriorityQueue;
import java.util.Scanner;

/* 1715. 카드 정렬하기 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 우선순위 큐 -> 들어온 순서대로 큐에 넣지 않고 우선순위가 높은 순대로 큐에 넣음
		// 이 경우 낮은 숫자 먼저 큐에 넣음(오름차순)
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			pq.add(sc.nextInt());
		}
		
		int sum = 0;
		while(pq.size() != 1 && !pq.isEmpty()) {
			int temp = pq.poll() + pq.poll();
			pq.add(temp);
			sum += temp;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}