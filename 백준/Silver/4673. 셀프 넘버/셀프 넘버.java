class Main{
    static final int N = 10001;
	static int d(int n){
        int sum = n;		// 주어진 수 n을 더함
        
        while(true) {
        	if(n==0)	break;
        	sum += n%10;		// 일의 자리수를 더한다
        	n = n/10;			// 주어진 수를 10으로 나눠 자릿수를 줄인다
        }
        return sum;
    }
	
    public static void main(String[] args){
    	boolean[] numbers = new boolean[N];
    	
    	for(int i=1; i<N; i++) {
    		int num = d(i);
    		
    		if(num < N)
    			numbers[num] = true;		// 셀프 넘버가 아닌 수는 true
    	}
    	
    	for(int i=1; i<N; i++) {
    		if(!numbers[i]) 
    			System.out.println(i);
    	}

    }
}