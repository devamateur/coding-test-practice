package swea.d1;

import java.util.Scanner;

/* 2025. N줄덧셈 - 1부터 주어진 숫자만큼 모두 더한 값을 출력 */
public class Prob2025 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			sum += (i+1);
		}
		System.out.println(sum);
		
		sc.close();
	}
}
