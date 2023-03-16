import java.util.Scanner;

/* 16953. A -> B
 * 정수 A와 B에 가능한 연산은 2를 곱하거나 1을 오른쪽에 추가하는 경우일 때,
 * A를 B로 바꾸는 데 필요한 연산의 최솟값 구하기 */
public class Main {
	static boolean[] visited = new boolean[1000000001];
	static long result=Long.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		dfs(A, B, 0);
		
		if(result == Long.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(result+1);
		}
		
		sc.close();
	}
	
	static void dfs(long a, long b, long count) {
		if(a == b) {
			result = Math.min(result, count);
			return;
		}
		else if(a > b) {		// a가 b보다 커지면 리턴
			return;
		}
		else {
			if(!visited[(int)a]) {
				visited[(int)a] = true;
				dfs(a*2, b, count+1);							// 1. a에 2곱하기
				
				// a가 b보다 자리수가 하나 작은 경우 뒤에 1을 붙이면 b보다 커질 수 있으므로 a에 10을 곱한 값이 b보다 작을 때만 1을 붙임
				if(a*10 < b) {		
					dfs(Integer.parseInt(a+"1"), b, count+1);		// 2. a 오른쪽에 1 추가하기
				}
			}	
			
		}
	}
}