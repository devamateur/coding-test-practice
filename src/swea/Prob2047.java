package swea;

import java.util.Scanner;

/* 2047. 신문 헤드라인 - 대문자로 출력 */
public class Prob2047 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String headline = sc.next().toUpperCase();
		
		System.out.println(headline);
		
		sc.close();
	}
}
