import java.util.Arrays;
import java.util.Scanner;

/* 11399. ATM */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] people = new int[N];
		
		for(int i=0; i<N; i++) {
			people[i] = sc.nextInt();		// 돈 인출 시간
		}
		
        // 오름차순 정렬
		Arrays.sort(people);
        
		int result = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				result += people[j];
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}