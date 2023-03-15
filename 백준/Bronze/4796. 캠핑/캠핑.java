import java.util.Scanner;

/* 캠핑 
 * 연속하는 P일 중 L일 만 캠핑장을 사용할 수 있을 때 
 * V일짜리 휴가에서 캠핑장을 사용할 수 있는 최대 일 수 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idx=1;
		while(true) {
			int L = sc.nextInt();		// P일 중 캠핑장을 사용가능한 일 수
			int P = sc.nextInt();		
			int V = sc.nextInt();		// V일짜리 휴가
			
			if(L == 0 && P == 0 && V == 0) {
				break;
			}
			
			int sum = 0;
			
			while(V > P) {
				V -= P;
				sum += L;
			}
			if(V < L) {
				sum += V;
			}
			else {
				sum += L;
			}

			System.out.println("Case "+idx+": "+sum);
			idx++;
		}
		
		sc.close();
	}
}