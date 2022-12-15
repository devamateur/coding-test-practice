package swea;

import java.util.Scanner;

/* 2046. 스탬프 찍기 */
public class Prob2046 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int i=0; i<number; i++)
			System.out.print("#");
		
		sc.close();
	}
}
