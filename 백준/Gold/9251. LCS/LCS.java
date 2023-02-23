import java.util.Scanner;

/* 9251. LCS */
public class Main {
	static int[][] cache;
	static char[] input1, input2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();

		input1 = new char[a.length()+1];
		input2 = new char[b.length()+1];
		
		for(int i=1; i<input1.length; i++) {
			input1[i] = a.charAt(i-1);
		}
		for(int i=1; i<input2.length; i++) {
			input2[i] = b.charAt(i-1);
		}
		
		cache = new int[input1.length+1][input2.length+1];

		dp();
		
		int max = 0;
		for(int i=1; i<=input1.length; i++) {
			for(int j=1; j<=input2.length; j++) {
				max = Math.max(max, cache[i][j]);
			}
		}
		
		System.out.println(max);
		
		sc.close();
	}
	static void dp() {
		int n = input1.length;
		int m = input2.length;

		for(int i=0; i<n; i++) {	
			for(int j=0; j<m; j++) {
				if((i==0 || j==0)) {        // 맨 첫 원소인 경우

					cache[i][j] = 0;
				}
				else if(input1[i] == input2[j]) {    // 맨 첫 원소가 아니면서 두 문자가 같을 때
					cache[i][j] = cache[i-1][j-1]+1;
				}
				else {        // 두 문자가 다를 때
					cache[i][j] = Math.max(cache[i][j-1], cache[i-1][j]);
				}
			}
		}

	}
}