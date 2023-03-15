import java.util.Scanner;

/* 14916. 거스름돈 */
// 2원 동전과 5원 동전으로 거슬러 줄 수 있는 동전의 최소 개수
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int answer = -1;
		
		// n이 5보다 작을 경우, 2로 나눠지지 않는 0, 1, 3은 -1임
		if(n == 1 || n == 3) {
			answer = -1;
		}
		else if(n%5 == 0) {
			answer = n/5;
		}
		else if(n%5 == 2 || n%5 == 4) {	// 5로 나눈 나머지가 짝수일 경우
			answer = n/5 + (n%5)/2;		
		}
		else if(n%5 == 1 || n%5 == 3) {	// 5로 나눈 나머지가 홀수일 경우
			answer = (n/5)-1 + (n-5*(n/5-1))/2;
		}
		else if(n%2 == 0) {
			answer = n/2;
		}

		else {		// 거슬러 줄 수 없는 경우
			answer = -1;
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}