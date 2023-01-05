package swea.d2;

import java.util.Scanner;

/* 1946. 간단한 압축 풀기 */
public class Prob1946 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			
			String[] alphabet = new String[N];
			int[] alphaCount = new int[N];

			for(int i=0; i<N; i++) {
				alphabet[i] = sc.next();
				alphaCount[i] = sc.nextInt();
			}
			
			System.out.println("#"+tc);
			for(int i=0; i<alphaCount.length; i++) {
				for(int j=1; j<=alphaCount[i]; j++) {
					if(j % 10 == 0) {
						System.out.println();
					}
					else{
						System.out.print(alphabet[i]);
					}
				}

				/*else {
					for(int j=0; j<alphaCount[i]; j++) {
						System.out.print(alphabet[i]);
						
					}System.out.println();
				}*/
				
			}
		}
		
		sc.close();
	}
}
