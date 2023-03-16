import java.util.Scanner;

/* 10162. 전자레인지
 * A, B, C 세 개의 버튼을 눌러 T초를 만들 수 있는 최소 횟수*/
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int A = 300;
		int B = 60;
		int C = 10;
		
		int[] count = new int[3];
		int result = 0;
		while(T > 0) {
			if(T >= A) {
				T -= A;
				count[0]++;
			}
			else if(T >= B) {
				T -= B;
				count[1]++;
			}
			else if(T >= C) {
				T -= C;
				count[2]++;
			}
			else {
				result = -1;
				break;
			}
		}
		
		if(result == -1) {
			System.out.println(result);
		}
		else {
			for(int i=0; i<3; i++) {
				System.out.print(count[i]+" ");
			}
		}
		
		sc.close();
	}
}