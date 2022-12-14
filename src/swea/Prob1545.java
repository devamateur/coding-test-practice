package swea;

import java.util.Scanner;

/* 1545. 거꾸로 출력해 보아요 */
// 입력받은 수~0까지 거꾸로 출력
public class Prob1545 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// 주어진 수에서 0까지 거꾸로 출력
		for(int i=num; i>=0; i--) {
			System.out.print(i+" ");
		}
		
		sc.close();
	}
}
