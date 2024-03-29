package swea.d3;

import java.util.Scanner;

/* 1216. [S/W 문제해결 기본] 3일차 - 회문2 */
public class Prob1216 {
	static final int N = 100;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=10;

		for(int tc = 1; tc <= T; tc++)
		{
			sc.nextInt();
			
			String[][] words = new String[N][N];
			for(int i=0; i<N; i++) {
				words[i] = sc.next().split("");
			}
			
			int maxLength=0;
			
			// 가로
			for(int length=0; length<N; length++) {
				for(int i=0; i<N; i++) {
					
					for(int j=0; j<N-length+1; j++) {
						boolean isPalindrome = false;

						for(int k=0; k<length/2; k++) {
							if(words[i][j+k].equals(words[i][j+length-k-1])) {
								isPalindrome = true;
							}
							else {
								isPalindrome = false;
								break;
							}
						}
						if(isPalindrome) {
							maxLength = Math.max(maxLength, length);
						}
					}
				}
				
				// 세로
				for(int i=0; i<N; i++) {

					for(int j=0; j<N-length+1; j++) {
						boolean isPalindrome = false;

						for(int k=0; k<length/2; k++) {
							if(words[j+k][i].equals(words[j+length-k-1][i])) {
								isPalindrome = true;
							}
							else {
								isPalindrome = false;
								break;
							}
						}
						if(isPalindrome) {
							maxLength = Math.max(maxLength, length);
						}

					}
				}
			}
			
			
			System.out.println("#"+tc+" "+maxLength);
		}
		
		sc.close();
	}
}
