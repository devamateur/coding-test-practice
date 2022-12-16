package swea;

import java.util.Scanner;

/* 2043. 서랍의 비밀번호 - 몇 번 만에 비밀번호를 맞출 수 있을까 */
public class Prob2043 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int password = sc.nextInt();		// ex) 123
		int myTry = sc.nextInt();			// ex) 100
		
		// 시도횟수는 둘의 차이에 1을 더한 값
		System.out.println(Math.abs(password-myTry)+1);
		
		sc.close();
	}
	
}
