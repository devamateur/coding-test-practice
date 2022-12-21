package swea.d1;

import java.util.Scanner;

/* 2019. 더블더블 */
// 1부터 주어진 횟수까지 2를 곱한 값 출력
public class Prob2019 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int times = 1;
		
		System.out.print(times+" ");
		
		for(int i=0; i<number; i++) {
			times *= 2;
			System.out.print(times+" ");
		}
		
		sc.close();
	}
}
