import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			int distance = y-x;
			int max = (int)Math.sqrt(distance);
			
			if(Math.sqrt(distance) == max)		// distance에 루트를 취한 값이 정수로 떨어진다면
				System.out.println(2 * max - 1);
			
			else if(distance <= max * max + max) {
				System.out.println(max * 2);
			}
			
			else {
				System.out.println(max * 2 + 1);
			}
		}
	}
}