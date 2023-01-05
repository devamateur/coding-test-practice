package swea.d2;

import java.util.Scanner;

/* 1970. 쉬운 거스름돈 - 거스름돈을 거슬러주기 위해 필요한 각 돈의 최소 개수 구하기 */
public class Prob1970 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] changes = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] moneyCount = new int[8];
		for(int tc=1; tc<=T; tc++) {
			int money = sc.nextInt();
			
			for(int i=0; i<moneyCount.length; i++) {
				moneyCount[i] = 0;
			}
			
			for (int i=0; i<moneyCount.length; i++) {
				moneyCount[i] = money / changes[i];
				money %= changes[i];
			}

			System.out.println("#"+tc);
			for(int i=0; i<moneyCount.length; i++) {
				System.out.print(moneyCount[i]+" ");
			}System.out.println();
		}
		
		sc.close();
	}
}
