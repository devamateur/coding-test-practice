import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 1026. 보물 */
// 두 배열 A, B의 각 원소의 곱의 합인 S의 최솟값을 구하는 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] A = new int[N];
		List<Integer> B = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			B.add(sc.nextInt());
		}
		
		// A*B가 최소가 되려면 A의 작은 값이 B의 큰 값에 곱해지면 됨

		Arrays.sort(A);			// A는 오름차순으로
		Collections.sort(B, Collections.reverseOrder());		// B는 내림차순으로 정렬
		
		
		int sum=0;
		for(int i=0; i<N; i++) {
			sum += A[i]*B.get(i);
		}
		
		System.out.println(sum);
				
		sc.close();
	}
}