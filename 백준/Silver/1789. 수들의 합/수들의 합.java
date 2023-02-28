import java.util.Scanner;

/* 1789. 수들의 합 */
// 서로 다른 N개의 자연수의 합이 S일 때, 자연수 N의 최댓값을 구하는 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong(); 		// 주어진 input의 범위가 약 42억까지이므로 (int는 약 21억까지ㅎㅎ) 

		long sum=0;
		int count=0;
		
		// 1부터 더하면서 sum이 S를 초과하면 그 때의 count에서 -1
		// ex) S가 50일 때, 1부터 10까지의 합이 55이므로 5를 제외한 9가 N의 최댓값
		int i=1;
		while(sum <= S) {
			sum += i;
			count++;
			if(sum > S) {
				break;
			}
			i++;
		}
		
		System.out.println(count-1);
		
		sc.close();
	}
}