import java.util.Scanner;

/* 2810. 컵홀더 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String holders = sc.next();
		
		int count=0;
		for(int i=0; i<n; i++) {
			if(holders.charAt(i) == 'S') {	// 일봔좌석은 그냥 카운트
				count++;
			}
			else if(holders.charAt(i) == 'L') {		// 커플석은 두 자리씩
				count++;
				i++;
			}
		}
		count++;		// 왼쪽 끝 컵홀더 더함
		
		if(count > n) {
			count = n;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}