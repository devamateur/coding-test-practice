import java.io.*;
import java.util.StringTokenizer;

/* 에라토스테네스의 체를 이용하여 소수 구하기*/
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		boolean[] isPrime = new boolean[b+1];
		
		for(int i=2; i<isPrime.length; i++)
			isPrime[i] = true;
		
		for(int i=2; i<b+1; i++) {
			for(int j = i*2; j<b+1; j+=i) {		// 어떤 수의 배수인 수는 제외
                if(!isPrime[j]) continue;
                isPrime[j] = false;
            }
		}
		
		for(int i=a; i<b+1; i++) {
			if(isPrime[i])
				bw.write(String.valueOf(i) + "\n");
		}
		
		br.close();
		bw.close();
	}
}