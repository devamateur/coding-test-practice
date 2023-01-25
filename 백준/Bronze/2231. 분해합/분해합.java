import java.io.*;

public class Main {
	static int d(int n){
        int sum = n;		// 주어진 수 n을 더함
        
        while(true) {
        	if(n==0)	break;
        	sum += n%10;		// 일의 자리수를 더한다
        	n = n/10;			// 주어진 수를 10으로 나눠 자릿수를 줄인다
        }
        return sum;
    }
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int result = 0;

		for(int i=0; i<n; i++) {
			sum = i;
			
			if(d(sum) == n) {
				result = i;
				break;
			}
		}

		bw.write(String.valueOf(result));
		
		br.close();
		bw.flush();
		bw.close();
	}
}