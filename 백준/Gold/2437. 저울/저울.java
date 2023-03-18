import java.util.Arrays;
import java.util.Scanner;

/* 2437. 저울
 * N개의 추가 주어질 때,
 * 추들로 측정할 수 없는 양의 정수 무게의 최솟값 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] weight = new int[N];
		for(int i=0; i<N; i++) {
			weight[i] = sc.nextInt();
		}
		
		Arrays.sort(weight);		// 정렬
		
		int sum=0;
		int result = 0;
		
		for(int i=0; i<N; i++) {
			if(weight[i] > sum+1) {		// 어떤 추의 무게가 (현재까지 추들의 무게 합+1)보다 크면
				break;				// 해당 추의 무게는 더하지 않음
			}
			sum += weight[i];
		}
		
		result = sum+1;		// 측정할 수 없는 무제의 최솟값은 현재 추들의 무게 합 + 1
		System.out.println(result);
		sc.close();
	}
}