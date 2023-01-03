package swea.d2;

import java.util.Scanner;

public class Prob1959 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		int[] A, B;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N=sc.nextInt();
			int M=sc.nextInt();
			
			A = new int[N];
			B = new int[M];
			
			
			for(int i=0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			
			for(int i=0; i<M; i++) {
				B[i] = sc.nextInt();
			}
			
			int sum=0;
			int max=0; 
			if(N>M) {
				max=0;
				for(int i=0; i<N-M+1; i++) {
					sum=0;
					for(int j=0; j<M; j++) {
						sum+=B[j]*A[i+j];
					} 
					
					if(max < sum) {
						max=sum;
					}

				}
			}
			else {
				max=0;
				for(int i=0; i<M-N+1; i++) {
					sum=0;
					for(int j=0; j<N; j++) {
						sum+=A[j]*B[i+j];
					}
					
					if(max < sum) {
						max=sum;
					}
				}
			}
			
			
			System.out.println("#"+test_case+" "+max);

		}
		
		sc.close();
	}
}
