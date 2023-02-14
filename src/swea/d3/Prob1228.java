package swea.d3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 1228. [S/W 문제해결 기본] 8일차 - 암호문1 */
public class Prob1228 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			int N = sc.nextInt();	// 원본 암호문의 길이
			
			List<String> list = new ArrayList<>();
			
			// 원본 암호문
			for(int i=0; i<N; i++) {
				String code = sc.next();
				list.add(code);
			}
			
			int M = sc.nextInt(); 	// 명령어 개수
			
			for(int i=0; i<M; i++) {
				String command = sc.next();
				int position = sc.nextInt();		// 삽입 위치
				int num = sc.nextInt();				// 숫자 개수
				
				for(int j=0; j<num; j++) {
					String newCode = sc.next();
					list.add(position++, newCode);
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int i=0; i<10; i++) {
				System.out.print(list.get(i)+" ");
			}System.out.println();
			
		}
		
		sc.close();
	}
}
