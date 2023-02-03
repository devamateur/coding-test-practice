package swea.d3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 1225. [S/W 문제해결 기본] 7일차 - 암호생성기 */
public class Prob1225 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		
		for(int tc=1; tc<=10; tc++) {
			int T = sc.nextInt();

			Queue<Integer> numbers = new LinkedList<>();
			for(int i=0; i<8; i++) {
				numbers.add(sc.nextInt());
			}

			int count=1;
			while(true) {
				int front = numbers.poll();		// 큐에서 맨 앞 원소를 제거
				
				front -= count;
				if(front <= 0) {
					numbers.offer(0);		// offer(): 큐 맨 뒤에 값 추가, add()와 같은 역할이지만 에러 발생이 X
					break;
				}
				
				numbers.offer(front);
				count++;
				if(count == 6) {
					count=1;
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int i=0; i<8; i++) {
				System.out.print(numbers.poll()+" ");
			}System.out.println();

		}
		
		sc.close();
	}

}
