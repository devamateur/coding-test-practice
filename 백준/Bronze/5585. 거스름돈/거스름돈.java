import java.util.Scanner;

/* 5585. 거스름돈 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 1000-sc.nextInt();
				
		int[] changes = {500, 100, 50, 10, 5, 1};
		
		int count=0;
		for(int i=0; i<changes.length; i++) {
			while(money >= changes[i]) {
				count += money/changes[i];
				money = money%changes[i];
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}