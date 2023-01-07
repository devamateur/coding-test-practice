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
			
			int totalCount = 0;
			for(int i=0; i<N; i++) {
				alphabet[i] = sc.next();
				alphaCount[i] = sc.nextInt();
				totalCount += alphaCount[i];
			}

			// 압축을 푼 문자열을 저장하기 위한 배열
			String[] totalAlpha = new String[totalCount];
			
			int index = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<alphaCount[i]; j++) {
					totalAlpha[index] = alphabet[i];		// 입력받은 수만큼 해당 알파벳들을 저장
					index++;								// index는 alphaCount의 총합
				}
			}
			
			System.out.println("#"+tc);
			for(int i=0; i<index; i++) {
				// i % 10 == 0인 경우에 i가 0일 때도 포함되므로 i != 0 을 추가
				if(i != 0 && i % 10 == 0) {		// 10개가 넘어가면 줄바꿈(원본 문서의 너비는 10)
					System.out.println();
				}
				System.out.print(totalAlpha[i]);
			}System.out.println();
		}
		
		sc.close();
	}
}
