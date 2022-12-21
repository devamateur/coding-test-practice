package swea.d1;

import java.util.Scanner;

public class Prob2072 {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		//sc.nextLine();
		
        int sum = 0;
		//String[] numbers = null;
		for(int i = 0; i < T; i++)
		{
            /*numbers= sc.nextLine().split(" ");

            sum = getSum(numbers);*/
			sum = 0;
			for(int j=0; j<10; j++) {
				String number = sc.next();
				sum += getSum(number);
			}
                	
            System.out.println("#"+(i+1)+" "+sum);
		}
		
		sc.close();
	}
	/*static int getSum(String[] numbers) {
		int sum = 0;
		for(int j=0; j<numbers.length; j++) {
			int number = Integer.parseInt(numbers[j]);
        	if(number % 2 == 1) {
        		sum += number;
        	}
		}
		return sum;
	}*/
	static int getSum(String number) {
		int sum = 0;
		
		int newNumber = Integer.parseInt(number);
        if(newNumber % 2 == 1) {
        	sum += newNumber;
        }
		
		return sum;
	}
}
