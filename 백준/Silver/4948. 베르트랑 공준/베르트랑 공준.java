import java.io.*;

public class Main {
	public static final int MAX = 246913;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] isPrime = new boolean[MAX];
				
		for(int i=0; i<isPrime.length; i++) {
			isPrime[i] = true;
		}
		
        for(int i = 2; i <= MAX; i++) {
            for(int j = i * 2; j <= MAX; j += i) {		// 어떤 수의 배수인 수는 제외
                if(!isPrime[j]) continue;
                isPrime[j] = false;
            }
        }
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0)		break;
            int count = 0;
            for(int i = n+1; i <= 2*n; i++) {
                if(isPrime[i])
                    ++count;
            }
            
            bw.write(String.valueOf(count) + "\n");
		}

		br.close();
		bw.close();
	}
}