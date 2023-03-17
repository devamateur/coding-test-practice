import java.util.Scanner;

/* 2720. 세탁소 사장 동혁 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int i=0; i<T; i++) {
			int cent = sc.nextInt();		// 센트 (1달러 = 100센트)
			int[] count = new int[4];

			while(cent > 0) {
				if(cent >= 25) {			// 쿼터 = 25센트
					count[0] = cent/25;
					cent %= 25;
				}
				else if(cent >= 10) {		// 다임 = 10센트
					count[1] = cent/10;
					cent %= 10;
				}
				else if(cent >= 5) {		// 니켈 = 5센트
					count[2] = cent/5;
					cent %= 5;
				}
				else if(cent >= 1) {		// 페니 = 1센트
					count[3] = cent;
					cent %= 1;
				}
			}
			
			for(int j=0; j<count.length; j++) {
				System.out.print(count[j]+" ");
			}System.out.println();
		}
		
		sc.close();

	}
}