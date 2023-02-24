import java.util.Scanner;

/* 11047. 동전 0 */
// K원을 만들기 위해 필요한 동전의 최소 개수
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] money = new int[N];
		for(int i=0; i<N; i++) {
			money[i] = sc.nextInt();
		}
		
		int m=K;
		int count=0;
		for(int i=N-1; i>=0; i--) {
			while(m >= money[i]) {
				m -= money[i];
				count++;
			}
			if(m == 0) {
				break;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}