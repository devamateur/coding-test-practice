package swea.d3;

/* 3131. 100만 이하의 모든 소수 */
public class Prob3131 {
	static int MAX=1000000;
	public static void main(String[] args) throws Exception{
		
		boolean[] isPrime = new boolean[MAX];	// 소수 여부

		for(int i=0; i<isPrime.length; i++) {
			isPrime[i] = true;
		}
		
	    for(int i = 2; i < MAX; i++) {
	        for(int j = i * 2; j < MAX; j += i) {		// 어떤 수의 배수인 수는 제외
	            if(!isPrime[j]) {
	            	continue;
	            }
	            isPrime[j] = false;
	        }
	    }
	    
	    for(int i=2; i<MAX; i++) {
	    	if(isPrime[i]) {
		    	System.out.print(i+" ");
	    	}
	    }
	}

}
