package swea.d1;

import java.util.Scanner;

/* 1대 1 가위바위보 - 가위바위보를 숫자로 입력받고 이긴 사람 출력 */
public class Prob1936 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)
			System.out.println("A");
		else if(a<b)
			System.out.println("B");
		
		sc.close();
	}
}
