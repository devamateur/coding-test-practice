package swea.d3;

import java.util.Scanner;

/* 1244. [S/W 문제해결 응용] 2일차 - 최대 상금 */
public class Prob1244 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			String N = sc.next();
			int change = sc.nextInt();
			
			char[] num = N.toCharArray();
			
			for(int i=0; i<change; i++) {
				for(int j=0; j<num.length/2; j++) {
					for(int k=num.length-1; k>=j+1; k--) {
						//char front = N.charAt(j);
						//char back = N.charAt(k);
						if(num[j] < num[k]) {
							// 교환
							char temp = num[j];
							num[j] = num[k];
							num[k] = temp;
						}
					}
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0; i<num.length; i++) {
				System.out.print(num[i]);
			}System.out.println();
		}
		
		sc.close();
	}
}
