package swea.d3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prob1215 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			int length = sc.nextInt();		// 찾아야 하는 단어의 길이
			
			String[][] words = new String[8][8];

			for(int i=0; i<8; i++) {
				words[i] = sc.next().split("");
			}
			
			List<String>[] list = new ArrayList[8];
			List<String>[] reversed = new ArrayList[8];		// 뒤집은 단어 리스트
			
			for(int i=0; i<8; i++) {
				list[i] = new ArrayList<>();
				reversed[i] = new ArrayList<>(); 
			}
			
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					list[i].add(words[i][j]);
					reversed[i].add(words[i][j]);
				}
			}
			
			// 리스트 뒤집기
			for(int i=0; i<8; i++) {
				Collections.reverse(reversed[i]);
			}
			
			int count=0;

			for(int i=0; i<8; i++) {
				for(int j=0; j<8-length; j++) {
					if(list[i].get(j) == reversed[i].get(j)) {
						count++;
					}
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
		
		sc.close();
	}
}
