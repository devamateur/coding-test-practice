import java.util.Arrays;
import java.util.Scanner;

/* 18310. 안테나 
 * 집들의 위치가 주어질 때
 * 모든 집까지 거리의 합이 최소가 되도록 안테나를 설치할 집을 선택 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] house = new int[N];
		
		for(int i=0; i<house.length; i++) {
			house[i] = sc.nextInt();
		}
		
		Arrays.sort(house);
		
		int result=0;
		if(house.length%2 == 1) {
			result = house[house.length/2];
		}
		else {
			result = house[house.length/2-1];
		}
		System.out.println(result);
		
		sc.close();
	}
}