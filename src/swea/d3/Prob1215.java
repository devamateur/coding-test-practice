package swea.d3;

import java.util.Scanner;

public class Prob1215 {
	final static int N = 8;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			int length = sc.nextInt();		// 찾아야 하는 단어의 길이
			
			String[][] words = new String[N][N];

			for(int i=0; i<N; i++) {
				words[i] = sc.next().split("");
			}

			int count=0;

			// 가로
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
						count++;
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
						count++;
					}
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
		
		sc.close();
	}
}
