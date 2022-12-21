package swea.d1;

import java.util.Scanner;

public class Prob2071 {
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		String[] numbers = new String[10];
		double sum = 0;
		int average = 0;

		sc.nextLine();
		for(int test_case = 0; test_case < T; test_case++)
		{
			numbers = sc.nextLine().split(" ");
			sum=0;
			average=0;
			for(int i=0; i<numbers.length; i++) {
				sum += Integer.parseInt(numbers[i]);
				average = (int) Math.round(sum/10);
			}
			System.out.println("#"+(test_case+1)+" "+average);
		}
		sc.close();
	}
}
