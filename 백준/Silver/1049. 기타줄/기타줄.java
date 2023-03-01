import java.util.Arrays;
import java.util.Scanner;

/* 1049. 기타줄 */
// 기타줄 N개가 끊어졌을 때, M개의 브랜드에서 N개의 기타줄을 사기 위해 필요한 돈의 최솟값
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 끊어진 기타줄 수
		int M = sc.nextInt();		// 브랜드 수
		
		int[] cost1 = new int[M];
		int[] cost2 = new int[M];
		for(int i=0; i<M; i++) {
			cost1[i] = sc.nextInt();		// 6개 구매 금액
			cost2[i] = sc.nextInt();		// 낱개 구매 금액
		}
		
		// 오름차순 정렬
		Arrays.sort(cost1);
		Arrays.sort(cost2);
		
		int min=Integer.MAX_VALUE;
		
		int onlySix = (N/6+1)*cost1[0];		// 6개짜리만 사는 경우, N을 초과해서 사야하므로 N/6+1
		int onlyOne = N*cost2[0];			// 낱개로만 사는 경우
		int mix = (N/6)*cost1[0] + (N%6)*cost2[0];		// 둘을 섞어서 사는 경우
		
		min = Math.min(mix, onlySix);
		min = Math.min(onlyOne, min);
		
		System.out.println(min);
		
		sc.close();
	}
}