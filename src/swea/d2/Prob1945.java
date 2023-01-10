package swea.d2;

import java.util.Scanner;

/* 1945. 간단한 소인수분해 */
public class Prob1945 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] primeNumbers = {2, 3, 5, 7, 11};
		int[] count = new int[5];
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			
			for(int i=0; i<5; i++) {
				count[i] = 0;
			}
			
			for(int i=0; i<5; i++) {
				// 소수로 나눈 나머지가 0인 동안 나누며 count를 증가
				while(N % primeNumbers[i] == 0) {
					N /= primeNumbers[i];
					count[i]++;
				}
			}

			
			System.out.print("#"+tc+" ");
			for(int j=0; j<5; j++)
				System.out.print(String.valueOf(count[j])+" ");
			System.out.println();
		}
		
		sc.close();
	}
}
