import java.util.Arrays;
import java.util.Scanner;

/* 2217.로프 */
// 로프가 버틸 수 있는 최대 중량 구하기
// k개의 로프를 이용해 중량이 w인 물체를 들어올릴 때, 각 로프에는 고르게 w/k만큼의 중량이 걸린다
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] ropes = new int[N];
		
		for(int i=0; i<N; i++) {
			ropes[i] = sc.nextInt();
		}
		
		Arrays.sort(ropes);		// 오름차순 정렬
		
		int result = 0;		// 중량이 최대인 로프
		
		// 최대 중량은 (중량이 가장 작은 로프 * N)
		for(int i=0; i<N; i++) {
			result = Math.max(ropes[i]*(N-i), result);
		}
		
		if(result == 0) {		// 마지막 로프 제외 어떤 로프도 w를 견딜 수 없으면
			result = ropes[N-1];		// 마지막 로프 하나만 사용
		}
		System.out.println(result);
		
		sc.close();
	}
}