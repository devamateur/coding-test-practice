import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(getFibonacci(n)));
		
		br.close();
		bw.close();
	}
	
	static int getFibonacci(int n) {
		if(n >= 2)
			return getFibonacci(n-1) + getFibonacci(n-2);
		else
			return n;
	}
}