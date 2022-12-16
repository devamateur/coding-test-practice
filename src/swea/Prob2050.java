package swea;

import java.util.Scanner;

/* 2050. 알파벳을 숫자로 변환 */
public class Prob2050 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		String alphabet = sc.next();
		
		// 알파벳 -> 숫자
		for(int i=0; i<alphabet.length(); i++) {
			int c = alphabet.charAt(i)-64;		// 알파벳 대문자 아스키코드값은 65~90이므로 64를 빼준다
			System.out.print(c+" ");
		}
		
		sc.close();
	}
}
