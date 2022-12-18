package swea;

import java.util.Scanner;

/* 1938. 아주 간단한 계산기 */
// 두 개의 자연수를 입력받아 사칙연산을 수행하는 프로그램
public class Prob1938 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		sc.close();
	}
}
