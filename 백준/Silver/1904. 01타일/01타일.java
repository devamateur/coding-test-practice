import java.util.Scanner;

public class Main {
	static int[] cache = new int[1000001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(getNumbers(N));
		
		sc.close();
	}
	
	static int getNumbers(int n) {
		
		cache[1] = 1;
		cache[2] = 2;
		
		if(cache[n] != 0) {
			return cache[n];
		}
		for(int i=3; i<=n; i++) {
			cache[i] = (cache[i-1] + cache[i-2]) % 15746;
		}
		return cache[n];
	}
}